package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.PlayerEntity;
import com.example.PROG3TD2.model.TeamEntity;
import com.example.PROG3TD2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository repository;

    public List<TeamEntity> getTeams(){
        return repository.findAll();
    }

    public List<TeamEntity> createTeams(List<TeamEntity> toCreate){
        return repository.saveAll(toCreate);
    }

    public List<TeamEntity> updateTeams(List<TeamEntity> toUpdate){
        return repository.saveAll(toUpdate);
    }

    public TeamEntity deleteTeams( int teamId){
        Optional<TeamEntity> optional = repository.findById(String.valueOf(teamId));
        if (optional.isPresent()){
            repository.delete(optional.get());
            return optional.get();
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Team "+teamId+" not found");
        }

    }
}
