
package com.avaya.xml.ws.session;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avaya.xml.ws.session package. 
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

    private final static QName _SessionID_QNAME = new QName("http://xml.avaya.com/ws/session", "sessionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avaya.xml.ws.session
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.avaya.com/ws/session", name = "sessionID")
    public JAXBElement<String> createSessionID(String value) {
        return new JAXBElement<String>(_SessionID_QNAME, String.class, null, value);
    }

}
