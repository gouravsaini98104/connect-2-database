package com.example.demo.jpa.repository.mydb;

import com.example.demo.entities.mydb.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryJPARepository extends JpaRepository<Country, Integer> {
}
