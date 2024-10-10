package org.example.tictactoe.factory;

import org.example.tictactoe.models.BotDifficultyLevel;
import org.example.tictactoe.strategy.botPlayingStrategy.BotPlayingStrategy;
import org.example.tictactoe.strategy.botPlayingStrategy.EasyBotPlayingStrategy;
import org.example.tictactoe.strategy.botPlayingStrategy.HardBotPlayingStrategy;
import org.example.tictactoe.strategy.botPlayingStrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
        if (difficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if (difficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else if (difficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        }

        return null;
    }
}
