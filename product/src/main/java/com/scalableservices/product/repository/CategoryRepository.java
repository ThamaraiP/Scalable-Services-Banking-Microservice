package com.scalableservices.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scalableservices.product.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findByCategoryId(Long categoryId);

}