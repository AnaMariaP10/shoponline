package com.sda.shoponline.service;


import com.sda.shoponline.model.Product;

import java.util.List;

public interface ProductService {

  void addProduct(Product product);

  List<Product> listProducts();

  Product getProductById(int id);

  void removeProduct(int id);
}
