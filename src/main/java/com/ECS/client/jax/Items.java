
package com.ECS.client.jax;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Request" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CorrectedQuery" minOccurs="0"/>
 *         &lt;element name="Qid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngineQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalResults" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="MoreSearchResultsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SearchResultsMap" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SearchBinSets" minOccurs="0"/>
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
    "correctedQuery",
    "qid",
    "engineQuery",
    "totalResults",
    "totalPages",
    "moreSearchResultsUrl",
    "searchResultsMap",
    "item",
    "searchBinSets"
})
@XmlRootElement(name = "Items")
public class Items {

    @XmlElement(name = "Request")
    protected Request request;
    @XmlElement(name = "CorrectedQuery")
    protected CorrectedQuery correctedQuery;
    @XmlElement(name = "Qid")
    protected String qid;
    @XmlElement(name = "EngineQuery")
    protected String engineQuery;
    @XmlElement(name = "TotalResults")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalResults;
    @XmlElement(name = "TotalPages")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalPages;
    @XmlElement(name = "MoreSearchResultsUrl")
    protected String moreSearchResultsUrl;
    @XmlElement(name = "SearchResultsMap")
    protected SearchResultsMap searchResultsMap;
    @XmlElement(name = "Item")
    protected List<Item> item;
    @XmlElement(name = "SearchBinSets")
    protected SearchBinSets searchBinSets;

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
     * Obtient la valeur de la propri�t� correctedQuery.
     * 
     * @return
     *     possible object is
     *     {@link CorrectedQuery }
     *     
     */
    public CorrectedQuery getCorrectedQuery() {
        return correctedQuery;
    }

    /**
     * D�finit la valeur de la propri�t� correctedQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectedQuery }
     *     
     */
    public void setCorrectedQuery(CorrectedQuery value) {
        this.correctedQuery = value;
    }

    /**
     * Obtient la valeur de la propri�t� qid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQid() {
        return qid;
    }

    /**
     * D�finit la valeur de la propri�t� qid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQid(String value) {
        this.qid = value;
    }

    /**
     * Obtient la valeur de la propri�t� engineQuery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineQuery() {
        return engineQuery;
    }

    /**
     * D�finit la valeur de la propri�t� engineQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineQuery(String value) {
        this.engineQuery = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalResults.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalResults() {
        return totalResults;
    }

    /**
     * D�finit la valeur de la propri�t� totalResults.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalResults(BigInteger value) {
        this.totalResults = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalPages.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPages() {
        return totalPages;
    }

    /**
     * D�finit la valeur de la propri�t� totalPages.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPages(BigInteger value) {
        this.totalPages = value;
    }

    /**
     * Obtient la valeur de la propri�t� moreSearchResultsUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreSearchResultsUrl() {
        return moreSearchResultsUrl;
    }

    /**
     * D�finit la valeur de la propri�t� moreSearchResultsUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreSearchResultsUrl(String value) {
        this.moreSearchResultsUrl = value;
    }

    /**
     * Obtient la valeur de la propri�t� searchResultsMap.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsMap }
     *     
     */
    public SearchResultsMap getSearchResultsMap() {
        return searchResultsMap;
    }

    /**
     * D�finit la valeur de la propri�t� searchResultsMap.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsMap }
     *     
     */
    public void setSearchResultsMap(SearchResultsMap value) {
        this.searchResultsMap = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Obtient la valeur de la propri�t� searchBinSets.
     * 
     * @return
     *     possible object is
     *     {@link SearchBinSets }
     *     
     */
    public SearchBinSets getSearchBinSets() {
        return searchBinSets;
    }

    /**
     * D�finit la valeur de la propri�t� searchBinSets.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBinSets }
     *     
     */
    public void setSearchBinSets(SearchBinSets value) {
        this.searchBinSets = value;
    }

}
