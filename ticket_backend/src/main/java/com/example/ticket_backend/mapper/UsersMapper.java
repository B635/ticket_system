package com.example.ticket_backend.mapper;

import com.example.ticket_backend.bean.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    Users searchUser(String account, String passwd);

    void addUser(@Param("users") Users users);

    Users searchUserByAccount(String account);
}
