package com.productes.computers.service;

import java.util.List;

import com.productes.computers.entity.Product;

public interface ProductService {
	String saveProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(Long productId);
	String deleteProductById(Long productId);
	
}
