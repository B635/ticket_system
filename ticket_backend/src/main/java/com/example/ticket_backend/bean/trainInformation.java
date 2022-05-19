package com.example.ticket_backend.bean;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class trainInformation {
    // 火车班次
    private String trainNo;

    // 起始站
    private String beginStation;

    // 终点站
    private String endStation;

    // 出发时间
    private OffsetDateTime startTime;

    // 到站时间
    private OffsetDateTime finishTime;

    public trainInformation(String trainNo, String beginStation, String endStation,
                            OffsetDateTime startTime, OffsetDateTime finishTime) {
        this.trainNo = trainNo;
        this.beginStation = beginStation;
        this.endStation = endStation;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public trainInformation(String trainNo, String beginStation, String endStation,
                            String startTime, String finishTime) {
        this.trainNo = trainNo;
        this.beginStation = beginStation;
        this.endStation = endStation;
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

    public String getBeginStation() {
        return beginStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public OffsetDateTime getFinishTime() {
        return finishTime;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setBeginStation(String beginStation) {
        this.beginStation = beginStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
    }

}
