package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Product;


@Service
public interface ProductService {
	
	Iterable<Product>listAllProducts();
	
	Product getProductById(Integer id);
	
	Product saveProduct(Product product);
}
