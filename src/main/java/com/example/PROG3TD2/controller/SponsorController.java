package com.example.PROG3TD2.controller;

import com.example.PROG3TD2.controller.mapper.SponsorRestMapper;
import com.example.PROG3TD2.controller.responses.CreateSponsorResponse;
import com.example.PROG3TD2.controller.responses.SponsorResponse;
import com.example.PROG3TD2.controller.responses.UpdateSponsorResponse;
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

    @PostMapping("/sponsors")
    public List<SponsorResponse> createSponsors(@RequestBody List<CreateSponsorResponse> toCreate){
        List<SponsorEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createSponsor(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/sponsors")
    public List<SponsorResponse> UpdateSponsors(@RequestBody List<UpdateSponsorResponse> toUpdate){
        List<SponsorEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createSponsor(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/sponsor/{sponsorId}")
    public SponsorResponse deleteSponsor(@PathVariable int sponsorId){
        return mapper.toRest(service.deleteSponsor(sponsorId));
    }
}
