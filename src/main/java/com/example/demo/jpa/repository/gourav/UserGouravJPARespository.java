package com.example.demo.jpa.repository.gourav;

import com.example.demo.entities.gourav.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGouravJPARespository extends JpaRepository<User, Integer> {

}
