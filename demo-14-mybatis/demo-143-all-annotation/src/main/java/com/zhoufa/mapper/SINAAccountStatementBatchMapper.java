package com.zhoufa.mapper;

import com.zhoufa.entity.SINAAccountStatementBatch;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
public interface SINAAccountStatementBatchMapper {

    void insert(SINAAccountStatementBatch model);

    void modifyToSuccess(int batchNoId);

    void delAccountStatementBatchExceptCurrent(Map<String, Object> params);

    @Select(
            "select top 1 fid from z_sinaaccountstatementbatch where fstatisticaltime = #{fstatisticaltime} and fisdelete = 0 and fstatus = 10 order by fid desc"
    )
    @ResultType(Integer.class)
    Integer queryByStatisticsDayRecently(String statisticsDay);
}
