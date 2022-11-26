package com.asyf.demo.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.asyf.demo.pojo.DateDemo;
import com.asyf.demo.pojo.ExcelDemo;
import com.asyf.demo.pojo.FrMasSwineInformationDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @Author yjz
 * @Date 2021/8/16 13:59
 */
@RestController
@Api(tags = "poi测试模块")
@RequestMapping(value = "/poi")
public class ExcelController {

    @RequestMapping(value = "demo", method = RequestMethod.POST)
    public Object demo() {
        return "1";
    }

    @RequestMapping(value = "import", method = RequestMethod.POST)
    @ApiOperation(value = "导入测试", notes = "easypoi")
    @ApiImplicitParams({
    })
    public Object importTest(@RequestParam(value = "file") MultipartFile file,
                             HttpServletResponse response, HttpServletRequest request) throws Exception {
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
//        importParams.setTitleRows(1);
        importParams.setStartSheetIndex(0);
        importParams.setSheetNum(1);
        List<ExcelDemo> list = ExcelImportUtil.importExcel(file.getInputStream(), ExcelDemo.class, importParams);
        //List<FrMasSwineInformationDto> list = result.getList();
        return list;
    }

    @RequestMapping(value = "import2", method = RequestMethod.POST)
    @ApiOperation(value = "导入测试2", notes = "easypoi")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "farmOrg", value = "农场代码", required = true, dataType = "String", paramType = "query", defaultValue = "031222111")
    })
    public Object swineInfoImport(@NotBlank(message = "农场代码必填") String farmOrg,
                                  @RequestParam(value = "file") MultipartFile file,
                                  HttpServletResponse response, HttpServletRequest request) throws Exception {
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
//        importParams.setTitleRows(1);
        importParams.setStartSheetIndex(0);
        importParams.setSheetNum(1);
        List<FrMasSwineInformationDto> list = ExcelImportUtil.importExcel(file.getInputStream(), FrMasSwineInformationDto.class, importParams);
        //List<FrMasSwineInformationDto> list = result.getList();
        return list;
    }

    @RequestMapping(value = "import3", method = RequestMethod.POST)
    @ApiOperation(value = "导入测试日期格式", notes = "easypoi")
    @ApiImplicitParams({})
    public Object importTest3(@RequestParam(value = "file") MultipartFile file,
                              HttpServletResponse response, HttpServletRequest request) throws Exception {
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
        importParams.setStartSheetIndex(0);
        importParams.setSheetNum(1);
        List<DateDemo> list = ExcelImportUtil.importExcel(file.getInputStream(), DateDemo.class, importParams);
        return list;
    }

}
