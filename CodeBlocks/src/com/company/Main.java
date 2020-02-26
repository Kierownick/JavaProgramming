package com.company;

public class Main {

    public static void main(String[] args) {
        {
            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

//           if (score < 5000 && score > 1000) {
//                System.out.println("Your score less then 5000 but greater than 1000");
//
//            } else if (score < 1000) {
//                System.out.println("Your score was less than 1000");
//
//            } else {
//                System.out.println("Got here");
//            }

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);
            }
        }
        {
            boolean gameOver = true;
            int score = 10000;
            int levelCompleted = 8;
            int bonus = 200;

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);

            }

        }
    }
//    int savedFinalScore = finalScore; // finalScore poza codeblockiem już nie istnieje, trzeba zdefiniować na nowo
}
