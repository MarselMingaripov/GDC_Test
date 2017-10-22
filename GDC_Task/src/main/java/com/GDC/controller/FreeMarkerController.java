package com.GDC.controller;

import com.GDC.city.Kazan;
import com.GDC.city.Moskow;
import com.GDC.city.Spb;
import com.GDC.service.KazanService;
import com.GDC.service.MoskowService;
import com.GDC.service.SpbService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class FreeMarkerController {

    private static final Logger log = Logger.getLogger(FreeMarkerController.class);

    @Autowired
    private KazanService kazanService;

    @Autowired
    private MoskowService moskowService;

    @Autowired
    private SpbService spbService;

    @GetMapping(value = "/welcome")
    public String weather(@ModelAttribute("model") ModelMap model) {
        String welcome = "Добро пожаловать!";
        model.addAttribute("welcomes", welcome);
        log.info("Вход на начальную страничку");
        return "welcome";
    }


    @GetMapping(value = "/")
    public String redirectWelcome() {
        return "redirect:/welcome";
    }

    @GetMapping(value = "/value")
    public String returnAdres(String adres){

        return null;
    }


    @GetMapping(value = "/welcomekazan")
    public String getKazan(@ModelAttribute("model")ModelMap model) throws Exception {
        Kazan kazan = kazanService.createKazan();
        String day = kazan.getDay();
        String temp = kazan.getTemperature();
        String last = "Температура в Казани на " + day + "    " + temp;
        model.addAttribute("lasts", last);
        log.info("Вход на страничку Казани");
        return "kazan";
    }

    @GetMapping(value = "/welcomemoskow")
    public String getMoskow(@ModelAttribute("model")ModelMap model) throws Exception {
        Moskow moskow = moskowService.createMoskow();
        String day = moskow.getDay();
        String temp = moskow.getTemperature();
        String last = "Температура в Москве на " + day + "    " + temp;
        model.addAttribute("lasts", last);
        log.info("Вход на страничку Москвы");
        return "moskow";
    }

    @GetMapping(value = "/welcomespb")
    public String getSpb(@ModelAttribute("model")ModelMap model) throws Exception {
        Spb spb = spbService.createSpb();
        String day = spb.getDay();
        String temp = spb.getTemperature();
        String last = "Температура в Санкт-Петербурге на " + day + "    " + temp;
        model.addAttribute("lasts", last);
        log.info("Вход на страничку Питера");
        return "spb";
    }

}


