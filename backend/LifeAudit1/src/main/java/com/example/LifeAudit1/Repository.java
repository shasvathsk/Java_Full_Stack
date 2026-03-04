package com.example.LifeAudit1;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface Repository extends JpaRepository<LifeModel,Long> {
     public LifeModel findByName(String Name);
    public LifeModel deleteByName(String Name);


}