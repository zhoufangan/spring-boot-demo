package com.zhoufa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Created by zhoufangan on 2017/5/5.
 *         新浪对账单模型
 */
public class SINAAccountStatement implements Serializable {

    private Integer id;// 主键
    private String sinaOrderNo;// 新浪交易订单号
    private String merchantOrderNo;// 商户请求订单号
    private Integer businessType;// 业务类型 1托管代收,10托管充值,20托管代付,30存钱罐充值,40托管转账,50预授权交易,60单笔即时到账,70操盘宝充值提现,80代付到银行卡,90代付到提现卡,100存钱罐赎回到卡
    private String subBusinessType;// 子类型
    private String payerName;// 付款人
    private String payerAccount;// 付款人支付账号
    private String goodsName;// 商品名
    private Double orderAmount;// 订单金额
    private Double counterFee;// 手续费
    private Double refundAmount;// 退款金额
    private String payeeName;// 收款名
    private String payeeAccount;// 收款人账号
    private Integer orderStatus;// 订单状态 1交易结束,10交易失败,20退款完成,30预授权撤销,40交易关闭,50退票
    private Date paySuccessTime;// 支付成功时间
    private Date orderCreateTime;// 订单创建时间
    private String paymentChannel;// 支付渠道
    private String paymentTerminal;// 支付终端
    private String remark;// 备注
    private String merchantNo;// 商户号
    private Double platformFee;// 平台手续费
    private String payerUid;// 付款方UID
    private String payeeUid;// 收款方UID 可空
    private String merchantBatchNo;// 商户批次号
    private String transactionBatchNo;// 交易批次号
    private Integer accountStatementBatchNoId;// 批次表批次号ID
    private Date createTime;// 创建时间
    private Boolean isDelete;// 是否删除

    private String orderOriginalStatus; // 订单原始状态
    private String businessOriginalType;// 业务类型原始状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSinaOrderNo() {
        return sinaOrderNo;
    }

    public void setSinaOrderNo(String sinaOrderNo) {
        this.sinaOrderNo = sinaOrderNo;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
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
        this.subBusinessType = subBusinessType;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getCounterFee() {
        return counterFee;
    }

    public void setCounterFee(Double counterFee) {
        this.counterFee = counterFee;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeAccount() {
        return payeeAccount;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
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
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentTerminal() {
        return paymentTerminal;
    }

    public void setPaymentTerminal(String paymentTerminal) {
        this.paymentTerminal = paymentTerminal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Double getPlatformFee() {
        return platformFee;
    }

    public void setPlatformFee(Double platformFee) {
        this.platformFee = platformFee;
    }

    public String getPayerUid() {
        return payerUid;
    }

    public void setPayerUid(String payerUid) {
        this.payerUid = payerUid;
    }

    public String getPayeeUid() {
        return payeeUid;
    }

    public void setPayeeUid(String payeeUid) {
        this.payeeUid = payeeUid;
    }

    public String getMerchantBatchNo() {
        return merchantBatchNo;
    }

    public void setMerchantBatchNo(String merchantBatchNo) {
        this.merchantBatchNo = merchantBatchNo;
    }

    public String getTransactionBatchNo() {
        return transactionBatchNo;
    }

    public void setTransactionBatchNo(String transactionBatchNo) {
        this.transactionBatchNo = transactionBatchNo;
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

    public void setIsDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getOrderOriginalStatus() {
        return orderOriginalStatus;
    }

    public void setOrderOriginalStatus(String orderOriginalStatus) {
        this.orderOriginalStatus = orderOriginalStatus;
    }

    public String getBusinessOriginalType() {
        return businessOriginalType;
    }

    public void setBusinessOriginalType(String businessOriginalType) {
        this.businessOriginalType = businessOriginalType;
    }
}
