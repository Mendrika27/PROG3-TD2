package com.example.PROG3TD2.repository;

import com.example.PROG3TD2.model.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity, String> {
}
