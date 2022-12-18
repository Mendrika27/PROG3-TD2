package com.example.PROG3TD2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "team")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany
    @JoinColumn(name = "player_id")
    @JsonIgnore
    private List<PlayerEntity> player;
    @ManyToMany
    @JoinColumn(name = "sponsor_id")
    private SponsorEntity sponsor;
    @OneToOne
    @JoinColumn(name = "opponent_id")
    @Column(name = "opponent")
    private TeamEntity opponent;
}
