package com.bharat.nosql.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BHARAT VERMA on 7/2/17.
 */
@Service
public class MongoService {

    @Autowired
    private MongoDao mongoDao;


    public List getUsers() {
        return mongoDao.getUsers();
    }
}
