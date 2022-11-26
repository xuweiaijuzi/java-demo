
package com.asyf.demo.customer.client2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>_-bic_-azetw00012 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="_-bic_-azetw00012">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rclnt" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Rldnr" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Rbukrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Gjahr" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/>
 *         &lt;element name="Belnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Docln" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Recordmode" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Ryear" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/>
 *         &lt;element name="Rrcty" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Rmvct" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Vorgn" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Vrgng" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Bttype" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Awtyp" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Awsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Aworg" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Awref" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Awitem" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Awitgrp" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Subta" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Xreversing" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Xreversed" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Xtruerev" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="AwtypRev" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="AworgRev" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="AwrefRev" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="SubtaRev" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Xsettling" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Xsettled" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="PrecAwtyp" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="PrecAworg" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="PrecAwref" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="PrecAwitem" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="PrecSubta" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="PrecAwmult" type="{urn:sap-com:document:sap:rfc:functions}byte16"/>
 *         &lt;element name="Rtcur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Rwcur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Rhcur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Rkcur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Rocur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Rvcur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Rfcur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="RcoOcur" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Runit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Rvunit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Rrunit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Qunit1" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Qunit2" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Qunit3" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Racct" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Rcntr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Prctr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Rfarea" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Rbusa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Kokrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Segment" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Scntr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Pprctr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Sfarea" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Sbusa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Rassc" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Psegment" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Tsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Wsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Ksl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Osl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Vsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Fsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Kfsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Psl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Pfsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="CoOsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hsalk3" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Ksalk3" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Osalk3" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Vsalk3" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hsalkv" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Ksalkv" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Osalkv" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Vsalkv" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hpvprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Kpvprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Opvprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Vpvprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hstprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Kstprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Ostprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Vstprs" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hslalt" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Kslalt" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Oslalt" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Vslalt" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hslext" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Kslext" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Oslext" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Vslext" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hvkwrt" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Hvksal" type="{urn:sap-com:document:sap:rfc:functions}decimal23.2"/>
 *         &lt;element name="Msl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Mfsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Vmsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Vmfsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Rmsl" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Quant1" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Quant2" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Quant3" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Lbkum" type="{urn:sap-com:document:sap:rfc:functions}decimal23.3"/>
 *         &lt;element name="Drcrk" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Poper" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Periv" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Fiscyearper" type="{urn:sap-com:document:sap:rfc:functions}char7"/>
 *         &lt;element name="Budat" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Bldat" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Blart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Buzei" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Zuonr" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Bschl" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Bstat" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Linetype" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Ktosl" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Slalittype" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Xsplitmod" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Usnam" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Timestamp" type="{urn:sap-com:document:sap:rfc:functions}decimal15.0"/>
 *         &lt;element name="Eprctr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Rhoart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="GlaccountType" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Ktopl" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Lokkt" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ktop2" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Rebzg" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Rebzj" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Rebzz" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Rebzt" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Rbest" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Ebeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ebelp" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Zekkn" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Sgtxt" type="{urn:sap-com:document:sap:rfc:functions}char50"/>
 *         &lt;element name="Kdauf" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Kdpos" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Lifnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Kunnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Koart" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Umskz" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Mwskz" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Hbkid" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Hktid" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Xopvw" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Augdt" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Augbl" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Auggj" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Afabe" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Anln1" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Anln2" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Bzdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Anbwa" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Movcat" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="DeprPeriod" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Anlgr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Anlgr2" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SettlementRule" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Kalnr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Vprsv" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Mlast" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Kzbws" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Xobew" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Sobkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Vtstamp" type="{urn:sap-com:document:sap:rfc:functions}decimal21.7"/>
 *         &lt;element name="MatKdauf" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="MatKdpos" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="MatPspnr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="MatPsPosid" type="{urn:sap-com:document:sap:rfc:functions}char24"/>
 *         &lt;element name="MatLifnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Bwtar" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Bwkey" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Hpeinh" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/>
 *         &lt;element name="Kpeinh" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/>
 *         &lt;element name="Opeinh" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/>
 *         &lt;element name="Vpeinh" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/>
 *         &lt;element name="Mlptyp" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Mlcateg" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Qsbvalt" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Qsprocess" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Perart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="RacctSender" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="AccasSender" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="AccastySender" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Objnr" type="{urn:sap-com:document:sap:rfc:functions}char22"/>
 *         &lt;element name="Hrkft" type="{urn:sap-com:document:sap:rfc:functions}char14"/>
 *         &lt;element name="Hkgrp" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Parob1" type="{urn:sap-com:document:sap:rfc:functions}char22"/>
 *         &lt;element name="Parobsrc" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Uspob" type="{urn:sap-com:document:sap:rfc:functions}char22"/>
 *         &lt;element name="CoBelkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="CoBeknz" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Beltp" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Muvflg" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Gkont" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Gkoar" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Erlkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Pernr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Paobjnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="XpaobjnrCoRel" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Scope" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Logsyso" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Pbukrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Pscope" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Logsysp" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Bwstrat" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="ObjnrHk" type="{urn:sap-com:document:sap:rfc:functions}char22"/>
 *         &lt;element name="AufnrOrg" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Ukostl" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ulstar" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Uprznr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Accas" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="Accasty" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Lstar" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Aufnr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Autyp" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="PsPosid" type="{urn:sap-com:document:sap:rfc:functions}char24"/>
 *         &lt;element name="PsPspid" type="{urn:sap-com:document:sap:rfc:functions}char24"/>
 *         &lt;element name="Nplnr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="NplnrVorgn" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Prznr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Kstrg" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Bemot" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Qmnum" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Erkrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Paccas" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="Paccasty" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Plstar" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Paufnr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Pautyp" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="PpsPosid" type="{urn:sap-com:document:sap:rfc:functions}char24"/>
 *         &lt;element name="PpsPspid" type="{urn:sap-com:document:sap:rfc:functions}char24"/>
 *         &lt;element name="Pkdauf" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Pkdpos" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Ppaobjnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Pnplnr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="PnplnrVorgn" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Pprznr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Pkstrg" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="CoAccastyN1" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="CoAccastyN2" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="CoAccastyN3" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="CoZlenr" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="CoBelnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="CoBuzei" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="CoRefbz" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="WorkItemId" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Fkart" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Vkorg" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Vtweg" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Spart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="MatnrCopa" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Matkl" type="{urn:sap-com:document:sap:rfc:functions}char9"/>
 *         &lt;element name="Kdgrp" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Land1" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Brsch" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Bzirk" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Kunre" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Kunwe" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Konzs" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="AcdocCopaEewDummyPa" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="KmmaklPa" type="{urn:sap-com:document:sap:rfc:functions}char9"/>
 *         &lt;element name="Ww012Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww013Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww014Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww015Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww016Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww020Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww018Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww002Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww022Pa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="DwerkPa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="ExtwgPa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Katr4Pa" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Katr5Pa" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Katr6Pa" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Katr7Pa" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Katr8Pa" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="KunrgPa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="KtgrmPa" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="KuklaPa" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="PstyvPa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="VgbelPa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="VgposPa" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="VsbedPa" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="LgortPa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="MtartPa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="LaborPa" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="AdrnrPa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="KmkdgrPa" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="KmvkbuPa" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="KmvkgrPa" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="KmvtnrPa" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="ProdhPa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww037Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww038Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww039Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww040Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="PartnerPa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww041Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww042Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww043Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww044Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww045Pa" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Ww046Pa" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Ww047Pa" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Ww048Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww049Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww050Pa" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Ww051Pa" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Ww052Pa" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Ww053Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww054Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww055Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww056Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww057Pa" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Ww058Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww059Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ww036Pa" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="ReBukrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="ReAccount" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Fikrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Fistl" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Measure" type="{urn:sap-com:document:sap:rfc:functions}char24"/>
 *         &lt;element name="Rfund" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="RgrantNbr" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="RbudgetPd" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Sfund" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="SgrantNbr" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="SbudgetPd" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Vname" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Egrup" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Recid" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Vptnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Btype" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Etype" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Prodper" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Swenr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Sgenr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Sgrnr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Smenr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Recnnr" type="{urn:sap-com:document:sap:rfc:functions}char13"/>
 *         &lt;element name="Snksl" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Sempsl" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Dabrz" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Pswenr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Psgenr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Psgrnr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Psmenr" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Precnnr" type="{urn:sap-com:document:sap:rfc:functions}char13"/>
 *         &lt;element name="Psnksl" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Psempsl" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Pdabrz" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="AcdocEewDummy" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Zzfi01" type="{urn:sap-com:document:sap:rfc:functions}char22"/>
 *         &lt;element name="Zzfi02" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="MigSource" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="MigDocln" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="Dataaging" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Zfysl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_-bic_-azetw00012", propOrder = {
    "rclnt",
    "rldnr",
    "rbukrs",
    "gjahr",
    "belnr",
    "docln",
    "recordmode",
    "ryear",
    "rrcty",
    "rmvct",
    "vorgn",
    "vrgng",
    "bttype",
    "awtyp",
    "awsys",
    "aworg",
    "awref",
    "awitem",
    "awitgrp",
    "subta",
    "xreversing",
    "xreversed",
    "xtruerev",
    "awtypRev",
    "aworgRev",
    "awrefRev",
    "subtaRev",
    "xsettling",
    "xsettled",
    "precAwtyp",
    "precAworg",
    "precAwref",
    "precAwitem",
    "precSubta",
    "precAwmult",
    "rtcur",
    "rwcur",
    "rhcur",
    "rkcur",
    "rocur",
    "rvcur",
    "rfcur",
    "rcoOcur",
    "runit",
    "rvunit",
    "rrunit",
    "qunit1",
    "qunit2",
    "qunit3",
    "racct",
    "rcntr",
    "prctr",
    "rfarea",
    "rbusa",
    "kokrs",
    "segment",
    "scntr",
    "pprctr",
    "sfarea",
    "sbusa",
    "rassc",
    "psegment",
    "tsl",
    "wsl",
    "hsl",
    "ksl",
    "osl",
    "vsl",
    "fsl",
    "kfsl",
    "psl",
    "pfsl",
    "coOsl",
    "hsalk3",
    "ksalk3",
    "osalk3",
    "vsalk3",
    "hsalkv",
    "ksalkv",
    "osalkv",
    "vsalkv",
    "hpvprs",
    "kpvprs",
    "opvprs",
    "vpvprs",
    "hstprs",
    "kstprs",
    "ostprs",
    "vstprs",
    "hslalt",
    "kslalt",
    "oslalt",
    "vslalt",
    "hslext",
    "kslext",
    "oslext",
    "vslext",
    "hvkwrt",
    "hvksal",
    "msl",
    "mfsl",
    "vmsl",
    "vmfsl",
    "rmsl",
    "quant1",
    "quant2",
    "quant3",
    "lbkum",
    "drcrk",
    "poper",
    "periv",
    "fiscyearper",
    "budat",
    "bldat",
    "blart",
    "buzei",
    "zuonr",
    "bschl",
    "bstat",
    "linetype",
    "ktosl",
    "slalittype",
    "xsplitmod",
    "usnam",
    "timestamp",
    "eprctr",
    "rhoart",
    "glaccountType",
    "ktopl",
    "lokkt",
    "ktop2",
    "rebzg",
    "rebzj",
    "rebzz",
    "rebzt",
    "rbest",
    "ebeln",
    "ebelp",
    "zekkn",
    "sgtxt",
    "kdauf",
    "kdpos",
    "matnr",
    "werks",
    "lifnr",
    "kunnr",
    "koart",
    "umskz",
    "mwskz",
    "hbkid",
    "hktid",
    "xopvw",
    "augdt",
    "augbl",
    "auggj",
    "afabe",
    "anln1",
    "anln2",
    "bzdat",
    "anbwa",
    "movcat",
    "deprPeriod",
    "anlgr",
    "anlgr2",
    "settlementRule",
    "kalnr",
    "vprsv",
    "mlast",
    "kzbws",
    "xobew",
    "sobkz",
    "vtstamp",
    "matKdauf",
    "matKdpos",
    "matPspnr",
    "matPsPosid",
    "matLifnr",
    "bwtar",
    "bwkey",
    "hpeinh",
    "kpeinh",
    "opeinh",
    "vpeinh",
    "mlptyp",
    "mlcateg",
    "qsbvalt",
    "qsprocess",
    "perart",
    "racctSender",
    "accasSender",
    "accastySender",
    "objnr",
    "hrkft",
    "hkgrp",
    "parob1",
    "parobsrc",
    "uspob",
    "coBelkz",
    "coBeknz",
    "beltp",
    "muvflg",
    "gkont",
    "gkoar",
    "erlkz",
    "pernr",
    "paobjnr",
    "xpaobjnrCoRel",
    "scope",
    "logsyso",
    "pbukrs",
    "pscope",
    "logsysp",
    "bwstrat",
    "objnrHk",
    "aufnrOrg",
    "ukostl",
    "ulstar",
    "uprznr",
    "accas",
    "accasty",
    "lstar",
    "aufnr",
    "autyp",
    "psPosid",
    "psPspid",
    "nplnr",
    "nplnrVorgn",
    "prznr",
    "kstrg",
    "bemot",
    "qmnum",
    "erkrs",
    "paccas",
    "paccasty",
    "plstar",
    "paufnr",
    "pautyp",
    "ppsPosid",
    "ppsPspid",
    "pkdauf",
    "pkdpos",
    "ppaobjnr",
    "pnplnr",
    "pnplnrVorgn",
    "pprznr",
    "pkstrg",
    "coAccastyN1",
    "coAccastyN2",
    "coAccastyN3",
    "coZlenr",
    "coBelnr",
    "coBuzei",
    "coRefbz",
    "workItemId",
    "fkart",
    "vkorg",
    "vtweg",
    "spart",
    "matnrCopa",
    "matkl",
    "kdgrp",
    "land1",
    "brsch",
    "bzirk",
    "kunre",
    "kunwe",
    "konzs",
    "acdocCopaEewDummyPa",
    "kmmaklPa",
    "ww012Pa",
    "ww013Pa",
    "ww014Pa",
    "ww015Pa",
    "ww016Pa",
    "ww020Pa",
    "ww018Pa",
    "ww002Pa",
    "ww022Pa",
    "dwerkPa",
    "extwgPa",
    "katr4Pa",
    "katr5Pa",
    "katr6Pa",
    "katr7Pa",
    "katr8Pa",
    "kunrgPa",
    "ktgrmPa",
    "kuklaPa",
    "pstyvPa",
    "vgbelPa",
    "vgposPa",
    "vsbedPa",
    "lgortPa",
    "mtartPa",
    "laborPa",
    "adrnrPa",
    "kmkdgrPa",
    "kmvkbuPa",
    "kmvkgrPa",
    "kmvtnrPa",
    "prodhPa",
    "ww037Pa",
    "ww038Pa",
    "ww039Pa",
    "ww040Pa",
    "partnerPa",
    "ww041Pa",
    "ww042Pa",
    "ww043Pa",
    "ww044Pa",
    "ww045Pa",
    "ww046Pa",
    "ww047Pa",
    "ww048Pa",
    "ww049Pa",
    "ww050Pa",
    "ww051Pa",
    "ww052Pa",
    "ww053Pa",
    "ww054Pa",
    "ww055Pa",
    "ww056Pa",
    "ww057Pa",
    "ww058Pa",
    "ww059Pa",
    "ww036Pa",
    "reBukrs",
    "reAccount",
    "fikrs",
    "fistl",
    "measure",
    "rfund",
    "rgrantNbr",
    "rbudgetPd",
    "sfund",
    "sgrantNbr",
    "sbudgetPd",
    "vname",
    "egrup",
    "recid",
    "vptnr",
    "btype",
    "etype",
    "prodper",
    "swenr",
    "sgenr",
    "sgrnr",
    "smenr",
    "recnnr",
    "snksl",
    "sempsl",
    "dabrz",
    "pswenr",
    "psgenr",
    "psgrnr",
    "psmenr",
    "precnnr",
    "psnksl",
    "psempsl",
    "pdabrz",
    "acdocEewDummy",
    "zzfi01",
    "zzfi02",
    "migSource",
    "migDocln",
    "dataaging",
    "zfysl"
})
public class BicAzetw00012 {

    @XmlElement(name = "Rclnt", required = true)
    protected String rclnt;
    @XmlElement(name = "Rldnr", required = true)
    protected String rldnr;
    @XmlElement(name = "Rbukrs", required = true)
    protected String rbukrs;
    @XmlElement(name = "Gjahr", required = true)
    protected String gjahr;
    @XmlElement(name = "Belnr", required = true)
    protected String belnr;
    @XmlElement(name = "Docln", required = true)
    protected String docln;
    @XmlElement(name = "Recordmode", required = true)
    protected String recordmode;
    @XmlElement(name = "Ryear", required = true)
    protected String ryear;
    @XmlElement(name = "Rrcty", required = true)
    protected String rrcty;
    @XmlElement(name = "Rmvct", required = true)
    protected String rmvct;
    @XmlElement(name = "Vorgn", required = true)
    protected String vorgn;
    @XmlElement(name = "Vrgng", required = true)
    protected String vrgng;
    @XmlElement(name = "Bttype", required = true)
    protected String bttype;
    @XmlElement(name = "Awtyp", required = true)
    protected String awtyp;
    @XmlElement(name = "Awsys", required = true)
    protected String awsys;
    @XmlElement(name = "Aworg", required = true)
    protected String aworg;
    @XmlElement(name = "Awref", required = true)
    protected String awref;
    @XmlElement(name = "Awitem", required = true)
    protected String awitem;
    @XmlElement(name = "Awitgrp", required = true)
    protected String awitgrp;
    @XmlElement(name = "Subta", required = true)
    protected String subta;
    @XmlElement(name = "Xreversing", required = true)
    protected String xreversing;
    @XmlElement(name = "Xreversed", required = true)
    protected String xreversed;
    @XmlElement(name = "Xtruerev", required = true)
    protected String xtruerev;
    @XmlElement(name = "AwtypRev", required = true)
    protected String awtypRev;
    @XmlElement(name = "AworgRev", required = true)
    protected String aworgRev;
    @XmlElement(name = "AwrefRev", required = true)
    protected String awrefRev;
    @XmlElement(name = "SubtaRev", required = true)
    protected String subtaRev;
    @XmlElement(name = "Xsettling", required = true)
    protected String xsettling;
    @XmlElement(name = "Xsettled", required = true)
    protected String xsettled;
    @XmlElement(name = "PrecAwtyp", required = true)
    protected String precAwtyp;
    @XmlElement(name = "PrecAworg", required = true)
    protected String precAworg;
    @XmlElement(name = "PrecAwref", required = true)
    protected String precAwref;
    @XmlElement(name = "PrecAwitem", required = true)
    protected String precAwitem;
    @XmlElement(name = "PrecSubta", required = true)
    protected String precSubta;
    @XmlElement(name = "PrecAwmult", required = true)
    protected byte[] precAwmult;
    @XmlElement(name = "Rtcur", required = true)
    protected String rtcur;
    @XmlElement(name = "Rwcur", required = true)
    protected String rwcur;
    @XmlElement(name = "Rhcur", required = true)
    protected String rhcur;
    @XmlElement(name = "Rkcur", required = true)
    protected String rkcur;
    @XmlElement(name = "Rocur", required = true)
    protected String rocur;
    @XmlElement(name = "Rvcur", required = true)
    protected String rvcur;
    @XmlElement(name = "Rfcur", required = true)
    protected String rfcur;
    @XmlElement(name = "RcoOcur", required = true)
    protected String rcoOcur;
    @XmlElement(name = "Runit", required = true)
    protected String runit;
    @XmlElement(name = "Rvunit", required = true)
    protected String rvunit;
    @XmlElement(name = "Rrunit", required = true)
    protected String rrunit;
    @XmlElement(name = "Qunit1", required = true)
    protected String qunit1;
    @XmlElement(name = "Qunit2", required = true)
    protected String qunit2;
    @XmlElement(name = "Qunit3", required = true)
    protected String qunit3;
    @XmlElement(name = "Racct", required = true)
    protected String racct;
    @XmlElement(name = "Rcntr", required = true)
    protected String rcntr;
    @XmlElement(name = "Prctr", required = true)
    protected String prctr;
    @XmlElement(name = "Rfarea", required = true)
    protected String rfarea;
    @XmlElement(name = "Rbusa", required = true)
    protected String rbusa;
    @XmlElement(name = "Kokrs", required = true)
    protected String kokrs;
    @XmlElement(name = "Segment", required = true)
    protected String segment;
    @XmlElement(name = "Scntr", required = true)
    protected String scntr;
    @XmlElement(name = "Pprctr", required = true)
    protected String pprctr;
    @XmlElement(name = "Sfarea", required = true)
    protected String sfarea;
    @XmlElement(name = "Sbusa", required = true)
    protected String sbusa;
    @XmlElement(name = "Rassc", required = true)
    protected String rassc;
    @XmlElement(name = "Psegment", required = true)
    protected String psegment;
    @XmlElement(name = "Tsl", required = true)
    protected BigDecimal tsl;
    @XmlElement(name = "Wsl", required = true)
    protected BigDecimal wsl;
    @XmlElement(name = "Hsl", required = true)
    protected BigDecimal hsl;
    @XmlElement(name = "Ksl", required = true)
    protected BigDecimal ksl;
    @XmlElement(name = "Osl", required = true)
    protected BigDecimal osl;
    @XmlElement(name = "Vsl", required = true)
    protected BigDecimal vsl;
    @XmlElement(name = "Fsl", required = true)
    protected BigDecimal fsl;
    @XmlElement(name = "Kfsl", required = true)
    protected BigDecimal kfsl;
    @XmlElement(name = "Psl", required = true)
    protected BigDecimal psl;
    @XmlElement(name = "Pfsl", required = true)
    protected BigDecimal pfsl;
    @XmlElement(name = "CoOsl", required = true)
    protected BigDecimal coOsl;
    @XmlElement(name = "Hsalk3", required = true)
    protected BigDecimal hsalk3;
    @XmlElement(name = "Ksalk3", required = true)
    protected BigDecimal ksalk3;
    @XmlElement(name = "Osalk3", required = true)
    protected BigDecimal osalk3;
    @XmlElement(name = "Vsalk3", required = true)
    protected BigDecimal vsalk3;
    @XmlElement(name = "Hsalkv", required = true)
    protected BigDecimal hsalkv;
    @XmlElement(name = "Ksalkv", required = true)
    protected BigDecimal ksalkv;
    @XmlElement(name = "Osalkv", required = true)
    protected BigDecimal osalkv;
    @XmlElement(name = "Vsalkv", required = true)
    protected BigDecimal vsalkv;
    @XmlElement(name = "Hpvprs", required = true)
    protected BigDecimal hpvprs;
    @XmlElement(name = "Kpvprs", required = true)
    protected BigDecimal kpvprs;
    @XmlElement(name = "Opvprs", required = true)
    protected BigDecimal opvprs;
    @XmlElement(name = "Vpvprs", required = true)
    protected BigDecimal vpvprs;
    @XmlElement(name = "Hstprs", required = true)
    protected BigDecimal hstprs;
    @XmlElement(name = "Kstprs", required = true)
    protected BigDecimal kstprs;
    @XmlElement(name = "Ostprs", required = true)
    protected BigDecimal ostprs;
    @XmlElement(name = "Vstprs", required = true)
    protected BigDecimal vstprs;
    @XmlElement(name = "Hslalt", required = true)
    protected BigDecimal hslalt;
    @XmlElement(name = "Kslalt", required = true)
    protected BigDecimal kslalt;
    @XmlElement(name = "Oslalt", required = true)
    protected BigDecimal oslalt;
    @XmlElement(name = "Vslalt", required = true)
    protected BigDecimal vslalt;
    @XmlElement(name = "Hslext", required = true)
    protected BigDecimal hslext;
    @XmlElement(name = "Kslext", required = true)
    protected BigDecimal kslext;
    @XmlElement(name = "Oslext", required = true)
    protected BigDecimal oslext;
    @XmlElement(name = "Vslext", required = true)
    protected BigDecimal vslext;
    @XmlElement(name = "Hvkwrt", required = true)
    protected BigDecimal hvkwrt;
    @XmlElement(name = "Hvksal", required = true)
    protected BigDecimal hvksal;
    @XmlElement(name = "Msl", required = true)
    protected BigDecimal msl;
    @XmlElement(name = "Mfsl", required = true)
    protected BigDecimal mfsl;
    @XmlElement(name = "Vmsl", required = true)
    protected BigDecimal vmsl;
    @XmlElement(name = "Vmfsl", required = true)
    protected BigDecimal vmfsl;
    @XmlElement(name = "Rmsl", required = true)
    protected BigDecimal rmsl;
    @XmlElement(name = "Quant1", required = true)
    protected BigDecimal quant1;
    @XmlElement(name = "Quant2", required = true)
    protected BigDecimal quant2;
    @XmlElement(name = "Quant3", required = true)
    protected BigDecimal quant3;
    @XmlElement(name = "Lbkum", required = true)
    protected BigDecimal lbkum;
    @XmlElement(name = "Drcrk", required = true)
    protected String drcrk;
    @XmlElement(name = "Poper", required = true)
    protected String poper;
    @XmlElement(name = "Periv", required = true)
    protected String periv;
    @XmlElement(name = "Fiscyearper", required = true)
    protected String fiscyearper;
    @XmlElement(name = "Budat", required = true)
    protected String budat;
    @XmlElement(name = "Bldat", required = true)
    protected String bldat;
    @XmlElement(name = "Blart", required = true)
    protected String blart;
    @XmlElement(name = "Buzei", required = true)
    protected String buzei;
    @XmlElement(name = "Zuonr", required = true)
    protected String zuonr;
    @XmlElement(name = "Bschl", required = true)
    protected String bschl;
    @XmlElement(name = "Bstat", required = true)
    protected String bstat;
    @XmlElement(name = "Linetype", required = true)
    protected String linetype;
    @XmlElement(name = "Ktosl", required = true)
    protected String ktosl;
    @XmlElement(name = "Slalittype", required = true)
    protected String slalittype;
    @XmlElement(name = "Xsplitmod", required = true)
    protected String xsplitmod;
    @XmlElement(name = "Usnam", required = true)
    protected String usnam;
    @XmlElement(name = "Timestamp", required = true)
    protected BigDecimal timestamp;
    @XmlElement(name = "Eprctr", required = true)
    protected String eprctr;
    @XmlElement(name = "Rhoart", required = true)
    protected String rhoart;
    @XmlElement(name = "GlaccountType", required = true)
    protected String glaccountType;
    @XmlElement(name = "Ktopl", required = true)
    protected String ktopl;
    @XmlElement(name = "Lokkt", required = true)
    protected String lokkt;
    @XmlElement(name = "Ktop2", required = true)
    protected String ktop2;
    @XmlElement(name = "Rebzg", required = true)
    protected String rebzg;
    @XmlElement(name = "Rebzj", required = true)
    protected String rebzj;
    @XmlElement(name = "Rebzz", required = true)
    protected String rebzz;
    @XmlElement(name = "Rebzt", required = true)
    protected String rebzt;
    @XmlElement(name = "Rbest", required = true)
    protected String rbest;
    @XmlElement(name = "Ebeln", required = true)
    protected String ebeln;
    @XmlElement(name = "Ebelp", required = true)
    protected String ebelp;
    @XmlElement(name = "Zekkn", required = true)
    protected String zekkn;
    @XmlElement(name = "Sgtxt", required = true)
    protected String sgtxt;
    @XmlElement(name = "Kdauf", required = true)
    protected String kdauf;
    @XmlElement(name = "Kdpos", required = true)
    protected String kdpos;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Lifnr", required = true)
    protected String lifnr;
    @XmlElement(name = "Kunnr", required = true)
    protected String kunnr;
    @XmlElement(name = "Koart", required = true)
    protected String koart;
    @XmlElement(name = "Umskz", required = true)
    protected String umskz;
    @XmlElement(name = "Mwskz", required = true)
    protected String mwskz;
    @XmlElement(name = "Hbkid", required = true)
    protected String hbkid;
    @XmlElement(name = "Hktid", required = true)
    protected String hktid;
    @XmlElement(name = "Xopvw", required = true)
    protected String xopvw;
    @XmlElement(name = "Augdt", required = true)
    protected String augdt;
    @XmlElement(name = "Augbl", required = true)
    protected String augbl;
    @XmlElement(name = "Auggj", required = true)
    protected String auggj;
    @XmlElement(name = "Afabe", required = true)
    protected String afabe;
    @XmlElement(name = "Anln1", required = true)
    protected String anln1;
    @XmlElement(name = "Anln2", required = true)
    protected String anln2;
    @XmlElement(name = "Bzdat", required = true)
    protected String bzdat;
    @XmlElement(name = "Anbwa", required = true)
    protected String anbwa;
    @XmlElement(name = "Movcat", required = true)
    protected String movcat;
    @XmlElement(name = "DeprPeriod", required = true)
    protected String deprPeriod;
    @XmlElement(name = "Anlgr", required = true)
    protected String anlgr;
    @XmlElement(name = "Anlgr2", required = true)
    protected String anlgr2;
    @XmlElement(name = "SettlementRule", required = true)
    protected String settlementRule;
    @XmlElement(name = "Kalnr", required = true)
    protected String kalnr;
    @XmlElement(name = "Vprsv", required = true)
    protected String vprsv;
    @XmlElement(name = "Mlast", required = true)
    protected String mlast;
    @XmlElement(name = "Kzbws", required = true)
    protected String kzbws;
    @XmlElement(name = "Xobew", required = true)
    protected String xobew;
    @XmlElement(name = "Sobkz", required = true)
    protected String sobkz;
    @XmlElement(name = "Vtstamp", required = true)
    protected BigDecimal vtstamp;
    @XmlElement(name = "MatKdauf", required = true)
    protected String matKdauf;
    @XmlElement(name = "MatKdpos", required = true)
    protected String matKdpos;
    @XmlElement(name = "MatPspnr", required = true)
    protected String matPspnr;
    @XmlElement(name = "MatPsPosid", required = true)
    protected String matPsPosid;
    @XmlElement(name = "MatLifnr", required = true)
    protected String matLifnr;
    @XmlElement(name = "Bwtar", required = true)
    protected String bwtar;
    @XmlElement(name = "Bwkey", required = true)
    protected String bwkey;
    @XmlElement(name = "Hpeinh", required = true)
    protected BigDecimal hpeinh;
    @XmlElement(name = "Kpeinh", required = true)
    protected BigDecimal kpeinh;
    @XmlElement(name = "Opeinh", required = true)
    protected BigDecimal opeinh;
    @XmlElement(name = "Vpeinh", required = true)
    protected BigDecimal vpeinh;
    @XmlElement(name = "Mlptyp", required = true)
    protected String mlptyp;
    @XmlElement(name = "Mlcateg", required = true)
    protected String mlcateg;
    @XmlElement(name = "Qsbvalt", required = true)
    protected String qsbvalt;
    @XmlElement(name = "Qsprocess", required = true)
    protected String qsprocess;
    @XmlElement(name = "Perart", required = true)
    protected String perart;
    @XmlElement(name = "RacctSender", required = true)
    protected String racctSender;
    @XmlElement(name = "AccasSender", required = true)
    protected String accasSender;
    @XmlElement(name = "AccastySender", required = true)
    protected String accastySender;
    @XmlElement(name = "Objnr", required = true)
    protected String objnr;
    @XmlElement(name = "Hrkft", required = true)
    protected String hrkft;
    @XmlElement(name = "Hkgrp", required = true)
    protected String hkgrp;
    @XmlElement(name = "Parob1", required = true)
    protected String parob1;
    @XmlElement(name = "Parobsrc", required = true)
    protected String parobsrc;
    @XmlElement(name = "Uspob", required = true)
    protected String uspob;
    @XmlElement(name = "CoBelkz", required = true)
    protected String coBelkz;
    @XmlElement(name = "CoBeknz", required = true)
    protected String coBeknz;
    @XmlElement(name = "Beltp", required = true)
    protected String beltp;
    @XmlElement(name = "Muvflg", required = true)
    protected String muvflg;
    @XmlElement(name = "Gkont", required = true)
    protected String gkont;
    @XmlElement(name = "Gkoar", required = true)
    protected String gkoar;
    @XmlElement(name = "Erlkz", required = true)
    protected String erlkz;
    @XmlElement(name = "Pernr", required = true)
    protected String pernr;
    @XmlElement(name = "Paobjnr", required = true)
    protected String paobjnr;
    @XmlElement(name = "XpaobjnrCoRel", required = true)
    protected String xpaobjnrCoRel;
    @XmlElement(name = "Scope", required = true)
    protected String scope;
    @XmlElement(name = "Logsyso", required = true)
    protected String logsyso;
    @XmlElement(name = "Pbukrs", required = true)
    protected String pbukrs;
    @XmlElement(name = "Pscope", required = true)
    protected String pscope;
    @XmlElement(name = "Logsysp", required = true)
    protected String logsysp;
    @XmlElement(name = "Bwstrat", required = true)
    protected String bwstrat;
    @XmlElement(name = "ObjnrHk", required = true)
    protected String objnrHk;
    @XmlElement(name = "AufnrOrg", required = true)
    protected String aufnrOrg;
    @XmlElement(name = "Ukostl", required = true)
    protected String ukostl;
    @XmlElement(name = "Ulstar", required = true)
    protected String ulstar;
    @XmlElement(name = "Uprznr", required = true)
    protected String uprznr;
    @XmlElement(name = "Accas", required = true)
    protected String accas;
    @XmlElement(name = "Accasty", required = true)
    protected String accasty;
    @XmlElement(name = "Lstar", required = true)
    protected String lstar;
    @XmlElement(name = "Aufnr", required = true)
    protected String aufnr;
    @XmlElement(name = "Autyp", required = true)
    protected String autyp;
    @XmlElement(name = "PsPosid", required = true)
    protected String psPosid;
    @XmlElement(name = "PsPspid", required = true)
    protected String psPspid;
    @XmlElement(name = "Nplnr", required = true)
    protected String nplnr;
    @XmlElement(name = "NplnrVorgn", required = true)
    protected String nplnrVorgn;
    @XmlElement(name = "Prznr", required = true)
    protected String prznr;
    @XmlElement(name = "Kstrg", required = true)
    protected String kstrg;
    @XmlElement(name = "Bemot", required = true)
    protected String bemot;
    @XmlElement(name = "Qmnum", required = true)
    protected String qmnum;
    @XmlElement(name = "Erkrs", required = true)
    protected String erkrs;
    @XmlElement(name = "Paccas", required = true)
    protected String paccas;
    @XmlElement(name = "Paccasty", required = true)
    protected String paccasty;
    @XmlElement(name = "Plstar", required = true)
    protected String plstar;
    @XmlElement(name = "Paufnr", required = true)
    protected String paufnr;
    @XmlElement(name = "Pautyp", required = true)
    protected String pautyp;
    @XmlElement(name = "PpsPosid", required = true)
    protected String ppsPosid;
    @XmlElement(name = "PpsPspid", required = true)
    protected String ppsPspid;
    @XmlElement(name = "Pkdauf", required = true)
    protected String pkdauf;
    @XmlElement(name = "Pkdpos", required = true)
    protected String pkdpos;
    @XmlElement(name = "Ppaobjnr", required = true)
    protected String ppaobjnr;
    @XmlElement(name = "Pnplnr", required = true)
    protected String pnplnr;
    @XmlElement(name = "PnplnrVorgn", required = true)
    protected String pnplnrVorgn;
    @XmlElement(name = "Pprznr", required = true)
    protected String pprznr;
    @XmlElement(name = "Pkstrg", required = true)
    protected String pkstrg;
    @XmlElement(name = "CoAccastyN1", required = true)
    protected String coAccastyN1;
    @XmlElement(name = "CoAccastyN2", required = true)
    protected String coAccastyN2;
    @XmlElement(name = "CoAccastyN3", required = true)
    protected String coAccastyN3;
    @XmlElement(name = "CoZlenr", required = true)
    protected String coZlenr;
    @XmlElement(name = "CoBelnr", required = true)
    protected String coBelnr;
    @XmlElement(name = "CoBuzei", required = true)
    protected String coBuzei;
    @XmlElement(name = "CoRefbz", required = true)
    protected String coRefbz;
    @XmlElement(name = "WorkItemId", required = true)
    protected String workItemId;
    @XmlElement(name = "Fkart", required = true)
    protected String fkart;
    @XmlElement(name = "Vkorg", required = true)
    protected String vkorg;
    @XmlElement(name = "Vtweg", required = true)
    protected String vtweg;
    @XmlElement(name = "Spart", required = true)
    protected String spart;
    @XmlElement(name = "MatnrCopa", required = true)
    protected String matnrCopa;
    @XmlElement(name = "Matkl", required = true)
    protected String matkl;
    @XmlElement(name = "Kdgrp", required = true)
    protected String kdgrp;
    @XmlElement(name = "Land1", required = true)
    protected String land1;
    @XmlElement(name = "Brsch", required = true)
    protected String brsch;
    @XmlElement(name = "Bzirk", required = true)
    protected String bzirk;
    @XmlElement(name = "Kunre", required = true)
    protected String kunre;
    @XmlElement(name = "Kunwe", required = true)
    protected String kunwe;
    @XmlElement(name = "Konzs", required = true)
    protected String konzs;
    @XmlElement(name = "AcdocCopaEewDummyPa", required = true)
    protected String acdocCopaEewDummyPa;
    @XmlElement(name = "KmmaklPa", required = true)
    protected String kmmaklPa;
    @XmlElement(name = "Ww012Pa", required = true)
    protected String ww012Pa;
    @XmlElement(name = "Ww013Pa", required = true)
    protected String ww013Pa;
    @XmlElement(name = "Ww014Pa", required = true)
    protected String ww014Pa;
    @XmlElement(name = "Ww015Pa", required = true)
    protected String ww015Pa;
    @XmlElement(name = "Ww016Pa", required = true)
    protected String ww016Pa;
    @XmlElement(name = "Ww020Pa", required = true)
    protected String ww020Pa;
    @XmlElement(name = "Ww018Pa", required = true)
    protected String ww018Pa;
    @XmlElement(name = "Ww002Pa", required = true)
    protected String ww002Pa;
    @XmlElement(name = "Ww022Pa", required = true)
    protected String ww022Pa;
    @XmlElement(name = "DwerkPa", required = true)
    protected String dwerkPa;
    @XmlElement(name = "ExtwgPa", required = true)
    protected String extwgPa;
    @XmlElement(name = "Katr4Pa", required = true)
    protected String katr4Pa;
    @XmlElement(name = "Katr5Pa", required = true)
    protected String katr5Pa;
    @XmlElement(name = "Katr6Pa", required = true)
    protected String katr6Pa;
    @XmlElement(name = "Katr7Pa", required = true)
    protected String katr7Pa;
    @XmlElement(name = "Katr8Pa", required = true)
    protected String katr8Pa;
    @XmlElement(name = "KunrgPa", required = true)
    protected String kunrgPa;
    @XmlElement(name = "KtgrmPa", required = true)
    protected String ktgrmPa;
    @XmlElement(name = "KuklaPa", required = true)
    protected String kuklaPa;
    @XmlElement(name = "PstyvPa", required = true)
    protected String pstyvPa;
    @XmlElement(name = "VgbelPa", required = true)
    protected String vgbelPa;
    @XmlElement(name = "VgposPa", required = true)
    protected String vgposPa;
    @XmlElement(name = "VsbedPa", required = true)
    protected String vsbedPa;
    @XmlElement(name = "LgortPa", required = true)
    protected String lgortPa;
    @XmlElement(name = "MtartPa", required = true)
    protected String mtartPa;
    @XmlElement(name = "LaborPa", required = true)
    protected String laborPa;
    @XmlElement(name = "AdrnrPa", required = true)
    protected String adrnrPa;
    @XmlElement(name = "KmkdgrPa", required = true)
    protected String kmkdgrPa;
    @XmlElement(name = "KmvkbuPa", required = true)
    protected String kmvkbuPa;
    @XmlElement(name = "KmvkgrPa", required = true)
    protected String kmvkgrPa;
    @XmlElement(name = "KmvtnrPa", required = true)
    protected String kmvtnrPa;
    @XmlElement(name = "ProdhPa", required = true)
    protected String prodhPa;
    @XmlElement(name = "Ww037Pa", required = true)
    protected String ww037Pa;
    @XmlElement(name = "Ww038Pa", required = true)
    protected String ww038Pa;
    @XmlElement(name = "Ww039Pa", required = true)
    protected String ww039Pa;
    @XmlElement(name = "Ww040Pa", required = true)
    protected String ww040Pa;
    @XmlElement(name = "PartnerPa", required = true)
    protected String partnerPa;
    @XmlElement(name = "Ww041Pa", required = true)
    protected String ww041Pa;
    @XmlElement(name = "Ww042Pa", required = true)
    protected String ww042Pa;
    @XmlElement(name = "Ww043Pa", required = true)
    protected String ww043Pa;
    @XmlElement(name = "Ww044Pa", required = true)
    protected String ww044Pa;
    @XmlElement(name = "Ww045Pa", required = true)
    protected String ww045Pa;
    @XmlElement(name = "Ww046Pa", required = true)
    protected String ww046Pa;
    @XmlElement(name = "Ww047Pa", required = true)
    protected String ww047Pa;
    @XmlElement(name = "Ww048Pa", required = true)
    protected String ww048Pa;
    @XmlElement(name = "Ww049Pa", required = true)
    protected String ww049Pa;
    @XmlElement(name = "Ww050Pa", required = true)
    protected String ww050Pa;
    @XmlElement(name = "Ww051Pa", required = true)
    protected String ww051Pa;
    @XmlElement(name = "Ww052Pa", required = true)
    protected String ww052Pa;
    @XmlElement(name = "Ww053Pa", required = true)
    protected String ww053Pa;
    @XmlElement(name = "Ww054Pa", required = true)
    protected String ww054Pa;
    @XmlElement(name = "Ww055Pa", required = true)
    protected String ww055Pa;
    @XmlElement(name = "Ww056Pa", required = true)
    protected String ww056Pa;
    @XmlElement(name = "Ww057Pa", required = true)
    protected String ww057Pa;
    @XmlElement(name = "Ww058Pa", required = true)
    protected String ww058Pa;
    @XmlElement(name = "Ww059Pa", required = true)
    protected String ww059Pa;
    @XmlElement(name = "Ww036Pa", required = true)
    protected String ww036Pa;
    @XmlElement(name = "ReBukrs", required = true)
    protected String reBukrs;
    @XmlElement(name = "ReAccount", required = true)
    protected String reAccount;
    @XmlElement(name = "Fikrs", required = true)
    protected String fikrs;
    @XmlElement(name = "Fistl", required = true)
    protected String fistl;
    @XmlElement(name = "Measure", required = true)
    protected String measure;
    @XmlElement(name = "Rfund", required = true)
    protected String rfund;
    @XmlElement(name = "RgrantNbr", required = true)
    protected String rgrantNbr;
    @XmlElement(name = "RbudgetPd", required = true)
    protected String rbudgetPd;
    @XmlElement(name = "Sfund", required = true)
    protected String sfund;
    @XmlElement(name = "SgrantNbr", required = true)
    protected String sgrantNbr;
    @XmlElement(name = "SbudgetPd", required = true)
    protected String sbudgetPd;
    @XmlElement(name = "Vname", required = true)
    protected String vname;
    @XmlElement(name = "Egrup", required = true)
    protected String egrup;
    @XmlElement(name = "Recid", required = true)
    protected String recid;
    @XmlElement(name = "Vptnr", required = true)
    protected String vptnr;
    @XmlElement(name = "Btype", required = true)
    protected String btype;
    @XmlElement(name = "Etype", required = true)
    protected String etype;
    @XmlElement(name = "Prodper", required = true)
    protected String prodper;
    @XmlElement(name = "Swenr", required = true)
    protected String swenr;
    @XmlElement(name = "Sgenr", required = true)
    protected String sgenr;
    @XmlElement(name = "Sgrnr", required = true)
    protected String sgrnr;
    @XmlElement(name = "Smenr", required = true)
    protected String smenr;
    @XmlElement(name = "Recnnr", required = true)
    protected String recnnr;
    @XmlElement(name = "Snksl", required = true)
    protected String snksl;
    @XmlElement(name = "Sempsl", required = true)
    protected String sempsl;
    @XmlElement(name = "Dabrz", required = true)
    protected String dabrz;
    @XmlElement(name = "Pswenr", required = true)
    protected String pswenr;
    @XmlElement(name = "Psgenr", required = true)
    protected String psgenr;
    @XmlElement(name = "Psgrnr", required = true)
    protected String psgrnr;
    @XmlElement(name = "Psmenr", required = true)
    protected String psmenr;
    @XmlElement(name = "Precnnr", required = true)
    protected String precnnr;
    @XmlElement(name = "Psnksl", required = true)
    protected String psnksl;
    @XmlElement(name = "Psempsl", required = true)
    protected String psempsl;
    @XmlElement(name = "Pdabrz", required = true)
    protected String pdabrz;
    @XmlElement(name = "AcdocEewDummy", required = true)
    protected String acdocEewDummy;
    @XmlElement(name = "Zzfi01", required = true)
    protected String zzfi01;
    @XmlElement(name = "Zzfi02", required = true)
    protected String zzfi02;
    @XmlElement(name = "MigSource", required = true)
    protected String migSource;
    @XmlElement(name = "MigDocln", required = true)
    protected String migDocln;
    @XmlElement(name = "Dataaging", required = true)
    protected String dataaging;
    @XmlElement(name = "Zfysl")
    protected int zfysl;

    /**
     * 获取rclnt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRclnt() {
        return rclnt;
    }

    /**
     * 设置rclnt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRclnt(String value) {
        this.rclnt = value;
    }

    /**
     * 获取rldnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRldnr() {
        return rldnr;
    }

    /**
     * 设置rldnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRldnr(String value) {
        this.rldnr = value;
    }

    /**
     * 获取rbukrs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbukrs() {
        return rbukrs;
    }

    /**
     * 设置rbukrs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbukrs(String value) {
        this.rbukrs = value;
    }

    /**
     * 获取gjahr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjahr() {
        return gjahr;
    }

    /**
     * 设置gjahr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjahr(String value) {
        this.gjahr = value;
    }

    /**
     * 获取belnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelnr() {
        return belnr;
    }

    /**
     * 设置belnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelnr(String value) {
        this.belnr = value;
    }

    /**
     * 获取docln属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocln() {
        return docln;
    }

    /**
     * 设置docln属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocln(String value) {
        this.docln = value;
    }

    /**
     * 获取recordmode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordmode() {
        return recordmode;
    }

    /**
     * 设置recordmode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordmode(String value) {
        this.recordmode = value;
    }

    /**
     * 获取ryear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRyear() {
        return ryear;
    }

    /**
     * 设置ryear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRyear(String value) {
        this.ryear = value;
    }

    /**
     * 获取rrcty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrcty() {
        return rrcty;
    }

    /**
     * 设置rrcty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrcty(String value) {
        this.rrcty = value;
    }

    /**
     * 获取rmvct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmvct() {
        return rmvct;
    }

    /**
     * 设置rmvct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmvct(String value) {
        this.rmvct = value;
    }

    /**
     * 获取vorgn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorgn() {
        return vorgn;
    }

    /**
     * 设置vorgn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorgn(String value) {
        this.vorgn = value;
    }

    /**
     * 获取vrgng属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrgng() {
        return vrgng;
    }

    /**
     * 设置vrgng属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrgng(String value) {
        this.vrgng = value;
    }

    /**
     * 获取bttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBttype() {
        return bttype;
    }

    /**
     * 设置bttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBttype(String value) {
        this.bttype = value;
    }

    /**
     * 获取awtyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwtyp() {
        return awtyp;
    }

    /**
     * 设置awtyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwtyp(String value) {
        this.awtyp = value;
    }

    /**
     * 获取awsys属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwsys() {
        return awsys;
    }

    /**
     * 设置awsys属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwsys(String value) {
        this.awsys = value;
    }

    /**
     * 获取aworg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAworg() {
        return aworg;
    }

    /**
     * 设置aworg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAworg(String value) {
        this.aworg = value;
    }

    /**
     * 获取awref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwref() {
        return awref;
    }

    /**
     * 设置awref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwref(String value) {
        this.awref = value;
    }

    /**
     * 获取awitem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwitem() {
        return awitem;
    }

    /**
     * 设置awitem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwitem(String value) {
        this.awitem = value;
    }

    /**
     * 获取awitgrp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwitgrp() {
        return awitgrp;
    }

    /**
     * 设置awitgrp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwitgrp(String value) {
        this.awitgrp = value;
    }

    /**
     * 获取subta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubta() {
        return subta;
    }

    /**
     * 设置subta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubta(String value) {
        this.subta = value;
    }

    /**
     * 获取xreversing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreversing() {
        return xreversing;
    }

    /**
     * 设置xreversing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreversing(String value) {
        this.xreversing = value;
    }

    /**
     * 获取xreversed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreversed() {
        return xreversed;
    }

    /**
     * 设置xreversed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreversed(String value) {
        this.xreversed = value;
    }

    /**
     * 获取xtruerev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtruerev() {
        return xtruerev;
    }

    /**
     * 设置xtruerev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtruerev(String value) {
        this.xtruerev = value;
    }

    /**
     * 获取awtypRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwtypRev() {
        return awtypRev;
    }

    /**
     * 设置awtypRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwtypRev(String value) {
        this.awtypRev = value;
    }

    /**
     * 获取aworgRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAworgRev() {
        return aworgRev;
    }

    /**
     * 设置aworgRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAworgRev(String value) {
        this.aworgRev = value;
    }

    /**
     * 获取awrefRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwrefRev() {
        return awrefRev;
    }

    /**
     * 设置awrefRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwrefRev(String value) {
        this.awrefRev = value;
    }

    /**
     * 获取subtaRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtaRev() {
        return subtaRev;
    }

    /**
     * 设置subtaRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtaRev(String value) {
        this.subtaRev = value;
    }

    /**
     * 获取xsettling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsettling() {
        return xsettling;
    }

    /**
     * 设置xsettling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsettling(String value) {
        this.xsettling = value;
    }

    /**
     * 获取xsettled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsettled() {
        return xsettled;
    }

    /**
     * 设置xsettled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsettled(String value) {
        this.xsettled = value;
    }

    /**
     * 获取precAwtyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecAwtyp() {
        return precAwtyp;
    }

    /**
     * 设置precAwtyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecAwtyp(String value) {
        this.precAwtyp = value;
    }

    /**
     * 获取precAworg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecAworg() {
        return precAworg;
    }

    /**
     * 设置precAworg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecAworg(String value) {
        this.precAworg = value;
    }

    /**
     * 获取precAwref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecAwref() {
        return precAwref;
    }

    /**
     * 设置precAwref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecAwref(String value) {
        this.precAwref = value;
    }

    /**
     * 获取precAwitem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecAwitem() {
        return precAwitem;
    }

    /**
     * 设置precAwitem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecAwitem(String value) {
        this.precAwitem = value;
    }

    /**
     * 获取precSubta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecSubta() {
        return precSubta;
    }

    /**
     * 设置precSubta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecSubta(String value) {
        this.precSubta = value;
    }

    /**
     * 获取precAwmult属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrecAwmult() {
        return precAwmult;
    }

    /**
     * 设置precAwmult属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPrecAwmult(byte[] value) {
        this.precAwmult = value;
    }

    /**
     * 获取rtcur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtcur() {
        return rtcur;
    }

    /**
     * 设置rtcur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtcur(String value) {
        this.rtcur = value;
    }

    /**
     * 获取rwcur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRwcur() {
        return rwcur;
    }

    /**
     * 设置rwcur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRwcur(String value) {
        this.rwcur = value;
    }

    /**
     * 获取rhcur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRhcur() {
        return rhcur;
    }

    /**
     * 设置rhcur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRhcur(String value) {
        this.rhcur = value;
    }

    /**
     * 获取rkcur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRkcur() {
        return rkcur;
    }

    /**
     * 设置rkcur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRkcur(String value) {
        this.rkcur = value;
    }

    /**
     * 获取rocur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRocur() {
        return rocur;
    }

    /**
     * 设置rocur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRocur(String value) {
        this.rocur = value;
    }

    /**
     * 获取rvcur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvcur() {
        return rvcur;
    }

    /**
     * 设置rvcur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRvcur(String value) {
        this.rvcur = value;
    }

    /**
     * 获取rfcur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcur() {
        return rfcur;
    }

    /**
     * 设置rfcur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcur(String value) {
        this.rfcur = value;
    }

    /**
     * 获取rcoOcur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcoOcur() {
        return rcoOcur;
    }

    /**
     * 设置rcoOcur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcoOcur(String value) {
        this.rcoOcur = value;
    }

    /**
     * 获取runit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunit() {
        return runit;
    }

    /**
     * 设置runit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunit(String value) {
        this.runit = value;
    }

    /**
     * 获取rvunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvunit() {
        return rvunit;
    }

    /**
     * 设置rvunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRvunit(String value) {
        this.rvunit = value;
    }

    /**
     * 获取rrunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrunit() {
        return rrunit;
    }

    /**
     * 设置rrunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrunit(String value) {
        this.rrunit = value;
    }

    /**
     * 获取qunit1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQunit1() {
        return qunit1;
    }

    /**
     * 设置qunit1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQunit1(String value) {
        this.qunit1 = value;
    }

    /**
     * 获取qunit2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQunit2() {
        return qunit2;
    }

    /**
     * 设置qunit2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQunit2(String value) {
        this.qunit2 = value;
    }

    /**
     * 获取qunit3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQunit3() {
        return qunit3;
    }

    /**
     * 设置qunit3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQunit3(String value) {
        this.qunit3 = value;
    }

    /**
     * 获取racct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacct() {
        return racct;
    }

    /**
     * 设置racct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacct(String value) {
        this.racct = value;
    }

    /**
     * 获取rcntr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcntr() {
        return rcntr;
    }

    /**
     * 设置rcntr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcntr(String value) {
        this.rcntr = value;
    }

    /**
     * 获取prctr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrctr() {
        return prctr;
    }

    /**
     * 设置prctr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrctr(String value) {
        this.prctr = value;
    }

    /**
     * 获取rfarea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfarea() {
        return rfarea;
    }

    /**
     * 设置rfarea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfarea(String value) {
        this.rfarea = value;
    }

    /**
     * 获取rbusa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbusa() {
        return rbusa;
    }

    /**
     * 设置rbusa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbusa(String value) {
        this.rbusa = value;
    }

    /**
     * 获取kokrs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKokrs() {
        return kokrs;
    }

    /**
     * 设置kokrs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKokrs(String value) {
        this.kokrs = value;
    }

    /**
     * 获取segment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * 设置segment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * 获取scntr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScntr() {
        return scntr;
    }

    /**
     * 设置scntr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScntr(String value) {
        this.scntr = value;
    }

    /**
     * 获取pprctr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPprctr() {
        return pprctr;
    }

    /**
     * 设置pprctr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPprctr(String value) {
        this.pprctr = value;
    }

    /**
     * 获取sfarea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfarea() {
        return sfarea;
    }

    /**
     * 设置sfarea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfarea(String value) {
        this.sfarea = value;
    }

    /**
     * 获取sbusa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbusa() {
        return sbusa;
    }

    /**
     * 设置sbusa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbusa(String value) {
        this.sbusa = value;
    }

    /**
     * 获取rassc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRassc() {
        return rassc;
    }

    /**
     * 设置rassc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRassc(String value) {
        this.rassc = value;
    }

    /**
     * 获取psegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsegment() {
        return psegment;
    }

    /**
     * 设置psegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsegment(String value) {
        this.psegment = value;
    }

    /**
     * 获取tsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTsl() {
        return tsl;
    }

    /**
     * 设置tsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTsl(BigDecimal value) {
        this.tsl = value;
    }

    /**
     * 获取wsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWsl() {
        return wsl;
    }

    /**
     * 设置wsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWsl(BigDecimal value) {
        this.wsl = value;
    }

    /**
     * 获取hsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHsl() {
        return hsl;
    }

    /**
     * 设置hsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHsl(BigDecimal value) {
        this.hsl = value;
    }

    /**
     * 获取ksl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKsl() {
        return ksl;
    }

    /**
     * 设置ksl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKsl(BigDecimal value) {
        this.ksl = value;
    }

    /**
     * 获取osl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsl() {
        return osl;
    }

    /**
     * 设置osl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsl(BigDecimal value) {
        this.osl = value;
    }

    /**
     * 获取vsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVsl() {
        return vsl;
    }

    /**
     * 设置vsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVsl(BigDecimal value) {
        this.vsl = value;
    }

    /**
     * 获取fsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFsl() {
        return fsl;
    }

    /**
     * 设置fsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFsl(BigDecimal value) {
        this.fsl = value;
    }

    /**
     * 获取kfsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKfsl() {
        return kfsl;
    }

    /**
     * 设置kfsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKfsl(BigDecimal value) {
        this.kfsl = value;
    }

    /**
     * 获取psl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPsl() {
        return psl;
    }

    /**
     * 设置psl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPsl(BigDecimal value) {
        this.psl = value;
    }

    /**
     * 获取pfsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPfsl() {
        return pfsl;
    }

    /**
     * 设置pfsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPfsl(BigDecimal value) {
        this.pfsl = value;
    }

    /**
     * 获取coOsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoOsl() {
        return coOsl;
    }

    /**
     * 设置coOsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoOsl(BigDecimal value) {
        this.coOsl = value;
    }

    /**
     * 获取hsalk3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHsalk3() {
        return hsalk3;
    }

    /**
     * 设置hsalk3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHsalk3(BigDecimal value) {
        this.hsalk3 = value;
    }

    /**
     * 获取ksalk3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKsalk3() {
        return ksalk3;
    }

    /**
     * 设置ksalk3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKsalk3(BigDecimal value) {
        this.ksalk3 = value;
    }

    /**
     * 获取osalk3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsalk3() {
        return osalk3;
    }

    /**
     * 设置osalk3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsalk3(BigDecimal value) {
        this.osalk3 = value;
    }

    /**
     * 获取vsalk3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVsalk3() {
        return vsalk3;
    }

    /**
     * 设置vsalk3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVsalk3(BigDecimal value) {
        this.vsalk3 = value;
    }

    /**
     * 获取hsalkv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHsalkv() {
        return hsalkv;
    }

    /**
     * 设置hsalkv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHsalkv(BigDecimal value) {
        this.hsalkv = value;
    }

    /**
     * 获取ksalkv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKsalkv() {
        return ksalkv;
    }

    /**
     * 设置ksalkv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKsalkv(BigDecimal value) {
        this.ksalkv = value;
    }

    /**
     * 获取osalkv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsalkv() {
        return osalkv;
    }

    /**
     * 设置osalkv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsalkv(BigDecimal value) {
        this.osalkv = value;
    }

    /**
     * 获取vsalkv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVsalkv() {
        return vsalkv;
    }

    /**
     * 设置vsalkv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVsalkv(BigDecimal value) {
        this.vsalkv = value;
    }

    /**
     * 获取hpvprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHpvprs() {
        return hpvprs;
    }

    /**
     * 设置hpvprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHpvprs(BigDecimal value) {
        this.hpvprs = value;
    }

    /**
     * 获取kpvprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKpvprs() {
        return kpvprs;
    }

    /**
     * 设置kpvprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKpvprs(BigDecimal value) {
        this.kpvprs = value;
    }

    /**
     * 获取opvprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpvprs() {
        return opvprs;
    }

    /**
     * 设置opvprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpvprs(BigDecimal value) {
        this.opvprs = value;
    }

    /**
     * 获取vpvprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVpvprs() {
        return vpvprs;
    }

    /**
     * 设置vpvprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVpvprs(BigDecimal value) {
        this.vpvprs = value;
    }

    /**
     * 获取hstprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHstprs() {
        return hstprs;
    }

    /**
     * 设置hstprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHstprs(BigDecimal value) {
        this.hstprs = value;
    }

    /**
     * 获取kstprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKstprs() {
        return kstprs;
    }

    /**
     * 设置kstprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKstprs(BigDecimal value) {
        this.kstprs = value;
    }

    /**
     * 获取ostprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOstprs() {
        return ostprs;
    }

    /**
     * 设置ostprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOstprs(BigDecimal value) {
        this.ostprs = value;
    }

    /**
     * 获取vstprs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVstprs() {
        return vstprs;
    }

    /**
     * 设置vstprs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVstprs(BigDecimal value) {
        this.vstprs = value;
    }

    /**
     * 获取hslalt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHslalt() {
        return hslalt;
    }

    /**
     * 设置hslalt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHslalt(BigDecimal value) {
        this.hslalt = value;
    }

    /**
     * 获取kslalt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKslalt() {
        return kslalt;
    }

    /**
     * 设置kslalt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKslalt(BigDecimal value) {
        this.kslalt = value;
    }

    /**
     * 获取oslalt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOslalt() {
        return oslalt;
    }

    /**
     * 设置oslalt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOslalt(BigDecimal value) {
        this.oslalt = value;
    }

    /**
     * 获取vslalt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVslalt() {
        return vslalt;
    }

    /**
     * 设置vslalt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVslalt(BigDecimal value) {
        this.vslalt = value;
    }

    /**
     * 获取hslext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHslext() {
        return hslext;
    }

    /**
     * 设置hslext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHslext(BigDecimal value) {
        this.hslext = value;
    }

    /**
     * 获取kslext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKslext() {
        return kslext;
    }

    /**
     * 设置kslext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKslext(BigDecimal value) {
        this.kslext = value;
    }

    /**
     * 获取oslext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOslext() {
        return oslext;
    }

    /**
     * 设置oslext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOslext(BigDecimal value) {
        this.oslext = value;
    }

    /**
     * 获取vslext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVslext() {
        return vslext;
    }

    /**
     * 设置vslext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVslext(BigDecimal value) {
        this.vslext = value;
    }

    /**
     * 获取hvkwrt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHvkwrt() {
        return hvkwrt;
    }

    /**
     * 设置hvkwrt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHvkwrt(BigDecimal value) {
        this.hvkwrt = value;
    }

    /**
     * 获取hvksal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHvksal() {
        return hvksal;
    }

    /**
     * 设置hvksal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHvksal(BigDecimal value) {
        this.hvksal = value;
    }

    /**
     * 获取msl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsl() {
        return msl;
    }

    /**
     * 设置msl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsl(BigDecimal value) {
        this.msl = value;
    }

    /**
     * 获取mfsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMfsl() {
        return mfsl;
    }

    /**
     * 设置mfsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMfsl(BigDecimal value) {
        this.mfsl = value;
    }

    /**
     * 获取vmsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVmsl() {
        return vmsl;
    }

    /**
     * 设置vmsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVmsl(BigDecimal value) {
        this.vmsl = value;
    }

    /**
     * 获取vmfsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVmfsl() {
        return vmfsl;
    }

    /**
     * 设置vmfsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVmfsl(BigDecimal value) {
        this.vmfsl = value;
    }

    /**
     * 获取rmsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmsl() {
        return rmsl;
    }

    /**
     * 设置rmsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRmsl(BigDecimal value) {
        this.rmsl = value;
    }

    /**
     * 获取quant1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuant1() {
        return quant1;
    }

    /**
     * 设置quant1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuant1(BigDecimal value) {
        this.quant1 = value;
    }

    /**
     * 获取quant2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuant2() {
        return quant2;
    }

    /**
     * 设置quant2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuant2(BigDecimal value) {
        this.quant2 = value;
    }

    /**
     * 获取quant3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuant3() {
        return quant3;
    }

    /**
     * 设置quant3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuant3(BigDecimal value) {
        this.quant3 = value;
    }

    /**
     * 获取lbkum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLbkum() {
        return lbkum;
    }

    /**
     * 设置lbkum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLbkum(BigDecimal value) {
        this.lbkum = value;
    }

    /**
     * 获取drcrk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrcrk() {
        return drcrk;
    }

    /**
     * 设置drcrk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrcrk(String value) {
        this.drcrk = value;
    }

    /**
     * 获取poper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoper() {
        return poper;
    }

    /**
     * 设置poper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoper(String value) {
        this.poper = value;
    }

    /**
     * 获取periv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriv() {
        return periv;
    }

    /**
     * 设置periv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriv(String value) {
        this.periv = value;
    }

    /**
     * 获取fiscyearper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscyearper() {
        return fiscyearper;
    }

    /**
     * 设置fiscyearper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscyearper(String value) {
        this.fiscyearper = value;
    }

    /**
     * 获取budat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudat() {
        return budat;
    }

    /**
     * 设置budat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudat(String value) {
        this.budat = value;
    }

    /**
     * 获取bldat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldat() {
        return bldat;
    }

    /**
     * 设置bldat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldat(String value) {
        this.bldat = value;
    }

    /**
     * 获取blart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlart() {
        return blart;
    }

    /**
     * 设置blart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlart(String value) {
        this.blart = value;
    }

    /**
     * 获取buzei属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuzei() {
        return buzei;
    }

    /**
     * 设置buzei属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuzei(String value) {
        this.buzei = value;
    }

    /**
     * 获取zuonr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZuonr() {
        return zuonr;
    }

    /**
     * 设置zuonr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZuonr(String value) {
        this.zuonr = value;
    }

    /**
     * 获取bschl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBschl() {
        return bschl;
    }

    /**
     * 设置bschl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBschl(String value) {
        this.bschl = value;
    }

    /**
     * 获取bstat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstat() {
        return bstat;
    }

    /**
     * 设置bstat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstat(String value) {
        this.bstat = value;
    }

    /**
     * 获取linetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinetype() {
        return linetype;
    }

    /**
     * 设置linetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinetype(String value) {
        this.linetype = value;
    }

    /**
     * 获取ktosl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtosl() {
        return ktosl;
    }

    /**
     * 设置ktosl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtosl(String value) {
        this.ktosl = value;
    }

    /**
     * 获取slalittype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlalittype() {
        return slalittype;
    }

    /**
     * 设置slalittype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlalittype(String value) {
        this.slalittype = value;
    }

    /**
     * 获取xsplitmod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsplitmod() {
        return xsplitmod;
    }

    /**
     * 设置xsplitmod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsplitmod(String value) {
        this.xsplitmod = value;
    }

    /**
     * 获取usnam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsnam() {
        return usnam;
    }

    /**
     * 设置usnam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsnam(String value) {
        this.usnam = value;
    }

    /**
     * 获取timestamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimestamp() {
        return timestamp;
    }

    /**
     * 设置timestamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimestamp(BigDecimal value) {
        this.timestamp = value;
    }

    /**
     * 获取eprctr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEprctr() {
        return eprctr;
    }

    /**
     * 设置eprctr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEprctr(String value) {
        this.eprctr = value;
    }

    /**
     * 获取rhoart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRhoart() {
        return rhoart;
    }

    /**
     * 设置rhoart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRhoart(String value) {
        this.rhoart = value;
    }

    /**
     * 获取glaccountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlaccountType() {
        return glaccountType;
    }

    /**
     * 设置glaccountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlaccountType(String value) {
        this.glaccountType = value;
    }

    /**
     * 获取ktopl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtopl() {
        return ktopl;
    }

    /**
     * 设置ktopl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtopl(String value) {
        this.ktopl = value;
    }

    /**
     * 获取lokkt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokkt() {
        return lokkt;
    }

    /**
     * 设置lokkt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokkt(String value) {
        this.lokkt = value;
    }

    /**
     * 获取ktop2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtop2() {
        return ktop2;
    }

    /**
     * 设置ktop2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtop2(String value) {
        this.ktop2 = value;
    }

    /**
     * 获取rebzg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebzg() {
        return rebzg;
    }

    /**
     * 设置rebzg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebzg(String value) {
        this.rebzg = value;
    }

    /**
     * 获取rebzj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebzj() {
        return rebzj;
    }

    /**
     * 设置rebzj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebzj(String value) {
        this.rebzj = value;
    }

    /**
     * 获取rebzz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebzz() {
        return rebzz;
    }

    /**
     * 设置rebzz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebzz(String value) {
        this.rebzz = value;
    }

    /**
     * 获取rebzt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebzt() {
        return rebzt;
    }

    /**
     * 设置rebzt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebzt(String value) {
        this.rebzt = value;
    }

    /**
     * 获取rbest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbest() {
        return rbest;
    }

    /**
     * 设置rbest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbest(String value) {
        this.rbest = value;
    }

    /**
     * 获取ebeln属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbeln() {
        return ebeln;
    }

    /**
     * 设置ebeln属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbeln(String value) {
        this.ebeln = value;
    }

    /**
     * 获取ebelp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbelp() {
        return ebelp;
    }

    /**
     * 设置ebelp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbelp(String value) {
        this.ebelp = value;
    }

    /**
     * 获取zekkn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZekkn() {
        return zekkn;
    }

    /**
     * 设置zekkn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZekkn(String value) {
        this.zekkn = value;
    }

    /**
     * 获取sgtxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgtxt() {
        return sgtxt;
    }

    /**
     * 设置sgtxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgtxt(String value) {
        this.sgtxt = value;
    }

    /**
     * 获取kdauf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdauf() {
        return kdauf;
    }

    /**
     * 设置kdauf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdauf(String value) {
        this.kdauf = value;
    }

    /**
     * 获取kdpos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdpos() {
        return kdpos;
    }

    /**
     * 设置kdpos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdpos(String value) {
        this.kdpos = value;
    }

    /**
     * 获取matnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatnr() {
        return matnr;
    }

    /**
     * 设置matnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatnr(String value) {
        this.matnr = value;
    }

    /**
     * 获取werks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerks() {
        return werks;
    }

    /**
     * 设置werks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerks(String value) {
        this.werks = value;
    }

    /**
     * 获取lifnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifnr() {
        return lifnr;
    }

    /**
     * 设置lifnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifnr(String value) {
        this.lifnr = value;
    }

    /**
     * 获取kunnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunnr() {
        return kunnr;
    }

    /**
     * 设置kunnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunnr(String value) {
        this.kunnr = value;
    }

    /**
     * 获取koart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoart() {
        return koart;
    }

    /**
     * 设置koart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoart(String value) {
        this.koart = value;
    }

    /**
     * 获取umskz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmskz() {
        return umskz;
    }

    /**
     * 设置umskz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmskz(String value) {
        this.umskz = value;
    }

    /**
     * 获取mwskz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMwskz() {
        return mwskz;
    }

    /**
     * 设置mwskz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwskz(String value) {
        this.mwskz = value;
    }

    /**
     * 获取hbkid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHbkid() {
        return hbkid;
    }

    /**
     * 设置hbkid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHbkid(String value) {
        this.hbkid = value;
    }

    /**
     * 获取hktid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHktid() {
        return hktid;
    }

    /**
     * 设置hktid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHktid(String value) {
        this.hktid = value;
    }

    /**
     * 获取xopvw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXopvw() {
        return xopvw;
    }

    /**
     * 设置xopvw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXopvw(String value) {
        this.xopvw = value;
    }

    /**
     * 获取augdt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAugdt() {
        return augdt;
    }

    /**
     * 设置augdt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAugdt(String value) {
        this.augdt = value;
    }

    /**
     * 获取augbl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAugbl() {
        return augbl;
    }

    /**
     * 设置augbl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAugbl(String value) {
        this.augbl = value;
    }

    /**
     * 获取auggj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuggj() {
        return auggj;
    }

    /**
     * 设置auggj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuggj(String value) {
        this.auggj = value;
    }

    /**
     * 获取afabe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfabe() {
        return afabe;
    }

    /**
     * 设置afabe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfabe(String value) {
        this.afabe = value;
    }

    /**
     * 获取anln1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnln1() {
        return anln1;
    }

    /**
     * 设置anln1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnln1(String value) {
        this.anln1 = value;
    }

    /**
     * 获取anln2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnln2() {
        return anln2;
    }

    /**
     * 设置anln2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnln2(String value) {
        this.anln2 = value;
    }

    /**
     * 获取bzdat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBzdat() {
        return bzdat;
    }

    /**
     * 设置bzdat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBzdat(String value) {
        this.bzdat = value;
    }

    /**
     * 获取anbwa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnbwa() {
        return anbwa;
    }

    /**
     * 设置anbwa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnbwa(String value) {
        this.anbwa = value;
    }

    /**
     * 获取movcat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovcat() {
        return movcat;
    }

    /**
     * 设置movcat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovcat(String value) {
        this.movcat = value;
    }

    /**
     * 获取deprPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeprPeriod() {
        return deprPeriod;
    }

    /**
     * 设置deprPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeprPeriod(String value) {
        this.deprPeriod = value;
    }

    /**
     * 获取anlgr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnlgr() {
        return anlgr;
    }

    /**
     * 设置anlgr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnlgr(String value) {
        this.anlgr = value;
    }

    /**
     * 获取anlgr2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnlgr2() {
        return anlgr2;
    }

    /**
     * 设置anlgr2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnlgr2(String value) {
        this.anlgr2 = value;
    }

    /**
     * 获取settlementRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementRule() {
        return settlementRule;
    }

    /**
     * 设置settlementRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementRule(String value) {
        this.settlementRule = value;
    }

    /**
     * 获取kalnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKalnr() {
        return kalnr;
    }

    /**
     * 设置kalnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKalnr(String value) {
        this.kalnr = value;
    }

    /**
     * 获取vprsv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVprsv() {
        return vprsv;
    }

    /**
     * 设置vprsv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVprsv(String value) {
        this.vprsv = value;
    }

    /**
     * 获取mlast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlast() {
        return mlast;
    }

    /**
     * 设置mlast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlast(String value) {
        this.mlast = value;
    }

    /**
     * 获取kzbws属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzbws() {
        return kzbws;
    }

    /**
     * 设置kzbws属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzbws(String value) {
        this.kzbws = value;
    }

    /**
     * 获取xobew属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXobew() {
        return xobew;
    }

    /**
     * 设置xobew属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXobew(String value) {
        this.xobew = value;
    }

    /**
     * 获取sobkz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobkz() {
        return sobkz;
    }

    /**
     * 设置sobkz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobkz(String value) {
        this.sobkz = value;
    }

    /**
     * 获取vtstamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVtstamp() {
        return vtstamp;
    }

    /**
     * 设置vtstamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVtstamp(BigDecimal value) {
        this.vtstamp = value;
    }

    /**
     * 获取matKdauf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatKdauf() {
        return matKdauf;
    }

    /**
     * 设置matKdauf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatKdauf(String value) {
        this.matKdauf = value;
    }

    /**
     * 获取matKdpos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatKdpos() {
        return matKdpos;
    }

    /**
     * 设置matKdpos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatKdpos(String value) {
        this.matKdpos = value;
    }

    /**
     * 获取matPspnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatPspnr() {
        return matPspnr;
    }

    /**
     * 设置matPspnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatPspnr(String value) {
        this.matPspnr = value;
    }

    /**
     * 获取matPsPosid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatPsPosid() {
        return matPsPosid;
    }

    /**
     * 设置matPsPosid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatPsPosid(String value) {
        this.matPsPosid = value;
    }

    /**
     * 获取matLifnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatLifnr() {
        return matLifnr;
    }

    /**
     * 设置matLifnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatLifnr(String value) {
        this.matLifnr = value;
    }

    /**
     * 获取bwtar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwtar() {
        return bwtar;
    }

    /**
     * 设置bwtar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwtar(String value) {
        this.bwtar = value;
    }

    /**
     * 获取bwkey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwkey() {
        return bwkey;
    }

    /**
     * 设置bwkey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwkey(String value) {
        this.bwkey = value;
    }

    /**
     * 获取hpeinh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHpeinh() {
        return hpeinh;
    }

    /**
     * 设置hpeinh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHpeinh(BigDecimal value) {
        this.hpeinh = value;
    }

    /**
     * 获取kpeinh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKpeinh() {
        return kpeinh;
    }

    /**
     * 设置kpeinh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKpeinh(BigDecimal value) {
        this.kpeinh = value;
    }

    /**
     * 获取opeinh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpeinh() {
        return opeinh;
    }

    /**
     * 设置opeinh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpeinh(BigDecimal value) {
        this.opeinh = value;
    }

    /**
     * 获取vpeinh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVpeinh() {
        return vpeinh;
    }

    /**
     * 设置vpeinh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVpeinh(BigDecimal value) {
        this.vpeinh = value;
    }

    /**
     * 获取mlptyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlptyp() {
        return mlptyp;
    }

    /**
     * 设置mlptyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlptyp(String value) {
        this.mlptyp = value;
    }

    /**
     * 获取mlcateg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlcateg() {
        return mlcateg;
    }

    /**
     * 设置mlcateg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlcateg(String value) {
        this.mlcateg = value;
    }

    /**
     * 获取qsbvalt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsbvalt() {
        return qsbvalt;
    }

    /**
     * 设置qsbvalt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsbvalt(String value) {
        this.qsbvalt = value;
    }

    /**
     * 获取qsprocess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsprocess() {
        return qsprocess;
    }

    /**
     * 设置qsprocess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsprocess(String value) {
        this.qsprocess = value;
    }

    /**
     * 获取perart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerart() {
        return perart;
    }

    /**
     * 设置perart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerart(String value) {
        this.perart = value;
    }

    /**
     * 获取racctSender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacctSender() {
        return racctSender;
    }

    /**
     * 设置racctSender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacctSender(String value) {
        this.racctSender = value;
    }

    /**
     * 获取accasSender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccasSender() {
        return accasSender;
    }

    /**
     * 设置accasSender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccasSender(String value) {
        this.accasSender = value;
    }

    /**
     * 获取accastySender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccastySender() {
        return accastySender;
    }

    /**
     * 设置accastySender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccastySender(String value) {
        this.accastySender = value;
    }

    /**
     * 获取objnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjnr() {
        return objnr;
    }

    /**
     * 设置objnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjnr(String value) {
        this.objnr = value;
    }

    /**
     * 获取hrkft属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrkft() {
        return hrkft;
    }

    /**
     * 设置hrkft属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrkft(String value) {
        this.hrkft = value;
    }

    /**
     * 获取hkgrp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHkgrp() {
        return hkgrp;
    }

    /**
     * 设置hkgrp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHkgrp(String value) {
        this.hkgrp = value;
    }

    /**
     * 获取parob1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParob1() {
        return parob1;
    }

    /**
     * 设置parob1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParob1(String value) {
        this.parob1 = value;
    }

    /**
     * 获取parobsrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParobsrc() {
        return parobsrc;
    }

    /**
     * 设置parobsrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParobsrc(String value) {
        this.parobsrc = value;
    }

    /**
     * 获取uspob属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUspob() {
        return uspob;
    }

    /**
     * 设置uspob属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUspob(String value) {
        this.uspob = value;
    }

    /**
     * 获取coBelkz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBelkz() {
        return coBelkz;
    }

    /**
     * 设置coBelkz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBelkz(String value) {
        this.coBelkz = value;
    }

    /**
     * 获取coBeknz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBeknz() {
        return coBeknz;
    }

    /**
     * 设置coBeknz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBeknz(String value) {
        this.coBeknz = value;
    }

    /**
     * 获取beltp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeltp() {
        return beltp;
    }

    /**
     * 设置beltp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeltp(String value) {
        this.beltp = value;
    }

    /**
     * 获取muvflg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuvflg() {
        return muvflg;
    }

    /**
     * 设置muvflg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuvflg(String value) {
        this.muvflg = value;
    }

    /**
     * 获取gkont属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGkont() {
        return gkont;
    }

    /**
     * 设置gkont属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGkont(String value) {
        this.gkont = value;
    }

    /**
     * 获取gkoar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGkoar() {
        return gkoar;
    }

    /**
     * 设置gkoar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGkoar(String value) {
        this.gkoar = value;
    }

    /**
     * 获取erlkz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErlkz() {
        return erlkz;
    }

    /**
     * 设置erlkz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErlkz(String value) {
        this.erlkz = value;
    }

    /**
     * 获取pernr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPernr() {
        return pernr;
    }

    /**
     * 设置pernr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPernr(String value) {
        this.pernr = value;
    }

    /**
     * 获取paobjnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaobjnr() {
        return paobjnr;
    }

    /**
     * 设置paobjnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaobjnr(String value) {
        this.paobjnr = value;
    }

    /**
     * 获取xpaobjnrCoRel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpaobjnrCoRel() {
        return xpaobjnrCoRel;
    }

    /**
     * 设置xpaobjnrCoRel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpaobjnrCoRel(String value) {
        this.xpaobjnrCoRel = value;
    }

    /**
     * 获取scope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * 设置scope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * 获取logsyso属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogsyso() {
        return logsyso;
    }

    /**
     * 设置logsyso属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogsyso(String value) {
        this.logsyso = value;
    }

    /**
     * 获取pbukrs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbukrs() {
        return pbukrs;
    }

    /**
     * 设置pbukrs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbukrs(String value) {
        this.pbukrs = value;
    }

    /**
     * 获取pscope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPscope() {
        return pscope;
    }

    /**
     * 设置pscope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPscope(String value) {
        this.pscope = value;
    }

    /**
     * 获取logsysp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogsysp() {
        return logsysp;
    }

    /**
     * 设置logsysp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogsysp(String value) {
        this.logsysp = value;
    }

    /**
     * 获取bwstrat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwstrat() {
        return bwstrat;
    }

    /**
     * 设置bwstrat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwstrat(String value) {
        this.bwstrat = value;
    }

    /**
     * 获取objnrHk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjnrHk() {
        return objnrHk;
    }

    /**
     * 设置objnrHk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjnrHk(String value) {
        this.objnrHk = value;
    }

    /**
     * 获取aufnrOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAufnrOrg() {
        return aufnrOrg;
    }

    /**
     * 设置aufnrOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAufnrOrg(String value) {
        this.aufnrOrg = value;
    }

    /**
     * 获取ukostl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUkostl() {
        return ukostl;
    }

    /**
     * 设置ukostl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUkostl(String value) {
        this.ukostl = value;
    }

    /**
     * 获取ulstar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlstar() {
        return ulstar;
    }

    /**
     * 设置ulstar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlstar(String value) {
        this.ulstar = value;
    }

    /**
     * 获取uprznr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUprznr() {
        return uprznr;
    }

    /**
     * 设置uprznr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUprznr(String value) {
        this.uprznr = value;
    }

    /**
     * 获取accas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccas() {
        return accas;
    }

    /**
     * 设置accas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccas(String value) {
        this.accas = value;
    }

    /**
     * 获取accasty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccasty() {
        return accasty;
    }

    /**
     * 设置accasty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccasty(String value) {
        this.accasty = value;
    }

    /**
     * 获取lstar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstar() {
        return lstar;
    }

    /**
     * 设置lstar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstar(String value) {
        this.lstar = value;
    }

    /**
     * 获取aufnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAufnr() {
        return aufnr;
    }

    /**
     * 设置aufnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAufnr(String value) {
        this.aufnr = value;
    }

    /**
     * 获取autyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutyp() {
        return autyp;
    }

    /**
     * 设置autyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutyp(String value) {
        this.autyp = value;
    }

    /**
     * 获取psPosid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsPosid() {
        return psPosid;
    }

    /**
     * 设置psPosid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsPosid(String value) {
        this.psPosid = value;
    }

    /**
     * 获取psPspid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsPspid() {
        return psPspid;
    }

    /**
     * 设置psPspid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsPspid(String value) {
        this.psPspid = value;
    }

    /**
     * 获取nplnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNplnr() {
        return nplnr;
    }

    /**
     * 设置nplnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNplnr(String value) {
        this.nplnr = value;
    }

    /**
     * 获取nplnrVorgn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNplnrVorgn() {
        return nplnrVorgn;
    }

    /**
     * 设置nplnrVorgn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNplnrVorgn(String value) {
        this.nplnrVorgn = value;
    }

    /**
     * 获取prznr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrznr() {
        return prznr;
    }

    /**
     * 设置prznr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrznr(String value) {
        this.prznr = value;
    }

    /**
     * 获取kstrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKstrg() {
        return kstrg;
    }

    /**
     * 设置kstrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKstrg(String value) {
        this.kstrg = value;
    }

    /**
     * 获取bemot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemot() {
        return bemot;
    }

    /**
     * 设置bemot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemot(String value) {
        this.bemot = value;
    }

    /**
     * 获取qmnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmnum() {
        return qmnum;
    }

    /**
     * 设置qmnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmnum(String value) {
        this.qmnum = value;
    }

    /**
     * 获取erkrs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErkrs() {
        return erkrs;
    }

    /**
     * 设置erkrs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErkrs(String value) {
        this.erkrs = value;
    }

    /**
     * 获取paccas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaccas() {
        return paccas;
    }

    /**
     * 设置paccas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaccas(String value) {
        this.paccas = value;
    }

    /**
     * 获取paccasty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaccasty() {
        return paccasty;
    }

    /**
     * 设置paccasty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaccasty(String value) {
        this.paccasty = value;
    }

    /**
     * 获取plstar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlstar() {
        return plstar;
    }

    /**
     * 设置plstar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlstar(String value) {
        this.plstar = value;
    }

    /**
     * 获取paufnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaufnr() {
        return paufnr;
    }

    /**
     * 设置paufnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaufnr(String value) {
        this.paufnr = value;
    }

    /**
     * 获取pautyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPautyp() {
        return pautyp;
    }

    /**
     * 设置pautyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPautyp(String value) {
        this.pautyp = value;
    }

    /**
     * 获取ppsPosid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpsPosid() {
        return ppsPosid;
    }

    /**
     * 设置ppsPosid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpsPosid(String value) {
        this.ppsPosid = value;
    }

    /**
     * 获取ppsPspid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpsPspid() {
        return ppsPspid;
    }

    /**
     * 设置ppsPspid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpsPspid(String value) {
        this.ppsPspid = value;
    }

    /**
     * 获取pkdauf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkdauf() {
        return pkdauf;
    }

    /**
     * 设置pkdauf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkdauf(String value) {
        this.pkdauf = value;
    }

    /**
     * 获取pkdpos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkdpos() {
        return pkdpos;
    }

    /**
     * 设置pkdpos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkdpos(String value) {
        this.pkdpos = value;
    }

    /**
     * 获取ppaobjnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpaobjnr() {
        return ppaobjnr;
    }

    /**
     * 设置ppaobjnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpaobjnr(String value) {
        this.ppaobjnr = value;
    }

    /**
     * 获取pnplnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnplnr() {
        return pnplnr;
    }

    /**
     * 设置pnplnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnplnr(String value) {
        this.pnplnr = value;
    }

    /**
     * 获取pnplnrVorgn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnplnrVorgn() {
        return pnplnrVorgn;
    }

    /**
     * 设置pnplnrVorgn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnplnrVorgn(String value) {
        this.pnplnrVorgn = value;
    }

    /**
     * 获取pprznr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPprznr() {
        return pprznr;
    }

    /**
     * 设置pprznr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPprznr(String value) {
        this.pprznr = value;
    }

    /**
     * 获取pkstrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkstrg() {
        return pkstrg;
    }

    /**
     * 设置pkstrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkstrg(String value) {
        this.pkstrg = value;
    }

    /**
     * 获取coAccastyN1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAccastyN1() {
        return coAccastyN1;
    }

    /**
     * 设置coAccastyN1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAccastyN1(String value) {
        this.coAccastyN1 = value;
    }

    /**
     * 获取coAccastyN2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAccastyN2() {
        return coAccastyN2;
    }

    /**
     * 设置coAccastyN2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAccastyN2(String value) {
        this.coAccastyN2 = value;
    }

    /**
     * 获取coAccastyN3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAccastyN3() {
        return coAccastyN3;
    }

    /**
     * 设置coAccastyN3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAccastyN3(String value) {
        this.coAccastyN3 = value;
    }

    /**
     * 获取coZlenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoZlenr() {
        return coZlenr;
    }

    /**
     * 设置coZlenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoZlenr(String value) {
        this.coZlenr = value;
    }

    /**
     * 获取coBelnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBelnr() {
        return coBelnr;
    }

    /**
     * 设置coBelnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBelnr(String value) {
        this.coBelnr = value;
    }

    /**
     * 获取coBuzei属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBuzei() {
        return coBuzei;
    }

    /**
     * 设置coBuzei属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBuzei(String value) {
        this.coBuzei = value;
    }

    /**
     * 获取coRefbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoRefbz() {
        return coRefbz;
    }

    /**
     * 设置coRefbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoRefbz(String value) {
        this.coRefbz = value;
    }

    /**
     * 获取workItemId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemId() {
        return workItemId;
    }

    /**
     * 设置workItemId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemId(String value) {
        this.workItemId = value;
    }

    /**
     * 获取fkart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkart() {
        return fkart;
    }

    /**
     * 设置fkart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkart(String value) {
        this.fkart = value;
    }

    /**
     * 获取vkorg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVkorg() {
        return vkorg;
    }

    /**
     * 设置vkorg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVkorg(String value) {
        this.vkorg = value;
    }

    /**
     * 获取vtweg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtweg() {
        return vtweg;
    }

    /**
     * 设置vtweg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtweg(String value) {
        this.vtweg = value;
    }

    /**
     * 获取spart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpart() {
        return spart;
    }

    /**
     * 设置spart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpart(String value) {
        this.spart = value;
    }

    /**
     * 获取matnrCopa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatnrCopa() {
        return matnrCopa;
    }

    /**
     * 设置matnrCopa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatnrCopa(String value) {
        this.matnrCopa = value;
    }

    /**
     * 获取matkl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatkl() {
        return matkl;
    }

    /**
     * 设置matkl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatkl(String value) {
        this.matkl = value;
    }

    /**
     * 获取kdgrp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdgrp() {
        return kdgrp;
    }

    /**
     * 设置kdgrp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdgrp(String value) {
        this.kdgrp = value;
    }

    /**
     * 获取land1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand1() {
        return land1;
    }

    /**
     * 设置land1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand1(String value) {
        this.land1 = value;
    }

    /**
     * 获取brsch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrsch() {
        return brsch;
    }

    /**
     * 设置brsch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrsch(String value) {
        this.brsch = value;
    }

    /**
     * 获取bzirk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBzirk() {
        return bzirk;
    }

    /**
     * 设置bzirk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBzirk(String value) {
        this.bzirk = value;
    }

    /**
     * 获取kunre属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunre() {
        return kunre;
    }

    /**
     * 设置kunre属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunre(String value) {
        this.kunre = value;
    }

    /**
     * 获取kunwe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunwe() {
        return kunwe;
    }

    /**
     * 设置kunwe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunwe(String value) {
        this.kunwe = value;
    }

    /**
     * 获取konzs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonzs() {
        return konzs;
    }

    /**
     * 设置konzs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonzs(String value) {
        this.konzs = value;
    }

    /**
     * 获取acdocCopaEewDummyPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdocCopaEewDummyPa() {
        return acdocCopaEewDummyPa;
    }

    /**
     * 设置acdocCopaEewDummyPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdocCopaEewDummyPa(String value) {
        this.acdocCopaEewDummyPa = value;
    }

    /**
     * 获取kmmaklPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmmaklPa() {
        return kmmaklPa;
    }

    /**
     * 设置kmmaklPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmmaklPa(String value) {
        this.kmmaklPa = value;
    }

    /**
     * 获取ww012Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw012Pa() {
        return ww012Pa;
    }

    /**
     * 设置ww012Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw012Pa(String value) {
        this.ww012Pa = value;
    }

    /**
     * 获取ww013Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw013Pa() {
        return ww013Pa;
    }

    /**
     * 设置ww013Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw013Pa(String value) {
        this.ww013Pa = value;
    }

    /**
     * 获取ww014Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw014Pa() {
        return ww014Pa;
    }

    /**
     * 设置ww014Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw014Pa(String value) {
        this.ww014Pa = value;
    }

    /**
     * 获取ww015Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw015Pa() {
        return ww015Pa;
    }

    /**
     * 设置ww015Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw015Pa(String value) {
        this.ww015Pa = value;
    }

    /**
     * 获取ww016Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw016Pa() {
        return ww016Pa;
    }

    /**
     * 设置ww016Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw016Pa(String value) {
        this.ww016Pa = value;
    }

    /**
     * 获取ww020Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw020Pa() {
        return ww020Pa;
    }

    /**
     * 设置ww020Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw020Pa(String value) {
        this.ww020Pa = value;
    }

    /**
     * 获取ww018Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw018Pa() {
        return ww018Pa;
    }

    /**
     * 设置ww018Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw018Pa(String value) {
        this.ww018Pa = value;
    }

    /**
     * 获取ww002Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw002Pa() {
        return ww002Pa;
    }

    /**
     * 设置ww002Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw002Pa(String value) {
        this.ww002Pa = value;
    }

    /**
     * 获取ww022Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw022Pa() {
        return ww022Pa;
    }

    /**
     * 设置ww022Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw022Pa(String value) {
        this.ww022Pa = value;
    }

    /**
     * 获取dwerkPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwerkPa() {
        return dwerkPa;
    }

    /**
     * 设置dwerkPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwerkPa(String value) {
        this.dwerkPa = value;
    }

    /**
     * 获取extwgPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtwgPa() {
        return extwgPa;
    }

    /**
     * 设置extwgPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtwgPa(String value) {
        this.extwgPa = value;
    }

    /**
     * 获取katr4Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatr4Pa() {
        return katr4Pa;
    }

    /**
     * 设置katr4Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatr4Pa(String value) {
        this.katr4Pa = value;
    }

    /**
     * 获取katr5Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatr5Pa() {
        return katr5Pa;
    }

    /**
     * 设置katr5Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatr5Pa(String value) {
        this.katr5Pa = value;
    }

    /**
     * 获取katr6Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatr6Pa() {
        return katr6Pa;
    }

    /**
     * 设置katr6Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatr6Pa(String value) {
        this.katr6Pa = value;
    }

    /**
     * 获取katr7Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatr7Pa() {
        return katr7Pa;
    }

    /**
     * 设置katr7Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatr7Pa(String value) {
        this.katr7Pa = value;
    }

    /**
     * 获取katr8Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatr8Pa() {
        return katr8Pa;
    }

    /**
     * 设置katr8Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatr8Pa(String value) {
        this.katr8Pa = value;
    }

    /**
     * 获取kunrgPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunrgPa() {
        return kunrgPa;
    }

    /**
     * 设置kunrgPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunrgPa(String value) {
        this.kunrgPa = value;
    }

    /**
     * 获取ktgrmPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtgrmPa() {
        return ktgrmPa;
    }

    /**
     * 设置ktgrmPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtgrmPa(String value) {
        this.ktgrmPa = value;
    }

    /**
     * 获取kuklaPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKuklaPa() {
        return kuklaPa;
    }

    /**
     * 设置kuklaPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKuklaPa(String value) {
        this.kuklaPa = value;
    }

    /**
     * 获取pstyvPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstyvPa() {
        return pstyvPa;
    }

    /**
     * 设置pstyvPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstyvPa(String value) {
        this.pstyvPa = value;
    }

    /**
     * 获取vgbelPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgbelPa() {
        return vgbelPa;
    }

    /**
     * 设置vgbelPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgbelPa(String value) {
        this.vgbelPa = value;
    }

    /**
     * 获取vgposPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgposPa() {
        return vgposPa;
    }

    /**
     * 设置vgposPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgposPa(String value) {
        this.vgposPa = value;
    }

    /**
     * 获取vsbedPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsbedPa() {
        return vsbedPa;
    }

    /**
     * 设置vsbedPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsbedPa(String value) {
        this.vsbedPa = value;
    }

    /**
     * 获取lgortPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgortPa() {
        return lgortPa;
    }

    /**
     * 设置lgortPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgortPa(String value) {
        this.lgortPa = value;
    }

    /**
     * 获取mtartPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtartPa() {
        return mtartPa;
    }

    /**
     * 设置mtartPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtartPa(String value) {
        this.mtartPa = value;
    }

    /**
     * 获取laborPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborPa() {
        return laborPa;
    }

    /**
     * 设置laborPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborPa(String value) {
        this.laborPa = value;
    }

    /**
     * 获取adrnrPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrnrPa() {
        return adrnrPa;
    }

    /**
     * 设置adrnrPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrnrPa(String value) {
        this.adrnrPa = value;
    }

    /**
     * 获取kmkdgrPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmkdgrPa() {
        return kmkdgrPa;
    }

    /**
     * 设置kmkdgrPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmkdgrPa(String value) {
        this.kmkdgrPa = value;
    }

    /**
     * 获取kmvkbuPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmvkbuPa() {
        return kmvkbuPa;
    }

    /**
     * 设置kmvkbuPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmvkbuPa(String value) {
        this.kmvkbuPa = value;
    }

    /**
     * 获取kmvkgrPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmvkgrPa() {
        return kmvkgrPa;
    }

    /**
     * 设置kmvkgrPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmvkgrPa(String value) {
        this.kmvkgrPa = value;
    }

    /**
     * 获取kmvtnrPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmvtnrPa() {
        return kmvtnrPa;
    }

    /**
     * 设置kmvtnrPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmvtnrPa(String value) {
        this.kmvtnrPa = value;
    }

    /**
     * 获取prodhPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdhPa() {
        return prodhPa;
    }

    /**
     * 设置prodhPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdhPa(String value) {
        this.prodhPa = value;
    }

    /**
     * 获取ww037Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw037Pa() {
        return ww037Pa;
    }

    /**
     * 设置ww037Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw037Pa(String value) {
        this.ww037Pa = value;
    }

    /**
     * 获取ww038Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw038Pa() {
        return ww038Pa;
    }

    /**
     * 设置ww038Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw038Pa(String value) {
        this.ww038Pa = value;
    }

    /**
     * 获取ww039Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw039Pa() {
        return ww039Pa;
    }

    /**
     * 设置ww039Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw039Pa(String value) {
        this.ww039Pa = value;
    }

    /**
     * 获取ww040Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw040Pa() {
        return ww040Pa;
    }

    /**
     * 设置ww040Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw040Pa(String value) {
        this.ww040Pa = value;
    }

    /**
     * 获取partnerPa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerPa() {
        return partnerPa;
    }

    /**
     * 设置partnerPa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerPa(String value) {
        this.partnerPa = value;
    }

    /**
     * 获取ww041Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw041Pa() {
        return ww041Pa;
    }

    /**
     * 设置ww041Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw041Pa(String value) {
        this.ww041Pa = value;
    }

    /**
     * 获取ww042Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw042Pa() {
        return ww042Pa;
    }

    /**
     * 设置ww042Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw042Pa(String value) {
        this.ww042Pa = value;
    }

    /**
     * 获取ww043Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw043Pa() {
        return ww043Pa;
    }

    /**
     * 设置ww043Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw043Pa(String value) {
        this.ww043Pa = value;
    }

    /**
     * 获取ww044Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw044Pa() {
        return ww044Pa;
    }

    /**
     * 设置ww044Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw044Pa(String value) {
        this.ww044Pa = value;
    }

    /**
     * 获取ww045Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw045Pa() {
        return ww045Pa;
    }

    /**
     * 设置ww045Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw045Pa(String value) {
        this.ww045Pa = value;
    }

    /**
     * 获取ww046Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw046Pa() {
        return ww046Pa;
    }

    /**
     * 设置ww046Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw046Pa(String value) {
        this.ww046Pa = value;
    }

    /**
     * 获取ww047Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw047Pa() {
        return ww047Pa;
    }

    /**
     * 设置ww047Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw047Pa(String value) {
        this.ww047Pa = value;
    }

    /**
     * 获取ww048Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw048Pa() {
        return ww048Pa;
    }

    /**
     * 设置ww048Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw048Pa(String value) {
        this.ww048Pa = value;
    }

    /**
     * 获取ww049Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw049Pa() {
        return ww049Pa;
    }

    /**
     * 设置ww049Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw049Pa(String value) {
        this.ww049Pa = value;
    }

    /**
     * 获取ww050Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw050Pa() {
        return ww050Pa;
    }

    /**
     * 设置ww050Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw050Pa(String value) {
        this.ww050Pa = value;
    }

    /**
     * 获取ww051Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw051Pa() {
        return ww051Pa;
    }

    /**
     * 设置ww051Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw051Pa(String value) {
        this.ww051Pa = value;
    }

    /**
     * 获取ww052Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw052Pa() {
        return ww052Pa;
    }

    /**
     * 设置ww052Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw052Pa(String value) {
        this.ww052Pa = value;
    }

    /**
     * 获取ww053Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw053Pa() {
        return ww053Pa;
    }

    /**
     * 设置ww053Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw053Pa(String value) {
        this.ww053Pa = value;
    }

    /**
     * 获取ww054Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw054Pa() {
        return ww054Pa;
    }

    /**
     * 设置ww054Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw054Pa(String value) {
        this.ww054Pa = value;
    }

    /**
     * 获取ww055Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw055Pa() {
        return ww055Pa;
    }

    /**
     * 设置ww055Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw055Pa(String value) {
        this.ww055Pa = value;
    }

    /**
     * 获取ww056Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw056Pa() {
        return ww056Pa;
    }

    /**
     * 设置ww056Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw056Pa(String value) {
        this.ww056Pa = value;
    }

    /**
     * 获取ww057Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw057Pa() {
        return ww057Pa;
    }

    /**
     * 设置ww057Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw057Pa(String value) {
        this.ww057Pa = value;
    }

    /**
     * 获取ww058Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw058Pa() {
        return ww058Pa;
    }

    /**
     * 设置ww058Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw058Pa(String value) {
        this.ww058Pa = value;
    }

    /**
     * 获取ww059Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw059Pa() {
        return ww059Pa;
    }

    /**
     * 设置ww059Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw059Pa(String value) {
        this.ww059Pa = value;
    }

    /**
     * 获取ww036Pa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWw036Pa() {
        return ww036Pa;
    }

    /**
     * 设置ww036Pa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWw036Pa(String value) {
        this.ww036Pa = value;
    }

    /**
     * 获取reBukrs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReBukrs() {
        return reBukrs;
    }

    /**
     * 设置reBukrs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReBukrs(String value) {
        this.reBukrs = value;
    }

    /**
     * 获取reAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReAccount() {
        return reAccount;
    }

    /**
     * 设置reAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReAccount(String value) {
        this.reAccount = value;
    }

    /**
     * 获取fikrs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFikrs() {
        return fikrs;
    }

    /**
     * 设置fikrs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFikrs(String value) {
        this.fikrs = value;
    }

    /**
     * 获取fistl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFistl() {
        return fistl;
    }

    /**
     * 设置fistl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFistl(String value) {
        this.fistl = value;
    }

    /**
     * 获取measure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * 设置measure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasure(String value) {
        this.measure = value;
    }

    /**
     * 获取rfund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfund() {
        return rfund;
    }

    /**
     * 设置rfund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfund(String value) {
        this.rfund = value;
    }

    /**
     * 获取rgrantNbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgrantNbr() {
        return rgrantNbr;
    }

    /**
     * 设置rgrantNbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgrantNbr(String value) {
        this.rgrantNbr = value;
    }

    /**
     * 获取rbudgetPd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbudgetPd() {
        return rbudgetPd;
    }

    /**
     * 设置rbudgetPd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbudgetPd(String value) {
        this.rbudgetPd = value;
    }

    /**
     * 获取sfund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfund() {
        return sfund;
    }

    /**
     * 设置sfund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfund(String value) {
        this.sfund = value;
    }

    /**
     * 获取sgrantNbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgrantNbr() {
        return sgrantNbr;
    }

    /**
     * 设置sgrantNbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgrantNbr(String value) {
        this.sgrantNbr = value;
    }

    /**
     * 获取sbudgetPd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbudgetPd() {
        return sbudgetPd;
    }

    /**
     * 设置sbudgetPd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbudgetPd(String value) {
        this.sbudgetPd = value;
    }

    /**
     * 获取vname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVname() {
        return vname;
    }

    /**
     * 设置vname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVname(String value) {
        this.vname = value;
    }

    /**
     * 获取egrup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgrup() {
        return egrup;
    }

    /**
     * 设置egrup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgrup(String value) {
        this.egrup = value;
    }

    /**
     * 获取recid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecid() {
        return recid;
    }

    /**
     * 设置recid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecid(String value) {
        this.recid = value;
    }

    /**
     * 获取vptnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVptnr() {
        return vptnr;
    }

    /**
     * 设置vptnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVptnr(String value) {
        this.vptnr = value;
    }

    /**
     * 获取btype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtype() {
        return btype;
    }

    /**
     * 设置btype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtype(String value) {
        this.btype = value;
    }

    /**
     * 获取etype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtype() {
        return etype;
    }

    /**
     * 设置etype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtype(String value) {
        this.etype = value;
    }

    /**
     * 获取prodper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdper() {
        return prodper;
    }

    /**
     * 设置prodper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdper(String value) {
        this.prodper = value;
    }

    /**
     * 获取swenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwenr() {
        return swenr;
    }

    /**
     * 设置swenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwenr(String value) {
        this.swenr = value;
    }

    /**
     * 获取sgenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgenr() {
        return sgenr;
    }

    /**
     * 设置sgenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgenr(String value) {
        this.sgenr = value;
    }

    /**
     * 获取sgrnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgrnr() {
        return sgrnr;
    }

    /**
     * 设置sgrnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgrnr(String value) {
        this.sgrnr = value;
    }

    /**
     * 获取smenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmenr() {
        return smenr;
    }

    /**
     * 设置smenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmenr(String value) {
        this.smenr = value;
    }

    /**
     * 获取recnnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecnnr() {
        return recnnr;
    }

    /**
     * 设置recnnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecnnr(String value) {
        this.recnnr = value;
    }

    /**
     * 获取snksl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnksl() {
        return snksl;
    }

    /**
     * 设置snksl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnksl(String value) {
        this.snksl = value;
    }

    /**
     * 获取sempsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSempsl() {
        return sempsl;
    }

    /**
     * 设置sempsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSempsl(String value) {
        this.sempsl = value;
    }

    /**
     * 获取dabrz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDabrz() {
        return dabrz;
    }

    /**
     * 设置dabrz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDabrz(String value) {
        this.dabrz = value;
    }

    /**
     * 获取pswenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswenr() {
        return pswenr;
    }

    /**
     * 设置pswenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswenr(String value) {
        this.pswenr = value;
    }

    /**
     * 获取psgenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgenr() {
        return psgenr;
    }

    /**
     * 设置psgenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgenr(String value) {
        this.psgenr = value;
    }

    /**
     * 获取psgrnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgrnr() {
        return psgrnr;
    }

    /**
     * 设置psgrnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgrnr(String value) {
        this.psgrnr = value;
    }

    /**
     * 获取psmenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsmenr() {
        return psmenr;
    }

    /**
     * 设置psmenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsmenr(String value) {
        this.psmenr = value;
    }

    /**
     * 获取precnnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecnnr() {
        return precnnr;
    }

    /**
     * 设置precnnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecnnr(String value) {
        this.precnnr = value;
    }

    /**
     * 获取psnksl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsnksl() {
        return psnksl;
    }

    /**
     * 设置psnksl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsnksl(String value) {
        this.psnksl = value;
    }

    /**
     * 获取psempsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsempsl() {
        return psempsl;
    }

    /**
     * 设置psempsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsempsl(String value) {
        this.psempsl = value;
    }

    /**
     * 获取pdabrz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdabrz() {
        return pdabrz;
    }

    /**
     * 设置pdabrz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdabrz(String value) {
        this.pdabrz = value;
    }

    /**
     * 获取acdocEewDummy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdocEewDummy() {
        return acdocEewDummy;
    }

    /**
     * 设置acdocEewDummy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdocEewDummy(String value) {
        this.acdocEewDummy = value;
    }

    /**
     * 获取zzfi01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzfi01() {
        return zzfi01;
    }

    /**
     * 设置zzfi01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzfi01(String value) {
        this.zzfi01 = value;
    }

    /**
     * 获取zzfi02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzfi02() {
        return zzfi02;
    }

    /**
     * 设置zzfi02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzfi02(String value) {
        this.zzfi02 = value;
    }

    /**
     * 获取migSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigSource() {
        return migSource;
    }

    /**
     * 设置migSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigSource(String value) {
        this.migSource = value;
    }

    /**
     * 获取migDocln属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigDocln() {
        return migDocln;
    }

    /**
     * 设置migDocln属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigDocln(String value) {
        this.migDocln = value;
    }

    /**
     * 获取dataaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataaging() {
        return dataaging;
    }

    /**
     * 设置dataaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataaging(String value) {
        this.dataaging = value;
    }

    /**
     * 获取zfysl属性的值。
     * 
     */
    public int getZfysl() {
        return zfysl;
    }

    /**
     * 设置zfysl属性的值。
     * 
     */
    public void setZfysl(int value) {
        this.zfysl = value;
    }

}
