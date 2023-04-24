package com.scalableservices.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalableservices.product.dto.ProductResponse;
import com.scalableservices.product.exception.NoCategoriesFoundException;
import com.scalableservices.product.exception.NoProductsFoundException;
import com.scalableservices.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<ProductResponse> getProducts(@PathVariable Long categoryId) throws NoCategoriesFoundException, NoProductsFoundException {
		return new ResponseEntity<>(productService.getProducts(categoryId), HttpStatus.OK);
	}
	

}
