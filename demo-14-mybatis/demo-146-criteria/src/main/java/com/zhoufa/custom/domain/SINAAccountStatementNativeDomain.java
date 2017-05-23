package com.zhoufa.custom.domain;

import com.zhoufa.custom.service.SINAAccountStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
@Service
public class SINAAccountStatementNativeDomain implements SINAAccountStatementDomain {

    @Autowired
    private SINAAccountStatementService sinaAccountStatementService;

    @Override
    public long countByExample(String startTime, String endTime) {
        return sinaAccountStatementService.countByExample(startTime, endTime);
    }
}
