package com.GDC.parser;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class KazanParser {

    private static final Logger log = Logger.getLogger(KazanParser.class);

    public Document getPage() throws IOException {
        String url = "http://meteo.infospace.ru/win/cities/html/city_r.sht?num=1247&id=150847125";
        Document page = Jsoup.parse(new URL(url), 3000);
        log.info("Казань спарсилась!");
        return page;
    }
}
