package com.zhoufa.mapper;

import com.zhoufa.entity.SINAAccountStatementBatch;

import java.util.Map;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
public interface SINAAccountStatementBatchMapper {

    void insert(SINAAccountStatementBatch model);

    void modifyToSuccess(int batchNoId);

    void delAccountStatementBatchExceptCurrent(Map<String, Object> params);

    Integer queryByStatisticsDayRecently(String statisticsDay);
}
