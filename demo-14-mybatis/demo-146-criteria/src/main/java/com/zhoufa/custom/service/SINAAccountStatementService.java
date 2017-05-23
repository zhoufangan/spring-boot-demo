package com.zhoufa.custom.service;

import com.google.common.collect.Lists;
import com.zhoufa.autogeneration.entity.SINAAccountStatement;
import com.zhoufa.autogeneration.entity.SINAAccountStatementExample;
import com.zhoufa.autogeneration.mapper.SINAAccountStatementMapper;
import com.zhoufa.custom.mapper.SINAAccountStatementCustomMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
@SuppressWarnings("ALL")
@Service
public class SINAAccountStatementService {

    @Autowired
    private SINAAccountStatementMapper autoMapper;
    @Autowired
    private SINAAccountStatementCustomMapper customMapper;

    public long countByExample(String startTime, String endTime) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        Date start = null;
        Date end = null;

        try {
            start = fmt.parse(startTime);
            end = fmt.parse(endTime);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        SINAAccountStatementExample example = new SINAAccountStatementExample();
        example.setOrderByClause("FID desc");
        example.setDistinct(true);
        example.createCriteria().andCreateTimeBetween(start, end)
                .andIsDeleteEqualTo(false)
                .andPayerNameLike("%客户%")
                .andBusinessTypeIn(Lists.newArrayList(1, 20))
                .andOrderStatusEqualTo(1);
        return autoMapper.countByExample(example);
    }

    public List<SINAAccountStatement> selectByExample(String startTime, String endTime) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        Date start = null;
        Date end = null;

        try {
            start = fmt.parse(startTime);
            end = fmt.parse(endTime);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        SINAAccountStatementExample example = new SINAAccountStatementExample();
        example.setOrderByClause("FID desc");
        example.createCriteria()
                .andCreateTimeBetween(start, end)
                .andIsDeleteEqualTo(false)
                .andPayerNameLike("%客户%")
                .andBusinessTypeIn(Lists.newArrayList(1, 20))
                .andOrderStatusEqualTo(1);

        return autoMapper.selectByExample(example);
    }

    public int updateByExampleSelective(@Param("record") SINAAccountStatement record, @Param("example") SINAAccountStatementExample example) {
        return 0;
    }

    public int updateByExample(@Param("record") SINAAccountStatement record, @Param("example") SINAAccountStatementExample example) {
        return 0;
    }
}
