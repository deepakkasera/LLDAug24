package org.example.parkingLot.repositories;

import org.example.parkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gateMap;
    private Long id;

    public GateRepository() {
        gateMap = new HashMap<>();
        id = 0L;
    }

    public Gate save(Gate gate) {
        // Update + Insert => Upsert
        if (gate.getId() == 0) {
            //insert
            id = id+1;
            gate.setId(id);
            gateMap.put(id, gate);
            return gate;
        }
        gateMap.put(gate.getId(), gate);
        return gate;
    }

    public Optional<Gate> findById(Long gateId) {
        if (gateMap.containsKey(gateId)) {
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }
}
