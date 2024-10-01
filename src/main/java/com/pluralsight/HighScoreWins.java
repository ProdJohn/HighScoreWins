package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Please input your game score in this format: USA:Mexico|17:23 ");
        System.out.println("Enter your game score: ");

        String scoreOfGame = Keyboard.nextLine().trim();
        String[] overallStats = scoreOfGame.split("\\|");
        String teams = overallStats[0];
        String scores = overallStats[1];
        String [] teamName = teams.split(":");
        String[] teamScores = scores.split(":");
        String homeTeam = teamName[0];
        String visitorTeam = teamName[1];

        int homeScore = Integer.parseInt(teamScores[0]);
        int visitorScore = Integer.parseInt(teamScores[1]);

        if (homeScore > visitorScore) {
            System.out.println("The team that won is: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("The team that won is: " + visitorTeam);
        } else {
            System.out.println("It's a draw between " + homeTeam + " and " + visitorTeam);
        }


    }
}
