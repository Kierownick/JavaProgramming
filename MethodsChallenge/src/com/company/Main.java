package com.company;

public class Main {

    public static void main(String[] args) {

        // To jest podejście gościa, który rozwiązał zagadkę, nie podoba mi się za bardzo
        int position = calculateHighScorePosition(900232323);
        displayHighScorePosition("Adrian", position);

        // A to moje, bez alokowania pamięci zmienną.
        displayHighScorePosition(
                "Karwowski",
                calculateHighScorePosition(
                        1500));

        displayHighScorePosition(
                "Kieras",
                calculateHighScorePosition(
                        900));

        displayHighScorePosition(
                "Adi",
                calculateHighScorePosition(
                        400));

        displayHighScorePosition(
                "Kierownick",
                calculateHighScorePosition(
                        50));
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
