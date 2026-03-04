package com.example.Studentdemo.repository;

import com.example.Studentdemo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long>{

}
