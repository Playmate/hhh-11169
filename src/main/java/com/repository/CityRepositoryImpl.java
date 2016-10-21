package com.repository;

import com.entity.City;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Igor Dmitriev on 10/21/16
 */
@Repository
@Transactional(readOnly = true)
public class CityRepositoryImpl implements CityRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public City findOne(Long id) {
        return entityManager.find(City.class, id);
    }

    @Override
    public List<City> findAll() {
        return entityManager.createQuery("select c from City c", City.class).getResultList();
    }
}
