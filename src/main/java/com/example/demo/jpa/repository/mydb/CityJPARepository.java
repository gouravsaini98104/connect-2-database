package com.example.demo.jpa.repository.mydb;

import com.example.demo.entities.mydb.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityJPARepository extends JpaRepository<City, Integer> {
}
