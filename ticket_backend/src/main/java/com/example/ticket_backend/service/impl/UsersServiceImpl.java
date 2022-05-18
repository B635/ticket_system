package com.example.ticket_backend.service.impl;

import com.example.ticket_backend.bean.Users;
import com.example.ticket_backend.mapper.UsersMapper;
import com.example.ticket_backend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;

    @Override
    public Users loginIn(String account, String passwd) {
        return usersMapper.searchUser(account, passwd);
    }

    @Override
    public void addUser(Users users) {
        usersMapper.addUser(users);
    }

    @Override
    public Users searchUser(String account) {
        return usersMapper.searchUserByAccount(account);
    }
}
