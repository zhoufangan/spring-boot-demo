package com.zhoufa.custom.domain;

import com.zhoufa.autogeneration.entity.SINAAccountStatement;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 *         Criteria查询
 */
public interface SINAAccountStatementDomain {

    long countByExample(String startTime, String endTime);

    List<SINAAccountStatement> selectByExample(String startTime, String endTime);

}
