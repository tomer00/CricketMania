package com.tomer.cric.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cricket_matches")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StoredMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchId;

    private String homeTeam, awayTeam;
    private String title;
    private String homeTeamScore, awayTeamScore;
    private String link;
    private String outcome;


}
