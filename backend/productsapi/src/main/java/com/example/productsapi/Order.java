package com.example.productsapi;

import com.example.productsapi.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String product;

// Many orders belong to one user
    @ManyToOne
    @JoinColumn(name ="user_id" ) // foreign key in Order table
    @JsonIgnore
    private User user;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }
    public User qetUser() { return user; }
    public void setUser(User user) { this.user = user; }
}