package com.store.mystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.mystore.model.Book;
import com.store.mystore.model.repository.BookRepo;

@RestController
public class BookController {
	@Autowired
	BookRepo bookRepo;
	
	@RequestMapping("/")
	public String hello() {
		System.out.println("hello this is test app");
		return "hello";
	}
	
	@PostMapping("/savebook")
	public String saveBook(@RequestBody Book book) {
		bookRepo.save(book);
		return "book added successfully";
	}
	
	@GetMapping("/findbooks")
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}

}
