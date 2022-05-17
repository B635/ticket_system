package com.example.ticket_backend.controller;

import com.example.ticket_backend.bean.trainAllInformation;
import com.example.ticket_backend.service.trainAllInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ticketController {
    @Autowired
    trainAllInformationService trainService;

    @ResponseBody
    @RequestMapping(value = "/searchTrain", method = RequestMethod.POST)
    public List<trainAllInformation> searchTrain(
            @RequestBody Map<String, String> body
    ) {
        return trainService.showSearchResult(body.get("beginStation"), body.get("endStation"));
    }

    @ResponseBody
    @RequestMapping(value = "/showTrain", method = RequestMethod.GET)
    public List<trainAllInformation> showTrain() {
        return trainService.showTrain();
    }
}
