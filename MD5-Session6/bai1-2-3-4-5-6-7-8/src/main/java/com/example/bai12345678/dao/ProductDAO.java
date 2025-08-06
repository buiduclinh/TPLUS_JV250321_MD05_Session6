package com.example.bai12345678.dao;

import com.example.bai12345678.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDAO {
    List<Product> findAll();

    boolean save(Product product);
}
