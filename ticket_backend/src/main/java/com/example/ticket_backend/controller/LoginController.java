package com.example.ticket_backend.controller;

import com.example.ticket_backend.bean.Users;
import com.example.ticket_backend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
public class LoginController {
    @Autowired
    UsersService usersService;

    @ResponseBody
    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(
            @RequestBody Map<String, String> body
    ) {

        Users user = usersService.loginIn(body.get("account"), body.get("password"));
        if (user == null) {
            return "AccountMissed";
        } else {
            return String.valueOf(user.getAdmin());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/searchUser/{account}", method = RequestMethod.POST)
    public String verifyUser(
            @PathVariable String account
    ) {
        Users user = usersService.searchUser(account);
        if (user == null) {
            return "AccountMissed";
        } else {
            return String.valueOf(user.getAdmin());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/addUser/{account}", method = RequestMethod.POST)
    public void addUser(
            @PathVariable String account,
            @RequestBody Map<String, String> body
    ) {
        Users result = new Users(account, body.get("password"));
        usersService.addUser(result);
    }
}
