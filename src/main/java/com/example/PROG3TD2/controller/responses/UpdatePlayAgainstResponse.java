package com.example.PROG3TD2.controller.responses;

import com.example.PROG3TD2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class UpdatePlayAgainstResponse {
    private int id;
    private Date dateTime;
    private TeamEntity firstTeam;
    private TeamEntity secondTeam;

}
