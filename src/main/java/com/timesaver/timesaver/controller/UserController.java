package com.timesaver.timesaver.controller;


import com.timesaver.timesaver.dto.RegisterDto;
import com.timesaver.timesaver.entity.User;
import com.timesaver.timesaver.repository.UserRepo;
import com.timesaver.timesaver.services.UserSer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Controller
public class UserController {

    public static String  uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/userImages";
    @Autowired
    public UserSer userSer;

    @Autowired
    public UserRepo userRepo;

        @GetMapping("/user/register")
        public String registerNewUser(Model trans){
            RegisterDto newUser = new RegisterDto();
            trans.addAttribute("newUser", newUser);
            trans.addAttribute("success", false);
            return "register";
        }

        @PostMapping("/user/registration")
        public String showUserRegistrationPage(
            Model model,
            @Valid @ModelAttribute RegisterDto registerDto,
            BindingResult result
            ) {
                if (!registerDto.getPassword().equals(registerDto.getConfirmPassword())) {
                     result.addError(
                         new FieldError("registerDto","confirmPassword",
                             "Password and ConfirmPassword do not match")
                        );
                }
                User appUser = userRepo.findByEmail(registerDto.getEmail());
                if (appUser != null) {
                    result.addError(
                         new FieldError("registerDto", "email"
                              , "Email address is already used"
                              )
                        );
                    }


                if (result.hasErrors()) {
                    return "register";
                }

                try {
                    var bCrypEncoder = new BCryptPasswordEncoder();

                    User newUser = new User();
                    newUser.setFirstName(registerDto.getFirstName());
                    newUser.setLastName(registerDto.getLastName());
                    newUser.setEmail(registerDto.getEmail());
                    newUser.setPhone(registerDto.getPhone());
                    newUser.setRoles("client");
                    newUser.setCreatedAt(new Date());
                    newUser.setPassword(bCrypEncoder.encode((registerDto.getPassword())));
                    userRepo.save(newUser);

                    model.addAttribute("registerDto", new RegisterDto());
                    model.addAttribute("success", true);
                }

                catch(Exception ex) {
                    result.addError(
                            new FieldError(
                                    "registerDto", "firstName"
                                    , ex.getMessage())
                       );
                }

            return "redirect:/login";
        }
//
//        @PostMapping("/user/registration")
//        public String showUserRegistrationPage(User user) {
//            userSer.saveUser(user);
//            return "redirect:/login";
//        }

}
