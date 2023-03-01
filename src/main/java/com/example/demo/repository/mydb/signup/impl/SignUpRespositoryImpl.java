package com.example.demo.repository.mydb.signup.impl;


import com.example.demo.entities.mydb.User;
import com.example.demo.jpa.repository.mydb.UserJPARespository;
import com.example.demo.repository.mydb.signup.SignUpRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SignUpRespositoryImpl implements SignUpRespository {

    @Autowired
    private UserJPARespository userRespository;

    @Override
    @Transactional("mydbTransactionManager")
    public void saveUser(User user) {
        try{
            userRespository.save(user);
        } catch (DataAccessException e){
            System.out.println("hello");
        }
    }
}
