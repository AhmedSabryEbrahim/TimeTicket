package com.timeticket.TimeTicket.Model.DayPolicy;

import com.yahoo.elide.annotation.Include;

import java.sql.Time;


@Include(rootLevel = true,type = "Shift")
public class Shift extends Policy{
    Time startTime , finishTime;
    String shiftName,shiftType,unitName;
    double ratio , costForUnit;
    int maxTickets;
}
