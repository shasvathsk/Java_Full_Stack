package com.example.jobapi.Controller;

import com.example.jobapi.Model.Users;
import com.example.jobapi.Repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repo;

    public UserController(UserRepository repo){
        this.repo=repo;
    }




    @PostMapping
    public Users create(@Valid @RequestBody Users user) {
        return repo.save(user);
    }


}
