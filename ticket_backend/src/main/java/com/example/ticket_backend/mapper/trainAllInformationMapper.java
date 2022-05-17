package com.example.ticket_backend.mapper;

import com.example.ticket_backend.bean.trainAllInformation;

import java.util.List;

public interface trainAllInformationMapper {
    trainAllInformation searchTrain(String trainNo);

    List<trainAllInformation> searchTrainByStation(String beginStation, String endStation);

    List<trainAllInformation> showTrain();

}
