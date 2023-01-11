package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.CreateMatchResponse;
import com.example.PROG3TD2.controller.responses.MatchResponse;
import com.example.PROG3TD2.controller.responses.UpdateMatchResponse;
import com.example.PROG3TD2.model.MatchEntity;
import com.example.PROG3TD2.model.TeamEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatchRestMapper {
    private TeamRestMapper mapper;
    public MatchResponse toRest(MatchEntity domain){
        return MatchResponse.builder()
                .id(domain.getId())
                .dateTime(domain.getDateTime())
                .team_a(mapper.toRest(domain.getTeam_a()))
                .team_b(mapper.toRest(domain.getTeam_b()))
                .build();
    }

}
