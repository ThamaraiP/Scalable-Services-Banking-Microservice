package com.scalableservices.product.dto;

import java.util.List;

public class ProductResponse {
	
	private Long categoryID;
	private String category;
	
	private List<ProductsList> products;

	public Long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<ProductsList> getProducts() {
		return products;
	}

	public void setProducts(List<ProductsList> products) {
		this.products = products;
	}
	
	
}
