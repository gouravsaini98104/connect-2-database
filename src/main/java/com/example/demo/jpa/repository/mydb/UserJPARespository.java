package com.example.demo.jpa.repository.mydb;

import com.example.demo.entities.mydb.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPARespository extends JpaRepository<User, Integer> {

}
