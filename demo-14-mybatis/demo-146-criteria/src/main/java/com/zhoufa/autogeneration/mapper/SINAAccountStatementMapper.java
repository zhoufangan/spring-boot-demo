package com.zhoufa.autogeneration.mapper;

import com.zhoufa.autogeneration.entity.SINAAccountStatement;
import com.zhoufa.autogeneration.entity.SINAAccountStatementExample;
import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SINAAccountStatementMapper extends Serializable {
    long countByExample(SINAAccountStatementExample example);

    int deleteByExample(SINAAccountStatementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SINAAccountStatement record);

    int insertSelective(SINAAccountStatement record);

    List<SINAAccountStatement> selectByExample(SINAAccountStatementExample example);

    SINAAccountStatement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SINAAccountStatement record, @Param("example") SINAAccountStatementExample example);

    int updateByExample(@Param("record") SINAAccountStatement record, @Param("example") SINAAccountStatementExample example);

    int updateByPrimaryKeySelective(SINAAccountStatement record);

    int updateByPrimaryKey(SINAAccountStatement record);
}