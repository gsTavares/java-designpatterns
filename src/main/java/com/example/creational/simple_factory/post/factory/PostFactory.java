package com.example.creational.simple_factory.post.factory;

import com.example.creational.simple_factory.post.model.BlogPost;
import com.example.creational.simple_factory.post.model.NewsPost;
import com.example.creational.simple_factory.post.model.Post;
import com.example.creational.simple_factory.post.model.ProductPost;

public class PostFactory {

    public static Post createPost(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }

}
