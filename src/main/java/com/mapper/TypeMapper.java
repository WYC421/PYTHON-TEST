package com.mapper;

import com.entity.Type;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeMapper {

    Type getTypeTid(Integer tid);
}
