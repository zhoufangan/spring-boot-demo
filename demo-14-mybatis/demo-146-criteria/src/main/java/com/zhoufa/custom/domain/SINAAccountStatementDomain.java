package com.zhoufa.custom.domain;

import com.zhoufa.autogeneration.entity.SINAAccountStatement;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 *         新浪对账Domain
 */
public interface SINAAccountStatementDomain {

    /**
     * 查询某天, 最后一个批次号的对账数据
     * 可为空默认,上一天
     *
     * @param statisticsTime 时间格式yyyyMMdd
     * @return 新浪对账单列表
     */
    List<SINAAccountStatement> queryByStatisticsDay(String statisticsTime);

    List<SINAAccountStatement> selectByPrimaries(List<Integer> primaries);

}
