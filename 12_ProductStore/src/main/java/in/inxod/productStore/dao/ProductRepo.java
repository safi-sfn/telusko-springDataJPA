package in.inxod.productStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.inxod.productStore.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	// Custom Finder method
	
	List<Product>findByBrand(String brand);
	
	List<Product> findByPriceBetween(Double minPrice, Double maxPrice);

	List<Product> findByBrandCategory(String category);
}
