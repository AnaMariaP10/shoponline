package com.sda.shoponline.controller;

import com.sda.shoponline.model.Product;
import com.sda.shoponline.repository.ProductRepository;
import com.sda.shoponline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public List<Product> getProductList() {
        return productService.listProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        try {
            Product product = productService.getProductById(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/products")
    public void add(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
        try {
            Product existProduct = productService.getProductById(id);
            productService.addProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        productService.removeProduct(id);
    }


}

