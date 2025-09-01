package in.inxod.productStore.service;

import java.util.Collection;
import java.util.List;

import in.inxod.productStore.model.Product;

public interface ProductService {
	
	// Add new Product
	Product addNewProduct(Product product);
	Iterable<Product> addMultipleProduct(Iterable<Product> product);
	
	// Update stock
	String updateStock(Integer id,Integer newStock);
//	List<Product> updateProduct(Collection<Product> product);
	
	// Find product by brand
	List<Product> getProductByBrand(String brand);
	
	// Delete product
	String deleteProduct(Integer id);
	
	//Find product in price range (min-max)
	List<Product> getProductInRange(Double min, Double max);
	
	// Find By Category
	List<Product> getProductByBrandCategory(String category);
}
