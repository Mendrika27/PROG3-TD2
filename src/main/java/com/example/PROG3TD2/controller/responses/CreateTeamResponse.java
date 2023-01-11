package com.example.PROG3TD2.controller.responses;

import com.example.PROG3TD2.model.PlayerEntity;
import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class CreateTeamResponse {
    private String name;
    private List<PlayerEntity> player;
    private List<SponsorEntity> sponsor;

}
