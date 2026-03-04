package com.example.userapi.Controller;

import com.example.userapi.Entity.User;
import com.example.userapi.Repository.UserRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserRepository userrepo;
    @PostMapping("/adduser")
    public User adduser(@RequestBody User user){
        return userrepo.save(user);
    }

    @GetMapping("/users")
    public List<User> getusers(){
        return userrepo.findAll();
    }
}
