package com.service;

import com.entity.UserInfo;

public interface UserService {
    UserInfo login(String name, String pwd);
}
