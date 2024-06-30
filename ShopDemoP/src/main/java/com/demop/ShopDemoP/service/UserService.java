package com.demop.ShopDemoP.service;

import com.demop.ShopDemoP.domain.User.User;
import com.demop.ShopDemoP.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   // @Autowired
   // private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) //BCryptPasswordEncoder bCryptPasswordEncoder)
     {
        this.userRepository = userRepository;
   //     this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Transactional
    public User registerUser(User user) {
        // Check if username or email already exist
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }
        // Encrypt password before saving
        //user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
