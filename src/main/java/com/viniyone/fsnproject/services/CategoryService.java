package com.viniyone.fsnproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniyone.fsnproject.domain.Category;
import com.viniyone.fsnproject.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;
	
	public Category find(Integer id) { 
		  Optional<Category> obj = repo.findById(id); 
		  return obj.orElse(null); 
		} 
}