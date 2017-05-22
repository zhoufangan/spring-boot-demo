package com.zhoufa.mapper;

import com.zhoufa.entity.SINAAccountStatement;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
public interface SINAAccountStatementMapper {

    @Select("select * from z_SINAAccountStatement where fid=#{id}")
    @ResultMap("com.zhoufa.mapper.SINAAccountStatementMapper.BaseResultMap")
    SINAAccountStatement selectByPrimary(int id);

    void insertBatch(List<SINAAccountStatement> data);

    @Select("select * from z_SINAAccountStatement where FAccountStatementBatchNoId=#{batchId}")
    @ResultMap("com.zhoufa.mapper.SINAAccountStatementMapper.BaseResultMap")
    List<SINAAccountStatement> queryByBatchId(Integer batchId);
}
