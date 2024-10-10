package org.example.tictactoe.controllers;

import org.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import org.example.tictactoe.exceptions.InvalidPlayerCountException;
import org.example.tictactoe.models.Game;
import org.example.tictactoe.models.GameState;
import org.example.tictactoe.models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) throws InvalidPlayerCountException, DuplicateSymbolFoundException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) {

    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }
}
