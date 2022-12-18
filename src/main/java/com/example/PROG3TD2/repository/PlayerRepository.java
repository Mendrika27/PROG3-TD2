package com.example.PROG3TD2.repository;

import com.example.PROG3TD2.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, String> {
}
