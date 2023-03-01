package com.example.demo.controller.signup.impl;

import com.example.demo.controller.signup.SignupApi;
import com.example.demo.models.User;
import com.example.demo.service.signup.SignUpService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SignupApiController implements SignupApi {

    private static final Logger log = LoggerFactory.getLogger(SignupApiController.class);

    @Autowired
    private SignUpService signUpService;

    public ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent user", required = true, schema = @Schema()) @RequestBody User user) {

        signUpService.createUser(user);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
