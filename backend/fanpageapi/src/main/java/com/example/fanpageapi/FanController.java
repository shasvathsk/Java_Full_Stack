package com.example.fanpageapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fanpage")
public class FanController {
    List<FanModel> db=new ArrayList<>();
    @PostMapping
    public List<FanModel> put(@RequestParam String name,
                              @RequestParam String email,
                              @RequestParam long contact,
                              @RequestParam String password,
                              @RequestParam String city,
                              @RequestParam int pin){
        FanModel fan = new FanModel(name,email,contact,password,city,pin);
        db.add(fan);
        return db;
    }

    @GetMapping
    public List<FanModel> get(){
        return db;
    }
}
