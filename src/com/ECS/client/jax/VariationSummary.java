
package com.ECS.client.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="LowestPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="HighestPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
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
    "lowestPrice",
    "highestPrice",
    "lowestSalePrice",
    "highestSalePrice"
})
@XmlRootElement(name = "VariationSummary")
public class VariationSummary {

    @XmlElement(name = "LowestPrice")
    protected Price lowestPrice;
    @XmlElement(name = "HighestPrice")
    protected Price highestPrice;
    @XmlElement(name = "LowestSalePrice")
    protected Price lowestSalePrice;
    @XmlElement(name = "HighestSalePrice")
    protected Price highestSalePrice;

    /**
     * Obtient la valeur de la propri�t� lowestPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestPrice() {
        return lowestPrice;
    }

    /**
     * D�finit la valeur de la propri�t� lowestPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestPrice(Price value) {
        this.lowestPrice = value;
    }

    /**
     * Obtient la valeur de la propri�t� highestPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getHighestPrice() {
        return highestPrice;
    }

    /**
     * D�finit la valeur de la propri�t� highestPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setHighestPrice(Price value) {
        this.highestPrice = value;
    }

    /**
     * Obtient la valeur de la propri�t� lowestSalePrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestSalePrice() {
        return lowestSalePrice;
    }

    /**
     * D�finit la valeur de la propri�t� lowestSalePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestSalePrice(Price value) {
        this.lowestSalePrice = value;
    }

    /**
     * Obtient la valeur de la propri�t� highestSalePrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getHighestSalePrice() {
        return highestSalePrice;
    }

    /**
     * D�finit la valeur de la propri�t� highestSalePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setHighestSalePrice(Price value) {
        this.highestSalePrice = value;
    }

}
