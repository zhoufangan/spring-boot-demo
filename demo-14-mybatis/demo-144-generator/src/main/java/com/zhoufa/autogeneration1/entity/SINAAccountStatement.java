package com.zhoufa.autogeneration1.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SINAAccountStatement {
    private Integer ID;

    private String sinaOrderNo;

    private String merchantOrderNo;

    private String businessOriginalType;

    private Integer businessType;

    private String subBusinessType;

    private String payerName;

    private String payerAccount;

    private String goodsName;

    private BigDecimal orderAmount;

    private BigDecimal counterFee;

    private BigDecimal refundAmount;

    private String payeeName;

    private String payeeAccount;

    private String orderOriginalStatus;

    private Integer orderStatus;

    private Date paySuccessTime;

    private Date orderCreateTime;

    private String paymentChannel;

    private String paymentTerminal;

    private String remark;

    private String merchantNo;

    private BigDecimal platformFee;

    private String payerUid;

    private String payeeUid;

    private String merchantBatchNo;

    private String transactionBatchNo;

    private Integer accountStatementBatchNoId;

    private Date createTime;

    private Boolean isDelete;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSinaOrderNo() {
        return sinaOrderNo;
    }

    public void setSinaOrderNo(String sinaOrderNo) {
        this.sinaOrderNo = sinaOrderNo == null ? null : sinaOrderNo.trim();
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    public String getBusinessOriginalType() {
        return businessOriginalType;
    }

    public void setBusinessOriginalType(String businessOriginalType) {
        this.businessOriginalType = businessOriginalType == null ? null : businessOriginalType.trim();
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getSubBusinessType() {
        return subBusinessType;
    }

    public void setSubBusinessType(String subBusinessType) {
        this.subBusinessType = subBusinessType == null ? null : subBusinessType.trim();
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount == null ? null : payerAccount.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getCounterFee() {
        return counterFee;
    }

    public void setCounterFee(BigDecimal counterFee) {
        this.counterFee = counterFee;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    public String getPayeeAccount() {
        return payeeAccount;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount == null ? null : payeeAccount.trim();
    }

    public String getOrderOriginalStatus() {
        return orderOriginalStatus;
    }

    public void setOrderOriginalStatus(String orderOriginalStatus) {
        this.orderOriginalStatus = orderOriginalStatus == null ? null : orderOriginalStatus.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel == null ? null : paymentChannel.trim();
    }

    public String getPaymentTerminal() {
        return paymentTerminal;
    }

    public void setPaymentTerminal(String paymentTerminal) {
        this.paymentTerminal = paymentTerminal == null ? null : paymentTerminal.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public BigDecimal getPlatformFee() {
        return platformFee;
    }

    public void setPlatformFee(BigDecimal platformFee) {
        this.platformFee = platformFee;
    }

    public String getPayerUid() {
        return payerUid;
    }

    public void setPayerUid(String payerUid) {
        this.payerUid = payerUid == null ? null : payerUid.trim();
    }

    public String getPayeeUid() {
        return payeeUid;
    }

    public void setPayeeUid(String payeeUid) {
        this.payeeUid = payeeUid == null ? null : payeeUid.trim();
    }

    public String getMerchantBatchNo() {
        return merchantBatchNo;
    }

    public void setMerchantBatchNo(String merchantBatchNo) {
        this.merchantBatchNo = merchantBatchNo == null ? null : merchantBatchNo.trim();
    }

    public String getTransactionBatchNo() {
        return transactionBatchNo;
    }

    public void setTransactionBatchNo(String transactionBatchNo) {
        this.transactionBatchNo = transactionBatchNo == null ? null : transactionBatchNo.trim();
    }

    public Integer getAccountStatementBatchNoId() {
        return accountStatementBatchNoId;
    }

    public void setAccountStatementBatchNoId(Integer accountStatementBatchNoId) {
        this.accountStatementBatchNoId = accountStatementBatchNoId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}