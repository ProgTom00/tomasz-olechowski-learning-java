package com.learning.rps;

public class PlayerChoices {

    enum Choice {
        ROCK("rock"),
        PAPER("paper"),
        SCISSORS("scissors"),
        LIZARD("lizard"),
        SPOCK("spock");

        String name;

        Choice(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static void printPlayerChoice(Player player, String choice) {
            System.out.println(player.getName() + " played " + choice);
        }
    }
}
