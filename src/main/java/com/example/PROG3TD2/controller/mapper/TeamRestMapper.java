package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.CreateTeamResponse;
import com.example.PROG3TD2.controller.responses.TeamResponse;
import com.example.PROG3TD2.controller.responses.UpdateTeamResponse;
import com.example.PROG3TD2.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain){
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .player(domain.getPlayer())
                .sponsor(domain.getSponsor())
                .opponent(domain.getOpponent())
                .build();
    }

    public TeamEntity todomain(CreateTeamResponse rest){
        return TeamEntity.builder()
                .name(rest.getName())
                .player(rest.getPlayer())
                .sponsor(rest.getSponsor())
                .opponent(rest.getOpponent())
                .build();
    }


    public TeamEntity todomain(UpdateTeamResponse rest){
        return TeamEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .player(rest.getPlayers())
                .sponsor(rest.getSponsor())
                .opponent(rest.getOpponent())
                .build();
    }
}
