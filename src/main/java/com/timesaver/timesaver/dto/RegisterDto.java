package com.timesaver.timesaver.dto;

import jakarta.validation.constraints.*;

import lombok.Data;

@Data
public class RegisterDto {
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    private String phone;
    @Email
    private String email;
    @Size(min = 6, message = "Minimum password lenght is 6 characters")
    private String password;
    private String confirmPassword;
}
