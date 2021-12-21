package com.learning.rps;

public class GameGesture {


    public static void gameGestures(int option) {
        switch (option) {
            case 1:
                System.out.println("Rock crushes Scissors");
                break;
            case 2:
                System.out.println("Scissors cuts Paper");
                break;
            case 3:
                System.out.println("Paper covers Rock");
                break;
            case 4:
                System.out.println("Rock crushes Lizard");
                break;
            case 5:
                System.out.println("Lizard poisons Spock");
                break;
            case 6:
                System.out.println("Spock smashes Scissors");
                break;
            case 7:
                System.out.println("Scissors decapitates Lizard");
                break;
            case 8:
                System.out.println("Lizard eats Paper");
                break;
            case 9:
                System.out.println("Paper disproves Spock");
                break;
            case 10:
                System.out.println("Spock vaporizes Rock");
                break;
            default:
                System.out.println("It's a tie!");
        }
    }

}