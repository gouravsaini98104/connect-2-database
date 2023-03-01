/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.40).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.demo.controller.signup;

import com.example.demo.models.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-15T07:26:22.438049028Z[GMT]")
@Validated
public interface SignupApi {

    @Operation(summary = "Update an existing user", description = "", tags = {"signUp"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),

            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),

            @ApiResponse(responseCode = "404", description = "User not found")})
    @RequestMapping(value = "/signup",
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent user", required = true, schema = @Schema()) @RequestBody User body);

}

