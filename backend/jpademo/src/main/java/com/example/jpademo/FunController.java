package com.example.jpademo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fun")
public class FunController {
    private final FunRepository repo;
    //contructor injection
    public FunController(FunRepository repo){
        this.repo=repo;
    }
    @PostMapping
//    public Fun addfun(@RequestBody Fun fun){
//        return repo.save(fun);
//    }
    public void addfun(@RequestParam String mike1,@RequestParam String mike2){
        Fun f=new Fun(mike1,mike2);
        repo.save(f);
        return ;

    }
    @GetMapping
    public List<Fun> getfun(){
        return repo.findAll();
    }

}
