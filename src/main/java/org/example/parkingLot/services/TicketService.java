package org.example.parkingLot.services;

import org.example.parkingLot.exceptions.GateNotFoundException;
import org.example.parkingLot.exceptions.SpotNotAvailableException;
import org.example.parkingLot.factories.SpotAssignmentStrategyFactory;
import org.example.parkingLot.models.*;
import org.example.parkingLot.repositories.GateRepository;
import org.example.parkingLot.repositories.ParkingLotRepository;
import org.example.parkingLot.repositories.TicketRepository;
import org.example.parkingLot.repositories.VehicleRepository;
import org.example.parkingLot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType) throws GateNotFoundException, SpotNotAvailableException {

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

        Optional<ParkingLot> optionalParkingLot = parkingLotRepository.findByGateId(gateId);

        if (optionalParkingLot.isEmpty()) {
            throw new RuntimeException("Invalid ParkingLot");
        }

        ParkingLot parkingLot = optionalParkingLot.get();

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.
                getSpotAssignmentStrategy(parkingLot.getSpotAssignmentStrategyType());


        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType, gate);

        if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.NOT_AVAILABLE)) {
            throw new SpotNotAvailableException("Spot not available.");
        }

        ticket.setParkingSpot(parkingSpot);

        return ticketRepository.save(ticket);
    }
}
