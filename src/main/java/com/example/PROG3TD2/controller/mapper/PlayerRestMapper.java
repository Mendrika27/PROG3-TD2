package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.PlayerResponse;
import com.example.PROG3TD2.model.PlayerEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain){
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .team(domain.getTeam())
                .post(domain.getPoste())
                .build();
    }


}
