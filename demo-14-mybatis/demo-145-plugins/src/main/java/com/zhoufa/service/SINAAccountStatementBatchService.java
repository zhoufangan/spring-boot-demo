package com.zhoufa.service;

import com.zhoufa.entity.SINAAccountStatementBatch;
import com.zhoufa.mapper.SINAAccountStatementBatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by zhoufangan on 2017/5/11.
 */
@Service
public class SINAAccountStatementBatchService {

    @SuppressWarnings("ALL")
    @Autowired
    private SINAAccountStatementBatchMapper mapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public SINAAccountStatementBatch insert(String statisticalTime) {
        SINAAccountStatementBatch model = new SINAAccountStatementBatch();
        model.setStatisticalTime(statisticalTime);// 统计时间

        mapper.insert(model);
        if (null == model.getId()) {
            throw new RuntimeException("批次号生成失败,统计时间[" + statisticalTime + "]");
        }
        return model;
    }

    public void modifyToSuccess(int batchNoId) {
        mapper.modifyToSuccess(batchNoId);
    }

    public Integer queryByStatisticsDayRecently(String statisticsDay) {
        return mapper.queryByStatisticsDayRecently(statisticsDay);
    }

    public void delAccountStatementBatchExceptCurrent(Integer batchId, String statisticalTime) {
        Map<String, Object> params = new HashMap<>();
        params.put("batchId", batchId);
        params.put("statisticalTime", statisticalTime);
        mapper.delAccountStatementBatchExceptCurrent(params);
    }
}
