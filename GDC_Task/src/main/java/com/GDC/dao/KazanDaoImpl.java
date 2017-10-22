package com.GDC.dao;

import com.GDC.city.Kazan;
import com.GDC.parser.KazanParser;
import com.GDC.patcher.PatternDateKazan;
import com.GDC.patcher.PatternWeatherKazan;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class KazanDaoImpl implements KazanDao {

    KazanParser kazanParser = new KazanParser();
    PatternDateKazan patternDateKazan = new PatternDateKazan();
    PatternWeatherKazan patternWeatherKazan = new PatternWeatherKazan();

    public String getDateString() throws Exception {
        Document page = kazanParser.getPage();
        Element table = page.select("table").first();
        Elements strings1 = page.select("tr");
        Elements strings2 = strings1.select("td");
        Elements strings3 = strings2.select("table");
        Elements strings4 = strings3.select("tr");
        Elements strings5 = strings4.select("td");
        String dateString = strings5.select("td").text();
        String lastDate = patternDateKazan.getDate(dateString);
        return lastDate;
    }

    public String getWeatherString() throws Exception {
        Document page = kazanParser.getPage();
        Element table = page.select("table").first();
        Elements strings1 = page.select("tr");
        Elements strings2 = strings1.select("td");
        Elements strings3 = strings2.select("table");
        Elements strings4 = strings3.select("tr");
        Elements strings5 = strings4.select("td");
        String dateString = strings5.select("td").text();
        String lastWeather = patternWeatherKazan.getWeather(dateString);
        return lastWeather;
    }
}
