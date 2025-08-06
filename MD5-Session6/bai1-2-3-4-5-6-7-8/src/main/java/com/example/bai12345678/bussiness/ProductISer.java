package com.example.bai12345678.bussiness;

import com.example.bai12345678.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductISer {
    List<Product> findAll();

    boolean save(Product product);
}
