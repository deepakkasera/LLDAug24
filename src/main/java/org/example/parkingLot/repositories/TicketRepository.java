package org.example.parkingLot.repositories;

import org.example.parkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap;
    private Long id;

    public TicketRepository() {
        ticketMap = new HashMap<>();
        id = 0L;
    }

    public Ticket save(Ticket ticket) {
        return null;
    }
}
