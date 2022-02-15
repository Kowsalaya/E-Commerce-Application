package com.example.MyCloudyStoreApplication.service.impl;

import com.example.MyCloudyStoreApplication.entity.CustomUserDetail;
import com.example.MyCloudyStoreApplication.entity.User;
import com.example.MyCloudyStoreApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<User> user = userService.getUserByEmail(email);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user.map(CustomUserDetail::new).get();
        // convert optional to <User> to <CustomUserDetail> after do get() data to optional
    }
}
