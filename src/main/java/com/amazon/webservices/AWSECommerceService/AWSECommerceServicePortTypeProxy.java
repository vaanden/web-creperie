package com.amazon.webservices.AWSECommerceService;

public class AWSECommerceServicePortTypeProxy implements com.amazon.webservices.AWSECommerceService.AWSECommerceServicePortType {
  private String _endpoint = null;
  private com.amazon.webservices.AWSECommerceService.AWSECommerceServicePortType aWSECommerceServicePortType = null;
  
  public AWSECommerceServicePortTypeProxy() {
    _initAWSECommerceServicePortTypeProxy();
  }
  
  public AWSECommerceServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAWSECommerceServicePortTypeProxy();
  }
  
  private void _initAWSECommerceServicePortTypeProxy() {
    try {
      aWSECommerceServicePortType = (new com.amazon.webservices.AWSECommerceService.AWSECommerceServiceLocator()).getAWSECommerceServicePortCA();
      if (aWSECommerceServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aWSECommerceServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aWSECommerceServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aWSECommerceServicePortType != null)
      ((javax.xml.rpc.Stub)aWSECommerceServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.amazon.webservices.AWSECommerceService.AWSECommerceServicePortType getAWSECommerceServicePortType() {
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    return aWSECommerceServicePortType;
  }
  
  public void itemSearch(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String XMLEscaping, java.lang.String validate, com.amazon.webservices.AWSECommerceService.ItemSearchRequest shared, com.amazon.webservices.AWSECommerceService.ItemSearchRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.ItemsArrayHolder items) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.itemSearch(marketplaceDomain, AWSAccessKeyId, associateTag, XMLEscaping, validate, shared, request, operationRequest, items);
  }
  
  public void itemLookup(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.ItemLookupRequest shared, com.amazon.webservices.AWSECommerceService.ItemLookupRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.ItemsArrayHolder items) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.itemLookup(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, items);
  }
  
  public void browseNodeLookup(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.BrowseNodeLookupRequest shared, com.amazon.webservices.AWSECommerceService.BrowseNodeLookupRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.BrowseNodesArrayHolder browseNodes) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.browseNodeLookup(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, browseNodes);
  }
  
  public void similarityLookup(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.SimilarityLookupRequest shared, com.amazon.webservices.AWSECommerceService.SimilarityLookupRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.ItemsArrayHolder items) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.similarityLookup(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, items);
  }
  
  public void cartGet(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.CartGetRequest shared, com.amazon.webservices.AWSECommerceService.CartGetRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.cartGet(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, cart);
  }
  
  public void cartAdd(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.CartAddRequest shared, com.amazon.webservices.AWSECommerceService.CartAddRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.cartAdd(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, cart);
  }
  
  public void cartCreate(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.CartCreateRequest shared, com.amazon.webservices.AWSECommerceService.CartCreateRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.cartCreate(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, cart);
  }
  
  public void cartModify(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.CartModifyRequest shared, com.amazon.webservices.AWSECommerceService.CartModifyRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.cartModify(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, cart);
  }
  
  public void cartClear(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService.CartClearRequest shared, com.amazon.webservices.AWSECommerceService.CartClearRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException{
    if (aWSECommerceServicePortType == null)
      _initAWSECommerceServicePortTypeProxy();
    aWSECommerceServicePortType.cartClear(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, cart);
  }
  
  
}