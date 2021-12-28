package com.learning.rps;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import static com.learning.rps.PlayerChoices.Choice.printPlayerChoice;


public class IOService {

    private static final Scanner scanner = new Scanner(System.in);

    public static int executeHumanPlayerMove(Player player1) {
        String option;
        GameMenu.printGameControls();
        while (true) {
            option = scanner.nextLine();
            switch (Objects.requireNonNull(option)) {
                case "1":
                    printPlayerChoice(player1, PlayerChoices.Choice.ROCK.getName());
                    return Integer.parseInt(option);
                case "2":
                    printPlayerChoice(player1, PlayerChoices.Choice.PAPER.getName());
                    return Integer.parseInt(option);
                case "3":
                    printPlayerChoice(player1, PlayerChoices.Choice.SCISSORS.getName());
                    return Integer.parseInt(option);
                case "4":
                    printPlayerChoice(player1, PlayerChoices.Choice.LIZARD.getName());
                    return Integer.parseInt(option);
                case "5":
                    printPlayerChoice(player1, PlayerChoices.Choice.SPOCK.getName());
                    return Integer.parseInt(option);
                case "x":
                    abortGame();
                    GameMenu.printGameControls();
                    break;
                case "n":
                    startNewGame();
                    GameMenu.printGameControls();
                    break;
                default:
                    System.out.println("Invalid value. Please try again");
            }
        }
    }

    public static int executeComputerMove(int computerChoice, Player player2) {

        switch (computerChoice) {
            case 1:
                printPlayerChoice(player2, PlayerChoices.Choice.ROCK.getName());
                return 1;
            case 2:
                printPlayerChoice(player2, PlayerChoices.Choice.PAPER.getName());
                return 2;
            case 3:
                printPlayerChoice(player2, PlayerChoices.Choice.SCISSORS.getName());
                return 3;
            case 4:
                printPlayerChoice(player2, PlayerChoices.Choice.LIZARD.getName());
                return 4;
            case 5:
                printPlayerChoice(player2, PlayerChoices.Choice.SPOCK.getName());
                return 5;
            default:
                return -1;
        }
    }

    public static String startNewGame() {
        while (true) {
            System.out.println("Do you really want to end this game? Press [y,n]");
            String choice = scanner.nextLine();
            switch (choice) {
                case "y":
                    GameProcessor.startGame();
                    break;
                case "n":
                    return null;
                default:
                    System.out.println("Invalid move. Please try again");
                    break;
            }
        }
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
        System.out.println("Do you really want to end game? Press [y,n]");

        while (true) {
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


    public static int getTypeOfGame() {
        String value = null;
        do {
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
        } while (value == null);
        return -1;
    }

    public static String getPlayerName() {
        System.out.println("Enter player name");
        String name;
        boolean correctName;
        do {
            name = scanner.nextLine();
            correctName = isNameCorrect(name);

        } while (!correctName);
        return name;
    }

    private static boolean isNameCorrect(String name) {
        if (name.isEmpty() || name == null) {
            System.out.println("Please Re-enter name.");
            return false;
        }
        return true;
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
}


