
package pe.company.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.company.ws package. 
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

    private final static QName _Baraja_QNAME = new QName("http://company.pe/", "baraja");
    private final static QName _BarajaResponse_QNAME = new QName("http://company.pe/", "barajaResponse");
    private final static QName _Hello_QNAME = new QName("http://company.pe/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://company.pe/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.company.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Baraja }
     * 
     */
    public Baraja createBaraja() {
        return new Baraja();
    }

    /**
     * Create an instance of {@link BarajaResponse }
     * 
     */
    public BarajaResponse createBarajaResponse() {
        return new BarajaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Baraja }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Baraja }{@code >}
     */
    @XmlElementDecl(namespace = "http://company.pe/", name = "baraja")
    public JAXBElement<Baraja> createBaraja(Baraja value) {
        return new JAXBElement<Baraja>(_Baraja_QNAME, Baraja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarajaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BarajaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://company.pe/", name = "barajaResponse")
    public JAXBElement<BarajaResponse> createBarajaResponse(BarajaResponse value) {
        return new JAXBElement<BarajaResponse>(_BarajaResponse_QNAME, BarajaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://company.pe/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://company.pe/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
