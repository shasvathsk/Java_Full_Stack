package com.example.productsapi;

import com.example. loginPortal.model. User;
import org.springframework.data.jpa.repository. JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {