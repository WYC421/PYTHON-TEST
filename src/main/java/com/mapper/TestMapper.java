package com.mapper;

import com.entity.Project;
import com.entity.TestU;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestU>getAllUser();

    Integer userInsert(TestU testU);

    List<Project>getProList();

}
