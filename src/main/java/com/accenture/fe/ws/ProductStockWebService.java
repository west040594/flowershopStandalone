
package com.accenture.fe.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductStockWebService", targetNamespace = "http://ws.fe.accenture.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductStockWebService {


    /**
     * 
     * @param count
     */
    @WebMethod
    @RequestWrapper(localName = "increaseProductStockSize", targetNamespace = "http://ws.fe.accenture.com/", className = "com.accenture.fe.ws.IncreaseProductStockSize")
    @ResponseWrapper(localName = "increaseProductStockSizeResponse", targetNamespace = "http://ws.fe.accenture.com/", className = "com.accenture.fe.ws.IncreaseProductStockSizeResponse")
    public void increaseProductStockSize(
        @WebParam(name = "count", targetNamespace = "")
        int count);

}