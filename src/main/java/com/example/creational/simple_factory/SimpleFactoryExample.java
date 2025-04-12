package com.example.creational.simple_factory;

import com.example.creational.simple_factory.post.factory.PostFactory;
import com.example.creational.simple_factory.post.model.Post;

public class SimpleFactoryExample {
    public static void main(String[] args) {
        Post blogPost = PostFactory.createPost("blog");
        Post newsPost = PostFactory.createPost("news");
        Post productPost = PostFactory.createPost("product");

        System.out.println(blogPost);
        System.out.println(newsPost);
        System.out.println(productPost);
    }
}
