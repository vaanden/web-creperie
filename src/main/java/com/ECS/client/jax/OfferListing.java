
package com.ECS.client.jax;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="AmountSaved" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="PercentageSaved" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailabilityAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IsEligibleForSuperSaverShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEligibleForPrime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offerListingId",
    "price",
    "salePrice",
    "amountSaved",
    "percentageSaved",
    "availability",
    "availabilityAttributes",
    "isEligibleForSuperSaverShipping",
    "isEligibleForPrime"
})
@XmlRootElement(name = "OfferListing")
public class OfferListing {

    @XmlElement(name = "OfferListingId")
    protected String offerListingId;
    @XmlElement(name = "Price")
    protected Price price;
    @XmlElement(name = "SalePrice")
    protected Price salePrice;
    @XmlElement(name = "AmountSaved")
    protected Price amountSaved;
    @XmlElement(name = "PercentageSaved")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger percentageSaved;
    @XmlElement(name = "Availability")
    protected String availability;
    @XmlElement(name = "AvailabilityAttributes")
    protected OfferListing.AvailabilityAttributes availabilityAttributes;
    @XmlElement(name = "IsEligibleForSuperSaverShipping")
    protected Boolean isEligibleForSuperSaverShipping;
    @XmlElement(name = "IsEligibleForPrime")
    protected Boolean isEligibleForPrime;

    /**
     * Obtient la valeur de la propri�t� offerListingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferListingId() {
        return offerListingId;
    }

    /**
     * D�finit la valeur de la propri�t� offerListingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferListingId(String value) {
        this.offerListingId = value;
    }

    /**
     * Obtient la valeur de la propri�t� price.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * D�finit la valeur de la propri�t� price.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Obtient la valeur de la propri�t� salePrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getSalePrice() {
        return salePrice;
    }

    /**
     * D�finit la valeur de la propri�t� salePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setSalePrice(Price value) {
        this.salePrice = value;
    }

    /**
     * Obtient la valeur de la propri�t� amountSaved.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getAmountSaved() {
        return amountSaved;
    }

    /**
     * D�finit la valeur de la propri�t� amountSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setAmountSaved(Price value) {
        this.amountSaved = value;
    }

    /**
     * Obtient la valeur de la propri�t� percentageSaved.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentageSaved() {
        return percentageSaved;
    }

    /**
     * D�finit la valeur de la propri�t� percentageSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentageSaved(BigInteger value) {
        this.percentageSaved = value;
    }

    /**
     * Obtient la valeur de la propri�t� availability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * D�finit la valeur de la propri�t� availability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Obtient la valeur de la propri�t� availabilityAttributes.
     * 
     * @return
     *     possible object is
     *     {@link OfferListing.AvailabilityAttributes }
     *     
     */
    public OfferListing.AvailabilityAttributes getAvailabilityAttributes() {
        return availabilityAttributes;
    }

    /**
     * D�finit la valeur de la propri�t� availabilityAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferListing.AvailabilityAttributes }
     *     
     */
    public void setAvailabilityAttributes(OfferListing.AvailabilityAttributes value) {
        this.availabilityAttributes = value;
    }

    /**
     * Obtient la valeur de la propri�t� isEligibleForSuperSaverShipping.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }

    /**
     * D�finit la valeur de la propri�t� isEligibleForSuperSaverShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForSuperSaverShipping(Boolean value) {
        this.isEligibleForSuperSaverShipping = value;
    }

    /**
     * Obtient la valeur de la propri�t� isEligibleForPrime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForPrime() {
        return isEligibleForPrime;
    }

    /**
     * D�finit la valeur de la propri�t� isEligibleForPrime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForPrime(Boolean value) {
        this.isEligibleForPrime = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "availabilityType",
        "isPreorder",
        "minimumHours",
        "maximumHours"
    })
    public static class AvailabilityAttributes {

        @XmlElement(name = "AvailabilityType")
        protected String availabilityType;
        @XmlElement(name = "IsPreorder")
        protected Boolean isPreorder;
        @XmlElement(name = "MinimumHours")
        protected BigInteger minimumHours;
        @XmlElement(name = "MaximumHours")
        protected BigInteger maximumHours;

        /**
         * Obtient la valeur de la propri�t� availabilityType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailabilityType() {
            return availabilityType;
        }

        /**
         * D�finit la valeur de la propri�t� availabilityType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailabilityType(String value) {
            this.availabilityType = value;
        }

        /**
         * Obtient la valeur de la propri�t� isPreorder.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPreorder() {
            return isPreorder;
        }

        /**
         * D�finit la valeur de la propri�t� isPreorder.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPreorder(Boolean value) {
            this.isPreorder = value;
        }

        /**
         * Obtient la valeur de la propri�t� minimumHours.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumHours() {
            return minimumHours;
        }

        /**
         * D�finit la valeur de la propri�t� minimumHours.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumHours(BigInteger value) {
            this.minimumHours = value;
        }

        /**
         * Obtient la valeur de la propri�t� maximumHours.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumHours() {
            return maximumHours;
        }

        /**
         * D�finit la valeur de la propri�t� maximumHours.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumHours(BigInteger value) {
            this.maximumHours = value;
        }

    }

}
