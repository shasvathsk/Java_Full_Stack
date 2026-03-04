package com.example.happyapi;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class Model2Controller {
    private List<Model2> store=new ArrayList<>();
//    @GetMapping("/mymodel2")
//    public Model2 sampleData(){
//        Model2 m=new Model2();
//        m.setColor("Clue");
//        m.setName("Shasvath");
//        return m;
//    }

//    @PostMapping("/mymodel2")
//    public Model2 get(@RequestBody Model2 profile){
//        store.add(profile); //additional with list
//        return profile;
//    }
    @GetMapping("/mymodel2")
    public List<Model2> getAll(){
        return store;
    }
    @PutMapping("/mymodel2/{index}")
    public Model2 update(@PathVariable int index,@RequestBody Model2 newData){
        if(index >=0 && index<store.size()){
            store.set(index,newData);
            return newData;
        }else{
            throw new RuntimeException("Invalid index");
        }}

        @DeleteMapping("/mymodel2/{index}")
                public String delete(@PathVariable int index){
                    if(index>=0 && index<store.size()){
                        store.remove(index);
                        return "deleted successfullly";
                    }else{
                        return "invalid index";
                    }
        }
        
        @PostMapping ("/mymodel2")
    public List<Model2> addall(@RequestBody List<Model2> data){
        store.addAll(data);
        return data;
        }
    }

