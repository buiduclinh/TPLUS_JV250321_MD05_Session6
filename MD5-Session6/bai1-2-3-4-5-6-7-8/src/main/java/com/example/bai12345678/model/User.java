package com.example.bai12345678.model;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    @NotBlank(message = "Tên không được để trống")
    private String name;
    @Min(value = 18, message = "Tuổi phải >= 18")
    @Max(value = 100, message = "Tuổi phải <= 100")
    private int age;
    @Past(message = "Ngày sinh phải trong quá khứ")
    private LocalDate birthday;
    @Email(message = "Email không hợp lệ")
    private String email;
    @Pattern(regexp = "^[0-9]{10,11}$", message = "Số điện thoại không hợp lệ")
    private String phone;
}
