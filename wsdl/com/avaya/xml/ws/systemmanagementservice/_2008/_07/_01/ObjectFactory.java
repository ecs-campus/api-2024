
package com.avaya.xml.ws.systemmanagementservice._2008._07._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avaya.xml.ws.systemmanagementservice._2008._07._01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SubmitRequest_QNAME = new QName("http://xml.avaya.com/ws/SystemManagementService/2008/07/01", "submitRequest");
    private final static QName _SubmitRequestResponse_QNAME = new QName("http://xml.avaya.com/ws/SystemManagementService/2008/07/01", "submitRequestResponse");
    private final static QName _Release_QNAME = new QName("http://xml.avaya.com/ws/SystemManagementService/2008/07/01", "release");
    private final static QName _ReleaseResponse_QNAME = new QName("http://xml.avaya.com/ws/SystemManagementService/2008/07/01", "releaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avaya.xml.ws.systemmanagementservice._2008._07._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnType }
     * 
     */
    public ReturnType createReturnType() {
        return new ReturnType();
    }

    /**
     * Create an instance of {@link SubmitRequestType }
     * 
     */
    public SubmitRequestType createSubmitRequestType() {
        return new SubmitRequestType();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", name = "submitRequest")
    public JAXBElement<SubmitRequestType> createSubmitRequest(SubmitRequestType value) {
        return new JAXBElement<SubmitRequestType>(_SubmitRequest_QNAME, SubmitRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", name = "submitRequestResponse")
    public JAXBElement<ReturnType> createSubmitRequestResponse(ReturnType value) {
        return new JAXBElement<ReturnType>(_SubmitRequestResponse_QNAME, ReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", name = "release")
    public JAXBElement<String> createRelease(String value) {
        return new JAXBElement<String>(_Release_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", name = "releaseResponse")
    public JAXBElement<ReturnType> createReleaseResponse(ReturnType value) {
        return new JAXBElement<ReturnType>(_ReleaseResponse_QNAME, ReturnType.class, null, value);
    }

}
