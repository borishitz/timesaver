package com.timesaver.timesaver.controller;

import com.timesaver.timesaver.domain.ProductOrder;
import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.domain.Shop;
import com.timesaver.timesaver.global.GlobalData;
import com.timesaver.timesaver.services.ProductOrderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductOrderController {
    @Autowired
    ProductOrderSer productOrderSer;
    //    DISPLAY ALL Orders
    @GetMapping("/all/product/orders")
    public String getAllProductOrders(Model model){
        List<ProductOrder> productOrderList = productOrderSer.getAllProductOrders();
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("productOrderList", productOrderList);
        return "productOrderList/allProductOrders";
    }

    //CREATE NEW RESULT BY ID
//    @GetMapping("/checkout")
//    public String showNewRProductForm( Model model){
//        ProductOrder productOrder = new ProductOrder();
//        model.addAttribute("productOrder", productOrder);
//        model.addAttribute("cartCount", GlobalData.cart.size());
//        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Products::getPrice).sum());
//        model.addAttribute("cart", GlobalData.cart);
//        return "checkout";
//    }
}
