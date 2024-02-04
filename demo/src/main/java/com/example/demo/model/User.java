package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Модель пользователя.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String firstName;

    private String lastName;
}