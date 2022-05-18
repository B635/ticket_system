package com.example.ticket_backend.service.impl;

import com.example.ticket_backend.bean.userTicket;
import com.example.ticket_backend.mapper.userTicketMapper;
import com.example.ticket_backend.service.userTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userTicketServiceImpl implements userTicketService {
    @Autowired
    userTicketMapper userTicketMapper;

    @Override
    public void addTicket(userTicket userTicket) {
        userTicketMapper.addTicket(userTicket);
    }
}
