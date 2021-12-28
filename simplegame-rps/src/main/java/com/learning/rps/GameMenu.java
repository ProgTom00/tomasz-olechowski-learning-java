package com.learning.rps;

public class GameMenu {


    public static void introduction() {
        System.out.println("Welcome in the Epic RPS Game.\nChoose type of game " +
                "\n1 - 'Human vs Computer', \n2 - 'Demo Computer vs Computer', \n3 - 'Human vs Human'");

    }

    public static void printGameControls() {
        System.out.println("Game Controls: \n1 - 'Rock', \n2 - 'Paper', \n3 - 'Scissors',\n4 - 'Lizard', \n5 - 'Spock'," +
                " \nx - 'x' exit the game\nn - 'n' start new game");
    }

    public static void presentScore(Player player1, Player player2) {
        System.out.println("Score of the round: " + player1.getName() + " and " +
                player2.getName() + " " + player1.getCountWinnings() + ":"
                + player2.getCountWinnings());
    }

    public static void showRoundResult(Player player) {
        System.out.println("Round won: " + player.getName());
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






