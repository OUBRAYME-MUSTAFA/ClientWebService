
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _CompteListResponse_QNAME = new QName("http://ws/", "compteListResponse");
    private final static QName _GetComtpe_QNAME = new QName("http://ws/", "getComtpe");
    private final static QName _ConversionEuroToDHResponse_QNAME = new QName("http://ws/", "conversionEuroToDHResponse");
    private final static QName _CompteList_QNAME = new QName("http://ws/", "compteList");
    private final static QName _GetComtpeResponse_QNAME = new QName("http://ws/", "getComtpeResponse");
    private final static QName _ConversionEuroToDH_QNAME = new QName("http://ws/", "conversionEuroToDH");
    private final static QName _Compte_QNAME = new QName("http://ws/", "compte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompteListResponse }
     * 
     */
    public CompteListResponse createCompteListResponse() {
        return new CompteListResponse();
    }

    /**
     * Create an instance of {@link GetComtpe }
     * 
     */
    public GetComtpe createGetComtpe() {
        return new GetComtpe();
    }

    /**
     * Create an instance of {@link ConversionEuroToDHResponse }
     * 
     */
    public ConversionEuroToDHResponse createConversionEuroToDHResponse() {
        return new ConversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link CompteList }
     * 
     */
    public CompteList createCompteList() {
        return new CompteList();
    }

    /**
     * Create an instance of {@link GetComtpeResponse }
     * 
     */
    public GetComtpeResponse createGetComtpeResponse() {
        return new GetComtpeResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDH }
     * 
     */
    public ConversionEuroToDH createConversionEuroToDH() {
        return new ConversionEuroToDH();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compteListResponse")
    public JAXBElement<CompteListResponse> createCompteListResponse(CompteListResponse value) {
        return new JAXBElement<CompteListResponse>(_CompteListResponse_QNAME, CompteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComtpe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getComtpe")
    public JAXBElement<GetComtpe> createGetComtpe(GetComtpe value) {
        return new JAXBElement<GetComtpe>(_GetComtpe_QNAME, GetComtpe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEuroToDHResponse")
    public JAXBElement<ConversionEuroToDHResponse> createConversionEuroToDHResponse(ConversionEuroToDHResponse value) {
        return new JAXBElement<ConversionEuroToDHResponse>(_ConversionEuroToDHResponse_QNAME, ConversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compteList")
    public JAXBElement<CompteList> createCompteList(CompteList value) {
        return new JAXBElement<CompteList>(_CompteList_QNAME, CompteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComtpeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getComtpeResponse")
    public JAXBElement<GetComtpeResponse> createGetComtpeResponse(GetComtpeResponse value) {
        return new JAXBElement<GetComtpeResponse>(_GetComtpeResponse_QNAME, GetComtpeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEuroToDH")
    public JAXBElement<ConversionEuroToDH> createConversionEuroToDH(ConversionEuroToDH value) {
        return new JAXBElement<ConversionEuroToDH>(_ConversionEuroToDH_QNAME, ConversionEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

}
