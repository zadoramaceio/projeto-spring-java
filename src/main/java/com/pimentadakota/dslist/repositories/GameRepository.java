package com.pimentadakota.dslist.repositories;

import com.pimentadakota.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
