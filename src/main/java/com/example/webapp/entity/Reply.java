package com.example.webapp.entity;

import jakarta.persistence.*;

// @Entity = table
@Entity
// class --ORM-> table
public class Reply {
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String title; // varchar(50)
    private String content;
    //getter, setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
