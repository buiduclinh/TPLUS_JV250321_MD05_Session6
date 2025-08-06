package com.example.bai12345678.bussiness.Impl;

import com.example.bai12345678.bussiness.ProductISer;
import com.example.bai12345678.dao.ProductDAO;
import com.example.bai12345678.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServ implements ProductISer {
    @Autowired
    ProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public boolean save(Product product) {
        return productDAO.save(product);
    }
}
