package com.learning.rps;

public class RulesOfTheGame implements Rules {
    @Override
    public int resultOfGame(int firstPlayerChoice, int secondPlayerChoice) {

        switch (firstPlayerChoice) {
            case 1:
                switch (secondPlayerChoice) {
                    case 2:
                        GameGesture.gameGestures(3);
                        return 2;
                    case 3:
                        GameGesture.gameGestures(1);
                        return 1;
                    case 4:
                        GameGesture.gameGestures(4);
                        return 1;
                    case 5:
                        GameGesture.gameGestures(10);
                        return 2;
                    default:
                        return 0;
                }
            case 2:
                switch (secondPlayerChoice) {
                    case 1:
                        GameGesture.gameGestures(3);
                        return 1;
                    case 3:
                        GameGesture.gameGestures(2);
                        return 2;
                    case 4:
                        GameGesture.gameGestures(8);
                        return 2;
                    case 5:
                        GameGesture.gameGestures(9);
                        return 1;
                    default:
                        return 0;
                }
            case 3:
                switch (secondPlayerChoice) {
                    case 1:
                        GameGesture.gameGestures(1);
                        return 2;
                    case 2:
                        GameGesture.gameGestures(2);
                        return 1;
                    case 4:
                        GameGesture.gameGestures(7);
                        return 1;
                    case 5:
                        GameGesture.gameGestures(6);
                        return 2;
                    default:
                        return 0;
                }
            case 4:
                switch (secondPlayerChoice) {
                    case 1:
                        GameGesture.gameGestures(4);
                        return 2;
                    case 2:
                        GameGesture.gameGestures(8);
                        return 1;
                    case 3:
                        GameGesture.gameGestures(7);
                        return 2;
                    case 5:
                        GameGesture.gameGestures(5);
                        return 1;
                    default:
                        return 0;
                }
            case 5:
                switch (secondPlayerChoice) {
                    case 1:
                        GameGesture.gameGestures(10);
                        return 1;
                    case 2:
                        GameGesture.gameGestures(9);
                        return 2;
                    case 3:
                        GameGesture.gameGestures(6);
                        return 1;
                    case 4:
                        GameGesture.gameGestures(5);
                        return 2;
                    default:
                        return 0;
                }
        }
        return -1;
    }
}

