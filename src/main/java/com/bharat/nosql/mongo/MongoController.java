package com.bharat.nosql.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by BHARAT VERMA on 7/2/17.
 */

@RestController
@RequestMapping("/nosql")
public class MongoController {


    @Autowired
    private MongoService mongoService;

    @RequestMapping(value = "/mongo", method = RequestMethod.GET)
    public List<UserEntity> getUsers () {
        return mongoService.getUsers();
    }
}
