package com.timesaver.timesaver;


import com.timesaver.timesaver.global.GlobalData;
import com.timesaver.timesaver.global.GlobalTrips;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    @GetMapping({"/home","","/"})
    public String homePage(Model model){
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("cartCountTrip", GlobalTrips.cart.size());
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @GetMapping("/login")
    public String login(){
        GlobalData.cart.clear();
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
