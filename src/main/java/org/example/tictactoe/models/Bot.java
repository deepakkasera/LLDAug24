package org.example.tictactoe.models;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(Long id, String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, id, symbol, PlayerType.BOT);
        this.botDifficultyLevel = difficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
