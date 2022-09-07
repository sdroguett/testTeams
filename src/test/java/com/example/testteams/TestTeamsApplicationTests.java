package com.example.testteams;

import com.example.testteams.model.TeamDTO;
import com.example.testteams.repository.TeamRepository;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TestTeamsApplicationTests {

    @Autowired
    private TeamRepository teamRepository;
    private List<TeamDTO> teamList;

    @Test
    void contextLoads() {
    }



   @BeforeEach
    public void beforeEachTest(){

   }

   @Test
   @DisplayName("Se obtiene lista completa de equipos y se compara con valor total")
    public void getTeams(){
       List<TeamDTO> teams = teamRepository.getTeams();
       System.out.println(teams.size());
       assertTrue(teams.size() == 50);
   }


   @Test
   @DisplayName("Se obtiene equipos ordenados por puntuacion y se compara primera posicion con valor puntaje")
    public void getTeamsSortedScore(){
       List<TeamDTO> teams = teamRepository.getTeamsScore();
       assertTrue(teams.get(0).getPuntuacion()== 1699);
   }

   @Test
   @DisplayName("Se obtiene equipos agrupados por paises y se compara con total dado")
    public void getTeamsPorPais(){
       Map<String, List<TeamDTO>> teams = teamRepository.getTeamsPorPais();
       int expected = teams.size();
       assertEquals(expected, 16);
   }

   @Test
   @DisplayName("Se obtiene equipos agrupados por pais y ordenados alfabeticamente y se compara contra metodo de agrupacion por pais")
    public void getTeamsPorPaisSorted(){
       Map<String, List<TeamDTO>> teams = teamRepository.getTeamsPorPaisSorted();
       Map<String, List<TeamDTO>> listTeams = teamRepository.getTeamsPorPais();
       assertEquals(listTeams.size(),teams.size());

   }



}
