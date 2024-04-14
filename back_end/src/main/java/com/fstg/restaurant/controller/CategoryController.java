package com.fstg.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.restaurant.model.Category;
import com.fstg.restaurant.service.CategoryService;

@RestController
public class CategoryController {

	private CategoryService categoryService;

	@Autowired
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping("/api/allCategories")
	public List<Category> getAllCategory() {
		return categoryService.allCategories();
	}
}
