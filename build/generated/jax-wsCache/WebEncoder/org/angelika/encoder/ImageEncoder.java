
package org.angelika.encoder;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImageEncoder", targetNamespace = "http://encoder.angelika.org/", wsdlLocation = "http://localhost:8080/ImageEncoder/WebEncoder?wsdl")
public class ImageEncoder
    extends Service
{

    private final static URL IMAGEENCODER_WSDL_LOCATION;
    private final static WebServiceException IMAGEENCODER_EXCEPTION;
    private final static QName IMAGEENCODER_QNAME = new QName("http://encoder.angelika.org/", "ImageEncoder");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ImageEncoder/WebEncoder?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMAGEENCODER_WSDL_LOCATION = url;
        IMAGEENCODER_EXCEPTION = e;
    }

    public ImageEncoder() {
        super(__getWsdlLocation(), IMAGEENCODER_QNAME);
    }

    public ImageEncoder(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMAGEENCODER_QNAME, features);
    }

    public ImageEncoder(URL wsdlLocation) {
        super(wsdlLocation, IMAGEENCODER_QNAME);
    }

    public ImageEncoder(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMAGEENCODER_QNAME, features);
    }

    public ImageEncoder(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageEncoder(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebEncoder
     */
    @WebEndpoint(name = "WebEncoderPort")
    public WebEncoder getWebEncoderPort() {
        return super.getPort(new QName("http://encoder.angelika.org/", "WebEncoderPort"), WebEncoder.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebEncoder
     */
    @WebEndpoint(name = "WebEncoderPort")
    public WebEncoder getWebEncoderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://encoder.angelika.org/", "WebEncoderPort"), WebEncoder.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMAGEENCODER_EXCEPTION!= null) {
            throw IMAGEENCODER_EXCEPTION;
        }
        return IMAGEENCODER_WSDL_LOCATION;
    }

}
