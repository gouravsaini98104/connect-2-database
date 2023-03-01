package com.example.demo.service.signup.impl;

import com.example.demo.mappers.UserGouravMapper;
import com.example.demo.mappers.UserMapper;
import com.example.demo.models.User;

import com.example.demo.repository.gourav.signup.SignUpGouravRespository;
import com.example.demo.repository.mydb.signup.SignUpRespository;
import com.example.demo.service.signup.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpRespository signUpRespository;

    @Autowired
    private SignUpGouravRespository signUpGouravRespository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserGouravMapper userGouravMapper;

    @Override
    public void createUser(User user) {

        signUpGouravRespository.saveUser(userGouravMapper.mapUserModeltoEntity(user));
        signUpRespository.saveUser(userMapper.mapUserModeltoEntity(user));

    }
}
