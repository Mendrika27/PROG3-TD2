package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.SponsorRestMapper;
import com.example.PROG3TD2.controller.responses.SponsorResponse;
import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService service;
    private final SponsorRestMapper mapper;

    @GetMapping("/sponsors")
    public List<SponsorResponse> getSponsors(){
        return service.getSponsor().stream()
                .map(mapper::toRest)
                .toList();
    }


}
