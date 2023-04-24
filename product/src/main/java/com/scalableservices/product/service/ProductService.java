package com.scalableservices.product.service;

import com.scalableservices.product.dto.ProductResponse;
import com.scalableservices.product.exception.NoCategoriesFoundException;
import com.scalableservices.product.exception.NoProductsFoundException;

public interface ProductService {

	ProductResponse getProducts(Long categoryId) throws NoCategoriesFoundException, NoProductsFoundException;

}
