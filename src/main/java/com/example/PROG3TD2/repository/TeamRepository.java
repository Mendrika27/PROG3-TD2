package com.example.PROG3TD2.repository;

import com.example.PROG3TD2.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, String> {
}
