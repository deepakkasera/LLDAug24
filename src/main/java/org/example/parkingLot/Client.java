package org.example.parkingLot;

import org.example.parkingLot.controllers.TicketController;
import org.example.parkingLot.dtos.IssueTicketRequestDto;
import org.example.parkingLot.dtos.IssueTicketResponseDto;
import org.example.parkingLot.models.VehicleType;
import org.example.parkingLot.repositories.GateRepository;
import org.example.parkingLot.repositories.ParkingLotRepository;
import org.example.parkingLot.repositories.TicketRepository;
import org.example.parkingLot.repositories.VehicleRepository;
import org.example.parkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(1234L);
        requestDto.setOwnerName("Ravi");
        requestDto.setVehicleNumber("KA01X0001");
        requestDto.setVehicleType(VehicleType.LARGE);

        IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);
    }
}
