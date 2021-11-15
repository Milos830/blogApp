package com.milos.testiranjebazeblog.service;

import com.milos.testiranjebazeblog.entity.Category;
import com.milos.testiranjebazeblog.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories (){
       return categoryRepository.findAll();
    }

    private void saveCategory(Category category) {
        categoryRepository.saveAndFlush(category);
    }

    private Category findCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }



}
