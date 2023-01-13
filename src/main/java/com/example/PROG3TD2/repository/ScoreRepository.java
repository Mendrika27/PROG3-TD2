package com.example.PROG3TD2.repository;

import com.example.PROG3TD2.model.MatchEntity;
import com.example.PROG3TD2.model.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<ScoreEntity, String>  {
    List<ScoreEntity> findByMatch (MatchEntity match);
}
