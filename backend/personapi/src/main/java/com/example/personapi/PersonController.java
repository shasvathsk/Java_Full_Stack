package com.example.personapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
public class PersonController {
    private final PersonRepository repo;
    public PersonController(PersonRepository repo){
        this.repo=repo;
    }
    @PostMapping("/add")
    public PersonModel addperson(@RequestParam String name){
        PersonModel p=new PersonModel();
        p.setName(name);
        return repo.save(p);
    }
    @GetMapping("/all")
    public List<PersonModel> getall(){
        return repo.findAll();
    }
}
