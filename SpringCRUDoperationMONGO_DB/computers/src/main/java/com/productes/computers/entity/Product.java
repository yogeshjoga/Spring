package com.productes.computers.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private long productId;
	private String productBrand;
	private String productType;
	private int productRam;
	private int productRom;
	private int productGraphicsCard;
    private String productProcessor;
	
	/*
	 * { "productId":101, "productBrand":"Dell", "productType":"Desktop",
	 * "productRam":128, "productRom":1024, "productGraphicsCard":16,
	 * "productProcessor":"Intel i9 12th gen" }
	 */

}
