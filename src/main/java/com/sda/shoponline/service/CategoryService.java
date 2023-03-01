package com.sda.shoponline.service;


import com.sda.shoponline.model.Product;

import com.sda.shoponline.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

 public void addCategory(Category category);


 public List<Category> listCategory();

 public Category getCategoryById(int id);

 public List<Product> getProductsByCategoryId(int id);

 public void removeCategory(int id);

}
