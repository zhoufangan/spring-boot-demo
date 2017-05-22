package com.zhoufa.custom.service;

import com.zhoufa.autogeneration.entity.SINAAccountStatement;
import com.zhoufa.autogeneration.mapper.SINAAccountStatementMapper;
import com.zhoufa.custom.mapper.SINAAccountStatementCustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
@SuppressWarnings("ALL")
@Service
public class SINAAccountStatementService {

    @Autowired
    private SINAAccountStatementMapper autoMapper;
    @Autowired
    private SINAAccountStatementCustomMapper customMapper;

    public SINAAccountStatement selectByPrimary(int id) {
        return autoMapper.selectByPrimaryKey(id);
    }

    public List<SINAAccountStatement> selectByPrimaries(List<Integer> primaries) {
        return customMapper.selectByPrimaries(primaries);
    }

    public void insertBatch(List<SINAAccountStatement> data) {
        customMapper.insertBatch(data);
    }

    public List<SINAAccountStatement> queryByBatchId(Integer batchId) {
        if (null == batchId) {
            return new ArrayList<>();
        }
        return customMapper.queryByBatchId(batchId);
    }
}
