
package com.asyf.demo.customer.client2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>_-bic_-azetw00012 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrclnt���Ե�ֵ��
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
     * ����rclnt���Ե�ֵ��
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
     * ��ȡrldnr���Ե�ֵ��
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
     * ����rldnr���Ե�ֵ��
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
     * ��ȡrbukrs���Ե�ֵ��
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
     * ����rbukrs���Ե�ֵ��
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
     * ��ȡgjahr���Ե�ֵ��
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
     * ����gjahr���Ե�ֵ��
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
     * ��ȡbelnr���Ե�ֵ��
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
     * ����belnr���Ե�ֵ��
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
     * ��ȡdocln���Ե�ֵ��
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
     * ����docln���Ե�ֵ��
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
     * ��ȡrecordmode���Ե�ֵ��
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
     * ����recordmode���Ե�ֵ��
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
     * ��ȡryear���Ե�ֵ��
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
     * ����ryear���Ե�ֵ��
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
     * ��ȡrrcty���Ե�ֵ��
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
     * ����rrcty���Ե�ֵ��
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
     * ��ȡrmvct���Ե�ֵ��
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
     * ����rmvct���Ե�ֵ��
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
     * ��ȡvorgn���Ե�ֵ��
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
     * ����vorgn���Ե�ֵ��
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
     * ��ȡvrgng���Ե�ֵ��
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
     * ����vrgng���Ե�ֵ��
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
     * ��ȡbttype���Ե�ֵ��
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
     * ����bttype���Ե�ֵ��
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
     * ��ȡawtyp���Ե�ֵ��
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
     * ����awtyp���Ե�ֵ��
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
     * ��ȡawsys���Ե�ֵ��
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
     * ����awsys���Ե�ֵ��
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
     * ��ȡaworg���Ե�ֵ��
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
     * ����aworg���Ե�ֵ��
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
     * ��ȡawref���Ե�ֵ��
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
     * ����awref���Ե�ֵ��
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
     * ��ȡawitem���Ե�ֵ��
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
     * ����awitem���Ե�ֵ��
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
     * ��ȡawitgrp���Ե�ֵ��
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
     * ����awitgrp���Ե�ֵ��
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
     * ��ȡsubta���Ե�ֵ��
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
     * ����subta���Ե�ֵ��
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
     * ��ȡxreversing���Ե�ֵ��
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
     * ����xreversing���Ե�ֵ��
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
     * ��ȡxreversed���Ե�ֵ��
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
     * ����xreversed���Ե�ֵ��
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
     * ��ȡxtruerev���Ե�ֵ��
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
     * ����xtruerev���Ե�ֵ��
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
     * ��ȡawtypRev���Ե�ֵ��
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
     * ����awtypRev���Ե�ֵ��
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
     * ��ȡaworgRev���Ե�ֵ��
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
     * ����aworgRev���Ե�ֵ��
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
     * ��ȡawrefRev���Ե�ֵ��
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
     * ����awrefRev���Ե�ֵ��
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
     * ��ȡsubtaRev���Ե�ֵ��
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
     * ����subtaRev���Ե�ֵ��
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
     * ��ȡxsettling���Ե�ֵ��
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
     * ����xsettling���Ե�ֵ��
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
     * ��ȡxsettled���Ե�ֵ��
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
     * ����xsettled���Ե�ֵ��
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
     * ��ȡprecAwtyp���Ե�ֵ��
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
     * ����precAwtyp���Ե�ֵ��
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
     * ��ȡprecAworg���Ե�ֵ��
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
     * ����precAworg���Ե�ֵ��
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
     * ��ȡprecAwref���Ե�ֵ��
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
     * ����precAwref���Ե�ֵ��
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
     * ��ȡprecAwitem���Ե�ֵ��
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
     * ����precAwitem���Ե�ֵ��
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
     * ��ȡprecSubta���Ե�ֵ��
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
     * ����precSubta���Ե�ֵ��
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
     * ��ȡprecAwmult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrecAwmult() {
        return precAwmult;
    }

    /**
     * ����precAwmult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPrecAwmult(byte[] value) {
        this.precAwmult = value;
    }

    /**
     * ��ȡrtcur���Ե�ֵ��
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
     * ����rtcur���Ե�ֵ��
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
     * ��ȡrwcur���Ե�ֵ��
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
     * ����rwcur���Ե�ֵ��
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
     * ��ȡrhcur���Ե�ֵ��
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
     * ����rhcur���Ե�ֵ��
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
     * ��ȡrkcur���Ե�ֵ��
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
     * ����rkcur���Ե�ֵ��
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
     * ��ȡrocur���Ե�ֵ��
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
     * ����rocur���Ե�ֵ��
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
     * ��ȡrvcur���Ե�ֵ��
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
     * ����rvcur���Ե�ֵ��
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
     * ��ȡrfcur���Ե�ֵ��
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
     * ����rfcur���Ե�ֵ��
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
     * ��ȡrcoOcur���Ե�ֵ��
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
     * ����rcoOcur���Ե�ֵ��
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
     * ��ȡrunit���Ե�ֵ��
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
     * ����runit���Ե�ֵ��
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
     * ��ȡrvunit���Ե�ֵ��
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
     * ����rvunit���Ե�ֵ��
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
     * ��ȡrrunit���Ե�ֵ��
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
     * ����rrunit���Ե�ֵ��
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
     * ��ȡqunit1���Ե�ֵ��
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
     * ����qunit1���Ե�ֵ��
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
     * ��ȡqunit2���Ե�ֵ��
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
     * ����qunit2���Ե�ֵ��
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
     * ��ȡqunit3���Ե�ֵ��
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
     * ����qunit3���Ե�ֵ��
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
     * ��ȡracct���Ե�ֵ��
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
     * ����racct���Ե�ֵ��
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
     * ��ȡrcntr���Ե�ֵ��
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
     * ����rcntr���Ե�ֵ��
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
     * ��ȡprctr���Ե�ֵ��
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
     * ����prctr���Ե�ֵ��
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
     * ��ȡrfarea���Ե�ֵ��
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
     * ����rfarea���Ե�ֵ��
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
     * ��ȡrbusa���Ե�ֵ��
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
     * ����rbusa���Ե�ֵ��
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
     * ��ȡkokrs���Ե�ֵ��
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
     * ����kokrs���Ե�ֵ��
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
     * ��ȡsegment���Ե�ֵ��
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
     * ����segment���Ե�ֵ��
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
     * ��ȡscntr���Ե�ֵ��
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
     * ����scntr���Ե�ֵ��
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
     * ��ȡpprctr���Ե�ֵ��
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
     * ����pprctr���Ե�ֵ��
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
     * ��ȡsfarea���Ե�ֵ��
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
     * ����sfarea���Ե�ֵ��
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
     * ��ȡsbusa���Ե�ֵ��
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
     * ����sbusa���Ե�ֵ��
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
     * ��ȡrassc���Ե�ֵ��
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
     * ����rassc���Ե�ֵ��
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
     * ��ȡpsegment���Ե�ֵ��
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
     * ����psegment���Ե�ֵ��
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
     * ��ȡtsl���Ե�ֵ��
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
     * ����tsl���Ե�ֵ��
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
     * ��ȡwsl���Ե�ֵ��
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
     * ����wsl���Ե�ֵ��
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
     * ��ȡhsl���Ե�ֵ��
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
     * ����hsl���Ե�ֵ��
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
     * ��ȡksl���Ե�ֵ��
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
     * ����ksl���Ե�ֵ��
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
     * ��ȡosl���Ե�ֵ��
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
     * ����osl���Ե�ֵ��
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
     * ��ȡvsl���Ե�ֵ��
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
     * ����vsl���Ե�ֵ��
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
     * ��ȡfsl���Ե�ֵ��
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
     * ����fsl���Ե�ֵ��
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
     * ��ȡkfsl���Ե�ֵ��
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
     * ����kfsl���Ե�ֵ��
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
     * ��ȡpsl���Ե�ֵ��
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
     * ����psl���Ե�ֵ��
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
     * ��ȡpfsl���Ե�ֵ��
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
     * ����pfsl���Ե�ֵ��
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
     * ��ȡcoOsl���Ե�ֵ��
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
     * ����coOsl���Ե�ֵ��
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
     * ��ȡhsalk3���Ե�ֵ��
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
     * ����hsalk3���Ե�ֵ��
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
     * ��ȡksalk3���Ե�ֵ��
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
     * ����ksalk3���Ե�ֵ��
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
     * ��ȡosalk3���Ե�ֵ��
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
     * ����osalk3���Ե�ֵ��
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
     * ��ȡvsalk3���Ե�ֵ��
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
     * ����vsalk3���Ե�ֵ��
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
     * ��ȡhsalkv���Ե�ֵ��
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
     * ����hsalkv���Ե�ֵ��
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
     * ��ȡksalkv���Ե�ֵ��
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
     * ����ksalkv���Ե�ֵ��
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
     * ��ȡosalkv���Ե�ֵ��
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
     * ����osalkv���Ե�ֵ��
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
     * ��ȡvsalkv���Ե�ֵ��
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
     * ����vsalkv���Ե�ֵ��
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
     * ��ȡhpvprs���Ե�ֵ��
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
     * ����hpvprs���Ե�ֵ��
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
     * ��ȡkpvprs���Ե�ֵ��
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
     * ����kpvprs���Ե�ֵ��
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
     * ��ȡopvprs���Ե�ֵ��
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
     * ����opvprs���Ե�ֵ��
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
     * ��ȡvpvprs���Ե�ֵ��
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
     * ����vpvprs���Ե�ֵ��
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
     * ��ȡhstprs���Ե�ֵ��
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
     * ����hstprs���Ե�ֵ��
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
     * ��ȡkstprs���Ե�ֵ��
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
     * ����kstprs���Ե�ֵ��
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
     * ��ȡostprs���Ե�ֵ��
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
     * ����ostprs���Ե�ֵ��
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
     * ��ȡvstprs���Ե�ֵ��
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
     * ����vstprs���Ե�ֵ��
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
     * ��ȡhslalt���Ե�ֵ��
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
     * ����hslalt���Ե�ֵ��
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
     * ��ȡkslalt���Ե�ֵ��
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
     * ����kslalt���Ե�ֵ��
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
     * ��ȡoslalt���Ե�ֵ��
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
     * ����oslalt���Ե�ֵ��
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
     * ��ȡvslalt���Ե�ֵ��
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
     * ����vslalt���Ե�ֵ��
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
     * ��ȡhslext���Ե�ֵ��
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
     * ����hslext���Ե�ֵ��
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
     * ��ȡkslext���Ե�ֵ��
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
     * ����kslext���Ե�ֵ��
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
     * ��ȡoslext���Ե�ֵ��
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
     * ����oslext���Ե�ֵ��
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
     * ��ȡvslext���Ե�ֵ��
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
     * ����vslext���Ե�ֵ��
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
     * ��ȡhvkwrt���Ե�ֵ��
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
     * ����hvkwrt���Ե�ֵ��
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
     * ��ȡhvksal���Ե�ֵ��
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
     * ����hvksal���Ե�ֵ��
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
     * ��ȡmsl���Ե�ֵ��
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
     * ����msl���Ե�ֵ��
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
     * ��ȡmfsl���Ե�ֵ��
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
     * ����mfsl���Ե�ֵ��
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
     * ��ȡvmsl���Ե�ֵ��
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
     * ����vmsl���Ե�ֵ��
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
     * ��ȡvmfsl���Ե�ֵ��
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
     * ����vmfsl���Ե�ֵ��
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
     * ��ȡrmsl���Ե�ֵ��
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
     * ����rmsl���Ե�ֵ��
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
     * ��ȡquant1���Ե�ֵ��
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
     * ����quant1���Ե�ֵ��
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
     * ��ȡquant2���Ե�ֵ��
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
     * ����quant2���Ե�ֵ��
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
     * ��ȡquant3���Ե�ֵ��
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
     * ����quant3���Ե�ֵ��
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
     * ��ȡlbkum���Ե�ֵ��
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
     * ����lbkum���Ե�ֵ��
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
     * ��ȡdrcrk���Ե�ֵ��
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
     * ����drcrk���Ե�ֵ��
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
     * ��ȡpoper���Ե�ֵ��
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
     * ����poper���Ե�ֵ��
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
     * ��ȡperiv���Ե�ֵ��
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
     * ����periv���Ե�ֵ��
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
     * ��ȡfiscyearper���Ե�ֵ��
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
     * ����fiscyearper���Ե�ֵ��
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
     * ��ȡbudat���Ե�ֵ��
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
     * ����budat���Ե�ֵ��
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
     * ��ȡbldat���Ե�ֵ��
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
     * ����bldat���Ե�ֵ��
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
     * ��ȡblart���Ե�ֵ��
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
     * ����blart���Ե�ֵ��
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
     * ��ȡbuzei���Ե�ֵ��
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
     * ����buzei���Ե�ֵ��
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
     * ��ȡzuonr���Ե�ֵ��
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
     * ����zuonr���Ե�ֵ��
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
     * ��ȡbschl���Ե�ֵ��
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
     * ����bschl���Ե�ֵ��
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
     * ��ȡbstat���Ե�ֵ��
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
     * ����bstat���Ե�ֵ��
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
     * ��ȡlinetype���Ե�ֵ��
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
     * ����linetype���Ե�ֵ��
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
     * ��ȡktosl���Ե�ֵ��
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
     * ����ktosl���Ե�ֵ��
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
     * ��ȡslalittype���Ե�ֵ��
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
     * ����slalittype���Ե�ֵ��
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
     * ��ȡxsplitmod���Ե�ֵ��
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
     * ����xsplitmod���Ե�ֵ��
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
     * ��ȡusnam���Ե�ֵ��
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
     * ����usnam���Ե�ֵ��
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
     * ��ȡtimestamp���Ե�ֵ��
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
     * ����timestamp���Ե�ֵ��
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
     * ��ȡeprctr���Ե�ֵ��
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
     * ����eprctr���Ե�ֵ��
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
     * ��ȡrhoart���Ե�ֵ��
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
     * ����rhoart���Ե�ֵ��
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
     * ��ȡglaccountType���Ե�ֵ��
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
     * ����glaccountType���Ե�ֵ��
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
     * ��ȡktopl���Ե�ֵ��
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
     * ����ktopl���Ե�ֵ��
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
     * ��ȡlokkt���Ե�ֵ��
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
     * ����lokkt���Ե�ֵ��
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
     * ��ȡktop2���Ե�ֵ��
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
     * ����ktop2���Ե�ֵ��
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
     * ��ȡrebzg���Ե�ֵ��
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
     * ����rebzg���Ե�ֵ��
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
     * ��ȡrebzj���Ե�ֵ��
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
     * ����rebzj���Ե�ֵ��
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
     * ��ȡrebzz���Ե�ֵ��
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
     * ����rebzz���Ե�ֵ��
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
     * ��ȡrebzt���Ե�ֵ��
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
     * ����rebzt���Ե�ֵ��
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
     * ��ȡrbest���Ե�ֵ��
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
     * ����rbest���Ե�ֵ��
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
     * ��ȡebeln���Ե�ֵ��
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
     * ����ebeln���Ե�ֵ��
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
     * ��ȡebelp���Ե�ֵ��
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
     * ����ebelp���Ե�ֵ��
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
     * ��ȡzekkn���Ե�ֵ��
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
     * ����zekkn���Ե�ֵ��
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
     * ��ȡsgtxt���Ե�ֵ��
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
     * ����sgtxt���Ե�ֵ��
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
     * ��ȡkdauf���Ե�ֵ��
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
     * ����kdauf���Ե�ֵ��
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
     * ��ȡkdpos���Ե�ֵ��
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
     * ����kdpos���Ե�ֵ��
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
     * ��ȡmatnr���Ե�ֵ��
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
     * ����matnr���Ե�ֵ��
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
     * ��ȡwerks���Ե�ֵ��
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
     * ����werks���Ե�ֵ��
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
     * ��ȡlifnr���Ե�ֵ��
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
     * ����lifnr���Ե�ֵ��
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
     * ��ȡkunnr���Ե�ֵ��
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
     * ����kunnr���Ե�ֵ��
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
     * ��ȡkoart���Ե�ֵ��
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
     * ����koart���Ե�ֵ��
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
     * ��ȡumskz���Ե�ֵ��
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
     * ����umskz���Ե�ֵ��
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
     * ��ȡmwskz���Ե�ֵ��
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
     * ����mwskz���Ե�ֵ��
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
     * ��ȡhbkid���Ե�ֵ��
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
     * ����hbkid���Ե�ֵ��
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
     * ��ȡhktid���Ե�ֵ��
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
     * ����hktid���Ե�ֵ��
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
     * ��ȡxopvw���Ե�ֵ��
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
     * ����xopvw���Ե�ֵ��
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
     * ��ȡaugdt���Ե�ֵ��
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
     * ����augdt���Ե�ֵ��
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
     * ��ȡaugbl���Ե�ֵ��
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
     * ����augbl���Ե�ֵ��
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
     * ��ȡauggj���Ե�ֵ��
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
     * ����auggj���Ե�ֵ��
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
     * ��ȡafabe���Ե�ֵ��
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
     * ����afabe���Ե�ֵ��
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
     * ��ȡanln1���Ե�ֵ��
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
     * ����anln1���Ե�ֵ��
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
     * ��ȡanln2���Ե�ֵ��
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
     * ����anln2���Ե�ֵ��
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
     * ��ȡbzdat���Ե�ֵ��
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
     * ����bzdat���Ե�ֵ��
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
     * ��ȡanbwa���Ե�ֵ��
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
     * ����anbwa���Ե�ֵ��
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
     * ��ȡmovcat���Ե�ֵ��
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
     * ����movcat���Ե�ֵ��
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
     * ��ȡdeprPeriod���Ե�ֵ��
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
     * ����deprPeriod���Ե�ֵ��
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
     * ��ȡanlgr���Ե�ֵ��
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
     * ����anlgr���Ե�ֵ��
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
     * ��ȡanlgr2���Ե�ֵ��
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
     * ����anlgr2���Ե�ֵ��
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
     * ��ȡsettlementRule���Ե�ֵ��
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
     * ����settlementRule���Ե�ֵ��
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
     * ��ȡkalnr���Ե�ֵ��
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
     * ����kalnr���Ե�ֵ��
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
     * ��ȡvprsv���Ե�ֵ��
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
     * ����vprsv���Ե�ֵ��
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
     * ��ȡmlast���Ե�ֵ��
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
     * ����mlast���Ե�ֵ��
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
     * ��ȡkzbws���Ե�ֵ��
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
     * ����kzbws���Ե�ֵ��
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
     * ��ȡxobew���Ե�ֵ��
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
     * ����xobew���Ե�ֵ��
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
     * ��ȡsobkz���Ե�ֵ��
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
     * ����sobkz���Ե�ֵ��
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
     * ��ȡvtstamp���Ե�ֵ��
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
     * ����vtstamp���Ե�ֵ��
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
     * ��ȡmatKdauf���Ե�ֵ��
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
     * ����matKdauf���Ե�ֵ��
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
     * ��ȡmatKdpos���Ե�ֵ��
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
     * ����matKdpos���Ե�ֵ��
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
     * ��ȡmatPspnr���Ե�ֵ��
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
     * ����matPspnr���Ե�ֵ��
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
     * ��ȡmatPsPosid���Ե�ֵ��
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
     * ����matPsPosid���Ե�ֵ��
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
     * ��ȡmatLifnr���Ե�ֵ��
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
     * ����matLifnr���Ե�ֵ��
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
     * ��ȡbwtar���Ե�ֵ��
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
     * ����bwtar���Ե�ֵ��
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
     * ��ȡbwkey���Ե�ֵ��
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
     * ����bwkey���Ե�ֵ��
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
     * ��ȡhpeinh���Ե�ֵ��
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
     * ����hpeinh���Ե�ֵ��
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
     * ��ȡkpeinh���Ե�ֵ��
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
     * ����kpeinh���Ե�ֵ��
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
     * ��ȡopeinh���Ե�ֵ��
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
     * ����opeinh���Ե�ֵ��
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
     * ��ȡvpeinh���Ե�ֵ��
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
     * ����vpeinh���Ե�ֵ��
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
     * ��ȡmlptyp���Ե�ֵ��
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
     * ����mlptyp���Ե�ֵ��
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
     * ��ȡmlcateg���Ե�ֵ��
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
     * ����mlcateg���Ե�ֵ��
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
     * ��ȡqsbvalt���Ե�ֵ��
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
     * ����qsbvalt���Ե�ֵ��
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
     * ��ȡqsprocess���Ե�ֵ��
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
     * ����qsprocess���Ե�ֵ��
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
     * ��ȡperart���Ե�ֵ��
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
     * ����perart���Ե�ֵ��
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
     * ��ȡracctSender���Ե�ֵ��
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
     * ����racctSender���Ե�ֵ��
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
     * ��ȡaccasSender���Ե�ֵ��
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
     * ����accasSender���Ե�ֵ��
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
     * ��ȡaccastySender���Ե�ֵ��
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
     * ����accastySender���Ե�ֵ��
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
     * ��ȡobjnr���Ե�ֵ��
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
     * ����objnr���Ե�ֵ��
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
     * ��ȡhrkft���Ե�ֵ��
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
     * ����hrkft���Ե�ֵ��
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
     * ��ȡhkgrp���Ե�ֵ��
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
     * ����hkgrp���Ե�ֵ��
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
     * ��ȡparob1���Ե�ֵ��
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
     * ����parob1���Ե�ֵ��
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
     * ��ȡparobsrc���Ե�ֵ��
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
     * ����parobsrc���Ե�ֵ��
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
     * ��ȡuspob���Ե�ֵ��
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
     * ����uspob���Ե�ֵ��
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
     * ��ȡcoBelkz���Ե�ֵ��
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
     * ����coBelkz���Ե�ֵ��
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
     * ��ȡcoBeknz���Ե�ֵ��
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
     * ����coBeknz���Ե�ֵ��
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
     * ��ȡbeltp���Ե�ֵ��
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
     * ����beltp���Ե�ֵ��
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
     * ��ȡmuvflg���Ե�ֵ��
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
     * ����muvflg���Ե�ֵ��
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
     * ��ȡgkont���Ե�ֵ��
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
     * ����gkont���Ե�ֵ��
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
     * ��ȡgkoar���Ե�ֵ��
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
     * ����gkoar���Ե�ֵ��
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
     * ��ȡerlkz���Ե�ֵ��
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
     * ����erlkz���Ե�ֵ��
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
     * ��ȡpernr���Ե�ֵ��
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
     * ����pernr���Ե�ֵ��
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
     * ��ȡpaobjnr���Ե�ֵ��
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
     * ����paobjnr���Ե�ֵ��
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
     * ��ȡxpaobjnrCoRel���Ե�ֵ��
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
     * ����xpaobjnrCoRel���Ե�ֵ��
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
     * ��ȡscope���Ե�ֵ��
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
     * ����scope���Ե�ֵ��
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
     * ��ȡlogsyso���Ե�ֵ��
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
     * ����logsyso���Ե�ֵ��
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
     * ��ȡpbukrs���Ե�ֵ��
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
     * ����pbukrs���Ե�ֵ��
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
     * ��ȡpscope���Ե�ֵ��
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
     * ����pscope���Ե�ֵ��
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
     * ��ȡlogsysp���Ե�ֵ��
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
     * ����logsysp���Ե�ֵ��
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
     * ��ȡbwstrat���Ե�ֵ��
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
     * ����bwstrat���Ե�ֵ��
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
     * ��ȡobjnrHk���Ե�ֵ��
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
     * ����objnrHk���Ե�ֵ��
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
     * ��ȡaufnrOrg���Ե�ֵ��
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
     * ����aufnrOrg���Ե�ֵ��
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
     * ��ȡukostl���Ե�ֵ��
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
     * ����ukostl���Ե�ֵ��
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
     * ��ȡulstar���Ե�ֵ��
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
     * ����ulstar���Ե�ֵ��
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
     * ��ȡuprznr���Ե�ֵ��
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
     * ����uprznr���Ե�ֵ��
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
     * ��ȡaccas���Ե�ֵ��
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
     * ����accas���Ե�ֵ��
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
     * ��ȡaccasty���Ե�ֵ��
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
     * ����accasty���Ե�ֵ��
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
     * ��ȡlstar���Ե�ֵ��
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
     * ����lstar���Ե�ֵ��
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
     * ��ȡaufnr���Ե�ֵ��
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
     * ����aufnr���Ե�ֵ��
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
     * ��ȡautyp���Ե�ֵ��
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
     * ����autyp���Ե�ֵ��
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
     * ��ȡpsPosid���Ե�ֵ��
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
     * ����psPosid���Ե�ֵ��
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
     * ��ȡpsPspid���Ե�ֵ��
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
     * ����psPspid���Ե�ֵ��
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
     * ��ȡnplnr���Ե�ֵ��
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
     * ����nplnr���Ե�ֵ��
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
     * ��ȡnplnrVorgn���Ե�ֵ��
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
     * ����nplnrVorgn���Ե�ֵ��
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
     * ��ȡprznr���Ե�ֵ��
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
     * ����prznr���Ե�ֵ��
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
     * ��ȡkstrg���Ե�ֵ��
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
     * ����kstrg���Ե�ֵ��
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
     * ��ȡbemot���Ե�ֵ��
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
     * ����bemot���Ե�ֵ��
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
     * ��ȡqmnum���Ե�ֵ��
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
     * ����qmnum���Ե�ֵ��
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
     * ��ȡerkrs���Ե�ֵ��
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
     * ����erkrs���Ե�ֵ��
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
     * ��ȡpaccas���Ե�ֵ��
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
     * ����paccas���Ե�ֵ��
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
     * ��ȡpaccasty���Ե�ֵ��
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
     * ����paccasty���Ե�ֵ��
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
     * ��ȡplstar���Ե�ֵ��
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
     * ����plstar���Ե�ֵ��
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
     * ��ȡpaufnr���Ե�ֵ��
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
     * ����paufnr���Ե�ֵ��
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
     * ��ȡpautyp���Ե�ֵ��
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
     * ����pautyp���Ե�ֵ��
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
     * ��ȡppsPosid���Ե�ֵ��
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
     * ����ppsPosid���Ե�ֵ��
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
     * ��ȡppsPspid���Ե�ֵ��
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
     * ����ppsPspid���Ե�ֵ��
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
     * ��ȡpkdauf���Ե�ֵ��
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
     * ����pkdauf���Ե�ֵ��
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
     * ��ȡpkdpos���Ե�ֵ��
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
     * ����pkdpos���Ե�ֵ��
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
     * ��ȡppaobjnr���Ե�ֵ��
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
     * ����ppaobjnr���Ե�ֵ��
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
     * ��ȡpnplnr���Ե�ֵ��
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
     * ����pnplnr���Ե�ֵ��
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
     * ��ȡpnplnrVorgn���Ե�ֵ��
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
     * ����pnplnrVorgn���Ե�ֵ��
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
     * ��ȡpprznr���Ե�ֵ��
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
     * ����pprznr���Ե�ֵ��
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
     * ��ȡpkstrg���Ե�ֵ��
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
     * ����pkstrg���Ե�ֵ��
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
     * ��ȡcoAccastyN1���Ե�ֵ��
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
     * ����coAccastyN1���Ե�ֵ��
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
     * ��ȡcoAccastyN2���Ե�ֵ��
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
     * ����coAccastyN2���Ե�ֵ��
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
     * ��ȡcoAccastyN3���Ե�ֵ��
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
     * ����coAccastyN3���Ե�ֵ��
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
     * ��ȡcoZlenr���Ե�ֵ��
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
     * ����coZlenr���Ե�ֵ��
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
     * ��ȡcoBelnr���Ե�ֵ��
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
     * ����coBelnr���Ե�ֵ��
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
     * ��ȡcoBuzei���Ե�ֵ��
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
     * ����coBuzei���Ե�ֵ��
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
     * ��ȡcoRefbz���Ե�ֵ��
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
     * ����coRefbz���Ե�ֵ��
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
     * ��ȡworkItemId���Ե�ֵ��
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
     * ����workItemId���Ե�ֵ��
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
     * ��ȡfkart���Ե�ֵ��
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
     * ����fkart���Ե�ֵ��
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
     * ��ȡvkorg���Ե�ֵ��
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
     * ����vkorg���Ե�ֵ��
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
     * ��ȡvtweg���Ե�ֵ��
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
     * ����vtweg���Ե�ֵ��
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
     * ��ȡspart���Ե�ֵ��
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
     * ����spart���Ե�ֵ��
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
     * ��ȡmatnrCopa���Ե�ֵ��
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
     * ����matnrCopa���Ե�ֵ��
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
     * ��ȡmatkl���Ե�ֵ��
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
     * ����matkl���Ե�ֵ��
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
     * ��ȡkdgrp���Ե�ֵ��
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
     * ����kdgrp���Ե�ֵ��
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
     * ��ȡland1���Ե�ֵ��
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
     * ����land1���Ե�ֵ��
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
     * ��ȡbrsch���Ե�ֵ��
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
     * ����brsch���Ե�ֵ��
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
     * ��ȡbzirk���Ե�ֵ��
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
     * ����bzirk���Ե�ֵ��
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
     * ��ȡkunre���Ե�ֵ��
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
     * ����kunre���Ե�ֵ��
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
     * ��ȡkunwe���Ե�ֵ��
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
     * ����kunwe���Ե�ֵ��
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
     * ��ȡkonzs���Ե�ֵ��
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
     * ����konzs���Ե�ֵ��
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
     * ��ȡacdocCopaEewDummyPa���Ե�ֵ��
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
     * ����acdocCopaEewDummyPa���Ե�ֵ��
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
     * ��ȡkmmaklPa���Ե�ֵ��
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
     * ����kmmaklPa���Ե�ֵ��
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
     * ��ȡww012Pa���Ե�ֵ��
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
     * ����ww012Pa���Ե�ֵ��
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
     * ��ȡww013Pa���Ե�ֵ��
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
     * ����ww013Pa���Ե�ֵ��
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
     * ��ȡww014Pa���Ե�ֵ��
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
     * ����ww014Pa���Ե�ֵ��
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
     * ��ȡww015Pa���Ե�ֵ��
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
     * ����ww015Pa���Ե�ֵ��
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
     * ��ȡww016Pa���Ե�ֵ��
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
     * ����ww016Pa���Ե�ֵ��
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
     * ��ȡww020Pa���Ե�ֵ��
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
     * ����ww020Pa���Ե�ֵ��
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
     * ��ȡww018Pa���Ե�ֵ��
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
     * ����ww018Pa���Ե�ֵ��
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
     * ��ȡww002Pa���Ե�ֵ��
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
     * ����ww002Pa���Ե�ֵ��
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
     * ��ȡww022Pa���Ե�ֵ��
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
     * ����ww022Pa���Ե�ֵ��
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
     * ��ȡdwerkPa���Ե�ֵ��
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
     * ����dwerkPa���Ե�ֵ��
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
     * ��ȡextwgPa���Ե�ֵ��
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
     * ����extwgPa���Ե�ֵ��
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
     * ��ȡkatr4Pa���Ե�ֵ��
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
     * ����katr4Pa���Ե�ֵ��
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
     * ��ȡkatr5Pa���Ե�ֵ��
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
     * ����katr5Pa���Ե�ֵ��
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
     * ��ȡkatr6Pa���Ե�ֵ��
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
     * ����katr6Pa���Ե�ֵ��
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
     * ��ȡkatr7Pa���Ե�ֵ��
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
     * ����katr7Pa���Ե�ֵ��
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
     * ��ȡkatr8Pa���Ե�ֵ��
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
     * ����katr8Pa���Ե�ֵ��
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
     * ��ȡkunrgPa���Ե�ֵ��
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
     * ����kunrgPa���Ե�ֵ��
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
     * ��ȡktgrmPa���Ե�ֵ��
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
     * ����ktgrmPa���Ե�ֵ��
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
     * ��ȡkuklaPa���Ե�ֵ��
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
     * ����kuklaPa���Ե�ֵ��
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
     * ��ȡpstyvPa���Ե�ֵ��
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
     * ����pstyvPa���Ե�ֵ��
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
     * ��ȡvgbelPa���Ե�ֵ��
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
     * ����vgbelPa���Ե�ֵ��
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
     * ��ȡvgposPa���Ե�ֵ��
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
     * ����vgposPa���Ե�ֵ��
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
     * ��ȡvsbedPa���Ե�ֵ��
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
     * ����vsbedPa���Ե�ֵ��
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
     * ��ȡlgortPa���Ե�ֵ��
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
     * ����lgortPa���Ե�ֵ��
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
     * ��ȡmtartPa���Ե�ֵ��
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
     * ����mtartPa���Ե�ֵ��
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
     * ��ȡlaborPa���Ե�ֵ��
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
     * ����laborPa���Ե�ֵ��
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
     * ��ȡadrnrPa���Ե�ֵ��
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
     * ����adrnrPa���Ե�ֵ��
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
     * ��ȡkmkdgrPa���Ե�ֵ��
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
     * ����kmkdgrPa���Ե�ֵ��
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
     * ��ȡkmvkbuPa���Ե�ֵ��
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
     * ����kmvkbuPa���Ե�ֵ��
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
     * ��ȡkmvkgrPa���Ե�ֵ��
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
     * ����kmvkgrPa���Ե�ֵ��
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
     * ��ȡkmvtnrPa���Ե�ֵ��
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
     * ����kmvtnrPa���Ե�ֵ��
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
     * ��ȡprodhPa���Ե�ֵ��
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
     * ����prodhPa���Ե�ֵ��
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
     * ��ȡww037Pa���Ե�ֵ��
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
     * ����ww037Pa���Ե�ֵ��
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
     * ��ȡww038Pa���Ե�ֵ��
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
     * ����ww038Pa���Ե�ֵ��
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
     * ��ȡww039Pa���Ե�ֵ��
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
     * ����ww039Pa���Ե�ֵ��
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
     * ��ȡww040Pa���Ե�ֵ��
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
     * ����ww040Pa���Ե�ֵ��
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
     * ��ȡpartnerPa���Ե�ֵ��
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
     * ����partnerPa���Ե�ֵ��
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
     * ��ȡww041Pa���Ե�ֵ��
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
     * ����ww041Pa���Ե�ֵ��
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
     * ��ȡww042Pa���Ե�ֵ��
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
     * ����ww042Pa���Ե�ֵ��
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
     * ��ȡww043Pa���Ե�ֵ��
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
     * ����ww043Pa���Ե�ֵ��
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
     * ��ȡww044Pa���Ե�ֵ��
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
     * ����ww044Pa���Ե�ֵ��
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
     * ��ȡww045Pa���Ե�ֵ��
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
     * ����ww045Pa���Ե�ֵ��
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
     * ��ȡww046Pa���Ե�ֵ��
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
     * ����ww046Pa���Ե�ֵ��
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
     * ��ȡww047Pa���Ե�ֵ��
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
     * ����ww047Pa���Ե�ֵ��
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
     * ��ȡww048Pa���Ե�ֵ��
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
     * ����ww048Pa���Ե�ֵ��
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
     * ��ȡww049Pa���Ե�ֵ��
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
     * ����ww049Pa���Ե�ֵ��
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
     * ��ȡww050Pa���Ե�ֵ��
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
     * ����ww050Pa���Ե�ֵ��
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
     * ��ȡww051Pa���Ե�ֵ��
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
     * ����ww051Pa���Ե�ֵ��
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
     * ��ȡww052Pa���Ե�ֵ��
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
     * ����ww052Pa���Ե�ֵ��
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
     * ��ȡww053Pa���Ե�ֵ��
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
     * ����ww053Pa���Ե�ֵ��
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
     * ��ȡww054Pa���Ե�ֵ��
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
     * ����ww054Pa���Ե�ֵ��
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
     * ��ȡww055Pa���Ե�ֵ��
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
     * ����ww055Pa���Ե�ֵ��
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
     * ��ȡww056Pa���Ե�ֵ��
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
     * ����ww056Pa���Ե�ֵ��
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
     * ��ȡww057Pa���Ե�ֵ��
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
     * ����ww057Pa���Ե�ֵ��
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
     * ��ȡww058Pa���Ե�ֵ��
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
     * ����ww058Pa���Ե�ֵ��
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
     * ��ȡww059Pa���Ե�ֵ��
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
     * ����ww059Pa���Ե�ֵ��
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
     * ��ȡww036Pa���Ե�ֵ��
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
     * ����ww036Pa���Ե�ֵ��
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
     * ��ȡreBukrs���Ե�ֵ��
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
     * ����reBukrs���Ե�ֵ��
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
     * ��ȡreAccount���Ե�ֵ��
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
     * ����reAccount���Ե�ֵ��
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
     * ��ȡfikrs���Ե�ֵ��
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
     * ����fikrs���Ե�ֵ��
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
     * ��ȡfistl���Ե�ֵ��
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
     * ����fistl���Ե�ֵ��
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
     * ��ȡmeasure���Ե�ֵ��
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
     * ����measure���Ե�ֵ��
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
     * ��ȡrfund���Ե�ֵ��
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
     * ����rfund���Ե�ֵ��
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
     * ��ȡrgrantNbr���Ե�ֵ��
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
     * ����rgrantNbr���Ե�ֵ��
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
     * ��ȡrbudgetPd���Ե�ֵ��
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
     * ����rbudgetPd���Ե�ֵ��
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
     * ��ȡsfund���Ե�ֵ��
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
     * ����sfund���Ե�ֵ��
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
     * ��ȡsgrantNbr���Ե�ֵ��
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
     * ����sgrantNbr���Ե�ֵ��
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
     * ��ȡsbudgetPd���Ե�ֵ��
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
     * ����sbudgetPd���Ե�ֵ��
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
     * ��ȡvname���Ե�ֵ��
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
     * ����vname���Ե�ֵ��
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
     * ��ȡegrup���Ե�ֵ��
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
     * ����egrup���Ե�ֵ��
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
     * ��ȡrecid���Ե�ֵ��
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
     * ����recid���Ե�ֵ��
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
     * ��ȡvptnr���Ե�ֵ��
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
     * ����vptnr���Ե�ֵ��
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
     * ��ȡbtype���Ե�ֵ��
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
     * ����btype���Ե�ֵ��
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
     * ��ȡetype���Ե�ֵ��
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
     * ����etype���Ե�ֵ��
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
     * ��ȡprodper���Ե�ֵ��
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
     * ����prodper���Ե�ֵ��
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
     * ��ȡswenr���Ե�ֵ��
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
     * ����swenr���Ե�ֵ��
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
     * ��ȡsgenr���Ե�ֵ��
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
     * ����sgenr���Ե�ֵ��
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
     * ��ȡsgrnr���Ե�ֵ��
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
     * ����sgrnr���Ե�ֵ��
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
     * ��ȡsmenr���Ե�ֵ��
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
     * ����smenr���Ե�ֵ��
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
     * ��ȡrecnnr���Ե�ֵ��
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
     * ����recnnr���Ե�ֵ��
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
     * ��ȡsnksl���Ե�ֵ��
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
     * ����snksl���Ե�ֵ��
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
     * ��ȡsempsl���Ե�ֵ��
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
     * ����sempsl���Ե�ֵ��
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
     * ��ȡdabrz���Ե�ֵ��
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
     * ����dabrz���Ե�ֵ��
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
     * ��ȡpswenr���Ե�ֵ��
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
     * ����pswenr���Ե�ֵ��
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
     * ��ȡpsgenr���Ե�ֵ��
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
     * ����psgenr���Ե�ֵ��
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
     * ��ȡpsgrnr���Ե�ֵ��
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
     * ����psgrnr���Ե�ֵ��
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
     * ��ȡpsmenr���Ե�ֵ��
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
     * ����psmenr���Ե�ֵ��
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
     * ��ȡprecnnr���Ե�ֵ��
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
     * ����precnnr���Ե�ֵ��
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
     * ��ȡpsnksl���Ե�ֵ��
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
     * ����psnksl���Ե�ֵ��
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
     * ��ȡpsempsl���Ե�ֵ��
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
     * ����psempsl���Ե�ֵ��
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
     * ��ȡpdabrz���Ե�ֵ��
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
     * ����pdabrz���Ե�ֵ��
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
     * ��ȡacdocEewDummy���Ե�ֵ��
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
     * ����acdocEewDummy���Ե�ֵ��
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
     * ��ȡzzfi01���Ե�ֵ��
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
     * ����zzfi01���Ե�ֵ��
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
     * ��ȡzzfi02���Ե�ֵ��
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
     * ����zzfi02���Ե�ֵ��
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
     * ��ȡmigSource���Ե�ֵ��
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
     * ����migSource���Ե�ֵ��
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
     * ��ȡmigDocln���Ե�ֵ��
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
     * ����migDocln���Ե�ֵ��
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
     * ��ȡdataaging���Ե�ֵ��
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
     * ����dataaging���Ե�ֵ��
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
     * ��ȡzfysl���Ե�ֵ��
     * 
     */
    public int getZfysl() {
        return zfysl;
    }

    /**
     * ����zfysl���Ե�ֵ��
     * 
     */
    public void setZfysl(int value) {
        this.zfysl = value;
    }

}
