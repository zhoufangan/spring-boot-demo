package com.zhoufa.domain;

import com.zhoufa.entity.SINAAccountStatement;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 *         新浪对账Domain
 */
public interface SINAAccountStatementDomain {

    /**
     * 初始化新浪对账单表
     * 可为空默认,上一天
     *
     * @param statisticsTime 新浪交易时间段
     */
    void downloadAndInitSINAAccountStatement(String statisticsTime);

    /**
     * 查询某天, 最后一个批次号的对账数据
     * 可为空默认,上一天
     *
     * @param statisticsTime 时间格式yyyyMMdd
     * @return 新浪对账单列表
     */
    List<SINAAccountStatement> queryByStatisticsDay(String statisticsTime);

}
