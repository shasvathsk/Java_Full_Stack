package com.example.studentapi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @GetMapping()
    @ResponseBody
    public String sayHello() {
        return "<html> <head> <title>ABOUT ME</title> </head><h1>hello</h1></html>"; // resolves to index.html or index.jsp
    }
}
