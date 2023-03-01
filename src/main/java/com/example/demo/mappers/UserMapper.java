package com.example.demo.mappers;

import com.example.demo.entities.mydb.City;
import com.example.demo.entities.mydb.Country;
import com.example.demo.entities.mydb.State;
import com.example.demo.entities.mydb.User;

import com.example.demo.repository.mydb.city.CityRepository;
import com.example.demo.repository.mydb.country.CountryRepository;
import com.example.demo.repository.mydb.state.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserMapper {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CountryRepository countryRepository;

    public User mapUserModeltoEntity(com.example.demo.models.User input){

        User user = new User();

        user.setFirstName(input.getFirstName());
        user.setLastName(input.getLastName());
        user.setMiddleName(input.getMiddleName());
        user.setEmail(input.getEmail());
        user.setPassword(input.getPassword());
        user.setAddress1(input.getAddress1());
        user.setAddress2(input.getAddress2());

        if(null != input.getCity()){
            City city = cityRepository.findCityById(input.getCity().intValue());
            user.setCity(city);
        }

        if(null != input.getState()){
            State state = stateRepository.findStateById(input.getState().intValue());
            user.setState(state);
        }

        if(null != input.getCountry()){
            Country country = countryRepository.findCountryById(input.getCountry().intValue());
            user.setCountry(country);
        }

        user.setMobileNumber(input.getMobileNo());
        user.setCreatedOn(new Date());

        return user;
    }
}
