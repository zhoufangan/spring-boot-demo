package com.zhoufa;

import com.zhoufa.domain.SINAAccountStatementRemoteDomain;
import com.zhoufa.entity.SINAAccountStatement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo141MybatisSpringApplicationTest {
    @Autowired
    private SINAAccountStatementRemoteDomain domain;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testqQueryByStatisticsDay() {
        String statisticsTime = "20170509";
        List<SINAAccountStatement> datas = domain.queryByStatisticsDay(statisticsTime);
        for (SINAAccountStatement data : datas) {
            System.out.println(data.getBusinessOriginalType());
        }
    }
}
