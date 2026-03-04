package com.example.roughapi2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rough")
public class RoughController {
    private List<String> a=new ArrayList<>();
    @GetMapping
    public String get(){
        return "hi";
    }
    @PostMapping
    public String post(String name){
        a.add(name);
        return name;
    }

}
