package org.example.parkingLot.strategies.spotAssignmentStrategy;

import org.example.parkingLot.models.Gate;
import org.example.parkingLot.models.ParkingSpot;
import org.example.parkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate);
}
