package com.example.pgdemo;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteRepository repo;

    public NoteController(NoteRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Note add(@RequestBody Note note) {
        return repo.save(note);
    }

    @GetMapping
    public List<Note> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Note getOne(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @GetMapping("/title/{title}")
    public Note getname(@PathVariable String title) {
        return repo.findByTitle(title);
    }

    @Transactional
    @DeleteMapping("/delete/{title}")
    public void del(@PathVariable String title){
        repo.deleteByTitle(title);
    }

    @GetMapping("/content/{content}")
    public Note getcontent(@PathVariable String content) {
        return repo.findByContent(content);
    }
    @Transactional
    @DeleteMapping("/delcontent/{content}")
    public void delcontent(@PathVariable String content) {
        repo.deleteByContent(content);
    }
}