package com.example.demo.repository.gourav.country.impl;


import com.example.demo.entities.gourav.Country;
import com.example.demo.jpa.repository.gourav.CountryGouravJPARepository;
import com.example.demo.repository.gourav.country.CountryGouravRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class CountryGouravRepositoryImpl implements CountryGouravRepository {

    @Autowired
    private CountryGouravJPARepository countryJPARepository;

    @Override
    @Transactional("gouravTransactionManager")
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
