package com.symum.major.service;

import com.symum.major.model.Category;
import com.symum.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    // Get all the category from the database.
    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }

    // Save the category to the database.
    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    // Delete Category by id
    public void deleteCategory(int id){
        categoryRepository.deleteById(id);
    }

    // Update the category
    public Optional<Category> updateCategory(int id){
        return categoryRepository.findById(id);
    }

}
