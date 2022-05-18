package com.example.ticket_backend.service.impl;

import com.example.ticket_backend.mapper.priceMapper;
import com.example.ticket_backend.service.priceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class priceServicImpl implements priceService {
    @Autowired
    priceMapper priceMapper;

    @Override
    public double seatPrice(String trainNo, int seatClass) {
        return priceMapper.searchPrice(trainNo, seatClass);
    }
}
