
package pe.company.ws;

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
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WS02", targetNamespace = "http://company.pe/", wsdlLocation = "http://localhost:8383/Sesion02/WS02?WSDL")
public class WS02_Service
    extends Service
{

    private final static URL WS02_WSDL_LOCATION;
    private final static WebServiceException WS02_EXCEPTION;
    private final static QName WS02_QNAME = new QName("http://company.pe/", "WS02");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8383/Sesion02/WS02?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WS02_WSDL_LOCATION = url;
        WS02_EXCEPTION = e;
    }

    public WS02_Service() {
        super(__getWsdlLocation(), WS02_QNAME);
    }

    public WS02_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WS02_QNAME, features);
    }

    public WS02_Service(URL wsdlLocation) {
        super(wsdlLocation, WS02_QNAME);
    }

    public WS02_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WS02_QNAME, features);
    }

    public WS02_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WS02_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WS02
     */
    @WebEndpoint(name = "WS02Port")
    public WS02 getWS02Port() {
        return super.getPort(new QName("http://company.pe/", "WS02Port"), WS02.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WS02
     */
    @WebEndpoint(name = "WS02Port")
    public WS02 getWS02Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://company.pe/", "WS02Port"), WS02.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WS02_EXCEPTION!= null) {
            throw WS02_EXCEPTION;
        }
        return WS02_WSDL_LOCATION;
    }

}
