package com.zhoufa.custom.domain;

import com.zhoufa.autogeneration.entity.SINAAccountStatement;
import com.zhoufa.custom.service.SINAAccountStatementBatchService;
import com.zhoufa.custom.service.SINAAccountStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
@Service
public class SINAAccountStatementNativeDomain implements SINAAccountStatementDomain {

    @Autowired
    private SINAAccountStatementService sinaAccountStatementService;
    @Autowired
    private SINAAccountStatementBatchService sinaAccountStatementBatchService;

    @Override
    public List<SINAAccountStatement> queryByStatisticsDay(String statisticsTime) {
        // 查询这一天最后的统计成功的批次号
        Integer batchId = sinaAccountStatementBatchService.queryByStatisticsDayRecently(statisticsTime);
        // 查询对账单列表
        return sinaAccountStatementService.queryByBatchId(batchId);
    }

    @Override
    public List<SINAAccountStatement> selectByPrimaries(List<Integer> primaries) {
        return sinaAccountStatementService.selectByPrimaries(primaries);
    }
}
