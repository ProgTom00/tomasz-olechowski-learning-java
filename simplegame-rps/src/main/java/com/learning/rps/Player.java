package com.learning.rps;

public abstract class Player {

    public String name;
    public int countWinnings;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountWinnings() {
        return countWinnings;
    }

    public void addCountWinnings() {
        this.countWinnings++;
    }

    public abstract int executeMove();

    public abstract int enhancedMove(int humanChoice);

}







