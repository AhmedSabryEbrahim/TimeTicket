package com.timeticket.TimeTicket.Model;

import com.yahoo.elide.annotation.Include;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Include(rootLevel = true,type = "Location")
@Data
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name , address ,city , country;
    double longitude, latitude;
}
