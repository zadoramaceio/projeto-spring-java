package com.pimentadakota.dslist.services;

import com.pimentadakota.dslist.dto.GameDTO;
import com.pimentadakota.dslist.dto.GameListDTO;
import com.pimentadakota.dslist.dto.GameMinDTO;
import com.pimentadakota.dslist.entities.Game;
import com.pimentadakota.dslist.entities.GameList;
import com.pimentadakota.dslist.projections.GameMinProjection;
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
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var result = gameListRepository.findAll();
        return  result.stream().map(x -> new GameListDTO(x)).toList();
    }
    @Transactional
    public void move(Long listId, int sourceIndex, int destinatiomIndex){
        List<GameMinProjection> originalList = gameRepository.searchByList(listId);
        GameMinProjection listaNova = originalList.remove(sourceIndex);
        originalList.add(destinatiomIndex, listaNova);
        int min = sourceIndex < destinatiomIndex ? sourceIndex : destinatiomIndex;
        int max = sourceIndex < destinatiomIndex ? destinatiomIndex : sourceIndex;
        for(int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, originalList.get(i).getId(), i );
        }


    }

}
