package com.example.Studentdemo;

import com.example.Studentdemo.entity.StudentEntity;
import com.example.Studentdemo.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
    private StudentRepository repo;
    public StudentController(StudentRepository repo){
        this.repo=repo;
    }

    @GetMapping
    public List<StudentEntity> getstudent(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public StudentEntity getstudentyid(@PathVariable Long id){
        return repo.findById(id).orElseThrow(()->new RuntimeException("hi"));
    }

    @PostMapping()
    public StudentEntity post(@RequestBody StudentEntity student){
        return repo.save(student);
    }

    @PostMapping("/{id}")
    public StudentEntity update(@PathVariable Long id,@RequestBody StudentEntity updated){
        StudentEntity current=repo.findById(id).orElseThrow(()->new RuntimeException("invalid"));
        current.setName(updated.getName());
        current.setEmail(updated.getEmail());
        return repo.save(current);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}
