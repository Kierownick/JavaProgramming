package com.company;

public class Main {

    public static void main(String[] args) {

        // To jest podejście gościa, który rozwiązał zagadkę, nie podoba mi się za bardzo
        int position = calculateHighScorePosition(900232323);
        displayHighScorePosition("Adrian", position, 900232323);

        // A to moje, bez alokowania pamięci zmienną.
        displayHighScorePosition(
                "Karwowski",
                calculateHighScorePosition(
                        1500), 1500);

        displayHighScorePosition(
                "Karwowski",
                calculateHighScorePosition(
                        900), 900);

        displayHighScorePosition(
                "Karwowski",
                calculateHighScorePosition(
                        400), 400);

        displayHighScorePosition(
                "Karwowski",
                calculateHighScorePosition(
                        50), 50);

    }

    public static void displayHighScorePosition(String playersName, int position, int playerScore) {
        System.out.println(playersName + " managed to get into position " + position
                + " on the high score table with "
                + playerScore + " points!");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

//        int position = 4; //position 4 will be returned
//        if(playerScore >= 1000) {
//            position = 1;
//    }
        }
    }
