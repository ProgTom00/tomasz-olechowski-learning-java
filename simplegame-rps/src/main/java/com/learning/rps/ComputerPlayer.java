package com.learning.rps;

import java.util.Random;

public class ComputerPlayer extends Player {
    private final Random random = new Random();


    public ComputerPlayer() {
        super("Computer");
    }

    public ComputerPlayer(String name) {
        super(name);
    }

    public int executeMove() {
        return GameMenu.executeComputerMove(random.nextInt(5), this);
    }

    @Override
    public int enhancedMove(int humanChoice) {

        int computerChoice = -1;

        boolean isWin = Math.random() >= 0.5;
        boolean isLoose = Math.random() <= 0.25;
        boolean isDraw = Math.random() <= 0.25;

        int[] winningArray;
        int[] loosingArray;
        int rndChoice;

        switch (humanChoice) {
            case 1:
                if (isWin) {
                    winningArray = new int[]{2, 5};
                    rndChoice = random.nextInt(winningArray.length);
                    computerChoice = winningArray[rndChoice];
                    break;
                } else if (isLoose) {
                    loosingArray = new int[]{3, 4};
                    rndChoice = random.nextInt(loosingArray.length);
                    computerChoice = loosingArray[rndChoice];
                    break;
                } else {
                    if (isDraw) {
                        computerChoice = 1;
                        break;
                    }
                }
            case 2:
                if (isWin) {
                    winningArray = new int[]{3, 4};
                    rndChoice = random.nextInt(winningArray.length);
                    computerChoice = winningArray[rndChoice];
                    break;

                } else if (isLoose) {
                    loosingArray = new int[]{1, 5};
                    rndChoice = random.nextInt(loosingArray.length);
                    computerChoice = loosingArray[rndChoice];
                    break;
                } else {
                    if (isDraw) {
                        computerChoice = 2;
                        break;
                    }
                }
            case 3:
                if (isWin) {
                    winningArray = new int[]{1, 5};
                    rndChoice = random.nextInt(winningArray.length);
                    computerChoice = winningArray[rndChoice];
                    break;

                } else if (isLoose) {
                    loosingArray = new int[]{2, 4};
                    rndChoice = random.nextInt(loosingArray.length);
                    computerChoice = loosingArray[rndChoice];
                    break;
                } else {
                    if (isDraw) {
                        computerChoice = 3;
                        break;
                    }
                }
            case 4:
                if (isWin) {
                    winningArray = new int[]{1, 3};
                    rndChoice = random.nextInt(winningArray.length);
                    computerChoice = winningArray[rndChoice];
                    break;
                } else if (isLoose) {
                    loosingArray = new int[]{2, 5};
                    rndChoice = random.nextInt(loosingArray.length);
                    computerChoice = loosingArray[rndChoice];
                    break;
                } else {
                    if (isDraw) {
                        computerChoice = 4;
                        break;
                    }
                }
            case 5:
                if (isWin) {
                    winningArray = new int[]{2, 4};
                    rndChoice = random.nextInt(winningArray.length);
                    computerChoice = winningArray[rndChoice];
                    break;
                } else if (isLoose) {
                    loosingArray = new int[]{1, 3};
                    rndChoice = random.nextInt(loosingArray.length);
                    computerChoice = loosingArray[rndChoice];
                    break;
                } else {
                    if (isDraw) {
                        computerChoice = 5;
                        break;
                    }
                }
        }
        GameMenu.executeComputerMove(computerChoice, this);
        return computerChoice;
    }
}
