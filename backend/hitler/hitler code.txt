package com.example.hitler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HitlerApplication{
    @GetMapping()
    public int hi(){
        return 9;
    }
}