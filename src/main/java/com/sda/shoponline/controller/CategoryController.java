package com.sda.shoponline.controller;

import com.sda.shoponline.dto.CategoryDTO;
import com.sda.shoponline.model.Category;
import com.sda.shoponline.model.Product;
import com.sda.shoponline.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategoryList() {
        return categoryService.listCategory();
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable int id) {
        try {
            Category category = categoryService.getCategoryById(id);
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/category")
    public void add(@RequestBody CategoryDTO category) {
        System.out.println(category);
//        categoryService.addCategory(category);
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<?> update(@RequestBody Category category, @PathVariable Integer id) {
        try {
            Category existCategory = categoryService.getCategoryById(id);
            categoryService.addCategory(category);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}


