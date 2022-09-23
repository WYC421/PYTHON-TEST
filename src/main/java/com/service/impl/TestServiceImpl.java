package com.service.impl;


import com.entity.TestU;
import com.mapper.TestMapper;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
  private TestService testService;
  private TestMapper testMapper;
  private TestU testU;
    /**
     * 模拟用户登录
     *
     * @param name 用户名
     * @param pwd  密码
     * @return 1001 登录成功  1002 账号或者密码错误  1003 账号不存在
     */
    @Override
    public Integer userLogin(String name, String pwd) {
        int code = 1003;
        if ("admin".equals(name) && "123456".equals(pwd)) {
            code = 1001;
        } else {
            code = 1002;
        }
        return code;


    }

    @Override
    public Integer userRes(TestU testU) {
        return this.testMapper.userInsert(testU);
    }
  public  List<TestU> getAllUser(){
        return this.testMapper.getAllUser();
  };

}
