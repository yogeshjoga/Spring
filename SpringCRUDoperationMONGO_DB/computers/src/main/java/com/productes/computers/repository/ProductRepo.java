package com.productes.computers.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.productes.computers.entity.Product;

public interface ProductRepo extends MongoRepository<Product, Long>{

}
