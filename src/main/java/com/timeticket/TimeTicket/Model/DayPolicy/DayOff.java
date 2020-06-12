package com.timeticket.TimeTicket.Model.DayPolicy;


import com.yahoo.elide.annotation.Include;

@Include(rootLevel = true,type = "DayOff")
public class DayOff extends Policy{
    String description;
}
