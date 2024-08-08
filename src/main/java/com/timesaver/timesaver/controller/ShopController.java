package com.timesaver.timesaver.controller;

import com.timesaver.timesaver.domain.Shop;
import com.timesaver.timesaver.global.GlobalData;
import com.timesaver.timesaver.repository.ShopRepo;
import com.timesaver.timesaver.services.ShopSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShopController {
    @Autowired
    ShopSer shopSer;

    @Autowired
    ShopRepo shopRepo;

//    display all shops
    @GetMapping("/allShops")
    public String getAllShops(Model model){
        List<Shop> shopList = shopSer.getAllShops();
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("shopList", shopList);
        return "Shop/AllShops";
    }

//    Create a new shop
    @GetMapping("/addShop")
    public String addShop(Model model){
        Shop shop = new Shop();
        model.addAttribute("shop", shop);
//        model.addAttribute("teachers", teachersSer.getTeachers());
        return "shop/addShop";
    }

    //SAVE SHOP TO DATABASE
    @PostMapping("/saveShop")
    public String saveProduct(Shop shop) {
        shopSer.saveShop(shop);
        return "redirect:/allShops";
    }

    //  EDIT Shop
    @RequestMapping("/edit/shop/{id}")
    public String EditShopForm(@PathVariable("id") Long id, Model model){
        Shop shop = shopRepo.findById(id).get();
        model.addAttribute("shop",shop);
        return "Shop/EditShop";
    }


}
