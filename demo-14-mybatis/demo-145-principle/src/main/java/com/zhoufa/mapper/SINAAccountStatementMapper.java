package com.zhoufa.mapper;

import com.zhoufa.entity.SINAAccountStatement;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
public interface SINAAccountStatementMapper {

    void insertBatch(List<SINAAccountStatement> data);

    List<SINAAccountStatement> queryByBatchId(Integer batchId);
}
