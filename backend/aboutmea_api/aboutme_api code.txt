package com.example.aboutmea_api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Aboutme {
        @GetMapping("/aboutme")
        @ResponseBody
        public String sayHello() {
            return "<html> <head> <title>ABOUT ME</title><style>body{background-color:blue;color:yellow;text-align:center}h1{color:pink;text-align:center}p{color:pink}</style> </head><body><h1>ABOUT ME</h1><p>paragraph</p>hi hello </body></html>"; // resolves to index.html or index.jsp
        }
    }


