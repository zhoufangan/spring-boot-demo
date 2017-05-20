package com.zhoufa.mapper1;

import com.zhoufa.entity1.SINAAccountStatement;

public interface SINAAccountStatementMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(SINAAccountStatement record);

    int insertSelective(SINAAccountStatement record);

    SINAAccountStatement selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(SINAAccountStatement record);

    int updateByPrimaryKey(SINAAccountStatement record);
}