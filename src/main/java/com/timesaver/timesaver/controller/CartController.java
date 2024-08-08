package com.timesaver.timesaver.controller;

import com.timesaver.timesaver.domain.ProductOrder;
import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.global.GlobalData;
import com.timesaver.timesaver.services.ProductSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartController {
    @Autowired
    ProductSer productSer;

    @Autowired
    ProductSer productRepo;

    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable int id) {
        GlobalData.cart.add(productRepo.getProductsByID(id));
        return "redirect:/allShops";
    }

    @GetMapping("/cart")
    public String cartGet(Model model) {
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Products::getPrice).sum());
        model.addAttribute("cart", GlobalData.cart);
        return "cart";
    }

    @GetMapping("/cart/removeItem/{index}")
    public String cartItemRemove(@PathVariable int index) {
        GlobalData.cart.remove(index);
        return "redirect:/cart";
    }

//    @GetMapping("/checkout")
//    public String checkout(Model model){
//        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Products::getPrice).sum());
//        return "checkout";
//    }

    @GetMapping("/checkout")
    public String showNewRProductForm( Model model){
        ProductOrder productOrder = new ProductOrder();
        model.addAttribute("productOrder", productOrder);
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Products::getPrice).sum());
        model.addAttribute("cart", GlobalData.cart);
        return "checkout";
    }
}
