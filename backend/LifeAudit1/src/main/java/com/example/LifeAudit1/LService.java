package com.example.LifeAudit1;

import java.util.List;


@org.springframework.stereotype.Service
public class LService {

    private final Repository repo;

    public LService(Repository repo) {
        this.repo = repo;
    }

    public LifeModel add(LifeModel life) {
        return repo.save(life);
    }

    public List<LifeModel> getAll() {
        return repo.findAll();
    }

    public LifeModel getOne(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    public LifeModel getName(String name){
        return repo.findByName(name);
    }

    public void deleteName(String name){
        repo.deleteByName(name);
    }
}