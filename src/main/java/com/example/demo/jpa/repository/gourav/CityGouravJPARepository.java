package com.example.demo.jpa.repository.gourav;

import com.example.demo.entities.gourav.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityGouravJPARepository extends JpaRepository<City, Integer> {
}
