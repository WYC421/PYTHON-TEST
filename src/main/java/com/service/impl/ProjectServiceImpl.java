package com.service.impl;


import com.entity.Project;
import com.entity.UserInfo;
import com.mapper.ProjectMapper;
import com.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.ProjectService;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;



    @Override
    public Integer project(Project project) {
        int code = 1002;
        //数据库设置唯一约束 如果用户名存在 则会抛出异常
        try {
            int pro = this.projectMapper.project(project);
            if (pro > 0) {
                code = 1001;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return code;
        }
        return code;
    }



}
