package com.example.demo.repository.gourav.signup.impl;


import com.example.demo.entities.gourav.User;
import com.example.demo.jpa.repository.gourav.UserGouravJPARespository;

import com.example.demo.repository.gourav.signup.SignUpGouravRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SignUpGouravRespositoryImpl implements SignUpGouravRespository {

    @Autowired
    private UserGouravJPARespository userRespository;

    @Override
    @Transactional("gouravTransactionManager")
    public void saveUser(User user) {
        try{
            userRespository.save(user);
        } catch (DataAccessException e){
            System.out.println("hello");
        }
    }
}
