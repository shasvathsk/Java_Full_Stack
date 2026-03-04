package com.example.productsapi;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @GeneratedValue
    @Id
    private Long id;
    private String name;

// One user can have many orders
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}