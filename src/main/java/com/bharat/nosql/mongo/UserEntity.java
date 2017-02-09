package com.bharat.nosql.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by BHARAT VERMA on 7/2/17.
 */
@Document(collection = "users")
public class UserEntity {

    @Id
    private String id;

    private String email;

    private String hashed_password;

    private String salt;

    private String username;

    private String name;

    private String provider;

    private List<String> roles;

    private String __v;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getHashed_password() {
        return hashed_password;
    }

    public String getSalt() {
        return salt;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getProvider() {
        return provider;
    }

    public List<String> getRoles() {
        return roles;
    }

    public String get__v() {
        return __v;
    }

    public UserEntity(String id, String email, String hashed_password, String salt, String username, String name,
                      String provider, List<String> roles, String __v) {
        this.id = id;
        this.email = email;
        this.hashed_password = hashed_password;
        this.salt = salt;
        this.username = username;
        this.name = name;
        this.provider = provider;
        this.roles = roles;
        this.__v = __v;
    }

    public UserEntity() {
    }
}
