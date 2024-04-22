package com.tomer.cric.scraping;

import com.tomer.cric.entities.LiveMatch;
import com.tomer.cric.services.ScrappingService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Service
public class ScrappingServiceImpl implements ScrappingService {



    @Override
    public List<LiveMatch> getLiveMatches() {
        return liveMatchesToday;
    }

    public List<LiveMatch> liveMatchesToday;

    public ScrappingServiceImpl() {
        liveMatchesToday = scrapeToDaysLiveMatches();
    }


    //Once Every day to fetch today's live Matches
    public List<LiveMatch> scrapeToDaysLiveMatches() {
        var list = new LinkedList<LiveMatch>();
        try {
            String url = "https://www.espncricinfo.com/live-cricket-match-schedule-fixtures";
            Document document = Jsoup.connect(url).get();
            Elements allNodes = document.getElementsByTag("div")
                    .select("div.debug-fixture-date-item")
                    .get(0).children()
                    .select("a.ds-no-tap-higlight");
            for (var e : allNodes) {
                System.out.println(e.html());
                System.out.println(e.attribute("href"));
                System.out.println();
            }
//            for(Element e :allNodes){
//                if (e.html().startsWith("<div class=\"ds-border ds-border-line ds-rounded-xl ds-overflow-hidden\">"))
//                    System.out.println(e.html());
//                try {
//                    System.out.println(e.html());
//                }catch (Exception ie){}
//                System.out.println('\n');
//            }
//            for (Element match : liveScoreElements) {
//                Elements outerDiv = match.select("div.ds-px-4");
//                var link = outerDiv.get(0).getElementsByTag("a").get(0).attr("href").toString();
////                boolean isLive = match.select("div.ds-text-raw-red").get(0).text().equals("Live");//isLive or Innings Break
////                String title = match.select("div.ds-text-tight-xs").text();
//
//
//                Elements matchBatTeamInfo = match.select("div.cb-hmscg-bat-txt");
//                String battingTeam = matchBatTeamInfo.select("div.cb-hmscg-tm-nm").text();
//                String score = matchBatTeamInfo.select("div.cb-hmscg-tm-nm+div").text();
//                Elements bowlTeamInfo = match.select("div.cb-hmscg-bwl-txt");
//                String bowlTeam = bowlTeamInfo.select("div.cb-hmscg-tm-nm").text();
//                String bowlTeamScore = bowlTeamInfo.select("div.cb-hmscg-tm-nm+div").text();
//                String textLive = match.select("div.cb-text-live").text();
//                String textComplete = match.select("div.cb-text-complete").text();
//                //getting match link
//                String matchLink = match.select("a.cb-lv-scrs-well.cb-lv-scrs-well-live").attr("href").toString();
//
//
//                System.out.println(match.html());
////                System.out.println(isLive);
////                System.out.println(title);
//
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
