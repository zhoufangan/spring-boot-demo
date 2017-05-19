package com.zhoufa.service;

import com.zhoufa.mapper.SINAAccountStatementMapper;
import com.zhoufa.entity.SINAAccountStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
@Service
public class SINAAccountStatementService {

    @SuppressWarnings("ALL")
    @Autowired
    private SINAAccountStatementMapper mapper;

    public void insertBatchAccountStatement(List<SINAAccountStatement> data) {
        mapper.insertBatch(data);
    }

    public List<SINAAccountStatement> queryByBatchId(Integer batchId) {
        if (null == batchId) {
            return new ArrayList<>();
        }
        return mapper.queryByBatchId(batchId);
    }
}
