package com.timeticket.TimeTicket.Repository;

import com.timeticket.TimeTicket.Model.Location;
import com.timeticket.TimeTicket.Model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlaceRepository extends JpaRepository<Place, UUID> {
}
