package com.sebone.java.productsearch.model;

/** Class : ProductCategory
 * @author DevendraMalve
 * Date: 24-03-2022
 * Objective : Taking Category As Input And Giving List of Category Product
 */
public class ProductCategory {
	int productCategoryId;
	String productCategoryName;
	String productDescription;
	/**
	 * @return the productCategoryId
	 */
	public int getProductCategoryId() {
		return productCategoryId;
	}
	/**
	 * @param productCategoryId the productCategoryId to set
	 */
	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	/**
	 * @return the productCategoryName
	 */
	public String getProductCategoryName() {
		return productCategoryName;
	}
	/**
	 * @param productCategoryName the productCategoryName to set
	 */
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	
}
