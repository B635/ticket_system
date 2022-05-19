package com.example.ticket_backend.bean;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ticketChange {
    private String trainNo;
    private OffsetDateTime startTime;
    private OffsetDateTime finishTime;

    public ticketChange(String trainNo, String startTime, String finishTime) {
        this.trainNo = trainNo;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ("yyyy-MM-dd HH:mm");
        this.startTime = LocalDateTime.parse(startTime, dtf)
                .atZone(ZoneId.of("Europe/London"))
                .toOffsetDateTime();
        this.finishTime = LocalDateTime.parse(finishTime, dtf)
                .atZone(ZoneId.of("Europe/London"))
                .toOffsetDateTime();
    }

    public String getTrainNo() {
        return trainNo;
    }

    public OffsetDateTime getFinishTime() {
        return finishTime;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }
}
