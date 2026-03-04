package com.example.personapi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PersonModel {
    @Id
    private String name;

    public void setName(String name){this.name=name;}
    public String getName(){return name;}
}
