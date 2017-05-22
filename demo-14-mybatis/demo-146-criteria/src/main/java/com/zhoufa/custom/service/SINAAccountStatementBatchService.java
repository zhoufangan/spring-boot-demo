package com.zhoufa.custom.service;

import com.zhoufa.autogeneration.entity.SINAAccountStatementBatch;
import com.zhoufa.autogeneration.mapper.SINAAccountStatementBatchMapper;
import com.zhoufa.custom.mapper.SINAAccountStatementBatchCustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Created by zhoufangan on 2017/5/11.
 */
@SuppressWarnings("ALL")
@Service
public class SINAAccountStatementBatchService {

    @Autowired
    private SINAAccountStatementBatchMapper autoMapper;
    @Autowired
    private SINAAccountStatementBatchCustomMapper customMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public SINAAccountStatementBatch insert(String statisticalTime) {
        SINAAccountStatementBatch model = new SINAAccountStatementBatch();
        model.setStatisticalTime(statisticalTime);// 统计时间

        autoMapper.insert(model);
        if (null == model.getId()) {
            throw new RuntimeException("批次号生成失败,统计时间[" + statisticalTime + "]");
        }
        return model;
    }

    public Integer queryByStatisticsDayRecently(String statisticsDay) {
        return customMapper.queryByStatisticsDayRecently(statisticsDay);
    }
}
