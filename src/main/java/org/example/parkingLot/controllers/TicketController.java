package org.example.parkingLot.controllers;

import org.example.parkingLot.dtos.IssueTicketRequestDto;
import org.example.parkingLot.dtos.IssueTicketResponseDto;
import org.example.parkingLot.dtos.ResponseStatus;
import org.example.parkingLot.models.Ticket;
import org.example.parkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(requestDto.getGateId(),
                    requestDto.getVehicleNumber(),
                    requestDto.getOwnerName(),
                    requestDto.getVehicleType());

            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
