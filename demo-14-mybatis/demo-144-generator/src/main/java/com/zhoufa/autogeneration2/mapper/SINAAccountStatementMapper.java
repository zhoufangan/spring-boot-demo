package com.zhoufa.autogeneration2.mapper;

import com.zhoufa.autogeneration2.entity.SINAAccountStatement;
import java.io.Serializable;
import java.util.List;

public interface SINAAccountStatementMapper extends Serializable {
    int deleteByPrimaryKey(Integer id);

    int insert(SINAAccountStatement record);

    SINAAccountStatement selectByPrimaryKey(Integer id);

    List<SINAAccountStatement> selectAll();

    int updateByPrimaryKey(SINAAccountStatement record);
}