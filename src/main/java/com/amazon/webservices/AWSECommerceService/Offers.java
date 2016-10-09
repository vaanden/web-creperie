/**
 * Offers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService;

public class Offers  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger totalOffers;

    private org.apache.axis.types.NonNegativeInteger totalOfferPages;

    private java.lang.String moreOffersUrl;

    private com.amazon.webservices.AWSECommerceService.Offer[] offer;

    public Offers() {
    }

    public Offers(
           org.apache.axis.types.NonNegativeInteger totalOffers,
           org.apache.axis.types.NonNegativeInteger totalOfferPages,
           java.lang.String moreOffersUrl,
           com.amazon.webservices.AWSECommerceService.Offer[] offer) {
           this.totalOffers = totalOffers;
           this.totalOfferPages = totalOfferPages;
           this.moreOffersUrl = moreOffersUrl;
           this.offer = offer;
    }


    /**
     * Gets the totalOffers value for this Offers.
     * 
     * @return totalOffers
     */
    public org.apache.axis.types.NonNegativeInteger getTotalOffers() {
        return totalOffers;
    }


    /**
     * Sets the totalOffers value for this Offers.
     * 
     * @param totalOffers
     */
    public void setTotalOffers(org.apache.axis.types.NonNegativeInteger totalOffers) {
        this.totalOffers = totalOffers;
    }


    /**
     * Gets the totalOfferPages value for this Offers.
     * 
     * @return totalOfferPages
     */
    public org.apache.axis.types.NonNegativeInteger getTotalOfferPages() {
        return totalOfferPages;
    }


    /**
     * Sets the totalOfferPages value for this Offers.
     * 
     * @param totalOfferPages
     */
    public void setTotalOfferPages(org.apache.axis.types.NonNegativeInteger totalOfferPages) {
        this.totalOfferPages = totalOfferPages;
    }


    /**
     * Gets the moreOffersUrl value for this Offers.
     * 
     * @return moreOffersUrl
     */
    public java.lang.String getMoreOffersUrl() {
        return moreOffersUrl;
    }


    /**
     * Sets the moreOffersUrl value for this Offers.
     * 
     * @param moreOffersUrl
     */
    public void setMoreOffersUrl(java.lang.String moreOffersUrl) {
        this.moreOffersUrl = moreOffersUrl;
    }


    /**
     * Gets the offer value for this Offers.
     * 
     * @return offer
     */
    public com.amazon.webservices.AWSECommerceService.Offer[] getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this Offers.
     * 
     * @param offer
     */
    public void setOffer(com.amazon.webservices.AWSECommerceService.Offer[] offer) {
        this.offer = offer;
    }

    public com.amazon.webservices.AWSECommerceService.Offer getOffer(int i) {
        return this.offer[i];
    }

    public void setOffer(int i, com.amazon.webservices.AWSECommerceService.Offer _value) {
        this.offer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Offers)) return false;
        Offers other = (Offers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalOffers==null && other.getTotalOffers()==null) || 
             (this.totalOffers!=null &&
              this.totalOffers.equals(other.getTotalOffers()))) &&
            ((this.totalOfferPages==null && other.getTotalOfferPages()==null) || 
             (this.totalOfferPages!=null &&
              this.totalOfferPages.equals(other.getTotalOfferPages()))) &&
            ((this.moreOffersUrl==null && other.getMoreOffersUrl()==null) || 
             (this.moreOffersUrl!=null &&
              this.moreOffersUrl.equals(other.getMoreOffersUrl()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              java.util.Arrays.equals(this.offer, other.getOffer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTotalOffers() != null) {
            _hashCode += getTotalOffers().hashCode();
        }
        if (getTotalOfferPages() != null) {
            _hashCode += getTotalOfferPages().hashCode();
        }
        if (getMoreOffersUrl() != null) {
            _hashCode += getMoreOffersUrl().hashCode();
        }
        if (getOffer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOffer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOffer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Offers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Offers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalOffers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TotalOffers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalOfferPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TotalOfferPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreOffersUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MoreOffersUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Offer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
