package com.timesaver.timesaver.controller;

import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.domain.Shop;
import com.timesaver.timesaver.global.GlobalData;
import com.timesaver.timesaver.repository.ProductRepo;
import com.timesaver.timesaver.repository.ShopRepo;
import com.timesaver.timesaver.services.ProductSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ShopRepo shopRepo;

    @Autowired
    private ProductSer productSer;

    @Autowired
    private ProductRepo productRepo;

//    DISPLAY ALL Products
    @GetMapping("/allProducts")
    public String getAllProducts(Model model){
        List<Products> productList = productSer.getAllProducts();
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("productList", productList);
        return "product/allProducts";
    }

    //CREATE NEW RESULT BY ID
    @GetMapping("/new/product/{id}")
    public String showNewRProductForm(@PathVariable("id") Long id, Model model){
        Shop shop = shopRepo.findById(id).get();
        model.addAttribute("product",new Products());
        model.addAttribute("shop", shop);
        return "product/addProduct";
    }

    //SAVE Product TO DATABASE
    @PostMapping("/saveProduct")
    public String saveResults(Products product) {
        productSer.saveProduct(product);
        return "redirect:/allProducts";
    }

    //find all products in a shop
    @RequestMapping(value = "/shop/products/{id}")
    public String getProductsByShopId(@PathVariable Long id,Model model){
        List<Products> shopProducts = productSer.getProductsByShopId(id);
        Shop shop = shopRepo.findById(id).get();
        model.addAttribute("shopProducts",shopProducts);
        model.addAttribute("shop",shop);
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "product/shopProducts";
    }

    //SEE THE FULL PROFILE OF STUDENT
    @GetMapping("/product/detail/{id}")
    public String showProductDetail(@PathVariable("id") Long id, Model model){
        Products product = productRepo.findById(id).get();
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("product", product);
        return "product/productDetail";
    }
}
