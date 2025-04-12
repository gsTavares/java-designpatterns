package com.example.creational.simple_factory.post.model;

import java.time.LocalDate;

public class NewsPost extends Post {
    
    private String headline;
    private LocalDate newTime;

    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public LocalDate getNewTime() {
        return newTime;
    }
    public void setNewTime(LocalDate newTime) {
        this.newTime = newTime;
    }

}
