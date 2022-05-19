package com.example.ticket_backend.bean;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ticket {
    public static DateTimeFormatter formatter = DateTimeFormatter
            .ofPattern("yyyy-MM-dd HH:mm");
    public static Map<Integer, String> seatConvert = Map.of(1, "硬座", 2, "软卧" , 0, "无座");

    private String trainNo;

    private String seatClass;

    private String beginStation;

    // 终点站
    private String endStation;

    // 出发时间
    private String startTime;

    // 到站时间
    private String finishTime;


    public ticket(String trainNo, int seatClass,String beginStation, String endStation, OffsetDateTime startTime,
                               OffsetDateTime finishTime){
        this.trainNo = trainNo;
        this.beginStation = beginStation;
        this.endStation = endStation;
        this.startTime = startTime.format(formatter);
        this.finishTime = finishTime.format(formatter);
        this.seatClass = seatConvert.get(seatClass);
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setSeatClass(int seatClass) {
        this.seatClass = seatConvert.get(seatClass);
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public void setBeginStation(String beginStation) {
        this.beginStation = beginStation;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public String getEndStation() {
        return endStation;
    }

    public String getBeginStation() {
        return beginStation;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public String getStartTime() {
        return startTime;
    }

}
