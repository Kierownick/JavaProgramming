package com.company;

public class Main {

    public static void main(String[] args) {

        String playersName = "Karwowski";
        int position = 2;
        String displayHighScorePosition = playersName + " managed to get into position " + position + " on the high score table!";
        System.out.println(displayHighScorePosition);

        int calculateHighScorePosition = 101;

        if (calculateHighScorePosition > 1000) {
            System.out.println("Calculate score is higher than 1000");
        } else if (calculateHighScorePosition > 500 && calculateHighScorePosition < 1000) {
            System.out.println("Score higher than 500 but lesser than 1000");
        } else if (calculateHighScorePosition > 100 && calculateHighScorePosition < 500) {
            System.out.println("Score higher than 100 but lesser than 500");
        } else
            System.out.println("Score is lesser than 100");
    }
    public static String displayHighScorePosition(String playersName, int position) {
        

    }
}
