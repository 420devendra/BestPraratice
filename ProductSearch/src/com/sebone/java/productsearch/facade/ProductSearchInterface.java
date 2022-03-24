package com.sebone.java.productsearch.facade;
import java.util.List;

import com.sebone.java.productsearch.model.ProductData;
import com.sebone.java.productsearch.model.ProductRating;

/** Class : ProductShipping
 * @author DevendraMalve
 * Date: 24-03-2022
 * Objective : Providing Product Rating Details
 */
public interface ProductSearchInterface {
	List<ProductData>getProductByKeyword(String keyword);
	 /*
	 * OBJECTIVE- To search a product By using a keyword 
	 * METHOD:-getProductByKeyword()
	 * PARAM:- String keyword optional(Param : String sortBy())
	 * RETURN OBJECT:- List<ProductData>
	 */
	
	 public List<ProductRating>getProductByRating(int rating);
	 /*
	 * OBJECTIVE - To sort products based on rating.
	 * METHOD:- SortProductsByRating()
	 * PARAM:- int rating, string ProductName 
	 * RETURN OBJECT:List<ProductData>
	 */

	 public List<ProductData>sortProductByDiscount(int productDiscount);
	 /*
	 * OBJECTIVE - To search products based on its discount nature
	 * METHOD:-getProductsByDiscount()
	 * PARAM:- string Discount type , String keyword ,productName
	 * RETURN OBJECT:-List<ProductData>
	 */
	public List<ProductData>SortProductByShippingPrice(String ProductShippingPrice);
	/*
	 * OBJECTIVE : to sort the product based on shipping price 
	 * METHOD : sortProductByShippingPrice() 
	 * PARAM- string product name, int shippingPrice ,int choice// 1- low to high,2- high to low
	 * RETURN OBJECT: List<productData>
	 */
	public List<ProductData>sortProductByPrice(int ProductPrice);
	/*
	 * OBJECTIVE : to sort the product based on price
	 * METHOD : sortProductByPrice()
	 * PARAM- string product name, int price , int choice// 1- low to high,2- highto low 
	 * RETURN OBJECT :- List<ProductData>
	 */


	
}
