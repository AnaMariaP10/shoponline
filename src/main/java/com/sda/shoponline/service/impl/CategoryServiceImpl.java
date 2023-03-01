package com.sda.shoponline.service.impl;


import com.sda.shoponline.model.Category;
import com.sda.shoponline.model.Product;
import com.sda.shoponline.repository.CategoryRepository;
import com.sda.shoponline.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);

    }

    @Override
    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Product> getProductsByCategoryId(int id) {
        return null;
    }

    @Override
    public void removeCategory(int id) {
        categoryRepository.deleteById(id);

    }
}
