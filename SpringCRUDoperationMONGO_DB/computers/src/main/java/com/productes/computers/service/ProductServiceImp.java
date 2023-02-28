package com.productes.computers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productes.computers.entity.Product;
import com.productes.computers.repository.ProductRepo;


@Service
public class ProductServiceImp implements ProductService{
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public String saveProduct(Product product) {
		productRepo.save(product);
		return "product updated............";
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Long productId) {
		return productRepo.findById(productId).get();
	}

	@Override
	public String deleteProductById(Long productId) {
		boolean delete =false;
		if(productRepo.existsById(productId)) {
			productRepo.deleteById(productId);
			delete=true;
		}
		return "the product is deleted succesfully";
	}

}
