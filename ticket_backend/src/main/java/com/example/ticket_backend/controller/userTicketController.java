package com.example.ticket_backend.controller;

import com.example.ticket_backend.bean.ticket;
import com.example.ticket_backend.bean.trainAllInformation;
import com.example.ticket_backend.bean.userTicket;
import com.example.ticket_backend.service.userTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class userTicketController {
    @Autowired
    userTicketService userTicketService;

    @ResponseBody
    @RequestMapping(value = "/addTicket", method = RequestMethod.POST)
    public void addTicket(
            @RequestBody Map<String, String> body
    ) {
        userTicket result = new userTicket(body.get("account"), body.get("trainNo"), body.get("seatClass"));
        userTicketService.addTicket(result);
    }

    @ResponseBody
    @RequestMapping(value = "/searchTicket", method = RequestMethod.POST)
    public List<ticket> searchTicket(
            @RequestBody Map<String, String> body
    ) {
        return userTicketService.showTicket(body.get("account"));
    }
}
