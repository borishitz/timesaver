//package com.timesaver.timesaver.domain;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.Set;
//
//@Entity
//
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ShoppingCart {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "shopping_cart_id")
//    private Long id;
//
//    private int totalItems;
//    private double totalPrices;
//
//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
//    private Customer customer;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
//    private Set<CartItem> cartItem;
//
//}
