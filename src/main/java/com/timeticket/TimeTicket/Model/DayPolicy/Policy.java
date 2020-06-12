package com.timeticket.TimeTicket.Model.DayPolicy;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.timeticket.TimeTicket.Model.Place;
import com.timeticket.TimeTicket.Model.ServiceType;
import com.yahoo.elide.annotation.Include;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Data
@Include(rootLevel = true,type = "Policy")
@Document("Policy")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dayType" ,visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Shift.class, name = "shift"),
        @JsonSubTypes.Type(value = Weekend.class, name = "weekend"),
        @JsonSubTypes.Type(value = DayOff.class, name = "dayOff")
})
public abstract class Policy {
    @Id
    String id;
    Date day;
    String dayType;

    @ManyToOne(targetEntity = Place.class)
    Place place;

    @ManyToOne(targetEntity = ServiceType.class)
    ServiceType serviceType;

}
