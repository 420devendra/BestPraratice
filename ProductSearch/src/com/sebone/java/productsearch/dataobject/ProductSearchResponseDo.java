package com.sebone.java.productsearch.model;

/** Class: ProductSearchResponse
 * @author DevendraMalve
 * Date: 24-03-2022
 * objective: Providing Product Search Response;
 */
public class ProductSearchResponse {
	String productSearchMessage;

	/**Method: getProductSearchMessage
	 * @return the productSearchMessage
	 * objective: Providing Product Search Response As Message Related to search;
	 */
	public String getProductSearchMessage() {
		return productSearchMessage;
	}

	/**
	 * @param productSearchMessage the productSearchMessage to set
	 */
	public void setProductSearchMessage(String productSearchMessage) {
		this.productSearchMessage = productSearchMessage;
	}


	
}
