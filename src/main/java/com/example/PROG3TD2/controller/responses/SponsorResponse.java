package com.example.PROG3TD2.controller.responses;

import com.example.PROG3TD2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class SponsorResponse {
    private int id;
    private String name;
}
