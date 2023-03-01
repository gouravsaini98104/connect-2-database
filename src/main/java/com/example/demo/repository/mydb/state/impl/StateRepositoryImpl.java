package com.example.demo.repository.mydb.state.impl;


import com.example.demo.entities.mydb.State;
import com.example.demo.jpa.repository.mydb.StateJPARepository;
import com.example.demo.repository.mydb.state.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository
public class StateRepositoryImpl implements StateRepository {

    @Autowired
    private StateJPARepository stateJPARepository;

    @Override
    @Transactional("mydbTransactionManager")
    public State findStateById(Integer id) {
        try {
            Optional<State> state = stateJPARepository.findById(id);
            if (state.isPresent()) {
                return state.get();
            }

        } catch (DataAccessException e) {

        }
        return null;
    }
}
