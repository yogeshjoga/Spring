package com.productes.computers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productes.computers.entity.Product;
import com.productes.computers.service.ProductService;

@RestController
@RequestMapping("/products/")
public class ProductConntroll {
	@Autowired
	ProductService productService;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
		return new ResponseEntity<String>(productService.saveProduct(product),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Product>> readAllProducts(){
		return new ResponseEntity<List<Product>>(productService.getAllProducts(),HttpStatus.OK);
	}
	
}
