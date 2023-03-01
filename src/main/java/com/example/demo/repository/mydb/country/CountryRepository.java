package com.example.demo.repository.mydb.country;


import com.example.demo.entities.mydb.Country;

public interface CountryRepository {

    Country findCountryById(Integer id);
}
