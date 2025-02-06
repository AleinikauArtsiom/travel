package com.example.travelpet.api.service;

import com.example.travelpet.api.exception.NotFoundException;
import com.example.travelpet.model.entity.Category;
import com.example.travelpet.model.entity.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.getReferenceById(id);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    //TODO:
    public Category updateCategory(Long id, Category categoryDetails) {
       return  null;
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}

