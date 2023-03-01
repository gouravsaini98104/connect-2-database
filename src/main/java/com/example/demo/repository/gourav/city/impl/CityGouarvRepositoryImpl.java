package com.example.demo.repository.gourav.city.impl;


import com.example.demo.entities.gourav.City;

import com.example.demo.jpa.repository.gourav.CityGouravJPARepository;
import com.example.demo.repository.gourav.city.CityGouravRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class CityGouarvRepositoryImpl implements CityGouravRepository {

    @Autowired
    private CityGouravJPARepository cityJPARepository;
    @Override
    @Transactional("gouravTransactionManager")
    public City findCityById(Integer id) {

        try{
            Optional<City> city = cityJPARepository.findById(id);
            if(city.isPresent()){
                return city.get();
            }

        } catch (DataAccessException e){

        }
        return null;
    }
}
