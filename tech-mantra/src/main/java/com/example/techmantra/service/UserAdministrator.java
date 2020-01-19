package com.example.techmantra.service;

import com.example.techmantra.entity.User;
import com.example.techmantra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdministrator {
    @Autowired
    private UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User Added";
    }
}
