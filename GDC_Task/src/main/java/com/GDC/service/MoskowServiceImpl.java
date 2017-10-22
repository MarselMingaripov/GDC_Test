package com.GDC.service;

import com.GDC.city.Moskow;
import com.GDC.dao.MoskowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MoskowServiceImpl implements MoskowService {

    @Autowired
    private MoskowDao moskowDao;

    @Override
    public Moskow createMoskow() throws Exception {
        Moskow moskow = new Moskow();
        moskow.setDay(moskowDao.getDateString());
        moskow.setTemperature(moskowDao.getWeatherString());
        return moskow;
    }

    @Override
    public String getMoskow() throws Exception {
        Moskow moskow = createMoskow();
        return moskow.toString();
    }
}
