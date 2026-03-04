package com.example.fanpageapi;

public class FanModel {
    private String name;
    private String email;
    private long contact;
    private String password;
    private String city;
    private int pin;

    FanModel(){}
    FanModel(String name,String email,long contact,String password,String city,int pin){
        this.name=name;
        this.email=email;
        this.contact=contact;
        this.password=password;
        this.city=city;
        this.pin=pin;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public long getContact(){
        return contact;
    }
    public void setContact(long contact){
        this.contact=contact;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public int getPin(){
        return pin;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
}
