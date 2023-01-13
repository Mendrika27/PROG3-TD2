package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.MatchRestMapper;
import com.example.PROG3TD2.controller.responses.MatchResponse;
import com.example.PROG3TD2.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService service;
    private final MatchRestMapper mapper;

    @GetMapping("/matches")
    public List<MatchResponse> getMatches() {
        return service.getMatches().stream().map(mapper::toRest).toList();
    }

}
