package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.PlayAgainstEntity;
import com.example.PROG3TD2.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private final PlayAgainstRepository repository;

    public List<PlayAgainstEntity> getMatches(){
        return repository.findAll();
    }
    public List<PlayAgainstEntity> createMatches(List<PlayAgainstEntity> toCreate){
        return repository.saveAll(toCreate);
    }

    public List<PlayAgainstEntity> updateMatches(List<PlayAgainstEntity> toUpdate){
        return repository.saveAll(toUpdate);
    }

    public PlayAgainstEntity deleteMatch(int matchId){
        Optional<PlayAgainstEntity> optional = repository.findById(String.valueOf(matchId));
        if(optional.isPresent()){
            repository.delete(optional.get());
            return optional.get();
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Match "+matchId+" not found");
        }
    }
}
