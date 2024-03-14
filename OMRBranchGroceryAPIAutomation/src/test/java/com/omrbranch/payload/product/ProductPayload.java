package com.omrbranch.payload.product;

import com.omrbranch.pojo.product.ProductList_Input_Pojo;

public class ProductPayload {
	public ProductList_Input_Pojo searchProductPayload(String product) {
		ProductList_Input_Pojo productList_Input_Pojo = new ProductList_Input_Pojo(product);
		return productList_Input_Pojo;

	}
	

}
