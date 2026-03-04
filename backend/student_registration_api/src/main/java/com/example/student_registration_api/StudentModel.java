package com.example.student_registration_api;

public class StudentModel {
    private String name;
    private String dept;
    public StudentModel(){          //default constructor
    }
    public StudentModel(String name,String dept){       //parameterised constructor
        this.name=name;
        this.dept=dept;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
}
