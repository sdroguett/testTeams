package com.example.testteams.repository;

import com.example.testteams.model.TeamDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class TeamRepository {

    private List<TeamDTO> teamsList = new ArrayList<>();

    private List<TeamDTO> createteamsList() {
        teamsList.add(new TeamDTO("Bayern Munich", "Alemania", 1971));
        teamsList.add(new TeamDTO("Inter Milan", "Italia", 1897));
        teamsList.add(new TeamDTO("AC Milan", "Italia", 1906));
        teamsList.add(new TeamDTO("Barcelona", "España", 1869));
        teamsList.add(new TeamDTO("Napoli", "Italia", 1869));
        teamsList.add(new TeamDTO("PSG", "Francia", 1868));
        teamsList.add(new TeamDTO("Villarreal", "España", 1862));
        teamsList.add(new TeamDTO("Tottenham Hotspur", "Inglaterra", 1861));
        teamsList.add(new TeamDTO("Manchester City", "Inglaterra", 2020));
        teamsList.add(new TeamDTO("Atlético Madrid", "España", 1837));
        teamsList.add(new TeamDTO("Real Madrid", "España", 2031));
        teamsList.add(new TeamDTO("Ajax", "Holanda", 1908));
        teamsList.add(new TeamDTO("Chelsea FC", "Inglaterra", 1847));
        teamsList.add(new TeamDTO("Benfica", "Portugal", 1829));
        teamsList.add(new TeamDTO("Arsenal", "Inglaterra", 1840));
        teamsList.add(new TeamDTO("Palmeiras", "Brasil", 1840));
        teamsList.add(new TeamDTO("Flamengo", "Brasil", 1844));
        teamsList.add(new TeamDTO("FC Porto", "Portugal", 1830));
        teamsList.add(new TeamDTO("Liverpool FC", "Inglaterra", 1994));
        teamsList.add(new TeamDTO("Real Betis", "España", 1783));
        teamsList.add(new TeamDTO("Borussia Dortmund", "Alemania", 1805));
        teamsList.add(new TeamDTO("Sporting", "Portugal", 1760));
        teamsList.add(new TeamDTO("PSV Eindhoven", "Holanda", 1759));
        teamsList.add(new TeamDTO("Roma", "Italia", 1779));
        teamsList.add(new TeamDTO("RB Leipzig", "Alemania", 1775));
        teamsList.add(new TeamDTO("Union Berlin", "Alemania", 1777));
        teamsList.add(new TeamDTO("Red Bull Salzburg", "Austria", 1755));
        teamsList.add(new TeamDTO("Lazio", "Italia", 1789));
        teamsList.add(new TeamDTO("Atalanta", "Italia", 1760));
        teamsList.add(new TeamDTO("Flora Tallinn", "Estonia", 1726));
        teamsList.add(new TeamDTO("Rangers", "Escocia", 1759));
        teamsList.add(new TeamDTO("Real Sociedad", "España", 1723));
        teamsList.add(new TeamDTO("Star Belgrade", "Serbia", 1759));
        teamsList.add(new TeamDTO("Sevilla", "España", 1737));
        teamsList.add(new TeamDTO("Marseille", "Francia", 1725));
        teamsList.add(new TeamDTO("Newcastle United", "Inglaterra", 1725));
        teamsList.add(new TeamDTO("Bayer Leverkusen", "Alemania", 1752));
        teamsList.add(new TeamDTO("Brighton & Hove Albion", "Inglaterra", 1735));
        teamsList.add(new TeamDTO("Monaco", "Francia", 1723));
        teamsList.add(new TeamDTO("Freiburg", "Alemania", 1710));
        teamsList.add(new TeamDTO("Feyenoord", "Holanda", 1709));
        teamsList.add(new TeamDTO("Slavia Prague R.", "Checa", 1719));
        teamsList.add(new TeamDTO("Celtic", "Escocia", 1716));
        teamsList.add(new TeamDTO("Shakhtar Donetsk", "Ucrania", 1709));
        teamsList.add(new TeamDTO("Manchester United", "Inglaterra", 1709));
        teamsList.add(new TeamDTO("River Plate", "Argentina", 1699));
        teamsList.add(new TeamDTO("Olympiakos", "Grecia", 1704));
        teamsList.add(new TeamDTO("Lyon", "Francia", 1707));
        teamsList.add(new TeamDTO("Juventus", "Italia", 1798));
        teamsList.add(new TeamDTO("Atlético Mineiro", "Brasil", 1703));
        return teamsList;
    }

    public List<TeamDTO> getTeams(){
        createteamsList();
        System.out.println(teamsList);
        return this.teamsList;
    }

    public List<TeamDTO> getTeamsScore(){
        createteamsList();
        List<TeamDTO> teams = teamsList.stream()
                .sorted(Comparator.comparing(TeamDTO::getPuntuacion))
                .peek(System.out::println)
                .collect(Collectors.toList());
                return teams;
    }

    public Map<String, List<TeamDTO>>getTeamsPorPais(){
        createteamsList();
        Map<String, List<TeamDTO>> teams = teamsList.stream()
                .collect(Collectors.groupingBy(TeamDTO::getPais));
                return teams;

    }

    public  Map<String, List<TeamDTO>> getTeamsPorPaisSorted(){
        createteamsList();
        Map<String, List<TeamDTO>> teams = teamsList.stream()
                .sorted(Comparator.comparing(TeamDTO::getNombre))
                .collect(Collectors.groupingBy(TeamDTO::getPais));
                return teams;

    }
}
