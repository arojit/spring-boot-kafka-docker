package com.example.techmantra.controller;

import com.example.techmantra.response.Response;
import com.example.techmantra.service.UserAdministrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/user")
public class User {
    @Autowired
    UserAdministrator userAdministrator;
    
    @PostMapping(value = "/add-user")
    public ResponseEntity<Response> addUser(@RequestBody com.example.techmantra.entity.User user){
        Response response = new Response(userAdministrator.addUser(user), LocalDate.now());
        return new ResponseEntity<Response>(response,HttpStatus.CREATED);
    }
}
