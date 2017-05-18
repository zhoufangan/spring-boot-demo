package com.zhoufa.domain;

import com.zhoufa.entity.SINAAccountStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/14.
 */
@Service
public class SINAAccountStatementRemoteDomain implements SINAAccountStatementDomain {

    @Autowired
    private SINAAccountStatementNativeDomain domain;

    @Override
    public List<SINAAccountStatement> queryByStatisticsDay(String statisticsTime) {
        return domain.queryByStatisticsDay(statisticsTime);
    }

    @Override
    public void downloadAndInitSINAAccountStatement(String statisticsTime) {
        domain.downloadAndInitSINAAccountStatement(statisticsTime);
    }
}
