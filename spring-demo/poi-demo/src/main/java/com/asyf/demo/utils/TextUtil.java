package com.asyf.demo.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.FileCopyUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author yjz
 * @Date 2022/3/24 16:31
 * 问题 1 查询内存溢出 select *
 * 问题 2 文件创建需要太多的对象（excel需要很多）
 */
@Slf4j
public class TextUtil {

    /**
     * 导出文件
     *
     * @param list
     * @param response
     * @param fileName
     */
    public static void exportText(List<Map<String, Object>> list, HttpServletResponse response, String fileName) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + new String(fileName.getBytes("GBK"), "iso8859-1"));
        response.setContentType("text/plain");
        try (ServletOutputStream outputStream = response.getOutputStream();) {
            StringBuilder sb = new StringBuilder();
            Map<String, Object> map = list.get(0);
            Set<String> keys = map.keySet();
            Iterator<String> iterator = keys.iterator();
            while (iterator.hasNext()) {
                sb.append(iterator.next()).append("\t");
            }
            sb.append("\n");
            for (Map<String, Object> dataMap : list) {
                Iterator<String> iterator1 = dataMap.keySet().iterator();
                while (iterator1.hasNext()) {
                    String key = iterator1.next();
                    Object o = dataMap.get(key);
                    sb.append(o == null ? "" : o).append("\t");
                }
                sb.append("\n");
            }
            outputStream.write(sb.toString().getBytes());
        }
    }

    /**
     * 导出txt-分页查询数据
     */
    public static void exportBigText(Object queryParams, HttpServletResponse response, String fileName, MyExportServer server) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + new String(fileName.getBytes("GBK"), "iso8859-1"));
        response.setContentType("text/plain");
        File file = File.createTempFile(fileName, ".txt");
        FileInputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try (OutputStream out = response.getOutputStream()) {
            fileOutputStream = new FileOutputStream(file);
            //从list取第一行到最后一行的内容并放到对应的Excel里，若记录里某字段值没有会有问题
            int rowNum = 0;//行数
            int page = 1;
            int var6 = page + 1;
            StringBuilder sb = new StringBuilder();
            for (List<Map<String, Object>> list = server.selectListForExcelExport(queryParams, page); list != null && list.size() > 0; list = server.selectListForExcelExport(queryParams, var6++)) {
                if (rowNum == 0) {
                    //设置表头
                    Map<String, Object> map = list.get(0);
                    Set<String> keys = map.keySet();
                    Iterator<String> iterator = keys.iterator();
                    while (iterator.hasNext()) {
                        sb.append(iterator.next()).append("\t");
                    }
                    sb.append("\n");
                    rowNum++;
                }
                for (Map<String, Object> dataMap : list) {
                    Iterator<String> iterator1 = dataMap.keySet().iterator();
                    while (iterator1.hasNext()) {
                        String key = iterator1.next();
                        Object value = dataMap.get(key);
                        sb.append(value == null ? "" : value).append("\t");
                    }
                    sb.append("\n");
                    rowNum++;
                }
                fileOutputStream.write(sb.toString().getBytes());
                sb.setLength(0);
            }
            //输出到文件
            inputStream = new FileInputStream(file);
            FileCopyUtils.copy(inputStream, out);
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            boolean delete = file.delete();
            log.info("删除临时文件:{},结果{}", file.getName(), delete);
        }
    }

    //======================================== 接口 ========================================
    public interface MyExportServer {

        List<Map<String, Object>> selectListForExcelExport(Object o, int page);
    }

}
