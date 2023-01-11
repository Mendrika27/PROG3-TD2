package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.CreateTeamResponse;
import com.example.PROG3TD2.controller.responses.TeamResponse;
import com.example.PROG3TD2.controller.responses.UpdateTeamResponse;
import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.model.TeamEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain){
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .players(domain.getPlayers())
                .sponsor(domain.getSponsor())
                .build();
    }

    public TeamEntity todomain(CreateTeamResponse rest){
        return TeamEntity.builder()
                .name(rest.getName())
                .players(rest.getPlayer())
                .sponsor(rest.getSponsor())
                .build();
    }


    public TeamEntity todomain(UpdateTeamResponse rest){
        return TeamEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .players(rest.getPlayers())
                .sponsor((List<SponsorEntity>) rest.getSponsor())
                .build();
    }
}
