package com;

import com.entity.City;
import com.repository.CityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void success() {
        cityRepository.findOne(1L);
    }

    @Test
    public void failed() {
        cityRepository.findAll();
    }

}
