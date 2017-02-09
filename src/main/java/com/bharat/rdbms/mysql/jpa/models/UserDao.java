package com.bharat.rdbms.mysql.jpa.models;

/**
 * Created by BHARAT VERMA on 9/2/17.
 */

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    public User findByEmail(String email);

}