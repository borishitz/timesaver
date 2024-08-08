package com.timesaver.timesaver.services;

import com.timesaver.timesaver.entity.User;
import com.timesaver.timesaver.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserSer implements UserDetailsService {
    @Autowired
    public UserRepo userRepo;

    public long countUser(){
        long count = userRepo.count();
        return count;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User appUser = userRepo.findByEmail(email);

        if (appUser != null) {
            var springUser = org.springframework.security.core.userdetails.User.withUsername(appUser.getEmail())
                    .password(appUser.getPassword())
                    .roles(appUser.getRoles())
                    .build();

            return springUser;
        }
        return null;
    }
}
