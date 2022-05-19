package com.example.ticket_backend.service;

import com.example.ticket_backend.bean.ticket;
import com.example.ticket_backend.bean.userTicket;

import java.util.List;

public interface userTicketService {
    void addTicket(userTicket userTicket);

    List<ticket> showTicket(String account);
}
