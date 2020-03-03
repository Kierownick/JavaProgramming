package com.company;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Karwowski", calculateHighScorePosition(1500));
        displayHighScorePosition("Karwowski", calculateHighScorePosition(900));
        displayHighScorePosition("Karwowski", calculateHighScorePosition(400));
        displayHighScorePosition("Karwowski", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table!");
    }

    public static int calculateHighScorePosition(int thePlayerScore) {
        if (thePlayerScore >= 1000) {
            return 1;
        } else if (thePlayerScore >= 500 && thePlayerScore < 1000) {
            return 2;
        } else if (thePlayerScore >= 100 && thePlayerScore < 500) {
            return 3;
        } else
            return 4;
    }
}
