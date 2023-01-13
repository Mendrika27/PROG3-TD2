package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.MatchEntity;
import com.example.PROG3TD2.model.ScoreEntity;
import com.example.PROG3TD2.repository.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScoreService {
    private ScoreRepository repository;

    public List<ScoreEntity>  getScore (){
        return repository.findAll();

    }

    public List<ScoreEntity> getByMatch(MatchEntity match){
        return repository.findByMatch(match);
    }
}
