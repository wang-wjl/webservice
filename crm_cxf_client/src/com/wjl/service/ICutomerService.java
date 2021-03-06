
package com.wjl.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICutomerService", targetNamespace = "http://service.wjl.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICutomerService {


    /**
     * 
     * @return
     *     returns java.util.List<com.wjl.service.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://service.wjl.com/", className = "com.wjl.service.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://service.wjl.com/", className = "com.wjl.service.FindAllResponse")
    public List<Customer> findAll();

}
