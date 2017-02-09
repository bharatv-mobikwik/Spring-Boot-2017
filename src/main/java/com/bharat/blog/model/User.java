package com.bharat.blog.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by BHARAT VERMA on 6/2/17.
 */
public class User {

    public long id;
    public String username;
    public String passwordHash;
    public String fullName;


    public Set<Post> posts = new HashSet<Post>();

    public User() {}

    public User(long id, String userName, String fullName) {
        this.id = id;
        this.username = userName;
        this.fullName = fullName;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(username).append('\'');
        sb.append(", passwordHash='").append(passwordHash).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", posts=").append(posts.toString());
        sb.append('}');
        return sb.toString();
    }
}
