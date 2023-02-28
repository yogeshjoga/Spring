package com.store.mystore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	private int bookId;
	private String programmingLang;
	private String author;

}
