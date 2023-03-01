package com.sda.shoponline.repository;


import com.sda.shoponline.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);

}
