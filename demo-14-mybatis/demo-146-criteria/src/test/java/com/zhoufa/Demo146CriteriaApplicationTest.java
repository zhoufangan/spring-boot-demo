package com.zhoufa;

import com.google.common.base.Joiner;
import com.zhoufa.autogeneration.entity.SINAAccountStatement;
import com.zhoufa.custom.domain.SINAAccountStatementDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo146CriteriaApplicationTest {
    private static Logger log = LoggerFactory.getLogger(Demo146CriteriaApplicationTest.class);

    @Autowired
    private SINAAccountStatementDomain domain;

    @Test
    public void testCountByExample() {
        String startTime = "20170509";
        String endTime = "20170520";
        long count = domain.countByExample(startTime, endTime);
        log.info("数据总数=" + count);
    }

    @Test
    public void testSelectByExample() {
        String startTime = "20170509";
        String endTime = "20170520";
        List<SINAAccountStatement> datas = domain.selectByExample(startTime, endTime);

        List<String> merchantNos = new ArrayList<>(datas.size());
        for (SINAAccountStatement data : datas) {
            merchantNos.add(data.getMerchantNo());
        }
        String ret = Joiner.on(";").skipNulls().join(merchantNos);
        log.info("商户号列表=" + ret);
    }
}
