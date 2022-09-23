package com.service;

import com.entity.UserInfo;

import java.util.List;

public interface  UserInfoService {

    List<UserInfo> getAllUser();

    Integer register(UserInfo userInfo);

    Integer UserDel(UserInfo userInfo);

    Integer UserUpd(UserInfo userInfo);
}
