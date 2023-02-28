package com.store.mystore.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.store.mystore.model.Book;

public interface BookRepo extends MongoRepository<Book, Integer> {

}
