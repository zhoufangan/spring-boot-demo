package com.zhoufa.custom.domain;

/**
 * @author Created by zhoufangan on 2017/5/5.
 *         新浪对账Domain
 */
public interface SINAAccountStatementDomain {

    long countByExample(String startTime, String endTime);

}
