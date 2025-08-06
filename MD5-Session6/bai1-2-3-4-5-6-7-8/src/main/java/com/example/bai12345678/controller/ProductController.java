package com.example.bai12345678.controller;// ProductController.java

import com.example.bai12345678.dao.ProductDAO;
import com.example.bai12345678.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping
    public String getAllProducts(Model model) {
        List<Product> products = productDAO.findAll();
        model.addAttribute("products", products);
        return "ProductView"; // view/ProductView.jsp
    }

    @PostMapping
    public String save(@ModelAttribute Product product) {
        productDAO.save(product);
        return "redirect:/products";
    }
}