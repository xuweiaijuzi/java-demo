
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
 *         &lt;element name="ItAcdoca" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOf_-bic_-azetw00012"/>
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
    "itAcdoca"
})
@XmlRootElement(name = "Zetw0003Response")
public class Zetw0003Response {

    @XmlElement(name = "ItAcdoca", required = true)
    protected TableOfBicAzetw00012 itAcdoca;

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

}
