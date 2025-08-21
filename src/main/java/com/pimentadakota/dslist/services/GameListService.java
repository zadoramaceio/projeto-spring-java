package com.pimentadakota.dslist.services;

import com.pimentadakota.dslist.dto.GameDTO;
import com.pimentadakota.dslist.dto.GameListDTO;
import com.pimentadakota.dslist.dto.GameMinDTO;
import com.pimentadakota.dslist.entities.Game;
import com.pimentadakota.dslist.entities.GameList;
import com.pimentadakota.dslist.repositories.GameListRepository;
import com.pimentadakota.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var result = gameListRepository.findAll();
        return  result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
