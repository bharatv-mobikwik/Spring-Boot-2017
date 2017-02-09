package com.bharat.nosql.mongo;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created by BHARAT VERMA on 7/2/17.
 */
@Configuration
public class MongoConfig {

    @Value("${mongo.host:127.0.0.1}")
    private String dbhost;

    @Value("${mongo.port}")
    private Integer dbport;

    @Value("${mongo.databaseName}")
    private String dbname;

    @Value("${mongo.connectionsPerHost}")
    private int connectionPerHost;

    @Value("${mongo.maxWaitTime}")
    private int maxWaitTime;

    @Value("${mongo.connectTimeout}")
    private int connectionTimeOut;

    @Value("${mongo.socketTimeout}")
    private int socketTimeOut;

    @Value("${mongo.socketKeepAlive}")
    private boolean socketKeepAlive;

    @Value("${mongo.autoConnectRetry}")
    private boolean autoConnectRetry;

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(dbhost), dbname);
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

        return mongoTemplate;

    }
}
