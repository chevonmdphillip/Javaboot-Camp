package com.chevonphillip.football.main;

import com.chevonphillip.football.Match;
import com.chevonphillip.football.Player;
import com.chevonphillip.football.Team;
import com.chevonphillip.football.Tournament;

public class Main {
    public static void main(String[] args) {
        Team jets = new Team("Jets", "Chevy,Phillip,John,Paul");
        Team sharks = new Team("Sharks", "David,Mark,James,Andrew");
        new Player("Chevy", 21, "Striker", jets);
        new Player("David", 22, "Striker", sharks);
        new Match(jets, sharks, 2, 1, jets);
        new Match(jets, sharks, 1, 1, null);
        new Match(jets, sharks, 4, 1, jets);
        Tournament homecoming = new Tournament("Homecoming", "Jets,Sharks", "Jets,Sharks,2,1,Jets;Jets,Sharks,1,1,null;Jets,Sharks,4,1,Jets");
        System.out.println(homecoming);
    }

}
