package com.service.impl;

import com.entity.UserInfo;
import com.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.UserInfoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> getAllUser() {
//        List<UserInfo> userInfoList =new ArrayList<>();
//        Map<String, Object> map = new HashMap<>();
//        try{
//            userInfoList = this.userInfoMapper.getAllUser();
//            if(userInfoList != null){
//                map.put("userInfoList",userInfoList);
//         -       map.put("code",1001);
//                map.put("msg","查询到数据");
//            }else{
//                map.put("code",1002);
//                map.put("msg","未查询到数据");
//            }
//        }catch (Exception e){
//            map.put("code",1004);
//            map.put("msg","请联系管理员");
//            e.printStackTrace();
//        }
//        return userInfoList;
//    }
        return this.userInfoMapper.getAllUser();

    }


    /**
     * @param userInfo 用户实例
     * @return 1001 注册成功  ， 1002 用户已存在  1003 注册失败
     */
@Override
    public Integer register(UserInfo userInfo) {
    int code = 1002;
    //数据库设置唯一约束 如果用户名存在 则会抛出异常
    try {
        int reg = this.userInfoMapper.register(userInfo);
        if (reg > 0) {
            code = 1001;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return code;
    }
    return code;
}

    @Override
    public Integer UserDel(UserInfo userInfo) {
        int code = 1002;
        //数据库设置唯一约束 如果用户名存在 则会抛出异常
        try {
            int del = this.userInfoMapper.UserDelect(userInfo);
            if (del > 0) {
                code = 1001;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return code;
        }
        return code;
    }

@Override
    public Integer UserUpd(UserInfo userInfo) {
        int code = 1002;
        //数据库设置唯一约束 如果用户名存在 则会抛出异常
        try {
            int Upd = this.userInfoMapper.UserUpdate(userInfo);
            if (Upd > 0) {
                code = 1001;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return code;
        }
        return code;
    }

}
