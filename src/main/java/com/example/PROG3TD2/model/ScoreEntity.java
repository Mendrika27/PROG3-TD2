package com.example.PROG3TD2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "score")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "match_id")
    private MatchEntity match;
    private int times;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;
    private boolean isOS;
}
