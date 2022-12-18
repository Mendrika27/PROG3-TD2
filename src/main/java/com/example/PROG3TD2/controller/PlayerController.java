package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.PlayerRestMapper;
import com.example.PROG3TD2.controller.responses.CreatePlayerResponse;
import com.example.PROG3TD2.controller.responses.PlayerResponse;
import com.example.PROG3TD2.controller.responses.UpdatePlayerResponse;
import com.example.PROG3TD2.model.PlayerEntity;
import com.example.PROG3TD2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers(){
        return service.getPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/players")
    public List<PlayerResponse> createPlayers(@RequestBody List<CreatePlayerResponse> toCreate){
        List<PlayerEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createPlayer(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/players")
    public List<PlayerResponse> updatePlayers(@RequestBody List<UpdatePlayerResponse> toUpdate){
        List<PlayerEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updatePlayer(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/player/{playerId}")
    public PlayerResponse deletePlayer(@PathVariable int playerId){
        return mapper.toRest(service.deletePlayer(playerId));
    }
}
