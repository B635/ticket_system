package com.example.ticket_backend.service;

import com.example.ticket_backend.bean.trainAllInformation;

import java.util.List;

public interface trainAllInformationService {

    List<trainAllInformation> showSearchResult(String beginStation, String endStation);

    trainAllInformation searchTrain(String trainNo);
}