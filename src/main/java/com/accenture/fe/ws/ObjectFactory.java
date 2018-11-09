
package com.accenture.fe.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.accenture.fe.ws package. 
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

    private final static QName _IncreaseProductStockSize_QNAME = new QName("http://ws.fe.accenture.com/", "increaseProductStockSize");
    private final static QName _IncreaseProductStockSizeResponse_QNAME = new QName("http://ws.fe.accenture.com/", "increaseProductStockSizeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.accenture.fe.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncreaseProductStockSize }
     * 
     */
    public IncreaseProductStockSize createIncreaseProductStockSize() {
        return new IncreaseProductStockSize();
    }

    /**
     * Create an instance of {@link IncreaseProductStockSizeResponse }
     * 
     */
    public IncreaseProductStockSizeResponse createIncreaseProductStockSizeResponse() {
        return new IncreaseProductStockSizeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncreaseProductStockSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncreaseProductStockSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fe.accenture.com/", name = "increaseProductStockSize")
    public JAXBElement<IncreaseProductStockSize> createIncreaseProductStockSize(IncreaseProductStockSize value) {
        return new JAXBElement<IncreaseProductStockSize>(_IncreaseProductStockSize_QNAME, IncreaseProductStockSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncreaseProductStockSizeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncreaseProductStockSizeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fe.accenture.com/", name = "increaseProductStockSizeResponse")
    public JAXBElement<IncreaseProductStockSizeResponse> createIncreaseProductStockSizeResponse(IncreaseProductStockSizeResponse value) {
        return new JAXBElement<IncreaseProductStockSizeResponse>(_IncreaseProductStockSizeResponse_QNAME, IncreaseProductStockSizeResponse.class, null, value);
    }

}
