package com.scalableservices.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalableservices.product.dto.CategoryResponse;
import com.scalableservices.product.exception.NoCategoriesFoundException;
import com.scalableservices.product.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<CategoryResponse>> getCategories() throws NoCategoriesFoundException {
		return new ResponseEntity<>(categoryService.getCategories(), HttpStatus.OK);
	}

}
