package com.sebone.java.productsearch.implementation;
import java.util.List;
import com.sebone.java.productsearch.facade.ProductSearchInterface;
import com.sebone.java.productsearch.model.ProductData;
import com.sebone.java.productsearch.model.ProductRating;

/** Class : ProductSearchImpl
 * @author DevendraMalve
 * Data:24-03-2022
 * Objective : providing implementation of ProductSearchInterface
 */
public class ProductSearchImpl implements ProductSearchInterface {

	@Override
	/*Method: getProductByKeyword
	 * Param: String Keyword
	 * Return :Return Product List According Your Keyword
	 *objective :Taking Input As Keyword and giving List of Product According your Input 
	 */
	public List<ProductData> getProductByKeyword(String keyword) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	/*Method: getProductByRating
	 * Param: Int rating
	 * Return :Return Product List According Your Product Rating
	 *objective :Taking Input As Product Rating and giving List of Product According your Input 
	 */
	public List<ProductRating> getProductByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}
	/*Method: sortProductByDiscount
	 * Param: Int productDiscount
	 * Return :Return Product List According Your productDiscount
	 *objective :Taking Input As productDiscount and giving List of Product According your Input 
	 */
	public List<ProductData> sortProductByDiscount(int productDiscount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*Method: SortProductByShippingPrice
	 * Param: String productDiscount
	 * Return :Return Product List According Your ProductShippingPrice
	 *objective :Taking Input As ProductShippingPrice and giving List of Product According your Input 
	 */
	public List<ProductData> SortProductByShippingPrice(String ProductShippingPrice) {
		// TODO Auto-generated method stub
		return null;
	}
	/*Method: sortProductByPrice
	 * Param: Int ProductPrice
	 * Return :Return Product List According Your ProductPrice
	 *objective :Taking Input As ProductPrice and giving List of Product According your Input 
	 */
	public List<ProductData> sortProductByPrice(int ProductPrice) {
		// TODO Auto-generated method stub
		return null;
	}
	
		

}
