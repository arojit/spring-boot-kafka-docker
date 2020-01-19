package com.example.techmantra.controller;

import com.example.techmantra.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/user")
public class User {
    @PostMapping(value = "/add-user")
    public ResponseEntity<Response> addUser(@RequestBody com.example.techmantra.entity.User user){
        Response response = new Response("User Added", LocalDate.now());
        return new ResponseEntity<Response>(response,HttpStatus.CREATED);
    }
}
