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
        gamesPlayed++;
        totalGoals += (myScore + otherScore);

        if(myScore > otherScore){
            this.wins ++;
            other.losses ++;
        }
        else if(myScore < otherScore){
            this.losses ++;
            other.wins ++;
        }
        else if (myScore == otherScore) {
            this.ties++;
            other.ties++;
        }
    }

    public int getPoints(){
        return 3*wins + ties;
    }
    
    public void reset(){
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public static int getGamesPlayed(){
        return gamesPlayed;
    }

    public static int getGoalsScored(){
        return totalGoals;
    }

    public static void resetTournament(){
        gamesPlayed = 0;
        totalGoals = 0;
    }

    public static void main(String[] args) {
        SoccerTeam red = new SoccerTeam();
        SoccerTeam orange = new SoccerTeam();
        SoccerTeam green = new SoccerTeam();
        SoccerTeam blue = new SoccerTeam();

        resetTournament();

        red.played(orange,  3,  5);
        orange.played(green, 7, 2);
        green.played(blue, 6, 6);
        blue.played(red, 7, 8);

        System.out.println("Tournament 1: ");
        System.out.println("Red scored " + red.getPoints() + " goals");
        System.out.println("Orange scored " + orange.getPoints() + " goals");
        System.out.println("Green scored " + green.getPoints() + " goals");
        System.out.println("Blue scored " + blue.getPoints() + " goals");

        System.out.println("Total games played " + getGamesPlayed());
        System.out.println("Total goals scored " + getGoalsScored());
        System.out.println();


    }
}
