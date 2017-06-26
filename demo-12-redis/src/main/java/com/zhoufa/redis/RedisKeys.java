package com.zhoufa.redis;

/**
 * @author zhoufangan on 2017/4/18.
 */
public interface RedisKeys {

    /**
     * ----------------------- 钱包用户锁定 -------------------------
     */
    // 添加用户 deptNumber=事业部编号  idCard=身份证号
    String WALLET_USER_MANAGED_ADD = "wallet:lock:user:add:deptNumber:%s:idCard:%s:";

    /**
     * ----------------------- 打款用户锁定 -------------------------
     */
    // 打款 deptNumber=事业部编号 openUserId=托管用户ID
    String WALLET_REMITTANCE_APPLY = "wallet:lock:remittance:deptNumber:%s:openUserId:%d";

    /**
     * ----------------------- 钱包还款用户锁定 -------------------------
     */
    // 还款 openUserId=托管用户ID
    String WALLET_REPAY_OPEN_USER_ID = "wallet:lock:repay:openUserId:%d";

    // 还款中断重新触发 deptNumber=事业部编号 openOrderNumber=外部订单编号
    String WALLET_REPAY_CONTINUE_DEALWITH_REPAYORDER = "wallet:lock:repay:continue:deptNumber:%s:openOrderNumber:%s";

    //还款 托管充值Key depositOrderBillNo=充值订单单据编号
    String WALLET_REPAY_DEPOSIT_ORDER_SOURCE_BILL_NO = "wallet:lock:repay:deposit:depositOrderSourceBillNo:%s";

    //还款 代收充值Key collectOrderBillNo=代收订单单据编号
    String WALLET_REPAY_COLLECT_ORDER_SOURCE_BILL_NO = "wallet:lock:repay:collect:collectOrderSourceBillNo:%s";

    //还款 代付充值Key payOrderBillNo=代付订单单据编号
    String WALLET_REPAY_PAY_ORDER_SOURCE_BILL_NO = "wallet:lock:repay:pay:payOrderSourceBillNo:%s";

    // 银行支行列表 bank_code, province_code,city_code;
    String WALLET_BANK_BRANCH_LIST = "wallet:bank:Branch:list:biztype:%s:bankCode:%s:province:%s:city:%s";
    // 银行列表
    String WALLET_BANK_LIST = "wallet:bank:list:biztype:%s";
}
