//package com.timesaver.timesaver.services.impl;
//
//import com.timesaver.timesaver.domain.CartItem;
//import com.timesaver.timesaver.domain.Customer;
//import com.timesaver.timesaver.domain.Products;
//import com.timesaver.timesaver.domain.ShoppingCart;
//import com.timesaver.timesaver.repository.CartItemRepository;
//import com.timesaver.timesaver.repository.ShoppingCartRepository;
//import com.timesaver.timesaver.services.ShoppingCartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class ShoppingCartServiceImplement implements ShoppingCartService {
//
//    @Autowired
//    private CartItemRepository cartItemRepo;
//
//    @Autowired
//    private ShoppingCartRepository shoppingCartRepo;
//
//    @Override
//    public ShoppingCart addItemToCart(Products product, int quantity, Customer customer) {
//        ShoppingCart cart = customer.getShoppingCart();
//
//        if(cart == null){
//            cart = new ShoppingCart();
//        }
//
//        Set<CartItem> cartItems = cart.getCartItem();
//        CartItem cartItem = findCartItem(cartItems, product.getId());
//        if(cartItems == null){
//            cartItems = new HashSet<>();
//            if(cartItem == null){
//                cartItem = new CartItem();
//                cartItem.setProducts(product);
//                cartItem.setTotalPrice(quantity * product.getPrice());
//                cartItem.setQuantity(quantity);
//                cartItem.setCart(cart);
//                cartItems.add(cartItem);
//                cartItemRepo.save(cartItem);
//            }
//        }else{
//            if(cartItem == null){
//                cartItem = new CartItem();
//                cartItem.setProducts(product);
//                cartItem.setTotalPrice(quantity * product.getPrice());
//                cartItem.setQuantity(quantity);
//                cartItem.setCart(cart);
//                cartItems.add(cartItem);
//                cartItemRepo.save(cartItem);
//            }else{
//                cartItem.setQuantity(cartItem.getQuantity() + quantity);
//                cartItem.setTotalPrice(cartItem.getTotalPrice() + (quantity * product.getPrice()));
//                cartItemRepo.save(cartItem);
//            }
//            cart.setCartItem(cartItems);
//
//            int totalItems = totalItems(cart.getCartItem());
//            double totalPrice = totalPrice(cart.getCartItem());
//
//            cart.setTotalPrices(totalPrice);
//            cart.setTotalItems(totalItems);
//            cart.setCustomer(customer);
//
//            return shoppingCartRepo.save(cart);
//        }
//        return null;
//    }
//    private CartItem findCartItem(Set<CartItem> cartItems, Long productId){
//        if(cartItems == null){
//            return null;
//        }
//        CartItem cartItem = null;
//
//        for(CartItem item : cartItems){
//            if(item.getProducts().getId() == productId){
//                cartItem = item;
//            }
//        }
//        return cartItem;
//    }
//
//    private int totalItems(Set<CartItem> cartItems) {
//        int totalItems = 0;
//        for (CartItem item : cartItems){
//            totalItems += item.getQuantity();
//        }
//        return totalItems;
//    }
//    private double totalPrice(Set<CartItem> cartItems) {
//        double totalPrice = 0.0;
//        for (CartItem item : cartItems){
//            totalPrice += item.getTotalPrice();
//        }
//        return totalPrice;
//    }
//
//}
