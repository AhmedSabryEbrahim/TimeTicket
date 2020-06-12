package com.timeticket.TimeTicket.Model.DayPolicy;

import com.yahoo.elide.annotation.Include;

import java.time.DayOfWeek;


@Include(rootLevel = true,type = "Weekend")
public class Weekend extends Policy{
    DayOfWeek dayOfWeek;
}
