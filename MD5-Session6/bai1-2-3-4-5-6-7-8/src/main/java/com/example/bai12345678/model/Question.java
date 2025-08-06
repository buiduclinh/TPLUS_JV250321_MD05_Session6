package com.example.bai12345678.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Question {
    private int id;
    private String imageUrl;
    private String answer;
}
