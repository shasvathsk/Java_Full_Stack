package com.example.userapi.Repository;

import com.example.userapi.Entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport,Long> {
}
