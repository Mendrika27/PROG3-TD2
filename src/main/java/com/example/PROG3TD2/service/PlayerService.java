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

    public List<PlayerEntity> createPlayer(List<PlayerEntity> toCreate){
        return repository.saveAll(toCreate);
    }

    public List<PlayerEntity> updatePlayer(List<PlayerEntity> toUpdate){
        return repository.saveAll(toUpdate);
    }

    public PlayerEntity deletePlayer(int playerId){
        Optional<PlayerEntity> optional = repository.findById(String.valueOf(playerId));
        if (optional.isPresent()){
            repository.delete(optional.get());
            return optional.get();
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Team "+playerId+" not found");
        }
    }
}
