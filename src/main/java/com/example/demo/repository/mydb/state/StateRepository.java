package com.example.demo.repository.mydb.state;


import com.example.demo.entities.mydb.State;

public interface StateRepository {

    State findStateById(Integer id);
}
