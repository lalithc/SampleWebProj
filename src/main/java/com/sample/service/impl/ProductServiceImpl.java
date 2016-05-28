/**
 * 
 */
package com.sample.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.domain.Product;
import com.sample.service.ProductService;

/**
 * @author lchennup
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	
	  public List<Product> getAllProducts() {
		  List<Product> products = new ArrayList<Product>();
		  Product product = new Product();
		  product.setCategory("AN");
		  product.setCondition("good");
		  product.setDescription("Iphone");
		  product.setDiscontinued(true);
		  product.setManufacturer("Apple");
		  product.setName("Iphone");
		  product.setProductId("IAC1");
		  product.setUnitPrice(new BigDecimal("2.2"));
		  product.setUnitsInOrder(200);
		  product.setUnitsInStock(45);
		  products.add(product);
		  
	    return products;
	  }
	  
	  @Override
	public Product getProduct(String productId) {
	
		  Product product = new Product();
		  product.setCategory("AN");
		  product.setCondition("good");
		  product.setDescription("Iphone");
		  product.setDiscontinued(true);
		  product.setManufacturer("Apple");
		  product.setName("Iphone");
		  product.setProductId(productId);
		  product.setUnitPrice(new BigDecimal("2.2"));
		  product.setUnitsInOrder(200);
		  product.setUnitsInStock(45);
		  
		  
		return product;
	}

	 

}
