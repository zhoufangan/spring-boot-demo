package com.zhoufa.custom.mapper;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
public interface SINAAccountStatementBatchCustomMapper {

    @Select("select top 1 fid from z_sinaaccountstatementbatch where fstatisticaltime = #{fstatisticaltime} and fisdelete = 0 and fstatus = 10 order by fid desc")
    @ResultType(Integer.class)
    Integer queryByStatisticsDayRecently(String statisticsDay);
}
