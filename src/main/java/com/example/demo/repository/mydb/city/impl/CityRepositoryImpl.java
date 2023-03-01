package com.example.demo.repository.mydb.city.impl;


import com.example.demo.entities.mydb.City;
import com.example.demo.jpa.repository.mydb.CityJPARepository;
import com.example.demo.repository.mydb.city.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class CityRepositoryImpl implements CityRepository {

    @Autowired
    private CityJPARepository cityJPARepository;
    @Override
    @Transactional("mydbTransactionManager")
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
