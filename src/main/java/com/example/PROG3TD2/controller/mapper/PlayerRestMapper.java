package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.CreatePlayerResponse;
import com.example.PROG3TD2.controller.responses.PlayerResponse;
import com.example.PROG3TD2.controller.responses.UpdatePlayerResponse;
import com.example.PROG3TD2.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain){
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .team(domain.getTeamEntity())
                .build();
    }

    public PlayerEntity toDomain(CreatePlayerResponse rest){
        return PlayerEntity.builder()
                .name(rest.getName())
                .teamEntity(rest.getTeam())
                .build();
    }

    public PlayerEntity toDomain (UpdatePlayerResponse rest){
        return  PlayerEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .teamEntity(rest.getTeam())
                .build();
    }
}
