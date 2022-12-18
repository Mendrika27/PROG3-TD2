package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.PlayAgainstRestMapper;
import com.example.PROG3TD2.controller.responses.CreatePlayAgainstResponse;
import com.example.PROG3TD2.controller.responses.PlayAgainstResponse;
import com.example.PROG3TD2.controller.responses.UpdatePlayAgainstResponse;
import com.example.PROG3TD2.model.PlayAgainstEntity;
import com.example.PROG3TD2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService service;
    private final PlayAgainstRestMapper mapper;

    @GetMapping("/matches")
    public List<PlayAgainstResponse> getMatches(){
        return service.getMatches().stream().map(mapper::toRest).toList();
    }

    @PostMapping("/matches")
    public List<PlayAgainstResponse> createMatches(@RequestBody List<CreatePlayAgainstResponse> toCreate){
        List<PlayAgainstEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createMatches(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/matches")
    public List<PlayAgainstResponse> updateMatches(@RequestBody List<UpdatePlayAgainstResponse> toUpdate){
        List<PlayAgainstEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updateMatches(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/match/{matchId}")
    public PlayAgainstResponse deleteMatch(@PathVariable int matchId){
        return mapper.toRest(service.deleteMatch(matchId));
    }
}
