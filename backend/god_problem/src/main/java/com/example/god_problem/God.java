package com.example.god_problem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class God {
    @GetMapping("/lemons/{n}")
    public String get(@PathVariable int n) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        StringBuilder s3=new StringBuilder();
        if(n>=7){
            s1.append("god1 : offered 7");
        }else{
            if(n==0){
                s1.append("god1: need 7");
            }else {
                if(n<0){
                    s1.append("god1: need ").append(7);
                }else{
                    s1.append("god1: have ").append(n).append("need ").append(7 - n);
                }
            }
        }
        n-=7;
        if(n>=7){
            s2.append("god2 : offered 7");
        }else{
            if(n==0){
                s2.append("god2: need 7");
            }else {
                if(n<0){
                    s2.append("god2: need ").append(7);
                }else{
                s2.append("god2: have ").append(n).append("need ").append(7 - n);
            }
        }
        }
        n-=7;
        if(n>=7){
            s3.append("god3 : offered 7");
        }else {
            if (n == 0) {
                s3.append("god3: need 7");
            } else {
                if (n < 0) {
                    s3.append("god3: need ").append(7);
                } else {
                    s3.append("god3: have ").append(n).append("need ").append(7 - n);
                }
            }
        }
        n-=7;
        if(n>0){
            s3.append("<br>").append("Surplus : ").append(n);
        }else if(n<0){
            s3.append("<br>").append("Shortage : ").append(21-(21+n));
        }

        return s1.toString()+"<br>"+s2.toString()+"<br>"+s3.toString()+"<br>"+"God bless you :)";
    }
}
