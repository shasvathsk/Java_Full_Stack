package com.example.Calculator_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/{op}/{x}/{y}")
    public String cal(@PathVariable String op,
                   @PathVariable int x,
                   @PathVariable int y) {
        int ans=0;
        switch(op){
            case("add"):ans=x+y;
                break;
            case("sub"):ans=x-y;
                break;
            case("prod"):ans=x*y;
                break;
            case("quo"):ans=x/y;
                break;
            case("rem"):ans=x%y;
                break;
        }
        return "Result : "+ans;
    }

    @GetMapping("/calc/{x}/{y}")
    public String get(@PathVariable int x,
                      @PathVariable int y) {
        return "add: "+(x+y)+"<br>"+
                "sub: "+(x-y)+"<br>"+
                "prod: "+(x*y)+"<br>"+
                "quo: "+(x/y)+"<br>"+
                "rem: "+(x%y);
    }
}
