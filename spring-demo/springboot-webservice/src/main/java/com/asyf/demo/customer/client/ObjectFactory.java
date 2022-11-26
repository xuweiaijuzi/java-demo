
package com.asyf.demo.customer.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.asyf.demo.customer.client package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmrServiceResponse_QNAME = new QName("http://www.baidu.com", "emrServiceResponse");
    private final static QName _EmrService_QNAME = new QName("http://www.baidu.com", "emrService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.asyf.demo.customer.client
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmrService }
     */
    public EmrService createEmrService() {
        return new EmrService();
    }

    /**
     * Create an instance of {@link EmrServiceResponse }
     */
    public EmrServiceResponse createEmrServiceResponse() {
        return new EmrServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmrServiceResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.baidu.com", name = "emrServiceResponse")
    public JAXBElement<EmrServiceResponse> createEmrServiceResponse(EmrServiceResponse value) {
        return new JAXBElement<EmrServiceResponse>(_EmrServiceResponse_QNAME, EmrServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmrService }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.baidu.com", name = "emrService")
    public JAXBElement<EmrService> createEmrService(EmrService value) {
        return new JAXBElement<EmrService>(_EmrService_QNAME, EmrService.class, null, value);
    }

}
