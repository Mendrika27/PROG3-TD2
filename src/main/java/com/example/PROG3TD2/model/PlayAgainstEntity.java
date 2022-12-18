package com.example.PROG3TD2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayAgainstEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateTime;
    private String stadium;
    @OneToOne
    @JoinColumn(name = "first_team_id")
    private TeamEntity firstTeam;
    @OneToOne
    @JoinColumn(name = "second_team_id", referencedColumnName = "opponent")
    private TeamEntity secondTeam;
}
