package com.example.productsapi2.Controller;

import com.example.productsapi2.Entity.Order;
import com.example.productsapi2.Entity.User;
import com.example.productsapi2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class TestController {

    @Autowired
    private UserRepository userrepo;

    // Get all users
    @GetMapping
    public List<User> getUsers() {
        return userrepo.findAll();
    }

    // Add an order to a user
    @PostMapping("/{id}/orders")
    public User addOrder(@PathVariable Long id, @RequestBody Order order) {
        return userrepo.findById(id).map(user -> {
            order.setUser(user);              // set relationship
            user.getOrders().add(order);      // add to user's list
            return userrepo.save(user);       // save user with new order
        }).orElseThrow(() -> new RuntimeException("Invalid user ID: " + id));
    }
}
