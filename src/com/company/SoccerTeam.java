package com.company;

public class SoccerTeam {
    private int wins;
    private int ties;
    private int losses;
    private static int gamesPlayed = 0;
    private static int totalGoals = 0;

    public SoccerTeam(){
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore){
            this.wins += 1;
            other.losses += 1;
        }

    }
}
