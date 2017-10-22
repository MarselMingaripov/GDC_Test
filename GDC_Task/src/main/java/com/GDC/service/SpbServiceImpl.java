package com.GDC.service;

import com.GDC.city.Spb;
import com.GDC.dao.SpbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpbServiceImpl implements SpbService {

    @Autowired
    SpbDao spbDao;

    @Override
    public Spb createSpb() throws Exception {
        Spb spb = new Spb();
        spb.setDay(spbDao.getDateString());
        spb.setTemperature(spbDao.getWeatherString());
        return spb;
    }

    @Override
    public String getSpb() throws Exception {
        Spb spb = createSpb();
        return spb.toString();
    }
}
