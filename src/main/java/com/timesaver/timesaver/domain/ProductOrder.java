package com.timesaver.timesaver.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity
@Table(name= "product_order")
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;

    @OneToMany
    private ArrayList<Products> products;
    private String orderTotalAmount;
    private String note;
}
