package com.timeticket.TimeTicket.Repository;

import com.timeticket.TimeTicket.Model.Ticket;
import com.timeticket.TimeTicket.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
