package com.example.ticket_backend.bean;

public class seatNumber {
    // 火车班次
    private String trainNo;

    // 硬座票数量
    private int hardSeat;

    // 软座票数量
    private int softSleeper;

    // 无座票数量
    private int notSeat;

    public seatNumber(String trainNo, int hardSeat, int softSleeper, int notSeat) {
        this.trainNo = trainNo;
        this.hardSeat = hardSeat;
        this.softSleeper = softSleeper;
        this.notSeat = notSeat;
    }

    public String getTrainNo() {
        return trainNo;
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
