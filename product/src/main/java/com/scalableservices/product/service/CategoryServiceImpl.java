package com.scalableservices.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalableservices.product.dto.CategoryResponse;
import com.scalableservices.product.exception.NoCategoriesFoundException;
import com.scalableservices.product.model.Category;
import com.scalableservices.product.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<CategoryResponse> getCategories() throws NoCategoriesFoundException {
		List<CategoryResponse> categoryResponses = new ArrayList<>();
		List<Category> categories = categoryRepository.findAll();
		if(categories.isEmpty()) {
			throw new NoCategoriesFoundException("No Categories Found");
		}
		categories.forEach(category -> {
			CategoryResponse categoryResponse = new CategoryResponse();
			categoryResponse.setCategory(category.getCategory());
			categoryResponse.setCategoryId(category.getCategoryId());
			categoryResponses.add(categoryResponse);
		});
		return categoryResponses;
	}

	@Override
	public Category getCategory(Long categoryId) throws NoCategoriesFoundException {
		Category category = categoryRepository.findByCategoryId(categoryId);
		if(Objects.isNull(category)) {
			throw new NoCategoriesFoundException("No Categories Found");
		}
		return category;
	}

}
