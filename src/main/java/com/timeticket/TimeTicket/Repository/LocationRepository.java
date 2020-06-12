package com.timeticket.TimeTicket.Repository;

import com.timeticket.TimeTicket.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface LocationRepository extends JpaRepository<Location, UUID> {
}
