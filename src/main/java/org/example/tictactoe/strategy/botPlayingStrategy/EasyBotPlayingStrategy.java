package org.example.tictactoe.strategy.botPlayingStrategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Cell;
import org.example.tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> cells : board.getBoard()) {
            for (Cell cell : cells) {
                if (cell.isEmpty()) {
                    return new Move(
                            null,
                            cell
                    );
                }
            }
        }
        return null;
    }
}
