package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.PlayerRestMapper;
import com.example.PROG3TD2.controller.responses.PlayerResponse;
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


}
