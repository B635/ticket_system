package com.example.ticket_backend.controller;


import com.example.ticket_backend.service.priceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

import static com.example.ticket_backend.bean.Price.seatConvert;

@Controller
public class priceController {
    @Autowired
    priceService priceService;

    @ResponseBody
    @RequestMapping(value = "/searchPrice", method = RequestMethod.POST)
    public double searchPrice(
            @RequestBody Map<String, String> body
    ) {
        return priceService.seatPrice(body.get("trainNo"), seatConvert.get(body.get("seatClass")));
    }

}
