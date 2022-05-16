package com.example.ticket_backend.service.impl;

import com.example.ticket_backend.mapper.trainAllInformationMapper;
import com.example.ticket_backend.service.trainAllInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.ticket_backend.bean.trainAllInformation;

import java.util.List;

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
}
