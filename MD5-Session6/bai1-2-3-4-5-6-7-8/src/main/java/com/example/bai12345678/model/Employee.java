package com.example.bai12345678.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    private int id;
    @NotBlank(message = "Tên không được để trống")
    private String name;
    @Email(message = "Email không hợp lệ")
    private String email;
    private String position;
}
