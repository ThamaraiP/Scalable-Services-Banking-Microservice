package com.scalableservices.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scalableservices.product.model.Category;
import com.scalableservices.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByCategory(Category category);

}
