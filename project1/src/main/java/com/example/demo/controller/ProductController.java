package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	@RequestMapping(value="/products" , method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("products", productService.listAllProducts());
		System.out.println("Retorno Productos lista :");
		return "products";
		
	}
	
	@RequestMapping("products/{id}")
	public String showProduct(@PathVariable Integer id, Model model ) {
		
		model.addAttribute("products", productService.getProductById(id));
		
		return "productshow";
		
	}
	
	@RequestMapping("products/edit/{id}")
	public String edit(@PathVariable Integer id, Model model ) {
		
		model.addAttribute("products", productService.getProductById(id));
		
		return "productform";
		
	}
	
	@RequestMapping("product/new")
	public String newProduct(Model model) {
		
		model.addAttribute("product", new Product());
		return "productform";
		
	}
	
	@RequestMapping(value= "product", method = RequestMethod.POST)
	public String saveProduct(Product product) {
		productService.saveProduct(product);
		
		return "redirect:/product/" + product.getId();
		
	}
}
