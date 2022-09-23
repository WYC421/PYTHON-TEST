package com.service;

import com.entity.TestU;

import java.util.List;

public interface TestService {
    /**
     * 模拟用户登录
     * @param name 用户名
     * @param pwd 密码
     * @return 1001 登录成功  1002 账号或者密码错误  1003 账号不存在
     */
    Integer userLogin(String name,String pwd);


    List<TestU> getAllUser();

    Integer userRes(TestU testU);


    /*List<Project> getProList();*/
}
