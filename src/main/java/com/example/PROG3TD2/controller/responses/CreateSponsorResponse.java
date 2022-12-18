package com.example.PROG3TD2.controller.responses;

import com.example.PROG3TD2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class CreateSponsorResponse {
    private String name;
    private List<TeamEntity> team;
}
