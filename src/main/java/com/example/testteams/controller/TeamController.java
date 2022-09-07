package com.example.testteams.controller;


import com.example.testteams.model.TeamDTO;
import com.example.testteams.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TeamController {


    @Autowired
    private TeamRepository teamRepository;



    @GetMapping("/teams")
    public List<TeamDTO> getTeams(){
    return teamRepository.getTeams();
    }


    @GetMapping("/teamsScores")
    public List<TeamDTO> getTeamsScore(){
        return teamRepository.getTeamsScore();
    }

    @GetMapping("/teamsPorPais")
    public Map<String, List<TeamDTO>> getTeamsPorPais(){
        return teamRepository.getTeamsPorPais();
    }

    @GetMapping("/teamsPorPaisOrdenados")
    public Map<String,List<TeamDTO>> getTeamsPorPaisOrdenados(){
        return teamRepository.getTeamsPorPaisSorted();
    }






}
