package com.example.ticket_backend.service.impl;

import com.example.ticket_backend.bean.userTicket;
import com.example.ticket_backend.mapper.userTicketMapper;
import com.example.ticket_backend.service.userTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ticket_backend.bean.ticket;

import java.util.List;

@Service
public class userTicketServiceImpl implements userTicketService {
    @Autowired
    userTicketMapper userTicketMapper;

    @Override
    public void addTicket(userTicket userTicket) {
        userTicketMapper.addTicket(userTicket);
    }

    @Override
    public List<ticket> showTicket(String account) {
        return userTicketMapper.searchTicket(account);
    }

    @Override
    public void deleteTicket(String account, String trainNo) {
        userTicketMapper.deleteTicket(account, trainNo);
    }
}
