/**
 * 
 */
package com.sample.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sample.domain.Product;

/**
 * @author lchennup
 *
 */
public interface ProductService {

	List<Product> getAllProducts();

	Product getProduct(String productId);
	
}
