package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.MatchEntity;
import com.example.PROG3TD2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MatchService {
    private final MatchRepository repository;

    public List<MatchEntity> getMatches(){
        return repository.findAll();
    }
    public List<MatchEntity> createMatches(List<MatchEntity> toCreate){
        return repository.saveAll(toCreate);
    }

    public List<MatchEntity> updateMatches(List<MatchEntity> toUpdate){
        return repository.saveAll(toUpdate);
    }

    public MatchEntity deleteMatch(int matchId){
        Optional<MatchEntity> optional = repository.findById(String.valueOf(matchId));
        if(optional.isPresent()){
            repository.delete(optional.get());
            return optional.get();
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Match "+matchId+" not found");
        }
    }
}
