package com.timesaver.timesaver.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/user/register").permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/css/**").permitAll()
                        .requestMatchers("/fonts/**").permitAll()
                        .requestMatchers("/images/**").permitAll()
                        .requestMatchers("/js/**").permitAll()
                        .requestMatchers("/addShop").permitAll()
                        .requestMatchers("/allShops").permitAll()
                        .requestMatchers("/saveShop").permitAll()
                        .requestMatchers("/new/**").permitAll()
                        .requestMatchers("/saveProduct").permitAll()
                        .requestMatchers("/allProducts","/addTravelAgency","addTrip").permitAll()
                        .requestMatchers("/shop/**").permitAll()
                        .requestMatchers("/product/**").permitAll()
                        .requestMatchers("/addToCart/*").permitAll()
                        .requestMatchers( "/cart").permitAll()
                        .requestMatchers( "/checkout").permitAll()
                        .requestMatchers("/cart/removeItem/").permitAll()
                        .requestMatchers("/user/registration").permitAll()
                        .requestMatchers("/about").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .defaultSuccessUrl("/dashboard", true)
                )
                .logout(config -> config.logoutSuccessUrl("/"))
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
