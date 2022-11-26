package com.asyf.demo.common.filter;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.annotation.PostConstruct;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//@Order(value = 1)
@WebFilter(filterName = "myWebFilter", urlPatterns = "/*")
@Component
@Slf4j
public class MyWebFilter implements Filter {

//    private Logger logger = LoggerFactory.getLogger(MyWebFilter.class);

    private static final String UNIQUE_ID = "traceId";

    private Set<String> ignoreList;

    @PostConstruct
    public void initIgnore() {
        ignoreList = new HashSet<>();
        ignoreList.add("/webjars");
        ignoreList.add("/swagger");
        ignoreList.add("/v2");
        ignoreList.add("/doc.html");
        ignoreList.add("/swagger-ui.html");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //忽略swagger
        if (ignore((HttpServletRequest) servletRequest)) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        boolean bInsertMDC = insertMDC();
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //包装
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
        try {
            log.info(apiInfo(request));
            //filterChain.doFilter(servletRequest, servletResponse);
            //使用包装类
            filterChain.doFilter(requestWrapper, responseWrapper);
        } finally {
            Map<String, String[]> parameterMap = requestWrapper.getParameterMap();
            log.info("ParameterMap: {}", JSONUtil.toJsonStr(parameterMap));
            String requestBody = new String(requestWrapper.getContentAsByteArray())
                    .replaceAll("\n", "").replaceAll("\t", "");
            log.info("Request body: {}", requestBody);

            String responseBody = new String(responseWrapper.getContentAsByteArray());
            log.info("Response body: {}", responseBody);
            if (bInsertMDC) {
                //通常，put（）操作应该通过相应的remove（）操作进行平衡。否则，
                // MDC将包含某些键的陈旧值。我们建议尽可能在finally块中执行remove（）操作，确保它们的调用无论代码的执行路径如何。
                MDC.remove(UNIQUE_ID);
                //MDC.remove(null);//key parameter cannot be null
            }
            // Do not forget this line after reading response content or actual response will be empty!
            responseWrapper.copyBodyToResponse();
        }
    }

    /**
     * 日志traceId
     * https://blog.csdn.net/xingbaozhen1210/article/details/89230570
     */
    private boolean insertMDC() {
        String id = IdUtil.simpleUUID();
        MDC.put(UNIQUE_ID, id);
        return true;
    }

    //Tomcat日志中加入 IP 和 客户端信息 的显示
    private String apiInfo(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        sb.append("时间：").append(DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS"));
        sb.append("接口地址：").append(request.getRequestURI().toString()).append(" 请求方式：")
                .append(request.getMethod()).append(" IP地址：").append(getIp(request))
                .append(" 客户端：").append(request.getHeader("User-Agent"));
        Map<String, String[]> parameterMap = request.getParameterMap();
        String params = JSONUtil.toJsonStr(parameterMap);
        sb.append(" 参数：").append(params);
        return sb.toString();
    }

    private String getIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    @Override
    public void destroy() {
        log.info("destroy");
    }

    protected boolean ignore(HttpServletRequest req) {
        String uri = req.getRequestURI();
        String path = uri.substring(req.getContextPath().length());
        for (String s : ignoreList) {
            if (path.startsWith(s)) {
                return true;
            }
        }
        return false;
    }
}
