package com.bharat.blog.service;

import com.bharat.blog.model.Post;

import java.util.List;

/**
 * Created by BHARAT VERMA on 6/2/17.
 */
public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
