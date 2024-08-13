//package com.timesaver.timesaver.domain;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//public class CartItem {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private int quantity;
//    private double totalPrice;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "product_id")
//    private ShoppingCart cart;
//
//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
//    private Products products;
//}
