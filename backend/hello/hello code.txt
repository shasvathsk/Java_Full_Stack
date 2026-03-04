package com.example.hello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello{
//    @GetMapping("/hello")
//    public String gets() {
//        return "hellooo";
//    }
//
//    @GetMapping("/hello/{name}")
//    public String get(@PathVariable String name) {
//        return "hello i am "+name+"!";
//    }
//
//    @GetMapping("/hello/{name}/{city}")
//    public String get(@PathVariable String name,
//                      @PathVariable String city) {
//        return "hello i am "+name+",from "+city;
//    }
//    @GetMapping("/hello/{name}/{city}/{college}")
//    public String get(@PathVariable String name,
//                      @PathVariable String city,
//                      @PathVariable String college) {
//        return "hello i am "+name+",from "+city+", welcome to "+college;
//    }



//    @GetMapping({"/hello/{age}", "/hello/{age}/{city}", "/hello/{age}/{city}/{college}"})
//    public String sayHello(@PathVariable int age,
//                           @PathVariable(required = false) String city,
//                           @PathVariable(required = false) String college
//    ) {
//        if (college != null) {
//            return "Hi I am " + age + ", from " + city + ", welcome to " + college + "!";
//        }
//        if (city != null) {
//            return "Hi I am " + age + ", from " + city + "!";
//        }
//        return "Hi I am " + age + "!";
//    }

    @GetMapping({"/hello/{name}", "/hello/{name}/{city}", "/hello/{name}/{city}/{college}/" , "/hello/{name}/{city}/{college}/{age}"})
    public String sayHello(@PathVariable String name,
                           @PathVariable(required = false) String city,
                           @PathVariable(required = false) String college,
                           @PathVariable(required = false) Integer age
    ) {
        if(age!=null){
            return "Hi I am " + name + ", from " + city + ", welcome to " + college + "!"+ "with age "+age;
        }
        if (college != null) {
            return "Hi I am " + name + ", from " + city + ", welcome to " + college + "!";
        }
        if (city != null) {
            return "Hi I am " + name + ", from " + city + "!";
        }
        return "Hi I am " + name + "!";
    }
}


