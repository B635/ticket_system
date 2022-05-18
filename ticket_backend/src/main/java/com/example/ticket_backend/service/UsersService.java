package com.example.ticket_backend.service;

import com.example.ticket_backend.bean.Users;

public interface UsersService {
    Users loginIn(String account, String passwd);

    void addUser(Users users);

    Users searchUser(String account);
}
