package com.timeticket.TimeTicket.Model;

import com.yahoo.elide.annotation.*;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.DateTimeException;
import java.util.List;
import java.util.UUID;



@Entity
@Table(name = "ticket")
@Data
@Include(rootLevel = true,type = "Ticket")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @Column(name = "start_date")
    Timestamp startDate ;

    @Column(name = "expiry_date")
    Timestamp expiryDate ;

    @Column(name = "end_date")
    Timestamp endDate;

    double delay , cost ;

    @Column(name = "delay_cost")
    double delayCost;

    boolean active;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "place_id")
    Place place;
}
