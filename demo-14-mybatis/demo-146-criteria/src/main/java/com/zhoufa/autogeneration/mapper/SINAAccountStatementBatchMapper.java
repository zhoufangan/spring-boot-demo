package com.zhoufa.autogeneration.mapper;

import com.zhoufa.autogeneration.entity.SINAAccountStatementBatch;
import com.zhoufa.autogeneration.entity.SINAAccountStatementBatchExample;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SINAAccountStatementBatchMapper extends Serializable {
    long countByExample(SINAAccountStatementBatchExample example);

    int deleteByExample(SINAAccountStatementBatchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SINAAccountStatementBatch record);

    int insertSelective(SINAAccountStatementBatch record);

    List<SINAAccountStatementBatch> selectByExample(SINAAccountStatementBatchExample example);

    SINAAccountStatementBatch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SINAAccountStatementBatch record, @Param("example") SINAAccountStatementBatchExample example);

    int updateByExample(@Param("record") SINAAccountStatementBatch record, @Param("example") SINAAccountStatementBatchExample example);

    int updateByPrimaryKeySelective(SINAAccountStatementBatch record);

    int updateByPrimaryKey(SINAAccountStatementBatch record);
}