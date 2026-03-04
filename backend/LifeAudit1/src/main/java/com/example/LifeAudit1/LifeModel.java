package com.example.LifeAudit1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LifeModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private int hrw;
    private float sh;
    private int sl;
    public LifeModel(){}
    public LifeModel(String name , int age , int hrw , float sh , int sl){
        this.name=name;
        this.age=age;
        this.hrw=hrw;
        this.sh=sh;
        this.sl=sl;
    }
    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHrw() {
        return hrw;
    }

    public void setHrw(int hrw) {
        this.hrw = hrw;
    }

    public float getSh() {
        return sh;
    }

    public void setSh(float sh) {
        this.sh = sh;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
}