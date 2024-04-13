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


}
