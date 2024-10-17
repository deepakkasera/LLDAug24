package org.example.parkingLot.services;

import org.example.parkingLot.exceptions.GateNotFoundException;
import org.example.parkingLot.models.Gate;
import org.example.parkingLot.models.Ticket;
import org.example.parkingLot.models.Vehicle;
import org.example.parkingLot.models.VehicleType;
import org.example.parkingLot.repositories.GateRepository;
import org.example.parkingLot.repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType) throws GateNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Gate with id: " + gateId + " not found.");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);

        Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);

        Vehicle savedVehicle = null;

        if (optionalVehicle.isEmpty()) {
            //Create a new Vehicle and save it in the DB.
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            savedVehicle = vehicleRepository.save(vehicle);
        } else {
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);

        ticket.setNumber("ticket-number");





        return null;
    }
}
