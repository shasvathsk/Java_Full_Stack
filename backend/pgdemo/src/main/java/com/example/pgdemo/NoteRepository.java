package com.example.pgdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface NoteRepository extends JpaRepository<Note,Long> {
    Note findByTitle(String title);

    Note deleteByTitle(String title);
    Note deleteByContent(String content);
    Note findByContent(String content);
}
