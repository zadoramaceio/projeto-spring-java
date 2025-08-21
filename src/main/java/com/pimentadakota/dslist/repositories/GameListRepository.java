package com.pimentadakota.dslist.repositories;

import com.pimentadakota.dslist.entities.Game;
import com.pimentadakota.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
