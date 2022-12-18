package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.CreatePlayAgainstResponse;
import com.example.PROG3TD2.controller.responses.PlayAgainstResponse;
import com.example.PROG3TD2.controller.responses.UpdatePlayAgainstResponse;
import com.example.PROG3TD2.model.PlayAgainstEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayAgainstRestMapper {
    public PlayAgainstResponse toRest(PlayAgainstEntity domain){
        return PlayAgainstResponse.builder()
                .id(domain.getId())
                .dateTime(domain.getDateTime())
                .firstTeam(domain.getFirstTeam())
                .secondTeam(domain.getSecondTeam())
                .build();
    }

    public PlayAgainstEntity toDomain(CreatePlayAgainstResponse rest){
        return PlayAgainstEntity.builder()
                .dateTime(rest.getDateTime())
                .firstTeam(rest.getFirstTeam())
                .secondTeam(rest.getSecondTeam())
                .build();
    }

    public PlayAgainstEntity toDomain(UpdatePlayAgainstResponse rest){
        return PlayAgainstEntity.builder()
                .id(rest.getId())
                .dateTime(rest.getDateTime())
                .firstTeam(rest.getFirstTeam())
                .secondTeam(rest.getSecondTeam())
                .build();
    }
}
