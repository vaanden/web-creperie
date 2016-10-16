
package com.ECS.client.jax;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Collection" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CollectionSummary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LowestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                             &lt;element name="HighestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                             &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                             &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CollectionParent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CollectionItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "collection"
})
@XmlRootElement(name = "Collections")
public class Collections {

    @XmlElement(name = "Collection")
    protected List<Collections.Collection> collection;

    /**
     * Gets the value of the collection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collections.Collection }
     * 
     * 
     */
    public List<Collections.Collection> getCollection() {
        if (collection == null) {
            collection = new ArrayList<Collections.Collection>();
        }
        return this.collection;
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
     *         &lt;element name="CollectionSummary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LowestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                   &lt;element name="HighestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                   &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                   &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CollectionParent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CollectionItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "collectionSummary",
        "collectionParent",
        "collectionItem"
    })
    public static class Collection {

        @XmlElement(name = "CollectionSummary")
        protected Collections.Collection.CollectionSummary collectionSummary;
        @XmlElement(name = "CollectionParent")
        protected Collections.Collection.CollectionParent collectionParent;
        @XmlElement(name = "CollectionItem")
        protected List<Collections.Collection.CollectionItem> collectionItem;

        /**
         * Obtient la valeur de la propri�t� collectionSummary.
         * 
         * @return
         *     possible object is
         *     {@link Collections.Collection.CollectionSummary }
         *     
         */
        public Collections.Collection.CollectionSummary getCollectionSummary() {
            return collectionSummary;
        }

        /**
         * D�finit la valeur de la propri�t� collectionSummary.
         * 
         * @param value
         *     allowed object is
         *     {@link Collections.Collection.CollectionSummary }
         *     
         */
        public void setCollectionSummary(Collections.Collection.CollectionSummary value) {
            this.collectionSummary = value;
        }

        /**
         * Obtient la valeur de la propri�t� collectionParent.
         * 
         * @return
         *     possible object is
         *     {@link Collections.Collection.CollectionParent }
         *     
         */
        public Collections.Collection.CollectionParent getCollectionParent() {
            return collectionParent;
        }

        /**
         * D�finit la valeur de la propri�t� collectionParent.
         * 
         * @param value
         *     allowed object is
         *     {@link Collections.Collection.CollectionParent }
         *     
         */
        public void setCollectionParent(Collections.Collection.CollectionParent value) {
            this.collectionParent = value;
        }

        /**
         * Gets the value of the collectionItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the collectionItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCollectionItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Collections.Collection.CollectionItem }
         * 
         * 
         */
        public List<Collections.Collection.CollectionItem> getCollectionItem() {
            if (collectionItem == null) {
                collectionItem = new ArrayList<Collections.Collection.CollectionItem>();
            }
            return this.collectionItem;
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
         *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "asin",
            "title"
        })
        public static class CollectionItem {

            @XmlElement(name = "ASIN")
            protected String asin;
            @XmlElement(name = "Title")
            protected String title;

            /**
             * Obtient la valeur de la propri�t� asin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASIN() {
                return asin;
            }

            /**
             * D�finit la valeur de la propri�t� asin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASIN(String value) {
                this.asin = value;
            }

            /**
             * Obtient la valeur de la propri�t� title.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * D�finit la valeur de la propri�t� title.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

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
         *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "asin",
            "title"
        })
        public static class CollectionParent {

            @XmlElement(name = "ASIN")
            protected String asin;
            @XmlElement(name = "Title")
            protected String title;

            /**
             * Obtient la valeur de la propri�t� asin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASIN() {
                return asin;
            }

            /**
             * D�finit la valeur de la propri�t� asin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASIN(String value) {
                this.asin = value;
            }

            /**
             * Obtient la valeur de la propri�t� title.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * D�finit la valeur de la propri�t� title.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

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
         *         &lt;element name="LowestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
         *         &lt;element name="HighestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
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
            "lowestListPrice",
            "highestListPrice",
            "lowestSalePrice",
            "highestSalePrice"
        })
        public static class CollectionSummary {

            @XmlElement(name = "LowestListPrice")
            protected Price lowestListPrice;
            @XmlElement(name = "HighestListPrice")
            protected Price highestListPrice;
            @XmlElement(name = "LowestSalePrice")
            protected Price lowestSalePrice;
            @XmlElement(name = "HighestSalePrice")
            protected Price highestSalePrice;

            /**
             * Obtient la valeur de la propri�t� lowestListPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getLowestListPrice() {
                return lowestListPrice;
            }

            /**
             * D�finit la valeur de la propri�t� lowestListPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setLowestListPrice(Price value) {
                this.lowestListPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� highestListPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getHighestListPrice() {
                return highestListPrice;
            }

            /**
             * D�finit la valeur de la propri�t� highestListPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setHighestListPrice(Price value) {
                this.highestListPrice = value;
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

    }

}
