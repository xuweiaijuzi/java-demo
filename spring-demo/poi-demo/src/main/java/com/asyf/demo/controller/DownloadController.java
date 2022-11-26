package com.asyf.demo.controller;

import cn.hutool.core.io.resource.ClassPathResource;
import com.asyf.demo.utils.ExcelUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yjz
 * @Date 2021/8/16 15:43
 */
@RestController
@Api(tags = "下载模块")
@RequestMapping(value = "/download")
public class DownloadController {

    @GetMapping("/downloadExcel")
    @ApiOperation(value = "下载excel模板", notes = "easypoi")
    public void downloadExcel(HttpServletResponse response, HttpServletRequest request) throws Exception {
        String path = "/templates/2250.xlsx";
        String fileName = "模板" + path.substring(path.lastIndexOf("/") + 1);
        downloadExcel(response, path, fileName);
    }

    //下载excel模板
    public void downloadExcel(HttpServletResponse response, String path, String fileName) throws IOException {
        // 将文件名称进行编码
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        response.setContentType("content-type:octet-stream");
        OutputStream outputStream = response.getOutputStream();
        ClassPathResource resource = new ClassPathResource(path);
        //方式二
        FileCopyUtils.copy(resource.getStream(), outputStream);

        //方式一
        InputStream inputStream = null;
        try {
            //读取服务器端模板文件
//            inputStream = resource.getStream();
//            //将流中内容写出去
//            outputStream = response.getOutputStream();
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = inputStream.read(buffer)) != -1) {
//                outputStream.write(buffer, 0, len);
//            }
//            outputStream.flush();
        } finally {
//            if (inputStream != null) {
//                inputStream.close();
//            }
//            if (outputStream != null) {
//                outputStream.close();
//            }
        }

    }

    //Java 将List＜Map＜String, Object＞＞导出为excel
    //http://localhost:8080/download/downloadFromMap
    @GetMapping("/downloadFromMap")
    @ApiOperation(value = "将List＜Map＜String, Object＞＞导出为excel", notes = "poi")
    public void downloadFromMap(HttpServletResponse response, HttpServletRequest request) throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("姓名", i);
            map.put("年龄", i);
            map.put("性别", i);
            list.add(map);
        }
        try (HSSFWorkbook workbook = ExcelUtil.createExcel(list); OutputStream outputStream = ExcelUtil.getOutputStream(response, "excel测试文件.xlsx")) {
            workbook.write(outputStream);
        }
    }


}
