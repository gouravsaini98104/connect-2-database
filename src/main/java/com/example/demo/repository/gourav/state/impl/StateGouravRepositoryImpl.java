package com.example.demo.repository.gourav.state.impl;


import com.example.demo.entities.gourav.State;
import com.example.demo.jpa.repository.gourav.StateGouravJPARepository;
import com.example.demo.repository.gourav.state.StateGouravRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository
public class StateGouravRepositoryImpl implements StateGouravRepository {

    @Autowired
    private StateGouravJPARepository stateJPARepository;

    @Override
    @Transactional("gouravTransactionManager")
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
