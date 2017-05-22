package com.zhoufa;

import com.zhoufa.autogeneration.entity.SINAAccountStatement;
import com.zhoufa.custom.domain.SINAAccountStatementDomain;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo146CriteriaApplicationTest {

    @Autowired
    private SINAAccountStatementDomain domain;

    @Test
    public void testqQueryByStatisticsDay() {
        String statisticsTime = "20170509";
        List<SINAAccountStatement> datas = domain.queryByStatisticsDay(statisticsTime);
        for (SINAAccountStatement data : datas) {
            System.out.println(data.getBusinessOriginalType());
        }
    }

    @Test
    public void testSelectByPrimaries() {
        List<Integer> primaries = Lists.newArrayList(289, 290, 291);
        List<SINAAccountStatement> datas = domain.selectByPrimaries(primaries);
        for (SINAAccountStatement data : datas) {
            System.out.println(data.getBusinessOriginalType());
        }
    }
}
