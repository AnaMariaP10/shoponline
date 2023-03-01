package com.sda.shoponline.service.impl;


import com.sda.shoponline.model.Category;
import com.sda.shoponline.model.Product;
import com.sda.shoponline.repository.ProductRepository;
import com.sda.shoponline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void removeProduct(int id) {
        productRepository.deleteById(id);

    }
}
