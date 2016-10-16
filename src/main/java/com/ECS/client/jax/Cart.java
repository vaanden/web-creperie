
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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Request" minOccurs="0"/>
 *         &lt;element name="CartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URLEncodedHMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PurchaseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileCartURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SavedForLaterItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SimilarProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}TopSellers" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}NewReleases" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SimilarViewedProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}OtherCategoriesSimilarProducts" minOccurs="0"/>
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
    "request",
    "cartId",
    "hmac",
    "urlEncodedHMAC",
    "purchaseURL",
    "mobileCartURL",
    "subTotal",
    "cartItems",
    "savedForLaterItems",
    "similarProducts",
    "topSellers",
    "newReleases",
    "similarViewedProducts",
    "otherCategoriesSimilarProducts"
})
@XmlRootElement(name = "Cart")
public class Cart {

    @XmlElement(name = "Request")
    protected Request request;
    @XmlElement(name = "CartId", required = true)
    protected String cartId;
    @XmlElement(name = "HMAC", required = true)
    protected String hmac;
    @XmlElement(name = "URLEncodedHMAC", required = true)
    protected String urlEncodedHMAC;
    @XmlElement(name = "PurchaseURL")
    protected String purchaseURL;
    @XmlElement(name = "MobileCartURL")
    protected String mobileCartURL;
    @XmlElement(name = "SubTotal")
    protected Price subTotal;
    @XmlElement(name = "CartItems")
    protected CartItems cartItems;
    @XmlElement(name = "SavedForLaterItems")
    protected SavedForLaterItems savedForLaterItems;
    @XmlElement(name = "SimilarProducts")
    protected SimilarProducts similarProducts;
    @XmlElement(name = "TopSellers")
    protected TopSellers topSellers;
    @XmlElement(name = "NewReleases")
    protected NewReleases newReleases;
    @XmlElement(name = "SimilarViewedProducts")
    protected SimilarViewedProducts similarViewedProducts;
    @XmlElement(name = "OtherCategoriesSimilarProducts")
    protected OtherCategoriesSimilarProducts otherCategoriesSimilarProducts;

    /**
     * Obtient la valeur de la propri�t� request.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * D�finit la valeur de la propri�t� request.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Obtient la valeur de la propri�t� cartId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * D�finit la valeur de la propri�t� cartId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartId(String value) {
        this.cartId = value;
    }

    /**
     * Obtient la valeur de la propri�t� hmac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMAC() {
        return hmac;
    }

    /**
     * D�finit la valeur de la propri�t� hmac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMAC(String value) {
        this.hmac = value;
    }

    /**
     * Obtient la valeur de la propri�t� urlEncodedHMAC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLEncodedHMAC() {
        return urlEncodedHMAC;
    }

    /**
     * D�finit la valeur de la propri�t� urlEncodedHMAC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLEncodedHMAC(String value) {
        this.urlEncodedHMAC = value;
    }

    /**
     * Obtient la valeur de la propri�t� purchaseURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseURL() {
        return purchaseURL;
    }

    /**
     * D�finit la valeur de la propri�t� purchaseURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseURL(String value) {
        this.purchaseURL = value;
    }

    /**
     * Obtient la valeur de la propri�t� mobileCartURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileCartURL() {
        return mobileCartURL;
    }

    /**
     * D�finit la valeur de la propri�t� mobileCartURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileCartURL(String value) {
        this.mobileCartURL = value;
    }

    /**
     * Obtient la valeur de la propri�t� subTotal.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getSubTotal() {
        return subTotal;
    }

    /**
     * D�finit la valeur de la propri�t� subTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setSubTotal(Price value) {
        this.subTotal = value;
    }

    /**
     * Obtient la valeur de la propri�t� cartItems.
     * 
     * @return
     *     possible object is
     *     {@link CartItems }
     *     
     */
    public CartItems getCartItems() {
        return cartItems;
    }

    /**
     * D�finit la valeur de la propri�t� cartItems.
     * 
     * @param value
     *     allowed object is
     *     {@link CartItems }
     *     
     */
    public void setCartItems(CartItems value) {
        this.cartItems = value;
    }

    /**
     * Obtient la valeur de la propri�t� savedForLaterItems.
     * 
     * @return
     *     possible object is
     *     {@link SavedForLaterItems }
     *     
     */
    public SavedForLaterItems getSavedForLaterItems() {
        return savedForLaterItems;
    }

    /**
     * D�finit la valeur de la propri�t� savedForLaterItems.
     * 
     * @param value
     *     allowed object is
     *     {@link SavedForLaterItems }
     *     
     */
    public void setSavedForLaterItems(SavedForLaterItems value) {
        this.savedForLaterItems = value;
    }

    /**
     * Obtient la valeur de la propri�t� similarProducts.
     * 
     * @return
     *     possible object is
     *     {@link SimilarProducts }
     *     
     */
    public SimilarProducts getSimilarProducts() {
        return similarProducts;
    }

    /**
     * D�finit la valeur de la propri�t� similarProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarProducts }
     *     
     */
    public void setSimilarProducts(SimilarProducts value) {
        this.similarProducts = value;
    }

    /**
     * Obtient la valeur de la propri�t� topSellers.
     * 
     * @return
     *     possible object is
     *     {@link TopSellers }
     *     
     */
    public TopSellers getTopSellers() {
        return topSellers;
    }

    /**
     * D�finit la valeur de la propri�t� topSellers.
     * 
     * @param value
     *     allowed object is
     *     {@link TopSellers }
     *     
     */
    public void setTopSellers(TopSellers value) {
        this.topSellers = value;
    }

    /**
     * Obtient la valeur de la propri�t� newReleases.
     * 
     * @return
     *     possible object is
     *     {@link NewReleases }
     *     
     */
    public NewReleases getNewReleases() {
        return newReleases;
    }

    /**
     * D�finit la valeur de la propri�t� newReleases.
     * 
     * @param value
     *     allowed object is
     *     {@link NewReleases }
     *     
     */
    public void setNewReleases(NewReleases value) {
        this.newReleases = value;
    }

    /**
     * Obtient la valeur de la propri�t� similarViewedProducts.
     * 
     * @return
     *     possible object is
     *     {@link SimilarViewedProducts }
     *     
     */
    public SimilarViewedProducts getSimilarViewedProducts() {
        return similarViewedProducts;
    }

    /**
     * D�finit la valeur de la propri�t� similarViewedProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarViewedProducts }
     *     
     */
    public void setSimilarViewedProducts(SimilarViewedProducts value) {
        this.similarViewedProducts = value;
    }

    /**
     * Obtient la valeur de la propri�t� otherCategoriesSimilarProducts.
     * 
     * @return
     *     possible object is
     *     {@link OtherCategoriesSimilarProducts }
     *     
     */
    public OtherCategoriesSimilarProducts getOtherCategoriesSimilarProducts() {
        return otherCategoriesSimilarProducts;
    }

    /**
     * D�finit la valeur de la propri�t� otherCategoriesSimilarProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCategoriesSimilarProducts }
     *     
     */
    public void setOtherCategoriesSimilarProducts(OtherCategoriesSimilarProducts value) {
        this.otherCategoriesSimilarProducts = value;
    }

}
