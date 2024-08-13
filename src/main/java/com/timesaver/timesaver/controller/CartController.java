package com.timesaver.timesaver.controller;

import com.timesaver.timesaver.domain.ProductOrder;
import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.domain.Trip;
import com.timesaver.timesaver.global.GlobalData;
import com.timesaver.timesaver.global.GlobalTrips;
import com.timesaver.timesaver.repository.TripRepo;
import com.timesaver.timesaver.services.ProductSer;
import com.timesaver.timesaver.services.TripSer;
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

    @Autowired
    TripSer tripSer;

    @Autowired
    TripRepo tripRepo;

    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable int id) {
        GlobalData.cart.add(productRepo.getProductsByID(id));
        return "redirect:/allShops";
    }

    @GetMapping("/addToCartTrips/{id}")
    public String addToCartTrips(@PathVariable int id) {
        GlobalTrips.cart.add(tripSer.getTripsByID(id));
        return "redirect:/allTrips";
    }

    @GetMapping("/cart")
    public String cartGet(Model model) {
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("cartCountTrip", GlobalTrips.cart.size());
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Products::getPrice).sum());
        model.addAttribute("cart", GlobalData.cart);
        return "cart";
    }

    @GetMapping("/cartTrip")
    public String cartGetTrip(Model model) {
        model.addAttribute("cartCountTrip", GlobalTrips.cart.size());
        model.addAttribute("total", GlobalTrips.cart.stream().mapToDouble(Trip::getTicketPrice).sum());
        model.addAttribute("cartTrip", GlobalTrips.cart);
        return "cartTrip";
    }

    @GetMapping("/cart/removeItem/{index}")
    public String cartItemRemove(@PathVariable int index) {
        GlobalData.cart.remove(index);
        return "redirect:/cart";
    }

    @GetMapping("/trip/removeItem/{index}")
    public String tripItemRemove(@PathVariable int index) {
        GlobalTrips.cart.remove(index);
        return "redirect:/cartTrip";
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
        model.addAttribute("cartCountTrip", GlobalTrips.cart.size());
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Products::getPrice).sum());
        model.addAttribute("cart", GlobalData.cart);
        return "checkout";
    }

    @GetMapping("/checkoutTrip")
    public String showNewTripForm( Model model){
        model.addAttribute("tripCount", GlobalTrips.cart.size());
        model.addAttribute("total", GlobalTrips.cart.stream().mapToDouble(Trip::getTicketPrice).sum());
        model.addAttribute("cart", GlobalTrips.cart);
        return "checkoutTrip";
    }
}
