//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.28 at 01:32:11 PM MSK 
//


package by.it.prigozhanov.jd02_09;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Car complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Car">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Discription" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Model" type="{http://jd02_09.prigozhanov.it.by}Model"/>
 *         &lt;element name="Insuranse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Insurance" type="{http://www.w3.org/2001/XMLSchema}string" fixed="BNB Insurance" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://jd02_09.prigozhanov.it.by}currency"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Car", propOrder = {

})
public class Car {

    @XmlElement(name = "Discription", required = true)
    protected Object discription;
    @XmlElement(name = "Model", required = true)
    protected Model model;
    @XmlElement(name = "Insuranse", required = true)
    protected Car.Insuranse insuranse;
    @XmlElement(name = "Price", required = true)
    protected Car.Price price;
    @XmlElement(name = "Location", required = true)
    protected String location;

    /**
     * Gets the value of the discription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDiscription() {
        return discription;
    }

    /**
     * Sets the value of the discription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDiscription(Object value) {
        this.discription = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setModel(Model value) {
        this.model = value;
    }

    /**
     * Gets the value of the insuranse property.
     * 
     * @return
     *     possible object is
     *     {@link Car.Insuranse }
     *     
     */
    public Car.Insuranse getInsuranse() {
        return insuranse;
    }

    /**
     * Sets the value of the insuranse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Car.Insuranse }
     *     
     */
    public void setInsuranse(Car.Insuranse value) {
        this.insuranse = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Car.Price }
     *     
     */
    public Car.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Car.Price }
     *     
     */
    public void setPrice(Car.Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Insurance" type="{http://www.w3.org/2001/XMLSchema}string" fixed="BNB Insurance" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Insuranse {

        @XmlAttribute(name = "Insurance")
        protected String insurance;

        /**
         * Gets the value of the insurance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsurance() {
            if (insurance == null) {
                return "BNB Insurance";
            } else {
                return insurance;
            }
        }

        /**
         * Sets the value of the insurance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsurance(String value) {
            this.insurance = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://jd02_09.prigozhanov.it.by}currency"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Price {

        @XmlAttribute(name = "USD")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger usd;
        @XmlAttribute(name = "RUB")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger rub;
        @XmlAttribute(name = "EUR")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger eur;
        @XmlAttribute(name = "GBP")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger gbp;

        /**
         * Gets the value of the usd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUSD() {
            return usd;
        }

        /**
         * Sets the value of the usd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUSD(BigInteger value) {
            this.usd = value;
        }

        /**
         * Gets the value of the rub property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRUB() {
            return rub;
        }

        /**
         * Sets the value of the rub property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRUB(BigInteger value) {
            this.rub = value;
        }

        /**
         * Gets the value of the eur property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEUR() {
            return eur;
        }

        /**
         * Sets the value of the eur property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEUR(BigInteger value) {
            this.eur = value;
        }

        /**
         * Gets the value of the gbp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGBP() {
            return gbp;
        }

        /**
         * Sets the value of the gbp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGBP(BigInteger value) {
            this.gbp = value;
        }

    }

}
