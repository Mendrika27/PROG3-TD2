package com.example.PROG3TD2.controller.responses;

import com.example.PROG3TD2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class UpdateMatchResponse {
    private int id;
    private Date dateTime;
    private TeamResponse team_a;
    private TeamResponse team_b;

}
