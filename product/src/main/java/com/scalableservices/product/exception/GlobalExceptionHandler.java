package com.scalableservices.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.scalableservices.product.dto.ExceptionResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoCategoriesFoundException.class)
	public ResponseEntity<ExceptionResponse> noCategoriesFoundException() {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setMessage("No Categories Found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
	}
	
	@ExceptionHandler(NoProductsFoundException.class)
	public ResponseEntity<ExceptionResponse> noProductsFoundException() {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setMessage("No Products Found for Category");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
	}

}
