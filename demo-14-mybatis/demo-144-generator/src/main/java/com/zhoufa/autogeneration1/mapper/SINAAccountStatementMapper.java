package com.zhoufa.autogeneration1.mapper;

import com.zhoufa.autogeneration1.entity.SINAAccountStatement;

public interface SINAAccountStatementMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(SINAAccountStatement record);

    int insertSelective(SINAAccountStatement record);

    SINAAccountStatement selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(SINAAccountStatement record);

    int updateByPrimaryKey(SINAAccountStatement record);
}