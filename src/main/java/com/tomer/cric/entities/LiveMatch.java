package com.tomer.cric.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class LiveMatch {

    private String id;
    private String homeTeam, awayTeam;
    private String currentStatus;
    private boolean isStrategicTimeOut = false,isLive=true;
    private String title;
    private String homeTeamScore, awayTeamScore;
    private String link;

}
