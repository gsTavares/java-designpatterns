package com.example.creational.simple_factory.post.model;

import java.time.LocalDateTime;

public abstract class Post {
    
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime publishedon;

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
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
    public LocalDateTime getPublishedon() {
        return publishedon;
    }
    public void setPublishedon(LocalDateTime publishedon) {
        this.publishedon = publishedon;
    }

}
