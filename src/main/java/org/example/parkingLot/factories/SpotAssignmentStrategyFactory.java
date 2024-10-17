package org.example.parkingLot.factories;

import org.example.parkingLot.models.SpotAssignmentStrategyType;
import org.example.parkingLot.strategies.spotAssignmentStrategy.CheapestSpotAssignmentStrategy;
import org.example.parkingLot.strategies.spotAssignmentStrategy.RandomSpotAssignmentStrategy;
import org.example.parkingLot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType
                                                            spotAssignmentStrategyType) {
        if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.CHEAPEST)) {
            return new CheapestSpotAssignmentStrategy();
        } else if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.RANDOM)) {
            return new RandomSpotAssignmentStrategy();
        }
        return null;
    }
}
