package org.example.tictactoe.strategy.gameWinningStrategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;
import org.example.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements GameWinningStrategy {
    private Map<Integer, Map<Symbol, Integer>> rowMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if (!rowMap.containsKey(row)) {
            rowMap.put(row, new HashMap<>());
        }

        Map<Symbol, Integer> currentRowMap = rowMap.get(row);

        if (!currentRowMap.containsKey(symbol)) {
            currentRowMap.put(symbol, 1);
        } else {
            currentRowMap.put(symbol,
                    currentRowMap.get(symbol) + 1);
        }

        return currentRowMap.get(symbol) == board.getSize();
    }
}
