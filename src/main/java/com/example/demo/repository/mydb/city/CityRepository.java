package com.example.demo.repository.mydb.city;


import com.example.demo.entities.mydb.City;

public interface CityRepository {

    City findCityById(Integer id);
}
