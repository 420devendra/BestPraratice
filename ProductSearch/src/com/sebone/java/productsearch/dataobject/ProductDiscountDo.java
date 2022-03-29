package com.sebone.java.productsearch.model;

/**Class : ProductShipping
 * @author DevendraMalve
 * Date: 24-03-2022
 * Objective : Taking Input as Product Discount and Will Give List of Products According Your Input
 */
public class ProductDiscount {
	int productDiscountId;
	int productDiscountPercent;
	String productDiscountStatus;
	int productDiscountStartTime;
	int productDiscountEndTime;
	/**
	 * @return the productDiscountId
	 */
	public int getProductDiscountId() {
		return productDiscountId;
	}
	/**
	 * @param productDiscountId the productDiscountId to set
	 */
	public void setProductDiscountId(int productDiscountId) {
		this.productDiscountId = productDiscountId;
	}
	/**
	 * @return the productDiscountPercent
	 */
	public int getProductDiscountPercent() {
		return productDiscountPercent;
	}
	/**
	 * @param productDiscountPercent the productDiscountPercent to set
	 */
	public void setProductDiscountPercent(int productDiscountPercent) {
		this.productDiscountPercent = productDiscountPercent;
	}
	/**
	 * @return the productDiscountStatus
	 */
	public String getProductDiscountStatus() {
		return productDiscountStatus;
	}
	/**
	 * @param productDiscountStatus the productDiscountStatus to set
	 */
	public void setProductDiscountStatus(String productDiscountStatus) {
		this.productDiscountStatus = productDiscountStatus;
	}
	/**
	 * @return the productDiscountStartTime
	 */
	public int getProductDiscountStartTime() {
		return productDiscountStartTime;
	}
	/**
	 * @param productDiscountStartTime the productDiscountStartTime to set
	 */
	public void setProductDiscountStartTime(int productDiscountStartTime) {
		this.productDiscountStartTime = productDiscountStartTime;
	}
	/**
	 * @return the productDiscountEndTime
	 */
	public int getProductDiscountEndTime() {
		return productDiscountEndTime;
	}
	/**
	 * @param productDiscountEndTime the productDiscountEndTime to set
	 */
	public void setProductDiscountEndTime(int productDiscountEndTime) {
		this.productDiscountEndTime = productDiscountEndTime;
	}
		
}
