package com.example.ticket_backend.bean;

import java.util.Map;

public class userTicket {
    public static Map<String, Integer> seatConvert = Map.of("hardSeat", 1, "softSleeper", 2, "notSeat", 0);

    private String account;
    private String trainNo;
    private int seatClass;

    public userTicket(String account, String trainNo, int seatClass) {
        this.account = account;
        this.trainNo = trainNo;
        this.seatClass = seatClass;
    }

    public userTicket(String account, String trainNo, String seatClass) {
        this.account = account;
        this.seatClass = seatConvert.get(seatClass);
        this.trainNo = trainNo;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public int getSeatClass() {
        return seatClass;
    }

    public String getAccount() {
        return account;
    }

    public void setSeatClass(int seatClass) {
        this.seatClass = seatClass;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setAccount(String account) {
        this.account = account;
    }

}
