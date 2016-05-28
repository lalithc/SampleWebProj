/**
 * 
 */
package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.domain.Product;
import com.sample.service.ProductService;

/**
 * @author lchennup
 *
 */
@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	 
	 
	 @RequestMapping("/all")
	 public ModelAndView  allProducts(Model model){
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("products", productService.getAllProducts());
		 modelAndView.setViewName("products");
		 return modelAndView;
	 }
	 
	 @RequestMapping("/product/{productid}")
	 public Product getProduct(String productId){
		 
		 Product product = productService.getProduct(productId);
		 
		 return product;
	 }
	
}
	 
