package com.tomer.cric;

import com.tomer.cric.scraping.ScrappingServiceImpl;

public class Test {
    public static void main(String[] args) {
        var s = new ScrappingServiceImpl();
        s.scrapeToDaysLiveMatches();
    }
}
