package com.example.reactapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ReactController {

    @GetMapping("/backend")
    public String get(){
        return "this is my backend";
    }
}
