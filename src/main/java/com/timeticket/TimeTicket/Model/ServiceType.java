package com.timeticket.TimeTicket.Model;

import com.yahoo.elide.annotation.Include;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Include(rootLevel = true,type = "ServiceType")
@Data
@Table(name = "service")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String type , name;
}
