package com.zhoufa.custom.service;

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
        example.createCriteria().andCreateTimeBetween(start, end);
        return autoMapper.countByExample(example);
    }

    public int deleteByExample(SINAAccountStatementExample example) {

        return 0;
    }

    public List<SINAAccountStatement> selectByExample(SINAAccountStatementExample example) {
        return null;
    }

    public int updateByExampleSelective(@Param("record") SINAAccountStatement record, @Param("example") SINAAccountStatementExample example) {
        return 0;
    }

    public int updateByExample(@Param("record") SINAAccountStatement record, @Param("example") SINAAccountStatementExample example) {
        return 0;
    }
}
