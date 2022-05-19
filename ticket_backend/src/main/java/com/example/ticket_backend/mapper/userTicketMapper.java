package com.example.ticket_backend.mapper;

import com.example.ticket_backend.bean.ticket;
import com.example.ticket_backend.bean.userTicket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userTicketMapper {
    List<ticket> searchTicket(String account);
    void addTicket(@Param("userTicket") userTicket userTicket);

    void deleteTicket(String account, String trainNo);
}
