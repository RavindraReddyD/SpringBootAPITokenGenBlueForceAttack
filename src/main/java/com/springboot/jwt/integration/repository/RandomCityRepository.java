package com.springboot.jwt.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jwt.integration.domain.RandomCity;

/**
 * Created by nydiarra on 10/05/17.
 */
@Repository
public interface RandomCityRepository extends JpaRepository<RandomCity, Long> {
}
