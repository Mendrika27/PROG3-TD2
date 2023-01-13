package com.example.PROG3TD2.controller.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ScoreResponse {
    private int id;
    private int matchId;
    private int times;
    private PlayerResponse player;
    private boolean isOs;
}
