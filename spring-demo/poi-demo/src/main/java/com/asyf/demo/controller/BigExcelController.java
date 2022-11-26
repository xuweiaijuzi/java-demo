package com.asyf.demo.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.handler.inter.IExcelExportServer;
import cn.hutool.core.bean.BeanUtil;
import com.asyf.demo.pojo.GetDataByDynamicInputDto;
import com.asyf.demo.pojo.MsgClient;
import com.asyf.demo.pojo.MsgClientGroup;
import com.asyf.demo.utils.ExcelUtil;
import com.asyf.demo.utils.TextUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//http://localhost:8080/monitor/applications
//monitor monitor
@RestController
@Api(tags = "POI大数据量导出")
@RequestMapping(value = "/bigExcel")
@Slf4j
public class BigExcelController {

    private ExecutorService executorService = Executors.newFixedThreadPool(5);

    //文档地址：http://doc.wupaas.com/docs/easypoi/easypoi-1c10lbsojh62f
    //官方demo：https://gitee.com/lemur/easypoi-test/commit/ac79b18d00874ef039a7ebf592f94c8eb29a69e7
    @RequestMapping(value = "export", method = RequestMethod.GET)
    @ApiOperation(value = "导出大量数据(easypoi)", notes = "官方demo")
    @ApiImplicitParams({})
    public void export(HttpServletResponse response, HttpServletRequest request) throws Exception {

        Workbook workbook = null;
        Date start = new Date();
        ExportParams params = new ExportParams("大数据测试", "测试");

        IExcelExportServer iExcelExportServer = new IExcelExportServer() {

            //这个方法会被循环调用 page每次+1
            @SneakyThrows
            @Override
            public List<Object> selectListForExcelExport(Object queryParams, int page) {
                log.info("当前查询第{}页数据", page);
                if (queryParams instanceof GetDataByDynamicInputDto) {
                    GetDataByDynamicInputDto params = (GetDataByDynamicInputDto) queryParams;
                    params.setPageNum(page++);
                    return (List<Object>) getPageData(params);
                }
                return null;
            }
        };
        GetDataByDynamicInputDto getDataByDynamicInputDto = new GetDataByDynamicInputDto();
        workbook = ExcelExportUtil.exportBigExcel(params, MsgClient.class, iExcelExportServer, getDataByDynamicInputDto);
        downLoadExcel("test" + System.currentTimeMillis() + ".xlsx", response, workbook);
        System.out.println(new Date().getTime() - start.getTime());
        workbook.close();
    }

    @RequestMapping(value = "export2", method = RequestMethod.GET)
    @ApiOperation(value = "导出大量数据(poi)", notes = "官方demo")
    @ApiImplicitParams({})
    public void export2(HttpServletResponse response, HttpServletRequest request) throws Exception {

        Workbook workbook = null;
        Date start = new Date();
        ExportParams params = new ExportParams("大数据测试", "测试");

        GetDataByDynamicInputDto getDataByDynamicInputDto = new GetDataByDynamicInputDto();
        getDataByDynamicInputDto.setPageSize(200 * 10000);
        getDataByDynamicInputDto.setPageNum(1);
        List<MsgClient> list = (List<MsgClient>) getPageData(getDataByDynamicInputDto);
        workbook = ExcelExportUtil.exportExcel(params, MsgClient.class, list);
        downLoadExcel("test" + System.currentTimeMillis() + ".xlsx", response, workbook);
        System.out.println(new Date().getTime() - start.getTime());
        workbook.close();
    }

    @RequestMapping(value = "export3", method = RequestMethod.GET)
    @ApiOperation(value = "导出大量数据(List<Map>)", notes = "SXSSFWorkbook")
    @ApiImplicitParams({})
    public void export3(HttpServletResponse response, HttpServletRequest request) throws Exception {

        Workbook workbook = null;
        Date start = new Date();
        Map<String, Object> params = new HashMap<>();
        params.put("pageSize", 5000);
        workbook = ExcelUtil.exportBigExcel(params, (param, page) -> {
            param.put("pageNum", page);
            //查询数据
            List<Map<String, Object>> list = getPageData2(param);
            return list;
        });
        downLoadExcel("test" + System.currentTimeMillis() + ".xlsx", response, workbook);
        System.out.println(new Date().getTime() - start.getTime());
        workbook.close();
    }

    @RequestMapping(value = "export4", method = RequestMethod.GET)
    @ApiOperation(value = "导出大量数据(csv)", notes = "csv")
    @ApiImplicitParams({})
    public void export4(HttpServletResponse response, HttpServletRequest request) throws Exception {

        Date start = new Date();
        Map<String, Object> params = new HashMap<>();
        params.put("pageSize", 10000);
        ExcelUtil.exportCsv(params, response, (param, page) -> {
            param.put("pageNum", page);
            //查询数据
            List<Map<String, Object>> list = getPageData2(param);
            return list;
        });
        System.out.println("耗时:" + (new Date().getTime() - start.getTime()));
    }

    @RequestMapping(value = "export5", method = RequestMethod.GET)
    @ApiOperation(value = "导出大量数据(zip)", notes = "csv")
    @ApiImplicitParams({})
    public void export5(HttpServletResponse response, HttpServletRequest request) throws Exception {
        Date start = new Date();
        Map<String, Object> params = new HashMap<>();
        params.put("pageSize", 10000);
        String fileName = "csv_" + System.currentTimeMillis();
        ExcelUtil.exportCsvZip(params, response, fileName, 100000, (param, page) -> {
            param.put("pageNum", page);
            //查询数据
            List<Map<String, Object>> list = getPageData2(param);
            return list;
        });
        log.info("耗时:{}", (new Date().getTime() - start.getTime()));
    }

    @RequestMapping(value = "export6", method = RequestMethod.GET)
    @ApiOperation(value = "导出大量数据(txt)", notes = "txt")
    @ApiImplicitParams({})
    public void export6(HttpServletResponse response, HttpServletRequest request) throws Exception {

        Date start = new Date();
        Map<String, Object> params = new HashMap<>();
        params.put("pageSize", 1000);
        String fileName = System.currentTimeMillis() + ".txt";
        TextUtil.exportBigText(params, response, fileName, (param, page) -> {
            //查询数据
            Map<String, Object> param2 = (Map<String, Object>) param;
            param2.put("pageNum", page);
            List<Map<String, Object>> list = getPageData2(param2);
            return list;
        });
        System.out.println("耗时:" + (new Date().getTime() - start.getTime()));
    }

    private Object getPageData(GetDataByDynamicInputDto params) {
        List<MsgClient> list = new ArrayList<MsgClient>();
        int pageNum = params.getPageNum();
        int pageSize = params.getPageSize();
        int offset = (pageNum - 1) * pageSize;
        //查询页数限制
        if (pageNum > 200) {//每页1000条
            return list;
        }
        for (int i = offset; i < offset + pageSize; i++) {
            MsgClient client = new MsgClient();
            client.setBirthday(new Date());
            client.setClientName("小明" + i);
            client.setClientPhone("18797" + i);
            client.setCreateBy("JueYue");
            client.setId(String.valueOf(1 + i));
            client.setRemark("测试" + i);
            MsgClientGroup group = new MsgClientGroup();
            group.setGroupName("测试" + i);
            client.setGroup(group);
            list.add(client);
        }
        return list;
    }

    //模拟查询数据库
    private List<Map<String, Object>> getPageData2(Map<String, Object> params) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        int pageNum = (int) params.get("pageNum");
        int pageSize = (int) params.get("pageSize");
        int offset = (pageNum - 1) * pageSize;
        //查询页数限制
        if (pageNum > 200) {
            return list;
        }
        for (int i = offset; i < offset + pageSize; i++) {
            MsgClient client = new MsgClient();
            client.setBirthday(new Date());
            client.setClientName("小明" + i);
            client.setClientPhone("18797" + i);
            client.setCreateBy("JueYue");
            client.setId(String.valueOf(1 + i));
            client.setRemark("测试" + i);
            Map<String, Object> map = BeanUtil.beanToMap(client);
            list.add(map);
        }
        return list;
    }


    private void downLoadExcel(String fileName, HttpServletResponse response, Workbook workbook) {
        try (OutputStream out = response.getOutputStream();) {
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            response.setHeader("content-Type", "application/vnd.ms-excel");
            workbook.write(out);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
