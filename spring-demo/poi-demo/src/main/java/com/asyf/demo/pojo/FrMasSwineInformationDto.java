package com.asyf.demo.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class FrMasSwineInformationDto {

    @ApiModelProperty(value = "分公司代码")
    private String orgCode;
    @ApiModelProperty(value = "农场代码")
    private String farmOrg;
    @ApiModelProperty(value = "猪耳号")
    @Excel(name = "上系统后耳标*")
    private String swineId;
    @ApiModelProperty(value = "猪详情编码")
    private String swineTrack;
    @ApiModelProperty(value = "猪生成时间标识")
    private String swineDateIn;
    @ApiModelProperty(value = "性别")
    //@Excel(name = "猪性别*", isImportField = "true")
    private String sex;
    @ApiModelProperty(value = "品种")
    private String breeder;
    @ApiModelProperty(value = "出生周")
    private String birthWeek;
    @ApiModelProperty(value = "出生时间")
    private Date birthDate;
    @ApiModelProperty(value = "重量")
    private BigDecimal weight;
    @ApiModelProperty(value = "当前状态")
    private String activityType;
    @ApiModelProperty(value = "状态时间")
    private Date activityDate;
    @ApiModelProperty(value = "胎次")
    private String litno1;
    @ApiModelProperty(value = "配种次数")
    private String litno2;
    @ApiModelProperty(value = "配种组")
    private String mateGroup;
    @ApiModelProperty(value = "上次状态")
    private String lastActivityType;
    @ApiModelProperty(value = "上次状态时间")
    private Date lastActivityDate;
    @ApiModelProperty(value = "上次胎次")
    private String lastLitno1;
    @ApiModelProperty(value = "上次配种次数")
    private String lastLitno2;
    @ApiModelProperty(value = "上次配种组")
    private String lastMateGroup;

    private String transferFlg;
    @ApiModelProperty(value = "转进时间")
    private Date transferInDate;
    @ApiModelProperty(value = "转进公司")
    private String transferInOrgCode;
    @ApiModelProperty(value = "转进农场")
    private String transferInFarmOrg;
    @ApiModelProperty(value = "转出时间")
    private Date transferOutDate;
    @ApiModelProperty(value = "转出分公司")
    private String transferOutOrgCode;
    @ApiModelProperty(value = "转出农场代码")
    private String transferOutFarmOrg;
    @ApiModelProperty(value = "猪母亲耳号")
    private String swineDamId;
    @ApiModelProperty(value = "猪母亲详情编码")
    private String swineDamTrack;
    @ApiModelProperty(value = "猪母亲生成时间标识")
    private String swineDamDateIn;
    @ApiModelProperty(value = "猪父亲耳号")
    private String swineSirId;
    @ApiModelProperty(value = "猪父亲详情编码")
    private String swineSirTrack;
    @ApiModelProperty(value = "猪父亲时间标识")
    private String swineSirDateIn;
    @ApiModelProperty(value = "取消标识")
    private String cancelFlag;
    @ApiModelProperty(value = "取消时间")
    private Date cancelDate;
    @ApiModelProperty(value = "操作人")
    private String userCreate;
    @ApiModelProperty(value = "操作时间")
    private Date createDate;
    @ApiModelProperty(value = "上次操作人")
    private String lastUserId;
    @ApiModelProperty(value = "上次更新时间")
    private Date lastUpdateDate;
    @ApiModelProperty(value = "参考单据类型")
    private String refDocumentType;
    @ApiModelProperty(value = "参考单据单号")
    private String refDocumentNo;
    @ApiModelProperty(value = "参考单据")
    private String refDocumentExt;
    private String trnInActivityType;
    private Date trnInActivityDate;
    private String trnInLitno1;
    private String trnInLitno2;
    private String trnInMateGroup;
    private String replaceFarmOrgLoc;
    private String releaseFarmOrgLoc;
    private String atbirthFarmOrgLoc;
    private Date replaceDate;
    private String replaceMateGroup;
    private String replaceLitno1;
    private String replaceLitno2;
    private String verBreederFarmOrg;
    private String genFlg;
    @ApiModelProperty(value = "第一次配种时间")
    private Date firstMate;
    private Date preReplaceDate;
    private String nickName;
    private Short numberOfSendingData;
    private String function;

}