package com.example.creational.simple_factory.post.model;

public class BlogPost extends Post {
    
    private String author;
    private String[] tags;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String[] getTags() {
        return tags;
    }
    public void setTags(String[] tags) {
        this.tags = tags;
    }

}
