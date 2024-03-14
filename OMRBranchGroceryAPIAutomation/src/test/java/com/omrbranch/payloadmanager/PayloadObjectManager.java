package com.omrbranch.payloadmanager;

import com.omrbranch.payload.address.AddressPayload;
import com.omrbranch.payload.product.ProductPayload;

public class PayloadObjectManager {
	private AddressPayload addressPayload;
	private ProductPayload productPayload;
	public AddressPayload getAddressPayload() {
		return (addressPayload==null)?addressPayload = new AddressPayload() : addressPayload;
	}
	public ProductPayload getProductPayload() {
		return (productPayload == null)?productPayload= new ProductPayload() : productPayload;
	}
	
	
	

}
