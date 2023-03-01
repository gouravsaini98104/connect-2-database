package com.example.demo.jpa.repository.mydb;

import com.example.demo.entities.mydb.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateJPARepository extends JpaRepository<State, Integer> {
}
