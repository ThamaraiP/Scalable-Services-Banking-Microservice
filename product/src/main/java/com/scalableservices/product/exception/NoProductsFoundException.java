package com.scalableservices.product.exception;

public class NoProductsFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;

	 public NoProductsFoundException(String exception) {
		
		super(exception);
	}

}
