package com.example.ticket_backend.bean;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class trainAllInformation {
    public static  DateTimeFormatter formatter = DateTimeFormatter
            .ofPattern("yyyy-MM-dd HH:mm");
    // 火车班次
    private String trainNo;

    // 起始站
    private String beginStation;

    // 终点站
    private String endStation;

    // 出发时间
    private String startTime;

    // 到站时间
    private String finishTime;

    // 硬座票数量
    private int hardSeat;

    // 软座票数量
    private int softSleeper;

    // 无座票数量
    private int notSeat;

    public trainAllInformation(String trainNo, String beginStation, String endStation, OffsetDateTime startTime,
                               OffsetDateTime finishTime, int hardSeat, int softSleeper, int notSeat){
        this.trainNo = trainNo;
        this.beginStation = beginStation;
        this.endStation = endStation;
        this.startTime = startTime.format(formatter);
        this.finishTime = finishTime.format(formatter);
        this.hardSeat = hardSeat;
        this.softSleeper = softSleeper;
        this.notSeat = notSeat;
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

    public String getStartTime() {
        return startTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public int getHardSeat() {
        return hardSeat;
    }

    public int getSoftSleeper() {
        return softSleeper;
    }

    public int getNotSeat() {
        return notSeat;
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
        this.startTime = startTime.format(formatter);
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime.format(formatter);
    }

    public void setHardSeat(int hardSeat) {
        this.hardSeat = hardSeat;
    }

    public void setSoftSleeper(int softSleeper) {
        this.softSleeper = softSleeper;
    }

    public void setNotSeat(int notSeat) {
        this.notSeat = notSeat;
    }
}
