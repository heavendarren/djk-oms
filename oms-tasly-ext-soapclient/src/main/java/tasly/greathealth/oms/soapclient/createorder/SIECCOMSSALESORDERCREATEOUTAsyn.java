
package tasly.greathealth.oms.soapclient.createorder;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SI_ECC_OMS_SALESORDER_CREATE_OUT_Asyn", targetNamespace = "urn:tasly:gerp:jt:ecc:proxy")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIECCOMSSALESORDERCREATEOUTAsyn {


    /**
     * 
     * @param parameters
     */
    @WebMethod(operationName = "SI_ECC_OMS_SALESORDER_CREATE_OUT_Asyn", action = "http://sap.com/xi/WebService/soap1.1")
    @Oneway
    public void siECCOMSSALESORDERCREATEOUTAsyn(
        @WebParam(name = "ZSD_OMS_SALESORDER_CREATE", targetNamespace = "urn:sap-com:document:sap:rfc:functions", partName = "parameters")
        ZSDOMSSALESORDERCREATE parameters);

}
