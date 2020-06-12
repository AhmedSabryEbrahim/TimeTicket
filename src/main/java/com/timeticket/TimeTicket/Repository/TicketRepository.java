package com.timeticket.TimeTicket.Repository;

import com.timeticket.TimeTicket.Model.Location;
import com.timeticket.TimeTicket.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
