package com.example.ticket_backend.mapper;

import com.example.ticket_backend.bean.userTicket;
import org.apache.ibatis.annotations.Param;

public interface userTicketMapper {

    void addTicket(@Param("userTicket") userTicket userTicket);

}
