## Table of contents

* [General info](#general-info)

* [Game navigation](#game-navigation)

* [Game modes](#game-modes)

* [Game rules](#game-rules)

* [Technologies](#technologies)

* [Setup](#Setup)

## General info
I am presenting to you a simple game called rock-paper-scissors which has two additional options.
This game is designed for two players.


## Game navigation
To navigate through the game, just follow the options. Mostly, you will use numbers from 1 to 5. 
There are additional keys for starting new game 'n' or exit current session 'x' which they can be 
confirmed with 'y' for yes or 'n' for no.

## Game modes
In the game there are 3 options to choose.
* human vs computer player
* 'demo' computer player vs computer player
* human vs human

When you pick 'demo' version, you just need to enter the number of rounds. When you choose first or third option, 
the game will ask for names for the players.

## Game rules
After selecting the game option, in the next step the game will ask for the number of winning rounds. 
To win the game winning rounds must be achieved by one of the players. When you have chosen first mode
human vs computer. You will be the first player which starts the game. You have 5 options available options:
1-rock, 2-paper, 3-scissors, 4-lizard, 5-spock. Although, you can start a new game by pressing 'n', or you can end
session with key 'x'. If you enter wrong values an error will appear, and you will have to re-enter the option. However,
when you choose first option in the game mode computer have enhanced move. It means that computer has 50% chance in case
of winning, 25 % chance of draw and 25% chance of losing with you.

* Rock crushes Scissors
* Scissors cuts Paper
* Paper covers Rock
* Rock crushes Lizard  
* Lizard poisons Spock
* Spock smashes Scissors
* Scissors decapitates Lizard
* Lizard eats Paper
* Paper disproves Spock
* Spock vaporizes Rock

The game will display possibilities of players whose picked specific option. When one of the players wins a round, 
one point will be added to the score. If the players picked the same options, the game will display a draw message,
and the score of the players will be unchanged. The game will be continued until one of the players
reach the point equality to the winning rounds. A message will be displayed at end of the game with present score
and who won the game. After that message you have two options to choose 'x' to exit game or 'n' to start a new game, 
and you need to use lower case letters.

                    


## Technologies
Project is created with:

* IntelliJ IDEA Community Edition 2021.1.3 x64
* JUnit Jupiter Engine version: 5.7.0
* JUnit Jupiter Api version: 5.7.0
* Mockito JUnit Jupiter version: 4.1.0
* Gradle version 6.3


## Setup
To start this game, just run main method from RpsRunner class.