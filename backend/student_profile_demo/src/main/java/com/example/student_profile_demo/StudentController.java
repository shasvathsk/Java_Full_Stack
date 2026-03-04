package com.example.student_profile_demo;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    @PostMapping("/students")
    public UserProfile addstudent(@RequestBody UserProfile student) {
        student.setId(1000);
        if(student.getDepartment().equals("ece")){
            student.setDepartment("aids");
        }
        return student;
    }
}
