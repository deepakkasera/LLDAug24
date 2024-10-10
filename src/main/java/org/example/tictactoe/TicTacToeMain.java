package org.example.tictactoe;

import org.example.tictactoe.controllers.GameController;
import org.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import org.example.tictactoe.exceptions.InvalidPlayerCountException;
import org.example.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) throws InvalidPlayerCountException, DuplicateSymbolFoundException {
        //Play the game.
        System.out.println("Starting TicTacToe game....");

        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();

        players.add(
                new Player("Ismail", 1L, new Symbol('X'), PlayerType.HUMAN)
        );

        players.add(
                new Bot(2L, "Scaler", new Symbol('O'), BotDifficultyLevel.EASY)
        );

        Game game = gameController.startGame(
                3,
                players
        );

        while (gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);

            gameController.makeMove(game);
        }

        if (gameController.getGameState(game).equals(GameState.DRAW)) {
            System.out.println("Game has DRAWN.");
        } else {
            //Someone has WON the game.
            gameController.displayBoard(game);
            System.out.println(gameController.getWinner(game).getName() + " has WON the game. Congratulations.");
        }

    }
}
