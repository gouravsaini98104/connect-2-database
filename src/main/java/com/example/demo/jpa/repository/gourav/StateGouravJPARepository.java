package com.example.demo.jpa.repository.gourav;

import com.example.demo.entities.gourav.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateGouravJPARepository extends JpaRepository<State, Integer> {
}
