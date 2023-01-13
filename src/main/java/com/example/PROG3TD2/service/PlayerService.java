package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.PlayerEntity;
import com.example.PROG3TD2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository repository;

    public List<PlayerEntity> getPlayers(){
        return repository.findAll();
    }


}
