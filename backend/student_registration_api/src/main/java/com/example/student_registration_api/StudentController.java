package com.example.student_registration_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//marks controller as spring rst api
@RequestMapping("/student")//base url--> every 8080 request will start with this endpint,. so here every method starts with /student
public class StudentController {
    private List<StudentModel> db= new ArrayList<>();



    //handle post request
    //param extracts form
    //query parameters from the request
    @PostMapping
    public List<StudentModel> post(@RequestParam String name,
                             @RequestParam String dept){
        StudentModel student=new StudentModel(name,dept);
        db.add(student);
        return db;
    }
                                //    @PostMapping
                                //    public StudentModel post(@RequestBody StudentModel student){
                                //        db.add(student);
                                //        return student;

    //GET /students->return all students
    @GetMapping
    public List<StudentModel> get(){
        return db;
    }

}
