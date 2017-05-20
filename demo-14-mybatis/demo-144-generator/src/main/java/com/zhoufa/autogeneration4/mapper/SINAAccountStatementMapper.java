package com.zhoufa.autogeneration4.mapper;

import com.zhoufa.autogeneration4.entity.SINAAccountStatement;
import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface SINAAccountStatementMapper extends Serializable {
    @Delete({
        "delete from z_SINAAccountStatement",
        "where FID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into z_SINAAccountStatement (FID, FSinaOrderNo, ",
        "FMerchantOrderNo, FBusinessOriginalType, ",
        "FBusinessType, FSubBusinessType, ",
        "FPayerName, FPayerAccount, ",
        "FGoodsName, FOrderAmount, ",
        "FCounterFee, FRefundAmount, ",
        "FPayeeName, FPayeeAccount, ",
        "FOrderOriginalStatus, FOrderStatus, ",
        "FPaySuccessTime, FOrderCreateTime, ",
        "FPaymentChannel, FPaymentTerminal, ",
        "FRemark, FMerchantNo, ",
        "FPlatformFee, FPayerUid, ",
        "FPayeeUid, FMerchantBatchNo, ",
        "FTransactionBatchNo, FAccountStatementBatchNoId, ",
        "FCreateTime, FIsDelete)",
        "values (#{id,jdbcType=INTEGER}, #{sinaOrderNo,jdbcType=VARCHAR}, ",
        "#{merchantOrderNo,jdbcType=VARCHAR}, #{businessOriginalType,jdbcType=VARCHAR}, ",
        "#{businessType,jdbcType=INTEGER}, #{subBusinessType,jdbcType=VARCHAR}, ",
        "#{payerName,jdbcType=VARCHAR}, #{payerAccount,jdbcType=VARCHAR}, ",
        "#{goodsName,jdbcType=VARCHAR}, #{orderAmount,jdbcType=NUMERIC}, ",
        "#{counterFee,jdbcType=NUMERIC}, #{refundAmount,jdbcType=NUMERIC}, ",
        "#{payeeName,jdbcType=VARCHAR}, #{payeeAccount,jdbcType=VARCHAR}, ",
        "#{orderOriginalStatus,jdbcType=VARCHAR}, #{orderStatus,jdbcType=INTEGER}, ",
        "#{paySuccessTime,jdbcType=TIMESTAMP}, #{orderCreateTime,jdbcType=TIMESTAMP}, ",
        "#{paymentChannel,jdbcType=VARCHAR}, #{paymentTerminal,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{merchantNo,jdbcType=VARCHAR}, ",
        "#{platformFee,jdbcType=NUMERIC}, #{payerUid,jdbcType=VARCHAR}, ",
        "#{payeeUid,jdbcType=VARCHAR}, #{merchantBatchNo,jdbcType=VARCHAR}, ",
        "#{transactionBatchNo,jdbcType=VARCHAR}, #{accountStatementBatchNoId,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{isDelete,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="id", before=true, resultType=Integer.class)
    int insert(SINAAccountStatement record);

    @Select({
        "select",
        "FID, FSinaOrderNo, FMerchantOrderNo, FBusinessOriginalType, FBusinessType, FSubBusinessType, ",
        "FPayerName, FPayerAccount, FGoodsName, FOrderAmount, FCounterFee, FRefundAmount, ",
        "FPayeeName, FPayeeAccount, FOrderOriginalStatus, FOrderStatus, FPaySuccessTime, ",
        "FOrderCreateTime, FPaymentChannel, FPaymentTerminal, FRemark, FMerchantNo, FPlatformFee, ",
        "FPayerUid, FPayeeUid, FMerchantBatchNo, FTransactionBatchNo, FAccountStatementBatchNoId, ",
        "FCreateTime, FIsDelete",
        "from z_SINAAccountStatement",
        "where FID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="FID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FSinaOrderNo", property="sinaOrderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FMerchantOrderNo", property="merchantOrderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FBusinessOriginalType", property="businessOriginalType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FBusinessType", property="businessType", jdbcType=JdbcType.INTEGER),
        @Result(column="FSubBusinessType", property="subBusinessType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayerName", property="payerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayerAccount", property="payerAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="FGoodsName", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOrderAmount", property="orderAmount", jdbcType=JdbcType.NUMERIC),
        @Result(column="FCounterFee", property="counterFee", jdbcType=JdbcType.NUMERIC),
        @Result(column="FRefundAmount", property="refundAmount", jdbcType=JdbcType.NUMERIC),
        @Result(column="FPayeeName", property="payeeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayeeAccount", property="payeeAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOrderOriginalStatus", property="orderOriginalStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOrderStatus", property="orderStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="FPaySuccessTime", property="paySuccessTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FOrderCreateTime", property="orderCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FPaymentChannel", property="paymentChannel", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPaymentTerminal", property="paymentTerminal", jdbcType=JdbcType.VARCHAR),
        @Result(column="FRemark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="FMerchantNo", property="merchantNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPlatformFee", property="platformFee", jdbcType=JdbcType.NUMERIC),
        @Result(column="FPayerUid", property="payerUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayeeUid", property="payeeUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="FMerchantBatchNo", property="merchantBatchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FTransactionBatchNo", property="transactionBatchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FAccountStatementBatchNoId", property="accountStatementBatchNoId", jdbcType=JdbcType.INTEGER),
        @Result(column="FCreateTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FIsDelete", property="isDelete", jdbcType=JdbcType.BIT)
    })
    SINAAccountStatement selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "FID, FSinaOrderNo, FMerchantOrderNo, FBusinessOriginalType, FBusinessType, FSubBusinessType, ",
        "FPayerName, FPayerAccount, FGoodsName, FOrderAmount, FCounterFee, FRefundAmount, ",
        "FPayeeName, FPayeeAccount, FOrderOriginalStatus, FOrderStatus, FPaySuccessTime, ",
        "FOrderCreateTime, FPaymentChannel, FPaymentTerminal, FRemark, FMerchantNo, FPlatformFee, ",
        "FPayerUid, FPayeeUid, FMerchantBatchNo, FTransactionBatchNo, FAccountStatementBatchNoId, ",
        "FCreateTime, FIsDelete",
        "from z_SINAAccountStatement",
        "order by age desc,username asc"
    })
    @Results({
        @Result(column="FID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FSinaOrderNo", property="sinaOrderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FMerchantOrderNo", property="merchantOrderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FBusinessOriginalType", property="businessOriginalType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FBusinessType", property="businessType", jdbcType=JdbcType.INTEGER),
        @Result(column="FSubBusinessType", property="subBusinessType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayerName", property="payerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayerAccount", property="payerAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="FGoodsName", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOrderAmount", property="orderAmount", jdbcType=JdbcType.NUMERIC),
        @Result(column="FCounterFee", property="counterFee", jdbcType=JdbcType.NUMERIC),
        @Result(column="FRefundAmount", property="refundAmount", jdbcType=JdbcType.NUMERIC),
        @Result(column="FPayeeName", property="payeeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayeeAccount", property="payeeAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOrderOriginalStatus", property="orderOriginalStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOrderStatus", property="orderStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="FPaySuccessTime", property="paySuccessTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FOrderCreateTime", property="orderCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FPaymentChannel", property="paymentChannel", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPaymentTerminal", property="paymentTerminal", jdbcType=JdbcType.VARCHAR),
        @Result(column="FRemark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="FMerchantNo", property="merchantNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPlatformFee", property="platformFee", jdbcType=JdbcType.NUMERIC),
        @Result(column="FPayerUid", property="payerUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="FPayeeUid", property="payeeUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="FMerchantBatchNo", property="merchantBatchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FTransactionBatchNo", property="transactionBatchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="FAccountStatementBatchNoId", property="accountStatementBatchNoId", jdbcType=JdbcType.INTEGER),
        @Result(column="FCreateTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FIsDelete", property="isDelete", jdbcType=JdbcType.BIT)
    })
    List<SINAAccountStatement> selectAll();

    @Update({
        "update z_SINAAccountStatement",
        "set FSinaOrderNo = #{sinaOrderNo,jdbcType=VARCHAR},",
          "FMerchantOrderNo = #{merchantOrderNo,jdbcType=VARCHAR},",
          "FBusinessOriginalType = #{businessOriginalType,jdbcType=VARCHAR},",
          "FBusinessType = #{businessType,jdbcType=INTEGER},",
          "FSubBusinessType = #{subBusinessType,jdbcType=VARCHAR},",
          "FPayerName = #{payerName,jdbcType=VARCHAR},",
          "FPayerAccount = #{payerAccount,jdbcType=VARCHAR},",
          "FGoodsName = #{goodsName,jdbcType=VARCHAR},",
          "FOrderAmount = #{orderAmount,jdbcType=NUMERIC},",
          "FCounterFee = #{counterFee,jdbcType=NUMERIC},",
          "FRefundAmount = #{refundAmount,jdbcType=NUMERIC},",
          "FPayeeName = #{payeeName,jdbcType=VARCHAR},",
          "FPayeeAccount = #{payeeAccount,jdbcType=VARCHAR},",
          "FOrderOriginalStatus = #{orderOriginalStatus,jdbcType=VARCHAR},",
          "FOrderStatus = #{orderStatus,jdbcType=INTEGER},",
          "FPaySuccessTime = #{paySuccessTime,jdbcType=TIMESTAMP},",
          "FOrderCreateTime = #{orderCreateTime,jdbcType=TIMESTAMP},",
          "FPaymentChannel = #{paymentChannel,jdbcType=VARCHAR},",
          "FPaymentTerminal = #{paymentTerminal,jdbcType=VARCHAR},",
          "FRemark = #{remark,jdbcType=VARCHAR},",
          "FMerchantNo = #{merchantNo,jdbcType=VARCHAR},",
          "FPlatformFee = #{platformFee,jdbcType=NUMERIC},",
          "FPayerUid = #{payerUid,jdbcType=VARCHAR},",
          "FPayeeUid = #{payeeUid,jdbcType=VARCHAR},",
          "FMerchantBatchNo = #{merchantBatchNo,jdbcType=VARCHAR},",
          "FTransactionBatchNo = #{transactionBatchNo,jdbcType=VARCHAR},",
          "FAccountStatementBatchNoId = #{accountStatementBatchNoId,jdbcType=INTEGER},",
          "FCreateTime = #{createTime,jdbcType=TIMESTAMP},",
          "FIsDelete = #{isDelete,jdbcType=BIT}",
        "where FID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SINAAccountStatement record);
}