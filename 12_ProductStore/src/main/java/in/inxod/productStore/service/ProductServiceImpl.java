package in.inxod.productStore.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.productStore.dao.ProductRepo;
import in.inxod.productStore.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	
	private ProductRepo repo;
	@Autowired
	public void setRepo(ProductRepo repo) {
		this.repo = repo;
	}

	
	
	// ======== CREATE: Saves a single new Product entity to the database=========
	@Override
	public Product addNewProduct(Product product) {
		
		return repo.save(product);
	}

	// ========= CREATE: Saves multiple Product ============
	@Override
	public Iterable<Product> addMultipleProduct(Iterable<Product> product) {
		
		return repo.saveAll(product);
	}

	
	// ========= UPDATE: updates the stock quantity of existing Product==========
	@Override
	public String updateStock(Integer id,Integer newStock) {
		Optional<Product> optional = repo.findById(id);
		if(optional.isPresent()) {
			Product product = optional.get();
			product.setStock(product.getStock()+newStock);
			repo.save(product);
			return "Product stock updated";
		}
		
		return "product not found";
	}

	
	// =========== READ: Retrieves all Product entities matching brand=============
	@Override
	public List<Product> getProductByBrand(String brand) {
		
		return repo.findByBrand(brand);
	}

	
	// ============ DELETE: Removes a Product entity from the database by its ID============
	@Override
	public String deleteProduct(Integer id) {
		Optional<Product> product = repo.findById(id);
		if(product.isPresent()) {
			repo.deleteById(id);
			return "Product deleted";
		}
		return "Product not found";
	}

	
	// ========== READ: Finds all Product entities within a specific price range===========
	@Override
	public List<Product> getProductInRange(Double min, Double max) {
		
		return repo.findByPriceBetween(min, max);   // use custom finder method from ProductRepo
	}


	// ========== READ: Finds all Product entities by brand category ===============
	@Override
	public List<Product> getProductByBrandCategory(String category) {
		return repo.findByBrandCategory(category);   // use custom finder method from ProductRepo
	}


/*  --------- Work On this Later--------
 *  
 * 
	@Override
	public List<Product> updateProduct(Collection<Product> products) {
		List<Product> updatedProduct = new ArrayList<>();
		
		for (Product newProduct : products) {
			Optional<Product> optional = repo.findById(newProduct.getProductId());
			if(optional.isPresent()) {
				Product prExisting = optional.get();
				
				if(newProduct.getBrandCategory()!=null) {
					prExisting.setBrandCategory(newProduct.getBrandCategory());	
				}
				
				if (newProduct.getPrice() != null && newProduct.getPrice() > 0) {
					prExisting.setPrice(newProduct.getPrice());
                }
				
				if(newProduct.getProductName() != null) {
					prExisting.setProductName(newProduct.getProductName());
				}
				
				updatedProduct.add(prExisting);
				
			}
		}
		
		return repo.saveAll(updatedProduct);
	}
*/

	
}










