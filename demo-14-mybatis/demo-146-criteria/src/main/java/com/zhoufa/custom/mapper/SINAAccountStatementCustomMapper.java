package com.zhoufa.custom.mapper;

import com.zhoufa.autogeneration.entity.SINAAccountStatement;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/5.
 */
public interface SINAAccountStatementCustomMapper {

    @Select({
            "<script>",
            "select * from z_SINAAccountStatement",
            "where",
            "fid in",
            "<foreach collection='list' item='item' index='index' open='(' separator=',' close=')'>",
            "#{item}",
            "</foreach>",
            "</script>"
    })
    @ResultMap("com.zhoufa.autogeneration.entity.SINAAccountStatement.BaseResultMap")
    List<SINAAccountStatement> selectByPrimaries(List<Integer> primaries);

    @Insert({
            "<script>",
            "insert into z_SINAAccountStatement",
            "(",
            "FSinaOrderNo, FMerchantOrderNo, FBusinessType, FBusinessOriginalType,",
            "FSubBusinessType, FPayerName, FPayerAccount, FGoodsName,",
            "FOrderAmount,FCounterFee, FRefundAmount, FPayeeName,",
            "FPayeeAccount,FOrderOriginalStatus, FOrderStatus, FPaySuccessTime,",
            "FOrderCreateTime, FPaymentChannel, FPaymentTerminal, FRemark,",
            "FMerchantNo, FPlatformFee, FPayerUid, FPayeeUid,",
            "FMerchantBatchNo, FTransactionBatchNo, FAccountStatementBatchNoId, FCreateTime",
            ")",
            "values",
            "<foreach collection='list' item='item' index='index' separator=','>",
            "(",
            "#{item.sinaOrderNo,jdbcType=VARCHAR},",
            "#{item.merchantOrderNo,jdbcType=VARCHAR},",
            "#{item.businessType,jdbcType=INTEGER},",
            "#{item.businessOriginalType,jdbcType=VARCHAR},",
            "#{item.subBusinessType,jdbcType=VARCHAR},",
            "#{item.payerName,jdbcType=VARCHAR},",
            "#{item.payerAccount,jdbcType=VARCHAR},",
            "#{item.goodsName,jdbcType=VARCHAR},",
            "#{item.orderAmount,jdbcType=NUMERIC},",
            "#{item.counterFee,jdbcType=NUMERIC},",
            "#{item.refundAmount,jdbcType=NUMERIC},",
            "#{item.payeeName,jdbcType=VARCHAR},",
            "#{item.payeeAccount,jdbcType=VARCHAR},",
            "#{item.orderOriginalStatus,jdbcType=VARCHAR},",
            "#{item.orderStatus,jdbcType=INTEGER},",
            "#{item.paySuccessTime,jdbcType=TIMESTAMP},",
            "#{item.orderCreateTime,jdbcType=TIMESTAMP},",
            "#{item.paymentChannel,jdbcType=VARCHAR},",
            "#{item.paymentTerminal,jdbcType=VARCHAR},",
            "#{item.remark,jdbcType=VARCHAR},",
            "#{item.merchantNo,jdbcType=VARCHAR},",
            "#{item.platformFee,jdbcType=NUMERIC},",
            "#{item.payerUid,jdbcType=VARCHAR},",
            "#{item.payeeUid,jdbcType=VARCHAR},",
            "#{item.merchantBatchNo,jdbcType=VARCHAR},",
            "#{item.transactionBatchNo,jdbcType=VARCHAR},",
            "#{item.accountStatementBatchNoId,jdbcType=INTEGER},",
            "#{item.createTime,jdbcType=TIMESTAMP}",
            ")",
            "</foreach>",
            "</script>"
    })
    void insertBatch(List<SINAAccountStatement> data);

    @Select("select * from z_SINAAccountStatement where FAccountStatementBatchNoId=#{batchId}")
    @ResultMap("com.zhoufa.autogeneration.entity.SINAAccountStatement.BaseResultMap")
    List<SINAAccountStatement> queryByBatchId(Integer batchId);
}
