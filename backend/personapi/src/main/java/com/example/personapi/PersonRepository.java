package com.example.personapi;

import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonRepository extends JpaRepository<PersonModel,String>{

}
