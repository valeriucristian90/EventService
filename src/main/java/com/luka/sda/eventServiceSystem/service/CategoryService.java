package com.luka.sda.eventServiceSystem.service;

import com.luka.sda.eventServiceSystem.model.Category;
import com.luka.sda.eventServiceSystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public List findAll() {
        return categoryRepository.findAll();
    }

    public Category create() {
        Category category = new Category();
        category.setLifeEvent("cev");
        category.setSocialEvent("ceva");
        return categoryRepository.save(category);
    }
}
