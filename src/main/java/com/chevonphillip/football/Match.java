package com.chevonphillip.football;

public record Match(Team homeTeam, Team awayTeam, int homeScore, int awayScore, Team winner) {
}
