package com.example.student_profile_demo;


public class UserProfile {
    private int id;
    private  String name;
    private String department;

    public int getId(){
        return id;
    }
    public  void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
}




