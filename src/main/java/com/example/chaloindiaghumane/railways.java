package com.example.chaloindiaghumane;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railways {
    @GetMapping("/mytrain")
    public String getData(){
        return "Please book your  train ticket from pune to lonavla";
    }

}