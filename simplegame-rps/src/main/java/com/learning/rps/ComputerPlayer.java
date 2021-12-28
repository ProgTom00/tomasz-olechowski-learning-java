package com.learning.rps;

import java.util.*;

public class ComputerPlayer extends Player {

    private static final Random random = new Random();

    public ComputerPlayer() {
        super("Computer");
    }

    public ComputerPlayer(String name) {
        super(name);
    }

    public int executeMove() {
        return IOService.executeComputerMove(random.nextInt(5), this);
    }

    @Override
    public int enhancedMove(int humanChoice) {

        int computerChoice = -1;

        boolean win = Math.random() >= 0.5;
        boolean loose = Math.random() <= 0.25;


        switch (humanChoice) {
            case 1:
                if (win) {
                    computerChoice = getComputerChoice(2, 5);
                    break;
                } else if (loose) {
                    computerChoice = getComputerChoice(3, 4);
                    break;
                } else {
                    computerChoice = 1;
                    break;
                }
            case 2:
                if (win) {
                    computerChoice = getComputerChoice(3, 4);
                    break;
                } else if (loose) {
                    computerChoice = getComputerChoice(1, 5);
                    break;
                } else {
                    computerChoice = 2;
                    break;
                }
            case 3:
                if (win) {
                    computerChoice = getComputerChoice(1, 5);
                    break;
                } else if (loose) {
                    computerChoice = getComputerChoice(2, 4);
                    break;
                } else {
                    computerChoice = 3;
                    break;
                }
            case 4:
                if (win) {
                    computerChoice = getComputerChoice(1, 3);
                    break;
                } else if (loose) {
                    computerChoice = getComputerChoice(2, 5);
                    break;
                } else {
                    computerChoice = 4;
                    break;
                }
            case 5:
                if (win) {
                    computerChoice = getComputerChoice(2, 4);
                    break;
                } else if (loose) {
                    computerChoice = getComputerChoice(1, 3);
                    break;
                } else {
                    computerChoice = 5;
                    break;
                }
        }

        IOService.executeComputerMove(computerChoice, this);
        return computerChoice;
    }

    public static int getComputerChoice(int firstComputerChoice, int secondComputerChoice) {

        int rndChoice = 0;
        int computerChoice = -1;
        List<Integer> list = List.of(firstComputerChoice, secondComputerChoice);
        rndChoice = random.nextInt(list.size());
        computerChoice = list.get(rndChoice);

        return computerChoice;

    }
}