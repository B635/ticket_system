package com.example.ticket_backend.service.impl;

import com.example.ticket_backend.bean.seatNumber;
import com.example.ticket_backend.bean.ticketChange;
import com.example.ticket_backend.bean.trainInformation;
import com.example.ticket_backend.mapper.trainAllInformationMapper;
import com.example.ticket_backend.service.trainAllInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.ticket_backend.bean.trainAllInformation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class trainAllInformationServiceImpl implements trainAllInformationService {
    @Autowired
    trainAllInformationMapper trainAllInformationMapper;

    @Override
    public List<trainAllInformation> showSearchResult(String beginStation, String endStation) {
        return trainAllInformationMapper.searchTrainByStation(beginStation, endStation);
    }

    @Override
    public trainAllInformation searchTrain(String trainNo) {
        return trainAllInformationMapper.searchTrain(trainNo);
    }

    @Override
    public List<trainAllInformation> showTrain() {
        return trainAllInformationMapper.showTrain();
    }

    @Override
    public void changeTicket(ticketChange ticketChange) {
        trainAllInformationMapper.changeTicket(ticketChange);
    }

    @Override
    public void deleteTrain(String trainNo) {
        trainAllInformationMapper.deleteTrain(trainNo);
    }

    @Override
    public void addTrain(seatNumber seatNumber, trainInformation trainInformation) {
        trainAllInformationMapper.addTrain(trainInformation);
        trainAllInformationMapper.addTrainSeat(seatNumber);
    }
}
