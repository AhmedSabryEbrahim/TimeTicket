package com.timeticket.TimeTicket.Repository;

import com.timeticket.TimeTicket.Model.Place;
import com.timeticket.TimeTicket.Model.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, UUID> {
}
