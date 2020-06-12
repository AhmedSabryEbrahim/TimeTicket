package com.timeticket.TimeTicket.Model;
import com.timeticket.TimeTicket.Model.DayPolicy.Policy;
import com.yahoo.elide.annotation.Include;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Include(rootLevel = true,type = "Place")
@Data
@CrossOrigin(origins = "*")
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;

    @ManyToOne
    @JoinColumn(name = "Location_id")
    Location location;

    @ManyToMany
    @JoinTable(name = "place_services",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "place_id"))
    List<ServiceType> services;


}
