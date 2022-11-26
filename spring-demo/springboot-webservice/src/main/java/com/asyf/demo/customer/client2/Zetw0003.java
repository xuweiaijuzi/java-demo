
package com.asyf.demo.customer.client2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Idbeg" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Idend" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ItAcdoca" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOf_-bic_-azetw00012"/>
 *         &lt;element name="Izfy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Zbukrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idbeg",
    "idend",
    "itAcdoca",
    "izfy",
    "zbukrs"
})
@XmlRootElement(name = "Zetw0003")
public class Zetw0003 {

    @XmlElement(name = "Idbeg", required = true)
    protected String idbeg;
    @XmlElement(name = "Idend", required = true)
    protected String idend;
    @XmlElement(name = "ItAcdoca", required = true)
    protected TableOfBicAzetw00012 itAcdoca;
    @XmlElement(name = "Izfy")
    protected Integer izfy;
    @XmlElement(name = "Zbukrs", required = true)
    protected String zbukrs;

    /**
     * ��ȡidbeg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdbeg() {
        return idbeg;
    }

    /**
     * ����idbeg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdbeg(String value) {
        this.idbeg = value;
    }

    /**
     * ��ȡidend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdend() {
        return idend;
    }

    /**
     * ����idend���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdend(String value) {
        this.idend = value;
    }

    /**
     * ��ȡitAcdoca���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TableOfBicAzetw00012 }
     *     
     */
    public TableOfBicAzetw00012 getItAcdoca() {
        return itAcdoca;
    }

    /**
     * ����itAcdoca���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBicAzetw00012 }
     *     
     */
    public void setItAcdoca(TableOfBicAzetw00012 value) {
        this.itAcdoca = value;
    }

    /**
     * ��ȡizfy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIzfy() {
        return izfy;
    }

    /**
     * ����izfy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIzfy(Integer value) {
        this.izfy = value;
    }

    /**
     * ��ȡzbukrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbukrs() {
        return zbukrs;
    }

    /**
     * ����zbukrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbukrs(String value) {
        this.zbukrs = value;
    }

}
