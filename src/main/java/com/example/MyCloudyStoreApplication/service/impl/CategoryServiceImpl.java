package com.example.MyCloudyStoreApplication.service.impl;

import com.example.MyCloudyStoreApplication.entity.Category;
import com.example.MyCloudyStoreApplication.repository.CategoryRepository;
import com.example.MyCloudyStoreApplication.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }//findAll

    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }//   add or update (although pri-key)


    public void removeCategoryById(int id) {
        categoryRepository.deleteById(id);
    }//delete access to pri-key

    public Optional<Category> getCategoryById(int id) {
        return categoryRepository.findById(id);
    }//search by id

}
