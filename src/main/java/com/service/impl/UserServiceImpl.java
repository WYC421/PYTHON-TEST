package com.service.impl;


import com.entity.UserInfo;
import com.mapper.UserInfoMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo login(String name, String pwd) {
        return userInfoMapper.login(name,pwd);
    }
}
