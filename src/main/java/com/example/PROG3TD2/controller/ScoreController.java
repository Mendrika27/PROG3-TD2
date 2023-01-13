package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.ScoreRestMapper;
import com.example.PROG3TD2.controller.responses.PlayerResponse;
import com.example.PROG3TD2.controller.responses.ScoreResponse;
import com.example.PROG3TD2.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ScoreController {
    private ScoreService service;
    private ScoreRestMapper mapper;
    @GetMapping("/scores")
    public List<ScoreResponse> getScores(){
        return service.getScore().stream()
                .map(mapper::toRest)
                .toList();
    }

}
