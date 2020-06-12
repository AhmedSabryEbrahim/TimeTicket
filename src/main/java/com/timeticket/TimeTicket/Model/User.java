package com.timeticket.TimeTicket.Model;

import com.yahoo.elide.annotation.Include;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Include(rootLevel = true,type = "User")
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name , email , password;

    @OneToMany(mappedBy = "user")
    List<Ticket>tickets;

    @ManyToOne
    @JoinColumn(name = "location_id")
    Location location;
}
