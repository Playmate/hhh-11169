package com.repository;

import com.entity.City;

import java.util.List;

/**
 * Created by Igor Dmitriev on 10/21/16
 */
public interface CityRepository {
    City findOne(Long id);

    List<City> findAll();
}
