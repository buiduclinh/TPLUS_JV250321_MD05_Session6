package com.example.bai12345678.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {
    private int id;
    private String productName;
    private double price;
    private String description;
    private String image;
}
