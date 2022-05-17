package com.example.ticket_backend.bean;

public class Price {
    private String ticketNo;

    private int seatClass;

    private double price;

    public Price(String ticketNo, int seatClass, double price) {
        this.ticketNo = ticketNo;
        this.seatClass = seatClass;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getSeatClass() {
        return seatClass;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSeatClass(int seatClass) {
        this.seatClass = seatClass;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }
}
