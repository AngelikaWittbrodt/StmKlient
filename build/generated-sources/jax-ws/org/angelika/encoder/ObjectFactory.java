
package org.angelika.encoder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.angelika.encoder package. 
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

    private final static QName _GetBinaryImageResponse_QNAME = new QName("http://encoder.angelika.org/", "getBinaryImageResponse");
    private final static QName _GetBinaryImage_QNAME = new QName("http://encoder.angelika.org/", "getBinaryImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.angelika.encoder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBinaryImage }
     * 
     */
    public GetBinaryImage createGetBinaryImage() {
        return new GetBinaryImage();
    }

    /**
     * Create an instance of {@link GetBinaryImageResponse }
     * 
     */
    public GetBinaryImageResponse createGetBinaryImageResponse() {
        return new GetBinaryImageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBinaryImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://encoder.angelika.org/", name = "getBinaryImageResponse")
    public JAXBElement<GetBinaryImageResponse> createGetBinaryImageResponse(GetBinaryImageResponse value) {
        return new JAXBElement<GetBinaryImageResponse>(_GetBinaryImageResponse_QNAME, GetBinaryImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBinaryImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://encoder.angelika.org/", name = "getBinaryImage")
    public JAXBElement<GetBinaryImage> createGetBinaryImage(GetBinaryImage value) {
        return new JAXBElement<GetBinaryImage>(_GetBinaryImage_QNAME, GetBinaryImage.class, null, value);
    }

}
