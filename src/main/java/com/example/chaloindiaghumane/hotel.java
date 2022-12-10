package com.example.chaloindiaghumane;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/myhotel")
    public String getData(){
        return "Please book your  hotel in goa  ticket, Choose Your Fav Airlines Idigo";
    }

}