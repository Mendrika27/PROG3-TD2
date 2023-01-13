package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.MatchResponse;
import com.example.PROG3TD2.model.MatchEntity;
import com.example.PROG3TD2.service.MatchService;
import com.example.PROG3TD2.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private TeamRestMapper mapper;
    private ScoreService service;
    private ScoreRestMapper scoreRestMapper;

    private MatchService matchService;
    public MatchResponse toRest(MatchEntity domain){
        return MatchResponse.builder()
                .id(domain.getId())
                .dateTime(domain.getDateTime())
                .team_a(mapper.toRest(domain.getTeam_a()))
                .team_b(mapper.toRest(domain.getTeam_b()))
                .scores(service.getByMatch(domain).stream()
                        .map(scoreRestMapper::toRest)
                        .toList())
                .scoreTeamA(matchService.scoreTeamA(domain))
                .scoreTeamB(matchService.scoreTeamB(domain))
                .build();
    }

}
