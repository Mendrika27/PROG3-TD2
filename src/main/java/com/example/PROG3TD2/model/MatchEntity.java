package com.example.PROG3TD2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "matches")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateTime;
    private String stadium;
    @ManyToOne
    @JoinColumn(name = "teams_id1")
    private TeamEntity team_a;
    @ManyToOne
    @JoinColumn(name = "teams_id2")
    private TeamEntity team_b;

}
