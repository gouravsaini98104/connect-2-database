package com.example.demo.repository.mydb.country.impl;


import com.example.demo.entities.mydb.Country;
import com.example.demo.jpa.repository.mydb.CountryJPARepository;
import com.example.demo.repository.mydb.country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    @Autowired
    private CountryJPARepository countryJPARepository;

    @Override
    @Transactional("mydbTransactionManager")
    public Country findCountryById(Integer id) {
        try {
            Optional<Country> country = countryJPARepository.findById(id);
            if (country.isPresent()) {
                return country.get();
            }

        } catch (DataAccessException e) {

        }

        return null;
    }
}
