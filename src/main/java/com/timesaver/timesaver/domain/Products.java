package com.timesaver.timesaver.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String productName;
    private String productDescription;
    private int price;

    @ManyToOne
    private Shop shop;


}
