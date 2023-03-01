package com.example.demo.controller.user.impl;

import com.example.demo.controller.user.UserApi;
import com.example.demo.models.User;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    public ResponseEntity<User> findUserById(@Parameter(in = ParameterIn.PATH, description = "ID of user", required = true, schema = @Schema()) @PathVariable("userId") Long userId) {

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> userUserIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of pet to return", required = true, schema = @Schema()) @PathVariable("userId") Long userId) {

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
