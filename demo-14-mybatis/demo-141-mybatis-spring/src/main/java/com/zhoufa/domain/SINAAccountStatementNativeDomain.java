package com.zhoufa.domain;

import com.zhoufa.entity.SINAAccountStatement;
import com.zhoufa.entity.SINAAccountStatementBatch;
import com.zhoufa.service.SINAAccountStatementBatchService;
import com.zhoufa.service.SINAAccountStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    public void downloadAndInitSINAAccountStatement(String statisticsTime) {
        // 生成批次号
        SINAAccountStatementBatch batch = sinaAccountStatementBatchService.insert(statisticsTime);

        // 解析文件成列表
        List<SINAAccountStatement> datas = new ArrayList<>();

        // 批量添加, commit一次, 有事物
        this.insertBatchAccountStatement(datas, batch);
    }

    /**
     * 批量插入新浪对账数据
     *
     * @param datas 数据
     */
    @Transactional(propagation = Propagation.REQUIRED)
    private void insertBatchAccountStatement(List<SINAAccountStatement> datas, SINAAccountStatementBatch batch) {
        if (null == datas || 0 == datas.size()) {
            return;
        }
        // 添加数据
        sinaAccountStatementService.insertBatchAccountStatement(datas);
        // 删除旧的批次号
        sinaAccountStatementBatchService.delAccountStatementBatchExceptCurrent(batch.getId(), batch.getStatisticalTime());
        // 更新批次号为成功
        sinaAccountStatementBatchService.modifyToSuccess(batch.getId());
    }
}
