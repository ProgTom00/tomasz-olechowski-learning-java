package com.learning.rps;

public class GameProcessor {

    private final Player player1;
    private final Player player2;
    private final Rules rules;
    private final int countWinningRounds;
    private static int playerOption;

    public GameProcessor(final Player player1, final Player player2, final Rules rules, final int countWinningRounds) {

        this.player1 = player1;
        this.player2 = player2;
        this.rules = rules;
        this.countWinningRounds = countWinningRounds;
    }


    public static void startGame() {
        Player player1;
        Player player2;
        GameMenu.introduction();

        playerOption = GameMenu.getTypeOfGame();
        switch (playerOption) {
            case 1: // human vs computer
                player1 = new HumanPlayer(GameMenu.getPlayerName());
                player2 = new ComputerPlayer("Computer");
                break;
            case 2: // Computer vs Computer2
                player1 = new ComputerPlayer("Computer");
                player2 = new ComputerPlayer("Computer");
                break;
            case 3: // Human vs Human
                player1 = new HumanPlayer(GameMenu.getPlayerName());
                player2 = new HumanPlayer(GameMenu.getPlayerName());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + playerOption);
        }
        int rounds = GameMenu.setGamesRounds();
        Rules rules = new RulesOfTheGame();
        GameProcessor gameProcessor = new GameProcessor(player1, player2, rules, rounds);
        gameProcessor.progressGame();
    }


    private void progressGame() {

        while (player1.getCountWinnings() != countWinningRounds && player2.getCountWinnings() != countWinningRounds) {
            GameMenu.presentScore(player1, player2);
            int win = 0;

            if (playerOption == 1) {
                int humanMove = player1.executeMove();
                int computerMove = player2.enhancedMove(humanMove);
                win = rules.resultOfGame(humanMove, computerMove);
            } else {
                win = rules.resultOfGame(player1.executeMove(), player2.executeMove());
            }
            if (win == 1) {
                player1.addCountWinnings();
                GameMenu.showRoundResult(player1);
            } else if (win == 2) {
                player2.addCountWinnings();
                GameMenu.showRoundResult(player2);
            } else {
                GameGesture.gameGestures(11);
            }
        }
        GameMenu.checkGameWinner(player1, player2);
        GameMenu.finishGame();
    }
}




