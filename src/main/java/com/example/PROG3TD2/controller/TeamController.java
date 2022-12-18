package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.TeamRestMapper;
import com.example.PROG3TD2.controller.responses.CreateTeamResponse;
import com.example.PROG3TD2.controller.responses.TeamResponse;
import com.example.PROG3TD2.controller.responses.UpdateTeamResponse;
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

    @PostMapping("/teams")
    public List<TeamResponse> createTeams(@RequestBody List<CreateTeamResponse> toCreate ){
        List<TeamEntity> domain = toCreate.stream()
                .map(mapper::todomain).toList();
        return service.createTeams(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/teams")
    public List<TeamResponse> updateTeams(@RequestBody List<UpdateTeamResponse> toUpdate){
        List<TeamEntity> domain = toUpdate.stream()
                .map(mapper::todomain)
                .toList();
        return service.updateTeams(domain).stream()
                .map(mapper::toRest).toList();
    }

    @DeleteMapping("/team/{teamId}")
    public TeamResponse deleteTeam(@PathVariable int teamId){
        return mapper.toRest(service.deleteTeams(teamId));
    }
}
