package com.mapper;

import com.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    List<UserInfo> getAllUser();

    Integer register(UserInfo userInfo);

    Integer UserDelect(UserInfo userInfo);

    Integer UserUpdate(UserInfo userInfo);

    UserInfo login(@Param("name") String name, @Param("pwd") String pwd);
}
