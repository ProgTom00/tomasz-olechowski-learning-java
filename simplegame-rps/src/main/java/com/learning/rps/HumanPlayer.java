package com.learning.rps;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int executeMove() {
        return IOService.executeHumanPlayerMove(this);
    }

    @Override
    public int enhancedMove(int humanChoice) {
        return 0;
    }
}
