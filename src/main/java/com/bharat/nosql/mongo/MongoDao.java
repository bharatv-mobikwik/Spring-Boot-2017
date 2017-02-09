package com.bharat.nosql.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import java.util.List;

/**
 * Created by BHARAT VERMA on 7/2/17.
 */
@Component
public class MongoDao {

    private static final String USER_COLLECTION_NAME ="users";


    @Autowired
    private MongoTemplate mongoTemplate;

    public List<UserEntity> getUsers() {
        Query query = new Query();
        return mongoTemplate.find(query, UserEntity.class);
    }
}
