package in.inxod.productStore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.inxod.productStore.model.Product;
import in.inxod.productStore.service.ProductServiceImpl;

@SpringBootApplication
public class ProductStoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(ProductStoreApplication.class, args);
		
		ProductServiceImpl service = container.getBean(ProductServiceImpl.class);
		
		// ===========Add Product==============
/*		
		Product p1 = new Product();
		p1.setProductName("iPhone 15");
		p1.setBrand("Apple");
		p1.setPrice(79999.0);
		p1.setStock(50);
		p1.setBrandCategory("Mobile");
		Product p = service.addNewProduct(p1);
		System.out.println("product added :"+p.getProductName());
*/
		
		
		// ===========Add Multiple Product==============
/*
		List<Product> products = List.of(
				    new Product("iMac 24 Inch", "Apple", 130000.0, 10, "Desktops"),
				    new Product("Dell Ultrasharp 27 Monitor", "Dell", 45000.0, 18, "Monitors"),
				    new Product("Samsung Odyssey G9", "Samsung", 120000.0, 8, "Monitors"),
				    new Product("Apple Watch Series 9", "Apple", 45000.0, 35, "Wearables"),
				    new Product("Samsung Galaxy Watch 5", "Samsung", 32000.0, 40, "Wearables"),
				    new Product("Fitbit Versa 4", "Fitbit", 22000.0, 55, "Wearables")
			);

			service.addMultipleProduct(products);
*/			

		
		
		// ===========Update Product Stock==============
/*
		String status = service.updateStock(7, -47);
		System.out.println(status);
*/	
	
		
		// ===========Get Product By Brand Name==============
/*
		String brand="Samsung";
		List<Product> products = service.getProductByBrand(brand);
		if(products==null || products.isEmpty()) {
			System.out.println("Product Not Found With This Brand : "+brand);
		}else {
			products.forEach(p->System.out.println(p.getProductName()+" | "+p.getPrice()));
		}
*/			

		// ===========Delete Product==============
/*
		 String st =  service.deleteProduct(4);
		  System.out.println(st);
*/		
		
		// ===========Get Product in Give Price range==============
/*		
		 List<Product> product =  service.getProductInRange(15000.0, 25000.0);
		 if(product==null || product.isEmpty()) {
			 System.out.println("Product Not Found in This Range");
		 }else {
		 product.forEach(p->System.out.println(p.getProductName()+" | "+p.getPrice()));
		 }
*/
	
		// ===========Get Product By Category==============
/*		
		String category = "Gaming";
		List<Product> product =service.getProductByBrandCategory(category);
		if(product==null || product.isEmpty()) {
			 System.out.println("Product Not Found with this Category : "+category);
		 }else {
		 product.forEach(p->System.out.println(p.getProductName()+" | "+p.getBrand()));
		 }
*/		
		
		 
		 
		 
	}

}













