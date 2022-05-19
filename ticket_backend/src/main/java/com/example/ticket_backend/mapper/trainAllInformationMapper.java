package com.example.ticket_backend.mapper;

import com.example.ticket_backend.bean.ticketChange;
import com.example.ticket_backend.bean.trainAllInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface trainAllInformationMapper {
    trainAllInformation searchTrain(String trainNo);

    List<trainAllInformation> searchTrainByStation(String beginStation, String endStation);

    List<trainAllInformation> showTrain();

    void changeTicket(@Param("ticket")ticketChange ticketChange);

    void deleteTrain(String trainNo);
}
