package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    public List<SponsorEntity> getSponsor(){
        return repository.findAll();
    }


}
