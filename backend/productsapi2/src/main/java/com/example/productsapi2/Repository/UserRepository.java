package com.example.productsapi2.Repository;

import com.example.productsapi2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    Long id(Long id);
}
