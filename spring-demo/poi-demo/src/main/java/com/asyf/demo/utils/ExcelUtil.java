package com.asyf.demo.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * poi版本 4.1.1
 * CSVPrinter版本 1.8
 */
@Slf4j
public class ExcelUtil {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("姓名", i);
            map.put("年龄", i);
            map.put("性别", i);
            list.add(map);
        }
        HSSFWorkbook workbook = ExcelUtil.createExcel(list);
        File file = new File("C:\\Users\\yangjianzhang\\Desktop\\a.xls");
        workbook.write(file);
        workbook.close();
        System.out.println("执行完成");
    }

    /**
     * 生成工作簿
     * 将List＜Map＜String, Object＞＞转为 HSSFWorkbook
     *
     * @param list
     * @return
     */
    public static HSSFWorkbook createExcel(List<Map<String, Object>> list) {
        //定义一个新的工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建Excel的sheet
        HSSFSheet sheet = workbook.createSheet("sheet1");
        //设置表头
        Map<String, Object> map = list.get(0);
        int num = 0;
        HSSFRow first = sheet.createRow(0);//创建sheet的第一行
        for (String key : map.keySet()) {
            //创建单元格并赋值
            first.createCell(num).setCellValue(key);
            num++;
        }

        //从list取第一行到最后一行的内容并放到对应的Excel里，若记录里某字段值没有会有问题
        int rowNum = 1;//行数
        for (Map<String, Object> data : list) {
            HSSFRow row = sheet.createRow(rowNum);//创建sheet的第rownum+1行
            int n = 0;//列数
            for (String key : data.keySet()) {
                row.createCell(n).setCellValue(data.get(key) != null ? data.get(key).toString() : "");
                n++;
            }
            rowNum++;
        }
        return workbook;
    }

    /**
     * 导出excel-分页查询数据
     * <p>
     * 将List＜Map＜String, Object＞＞转为 SXSSFWorkbook(大数据量文件使用)
     * 参考： https://www.cnblogs.com/renjiaqi/p/11731768.html
     */
    public static SXSSFWorkbook exportBigExcel(Map<String, Object> queryParams, MyExcelExportServer server) {
        //这样表示SXSSFWorkbook只会保留100条数据在内存中，其它的数据都会写到磁盘里，这样的话占用的内存就会很少
        SXSSFWorkbook workbook = new SXSSFWorkbook(100);
        //创建Excel的sheet
        SXSSFSheet sheet = workbook.createSheet("sheet1");
        //从list取第一行到最后一行的内容并放到对应的Excel里，若记录里某字段值没有会有问题
        int rowNum = 0;//行数
        int page = 1;
        int var6 = page + 1;

        for (List<Map<String, Object>> list = server.selectListForExcelExport(queryParams, page); list != null && list.size() > 0; list = server.selectListForExcelExport(queryParams, var6++)) {
            if (rowNum == 0) {
                //设置表头
                int n = 0;//列数
                Map<String, Object> map = list.get(0);
                SXSSFRow first = sheet.createRow(0);//创建sheet的第一行
                for (String key : map.keySet()) {
                    //创建单元格并赋值
                    first.createCell(n).setCellValue(key);
                    n++;
                }
                rowNum++;
            }
            for (Map<String, Object> data : list) {
                SXSSFRow row = sheet.createRow(rowNum);//创建sheet的第rownum+1行
                int n = 0;//列数
                for (String key : data.keySet()) {
                    row.createCell(n).setCellValue(data.get(key) != null ? data.get(key).toString() : "");
                    n++;
                }
                rowNum++;
            }
        }
        return workbook;
    }

    /**
     * 导出csv-分页查询数据
     * 参考：https://www.cnblogs.com/cjsblog/p/9260421.html
     *
     * @param queryParams
     * @param response
     * @param server
     * @throws IOException
     */
    public static void exportCsv(Map<String, Object> queryParams, HttpServletResponse response, MyExcelExportServer server) throws IOException {
        //使用临时文件
        String fileName = UUID.randomUUID().toString();
        File file = File.createTempFile(fileName, ".csv");
        FileWriter writer = null;
        CSVPrinter printer = null;
        FileInputStream inputStream = null;
        try (OutputStream out = response.getOutputStream()) {
            writer = new FileWriter(file);
            printer = CSVFormat.EXCEL.print(writer);
            List<Object> tempList = new ArrayList<>();

            //从list取第一行到最后一行的内容并放到对应的Excel里，若记录里某字段值没有会有问题
            int rowNum = 0;//行数
            int page = 1;
            int var6 = page + 1;

            for (List<Map<String, Object>> list = server.selectListForExcelExport(queryParams, page); list != null && list.size() > 0; list = server.selectListForExcelExport(queryParams, var6++)) {
                if (rowNum == 0) {
                    //设置表头
                    Map<String, Object> map = list.get(0);
                    //创建sheet的第一行标题
                    tempList.addAll(map.keySet());
                    //写入数据
                    printer.printRecord(tempList);
                    tempList.clear();
                    rowNum++;
                }
                for (Map<String, Object> data : list) {
                    for (String key : data.keySet()) {
                        tempList.add(data.get(key) != null ? data.get(key).toString() : "");
                    }
                    //写入数据
                    printer.printRecord(tempList);
                    //log.info(JSONUtil.toJsonStr(tempList));
                    tempList.clear();
                    rowNum++;
                }
            }
            printer.flush();//必须执行，否则会出现丢失末尾数据的问题
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".csv", "UTF-8"));
            response.setContentType("text/csv");
            inputStream = new FileInputStream(file);
            FileCopyUtils.copy(inputStream, out);
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (printer != null) {
                printer.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            boolean delete = file.delete();
            log.info("删除临时文件:{}", file.getName());
        }
    }

    /**
     * 导出csv压缩包-分页查询数据
     *
     * @param queryParams  查询参数
     * @param response     输出
     * @param fileName     文件名
     * @param fileRowCount 文件行数
     * @param server       查询数据接口
     * @throws IOException IO异常
     */
    public static void exportCsvZip(Map<String, Object> queryParams, HttpServletResponse response, String fileName, int fileRowCount, MyExcelExportServer server) throws IOException {
        //使用临时文件
        List<File> fileList = new ArrayList<>();
        //设置response参数
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".zip", "UTF-8"));
        response.setContentType("application/x-zip-compressed");
        File file = null;
        FileWriter writer = null;
        CSVPrinter printer = null;
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(response.getOutputStream());) {
            List<Object> tempList = new ArrayList<>();

            //从list取第一行到最后一行的内容并放到对应的Excel里，若记录里某字段值没有会有问题
            int rowNum = 0;//行数
            int page = 1;
            int var6 = page + 1;
            //文件号
            int fileNum = 1;

            for (List<Map<String, Object>> list = server.selectListForExcelExport(queryParams, page); list != null && list.size() > 0; list = server.selectListForExcelExport(queryParams, var6++)) {
                //分sheet的条件（excel最大支持 1048576 (2的20次方)行数据）
                int pageNum = (int) queryParams.get("pageNum");
                int pageSize = (int) queryParams.get("pageSize");
                int fileNumNew = (pageSize * pageNum - 1) / fileRowCount + 1;//计算文件数
                log.info("第{}个文件,查询页数{}", fileNum, pageNum);
                if (fileNumNew > fileNum) {//创建临时文件
                    fileNum = fileNumNew;
                    file = File.createTempFile(fileNum + "_" + fileName, ".csv");
                    fileList.add(file);
                    if (writer != null) {
                        writer.close();
                    }
                    if (printer != null) {
                        printer.close();
                    }
                    writer = new FileWriter(file);
                    printer = CSVFormat.EXCEL.print(writer);
                }
                if (file == null) {//首次创建临时文件
                    file = File.createTempFile(fileNum + "_" + fileName, ".csv");
                    fileList.add(file);
                    writer = new FileWriter(file);
                    printer = CSVFormat.EXCEL.print(writer);
                }
                if (rowNum == 0) {
                    //设置表头
                    Map<String, Object> map = list.get(0);
                    //创建sheet的第一行标题
                    tempList.addAll(map.keySet());
                    //写入数据
                    printer.printRecord(tempList);
                    tempList.clear();
                    rowNum++;
                }
                for (Map<String, Object> data : list) {
                    for (String key : data.keySet()) {
                        tempList.add(data.get(key) != null ? data.get(key).toString() : "");
                    }
                    //写入数据
                    printer.printRecord(tempList);
                    //log.info(JSONUtil.toJsonStr(tempList));
                    tempList.clear();
                    rowNum++;
                }
                printer.flush();//必须执行，否则会出现丢失末尾数据的问题
            }

            //输出文件
            int i = 1;
            for (File f : fileList) {
                zipOutputStream.putNextEntry(new ZipEntry(String.format("%0" + String.valueOf(fileList.size()).length() + "d", i++) + "_" + fileName + ".csv"));
                byte[] buf = new byte[1024];
                int len;
                try (FileInputStream in = new FileInputStream(f)) {
                    while ((len = in.read(buf)) != -1) {
                        zipOutputStream.write(buf, 0, len);
                    }
                }
            }
            zipOutputStream.flush();
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (printer != null) {
                printer.close();
            }
            for (File f : fileList) {
                boolean delete = f.delete();
                log.info("删除临时文件:{},删除结果:{}", file.getName(), delete);
            }
        }
    }

    /**
     * 获取输出流
     *
     * @param response
     * @param fileName
     * @return
     * @throws IOException
     */
    public static OutputStream getOutputStream(HttpServletResponse response, String fileName) throws IOException {
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        response.setContentType("content-type:octet-stream");
        return response.getOutputStream();
    }

    /**
     * 导出excel
     *
     * @param list
     * @param response
     * @param fileName
     * @throws IOException
     */
    public static void exportExcel(List<Map<String, Object>> list, HttpServletResponse response, String fileName) throws IOException {
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        response.setContentType("content-type:octet-stream");
        try (OutputStream outputStream = response.getOutputStream(); Workbook workbook = createExcel(list)) {
            //导出
            workbook.write(outputStream);
        }
    }

    /**
     * 导入excel
     *
     * @param file
     * @param sheetName
     * @param rowNum    数据起始行数 首行从0开始
     * @return
     * @throws IOException
     */
    public static List<Map<String, Object>> importExcel(MultipartFile file, String sheetName, int rowNum) throws IOException {
        String name = file.getOriginalFilename();
        Workbook workbook = null;
        List<Map<String, Object>> list = new ArrayList<>();
        try (InputStream is = file.getInputStream();) {
            // 创建excel操作对象
            if (name.contains(".xlsx") || name.contains(".xls")) {
                //使用工厂方法创建.
                workbook = WorkbookFactory.create(is);
            }
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("sheet不存在");
            }
            //获得数据的总行数
            int totalRowNum = sheet.getLastRowNum();
            //获得总列数
            int cellLength = sheet.getRow(0).getPhysicalNumberOfCells();
            //获取表头
            Row firstRow = sheet.getRow(0);
            List<String> keys = new ArrayList<>();
            for (int i = 0; i < cellLength; i++) {
                Cell cell = firstRow.getCell(i);
                keys.add(String.valueOf(getCellValue(cell)));
            }
            //从第i行开始获取
            for (int i = rowNum; i <= totalRowNum; i++) {
                Map<String, Object> map = new LinkedHashMap<>();
                //获得第i行对象
                Row row = sheet.getRow(i);
                // 遇到空行则结束
                if (row == null) {
                    break;
                }
                //如果一行里的所有单元格都为空则不放进list里面
                int a = 0;
                for (int j = 0; j < cellLength; j++) {
                    Cell cell = row.getCell(j);
                    if (cell == null) {
                        continue;
                    }
                    // 获取列值
                    Object value = getCellValue(cell);
                    map.put(keys.get(j), value);
                }
                if (!checkNullMap(map)) {
                    list.add(map);
                }
            }
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
        return list;
    }

//======================================== 私有方法 ========================================

    //如果map存储的value都是null返回true
    private static boolean checkNullMap(Map<String, Object> map) {
        for (Object value : map.values()) {
            if (Objects.nonNull(value))
                return false;
        }
        return true;
    }

    private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellType();
        Object cellValue = null;

        if (cellType == CellType._NONE) {

        } else if (cellType == CellType.NUMERIC) {
            // 数值型
            if (DateUtil.isCellDateFormatted(cell)) {
                // 日期类型
                Date d = cell.getDateCellValue();
                cellValue = dateTimeFormatter.format(LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault()));
            } else {
                double numericCellValue = cell.getNumericCellValue();
                BigDecimal bdVal = new BigDecimal(numericCellValue);
                if ((bdVal + ".0").equals(Double.toString(numericCellValue))) {
                    // 整型
                    cellValue = bdVal;
                } else if (String.valueOf(numericCellValue).contains("E10")) {
                    // 科学记数法
                    cellValue = new BigDecimal(numericCellValue).toPlainString();
                } else {
                    // 浮点型
                    cellValue = numericCellValue;
                }
            }
        } else if (cellType == CellType.STRING) {
            // 字符串型
            cellValue = cell.getStringCellValue();
            if (cellValue != null) {
                cellValue = cellValue.toString().trim();
            }
        } else if (cellType == CellType.FORMULA) {
            // 公式型
        } else if (cellType == CellType.BLANK) {
            // 空值
        } else if (cellType == CellType.BOOLEAN) {
            // 布尔型
            cellValue = cell.getBooleanCellValue();
        } else if (cellType == CellType.ERROR) {
            // 错误
            cellValue = cell.getErrorCellValue();
        }

        log.info("cellType={}, cellValue={}", cellType.name(), cellValue);
        return cellValue;
    }

    //======================================== 接口 ========================================
    public interface MyExcelExportServer {

        List<Map<String, Object>> selectListForExcelExport(Map<String, Object> var1, int page);
    }

}