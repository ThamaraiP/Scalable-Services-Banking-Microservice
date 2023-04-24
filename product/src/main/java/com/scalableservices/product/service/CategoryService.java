package com.scalableservices.product.service;

import java.util.List;

import com.scalableservices.product.dto.CategoryResponse;
import com.scalableservices.product.exception.NoCategoriesFoundException;
import com.scalableservices.product.model.Category;

public interface CategoryService {

	List<CategoryResponse> getCategories() throws NoCategoriesFoundException;

	Category getCategory(Long categoryId) throws NoCategoriesFoundException;

}
