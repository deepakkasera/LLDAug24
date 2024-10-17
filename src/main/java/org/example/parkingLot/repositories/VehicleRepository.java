package org.example.parkingLot.repositories;

import org.example.parkingLot.models.Vehicle;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<Long, Vehicle> vehicleMap;
//    private Map<String, Vehicle> vehicleNumberVehicleMap;

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) {
        return null;
    }

    public Optional<Vehicle> findById(Long vehicleId) {
        return null;
    }

    public Vehicle save(Vehicle vehicle) {
        return null;
    }


}
