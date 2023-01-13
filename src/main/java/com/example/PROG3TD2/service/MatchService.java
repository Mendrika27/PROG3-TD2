package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.MatchEntity;
import com.example.PROG3TD2.model.ScoreEntity;
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

    private final ScoreService service;
    public List<MatchEntity> getMatches(){
        return repository.findAll();
    }

    public int scoreTeamA (MatchEntity match){
        List<ScoreEntity> scores = service.getByMatch(match);
        int scoreTeamA = 0;
        for (ScoreEntity score : scores){
            if (score.getPlayer().getTeam() == match.getTeam_a() && score.isOS()){
                scoreTeamA++;
            } else if (score.getPlayer().getTeam() == match.getTeam_b() && !score.isOS() ) {
                scoreTeamA++;
            }
        }
         return scoreTeamA;

    }

    public  int scoreTeamB (MatchEntity match){
        List<ScoreEntity> scores = service.getByMatch(match);
        int scoreTeamB = 0;
        for (ScoreEntity score : scores){
            if (score.getPlayer().getTeam() == match.getTeam_a() && !score.isOS()){
                scoreTeamB++;
            } else if (score.getPlayer().getTeam() == match.getTeam_b() && score.isOS() ) {
                scoreTeamB++;
            }
        }
        return scoreTeamB;
    }
}
