package com.springboot.jwt.integration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jwt.integration.domain.RandomCity;
import com.springboot.jwt.integration.domain.User;
import com.springboot.jwt.integration.repository.RandomCityRepository;
import com.springboot.jwt.integration.repository.UserRepository;
import com.springboot.jwt.integration.service.GenericService;

/**
 * Created by nydiarra on 07/05/17.
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>) randomCityRepository.findAll();
    }
}
