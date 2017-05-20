package com.zhoufa.mapper2;

import com.zhoufa.entity2.SINAAccountStatement;
import java.io.Serializable;
import java.util.List;

public interface SINAAccountStatementMapper extends Serializable {
    int deleteByPrimaryKey(Integer id);

    int insert(SINAAccountStatement record);

    SINAAccountStatement selectByPrimaryKey(Integer id);

    List<SINAAccountStatement> selectAll();

    int updateByPrimaryKey(SINAAccountStatement record);
}