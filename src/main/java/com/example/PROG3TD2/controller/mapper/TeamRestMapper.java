package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.TeamResponse;
import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain){
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .sponsor(domain.getSponsor())
                .build();
    }


}
