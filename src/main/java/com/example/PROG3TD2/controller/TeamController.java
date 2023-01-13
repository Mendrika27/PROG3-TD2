package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.TeamRestMapper;
import com.example.PROG3TD2.controller.responses.TeamResponse;
import com.example.PROG3TD2.model.TeamEntity;
import com.example.PROG3TD2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeams(){
        return service.getTeams().stream()
                .map(mapper::toRest)
                .toList();
    }


}
