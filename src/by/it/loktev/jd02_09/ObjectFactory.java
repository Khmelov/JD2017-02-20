//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.19 at 11:29:22 AM MSK 
//


package by.it.loktev.jd02_09;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.it.loktev.jd02_09 package. 
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

    private final static QName _Picture_QNAME = new QName("http://jd02_09.loktev.it.by", "picture");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.it.loktev.jd02_09
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TGroup }
     * 
     */
    public TGroup createTGroup() {
        return new TGroup();
    }

    /**
     * Create an instance of {@link TText }
     * 
     */
    public TText createTText() {
        return new TText();
    }

    /**
     * Create an instance of {@link TCircle }
     * 
     */
    public TCircle createTCircle() {
        return new TCircle();
    }

    /**
     * Create an instance of {@link TSquare }
     * 
     */
    public TSquare createTSquare() {
        return new TSquare();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jd02_09.loktev.it.by", name = "picture")
    public JAXBElement<TGroup> createPicture(TGroup value) {
        return new JAXBElement<TGroup>(_Picture_QNAME, TGroup.class, null, value);
    }

}
