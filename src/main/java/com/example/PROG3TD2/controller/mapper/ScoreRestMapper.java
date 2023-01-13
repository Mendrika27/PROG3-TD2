package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.ScoreResponse;
import com.example.PROG3TD2.model.ScoreEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ScoreRestMapper {
    private final PlayerRestMapper mapper;

    public ScoreResponse toRest(ScoreEntity domain){
        return ScoreResponse.builder()
                .id(domain.getId())
                .matchId(domain.getMatch().getId())
                .times(domain.getTimes())
                .player(mapper.toRest(domain.getPlayer()))
                .isOs(domain.isOS())
                .build();
    }
}
