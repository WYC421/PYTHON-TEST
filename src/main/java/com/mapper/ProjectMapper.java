package com.mapper;


import com.entity.Project;
import com.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {

    Integer project(Project project);


}
