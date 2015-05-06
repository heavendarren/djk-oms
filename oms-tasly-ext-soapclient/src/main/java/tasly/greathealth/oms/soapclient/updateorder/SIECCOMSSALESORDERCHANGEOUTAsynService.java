package tasly.greathealth.oms.soapclient.updateorder;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "SI_ECC_OMS_SALESORDER_CHANGE_OUT_AsynService", targetNamespace = "urn:tasly:gerp:jt:ecc:proxy", wsdlLocation = "file:/D:/generate/version2.wsdl")
public class SIECCOMSSALESORDERCHANGEOUTAsynService extends Service
{

	private final static URL SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_WSDL_LOCATION;
	private final static WebServiceException SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_EXCEPTION;
	private final static QName SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_QNAME = new QName("urn:tasly:gerp:jt:ecc:proxy",
			"SI_ECC_OMS_SALESORDER_CHANGE_OUT_AsynService");

	static
	{
		URL url = null;
		WebServiceException e = null;
		try
		{
			url = new URL("file:/D:/generate/version2.wsdl");
		}
		catch (final MalformedURLException ex)
		{
			e = new WebServiceException(ex);
		}
		SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_WSDL_LOCATION = url;
		SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_EXCEPTION = e;
	}

	public SIECCOMSSALESORDERCHANGEOUTAsynService()
	{
		super(__getWsdlLocation(), SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_QNAME);
	}

	public SIECCOMSSALESORDERCHANGEOUTAsynService(final WebServiceFeature... features)
	{
		super(__getWsdlLocation(), SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_QNAME, features);
	}

	public SIECCOMSSALESORDERCHANGEOUTAsynService(final URL wsdlLocation)
	{
		super(wsdlLocation, SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_QNAME);
	}

	public SIECCOMSSALESORDERCHANGEOUTAsynService(final URL wsdlLocation, final WebServiceFeature... features)
	{
		super(wsdlLocation, SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_QNAME, features);
	}

	public SIECCOMSSALESORDERCHANGEOUTAsynService(final URL wsdlLocation, final QName serviceName)
	{
		super(wsdlLocation, serviceName);
	}

	public SIECCOMSSALESORDERCHANGEOUTAsynService(final URL wsdlLocation, final QName serviceName,
			final WebServiceFeature... features)
	{
		super(wsdlLocation, serviceName, features);
	}

	/**
	 * 
	 * @return
	 *         returns SIECCOMSSALESORDERCHANGEOUTAsyn
	 */
	@WebEndpoint(name = "HTTP_Port")
	public SIECCOMSSALESORDERCHANGEOUTAsyn getHTTPPort()
	{
		return super.getPort(new QName("urn:tasly:gerp:jt:ecc:proxy", "HTTP_Port"), SIECCOMSSALESORDERCHANGEOUTAsyn.class);
	}

	/**
	 * 
	 * @param features
	 *           A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in
	 *           the <code>features</code> parameter will have their default values.
	 * @return
	 *         returns SIECCOMSSALESORDERCHANGEOUTAsyn
	 */
	@WebEndpoint(name = "HTTP_Port")
	public SIECCOMSSALESORDERCHANGEOUTAsyn getHTTPPort(final WebServiceFeature... features)
	{
		return super
				.getPort(new QName("urn:tasly:gerp:jt:ecc:proxy", "HTTP_Port"), SIECCOMSSALESORDERCHANGEOUTAsyn.class, features);
	}

	/**
	 * 
	 * @return
	 *         returns SIECCOMSSALESORDERCHANGEOUTAsyn
	 */
	@WebEndpoint(name = "HTTPS_Port")
	public SIECCOMSSALESORDERCHANGEOUTAsyn getHTTPSPort()
	{
		return super.getPort(new QName("urn:tasly:gerp:jt:ecc:proxy", "HTTPS_Port"), SIECCOMSSALESORDERCHANGEOUTAsyn.class);
	}

	/**
	 * 
	 * @param features
	 *           A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in
	 *           the <code>features</code> parameter will have their default values.
	 * @return
	 *         returns SIECCOMSSALESORDERCHANGEOUTAsyn
	 */
	@WebEndpoint(name = "HTTPS_Port")
	public SIECCOMSSALESORDERCHANGEOUTAsyn getHTTPSPort(final WebServiceFeature... features)
	{
		return super.getPort(new QName("urn:tasly:gerp:jt:ecc:proxy", "HTTPS_Port"), SIECCOMSSALESORDERCHANGEOUTAsyn.class,
				features);
	}

	private static URL __getWsdlLocation()
	{
		if (SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_EXCEPTION != null)
		{
			throw SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_EXCEPTION;
		}
		return SIECCOMSSALESORDERCHANGEOUTASYNSERVICE_WSDL_LOCATION;
	}

}
