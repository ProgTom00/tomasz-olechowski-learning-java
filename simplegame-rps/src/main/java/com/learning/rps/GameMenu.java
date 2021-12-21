package com.learning.rps;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class GameMenu {

    private static final Scanner scanner = new Scanner(System.in);

    public static void introduction() {

        System.out.println("Welcome in the Epic RPS Game.\nChoose type of game " +
                "\n1 - 'Human vs Computer', \n2 - 'Demo Computer vs Computer', \n3 - 'Human vs Human'");

    }

    public static int getTypeOfGame() {
        String value = null;
        boolean isTrue = false;
        while (!isTrue) {
            try {
                value = scanner.nextLine();
                switch (value) {
                    case "1":
                    case "2":
                    case "3":
                        return Integer.parseInt(value);
                    default:
                        System.out.println("Invalid value. Please try again");
                        value = null;
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to choose a type game from 1 to 3");
            }
        }
        if (value == null) {
            return -1;
        }
        return 0;
    }


    public static void printGameControls() {
        System.out.println("Game Controls: \n1 - 'Rock', \n2 - 'Paper', \n3 - 'Scissors',\n4 - 'Lizard', \n5 - 'Spock'," +
                " \nx - 'x' exit the game\nn - 'n' start new game");
    }

    public static int executeComputerMove(int computerChoice, Player player2) {

        switch (computerChoice) {
            case 1:
                System.out.println(player2.getName() + " played rock");
                return 1;
            case 2:
                System.out.println(player2.getName() + " played paper");
                return 2;
            case 3:
                System.out.println(player2.getName() + " played scissors");
                return 3;
            case 4:
                System.out.println(player2.getName() + " played lizard");
                return 4;
            case 5:
                System.out.println(player2.getName() + " played spock");
                return 5;
            default:
                return -1;
        }
    }
    public static int executeHumanPlayerMove(Player player1) {
        String option = null;
        printGameControls();
        boolean isTrue = false;
        while (!isTrue) {
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println(player1.getName() + " played rock");
                    return Integer.parseInt(option);
                case "2":
                    System.out.println(player1.getName() + " played paper");
                    return Integer.parseInt(option);
                case "3":
                    System.out.println(player1.getName() + " played scissors");
                    return Integer.parseInt(option);
                case "4":
                    System.out.println(player1.getName() + " played lizard");
                    return Integer.parseInt(option);
                case "5":
                    System.out.println(player1.getName() + " played spock");
                    return Integer.parseInt(option);
                case "x":
                    option = abortGame();
                    printGameControls();
                    break;
                case "n":
                    option = startNewGame();
                    printGameControls();
                    break;
                default:
                    System.out.println("Invalid value. Please try again");
                    option = null;
            }

        }
        if (!isTrue)
            return -1;
        return Integer.parseInt(option);
    }

    public static String startNewGame() {
        boolean gameEnd = false;
        while (!gameEnd) {
            System.out.println("Do you really want to end this game? Press [y,n]");
            String choice = scanner.nextLine();
            switch (choice) {
                case "y":
                    GameProcessor.startGame();
                    break;
                case "x":
                    break;
                default:
                    System.out.println("Invalid move. Please try again");
                    return null;
            }
        }
        return null;
    }

    public static void finishGame() {
        String choice;
        System.out.println("Press 'x' to quit the game\nPress 'n' to start new game");
        do {
            choice = scanner.nextLine().toLowerCase(Locale.ROOT);
            if ("x".equals(choice)) {
                choice = abortGame();
            } else if ("n".equals(choice)) {
                choice = startNewGame();
            } else {
                System.out.print("");
                choice = null;
            }

        } while (choice == null);

    }

    public static String abortGame() {
        boolean isEnd = false;
        System.out.println("Do you really want to end game? Press [y,n]");

        while (!isEnd) {
            String choice = scanner.nextLine();
            if (choice.equals("y")) {
                System.exit(0);
                break;
            } else if (choice.equals("n")) {
                return null;
            } else {
                System.out.println("Invalid move. Please try again");
            }
        }
        return null;
    }

    public static int setGamesRounds() {
        System.out.println("Enter the number of rounds which determine the winner! (Max 20 rounds)");
        boolean correctRound = false;
        int rounds;

        do {
            try {
                rounds = scanner.nextInt();
                correctRound = checkRoundsCorrectMove(rounds);

            } catch (InputMismatchException e) {
                System.out.println("Enter a number");
                rounds = 0;
            }
            scanner.nextLine();
        } while (!correctRound);
        return rounds;
    }

    private static boolean checkRoundsCorrectMove(int rounds) {

        if (rounds > 0 && rounds < 21) {
            return true;
        } else {
            System.out.println("Invalid value. Please try again");
            return false;
        }
    }

    public static void presentScore(Player player1, Player player2) {
        System.out.println("Score of the round: " + player1.getName() + " and " +
                player2.getName() + " " + player1.getCountWinnings() + ":"
                + player2.getCountWinnings());
    }


    public static void showRoundResult(Player player) {
        System.out.println("Round won: " + player.getName());
    }

    public static String getPlayerName() {
        System.out.println("Enter player name");
        String name;
        boolean correctName = false;
        do {
            name = scanner.nextLine();
            correctName = isNameCorrect(name);

        } while (!correctName);
        return name;
    }

    private static boolean isNameCorrect(String name) {
        return name != null && !name.isEmpty();
    }

    public static void checkGameWinner(Player player1, Player player2) {

        if (player1.getCountWinnings() > player2.getCountWinnings()) {
            System.out.println("Winner is " + player1.getName() + "!" + " With result " + player1.getCountWinnings()
                    + ":" + player2.getCountWinnings());
        } else {
            System.out.println("Winner is " + player2.getName() + "!" + " With result " + player2.getCountWinnings()
                    + ":" + player1.getCountWinnings());
        }
    }
}


