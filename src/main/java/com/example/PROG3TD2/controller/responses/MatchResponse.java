package com.example.PROG3TD2.controller.responses;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class MatchResponse {
    private int  id;
    private Date dateTime;
    private TeamResponse team_a;
    private TeamResponse team_b;
}
