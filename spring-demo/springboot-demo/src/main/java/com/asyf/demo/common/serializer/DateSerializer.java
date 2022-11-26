package com.asyf.demo.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSerializer extends JsonSerializer<Date> {

    private String pattern = "yyyy/MM/dd";

    public DateSerializer() {
    }

    public DateSerializer(String pattern) {
        super();
        this.pattern = pattern;
    }

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String output = StringUtils.EMPTY;
        //根据header参数返回不同格式的日期
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String dateFormat = request.getHeader("dateFormat");
        if (StringUtils.isNotBlank(dateFormat)) {
            pattern = dateFormat;
        }
        if (date != null) {
            output = new SimpleDateFormat(pattern).format(date);
        }
        jsonGenerator.writeString(output);
    }

}
