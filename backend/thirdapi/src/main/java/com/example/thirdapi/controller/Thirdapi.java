package com.example.thirdapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Thirdapi{
    @GetMapping("/buddy")
    public String hi(){
        return "hey my dear buddy";
    }
}
