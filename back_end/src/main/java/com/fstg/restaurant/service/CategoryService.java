package com.fstg.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.restaurant.dao.CategoryRepository;
import com.fstg.restaurant.model.Category;


@Service
public class CategoryService {
	private CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> allCategories() {
		return categoryRepository.findAll();
	}
}
