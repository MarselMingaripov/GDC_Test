package com.GDC.service;

import com.GDC.city.Kazan;
import com.GDC.dao.KazanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KazanServiceImpl implements KazanService {

    @Autowired
    private KazanDao kazanDao;

    public Kazan createKazan() throws Exception {
        Kazan kazan = new Kazan();
        kazan.setDay(kazanDao.getDateString());
        kazan.setTemperature(kazanDao.getWeatherString());
        return kazan;
    }

    @Override
    public String getKazan() throws Exception {
        Kazan kazan = createKazan();
        return kazan.toString();
    }

}
