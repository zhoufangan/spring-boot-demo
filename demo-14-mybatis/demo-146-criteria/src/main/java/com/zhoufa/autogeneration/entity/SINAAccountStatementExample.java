package com.zhoufa.autogeneration.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SINAAccountStatementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SINAAccountStatementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("FID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("FID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("FID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("FID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("FID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("FID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("FID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("FID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoIsNull() {
            addCriterion("FSinaOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoIsNotNull() {
            addCriterion("FSinaOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoEqualTo(String value) {
            addCriterion("FSinaOrderNo =", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoNotEqualTo(String value) {
            addCriterion("FSinaOrderNo <>", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoGreaterThan(String value) {
            addCriterion("FSinaOrderNo >", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("FSinaOrderNo >=", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoLessThan(String value) {
            addCriterion("FSinaOrderNo <", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoLessThanOrEqualTo(String value) {
            addCriterion("FSinaOrderNo <=", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoLike(String value) {
            addCriterion("FSinaOrderNo like", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoNotLike(String value) {
            addCriterion("FSinaOrderNo not like", value, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoIn(List<String> values) {
            addCriterion("FSinaOrderNo in", values, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoNotIn(List<String> values) {
            addCriterion("FSinaOrderNo not in", values, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoBetween(String value1, String value2) {
            addCriterion("FSinaOrderNo between", value1, value2, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andSinaOrderNoNotBetween(String value1, String value2) {
            addCriterion("FSinaOrderNo not between", value1, value2, "sinaOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNull() {
            addCriterion("FMerchantOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNotNull() {
            addCriterion("FMerchantOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoEqualTo(String value) {
            addCriterion("FMerchantOrderNo =", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotEqualTo(String value) {
            addCriterion("FMerchantOrderNo <>", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThan(String value) {
            addCriterion("FMerchantOrderNo >", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("FMerchantOrderNo >=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThan(String value) {
            addCriterion("FMerchantOrderNo <", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThanOrEqualTo(String value) {
            addCriterion("FMerchantOrderNo <=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLike(String value) {
            addCriterion("FMerchantOrderNo like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotLike(String value) {
            addCriterion("FMerchantOrderNo not like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIn(List<String> values) {
            addCriterion("FMerchantOrderNo in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotIn(List<String> values) {
            addCriterion("FMerchantOrderNo not in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoBetween(String value1, String value2) {
            addCriterion("FMerchantOrderNo between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotBetween(String value1, String value2) {
            addCriterion("FMerchantOrderNo not between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeIsNull() {
            addCriterion("FBusinessOriginalType is null");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeIsNotNull() {
            addCriterion("FBusinessOriginalType is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeEqualTo(String value) {
            addCriterion("FBusinessOriginalType =", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeNotEqualTo(String value) {
            addCriterion("FBusinessOriginalType <>", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeGreaterThan(String value) {
            addCriterion("FBusinessOriginalType >", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FBusinessOriginalType >=", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeLessThan(String value) {
            addCriterion("FBusinessOriginalType <", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeLessThanOrEqualTo(String value) {
            addCriterion("FBusinessOriginalType <=", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeLike(String value) {
            addCriterion("FBusinessOriginalType like", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeNotLike(String value) {
            addCriterion("FBusinessOriginalType not like", value, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeIn(List<String> values) {
            addCriterion("FBusinessOriginalType in", values, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeNotIn(List<String> values) {
            addCriterion("FBusinessOriginalType not in", values, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeBetween(String value1, String value2) {
            addCriterion("FBusinessOriginalType between", value1, value2, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessOriginalTypeNotBetween(String value1, String value2) {
            addCriterion("FBusinessOriginalType not between", value1, value2, "businessOriginalType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("FBusinessType is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("FBusinessType is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("FBusinessType =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("FBusinessType <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("FBusinessType >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBusinessType >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("FBusinessType <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("FBusinessType <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("FBusinessType in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("FBusinessType not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("FBusinessType between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FBusinessType not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeIsNull() {
            addCriterion("FSubBusinessType is null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeIsNotNull() {
            addCriterion("FSubBusinessType is not null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeEqualTo(String value) {
            addCriterion("FSubBusinessType =", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeNotEqualTo(String value) {
            addCriterion("FSubBusinessType <>", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeGreaterThan(String value) {
            addCriterion("FSubBusinessType >", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FSubBusinessType >=", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeLessThan(String value) {
            addCriterion("FSubBusinessType <", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("FSubBusinessType <=", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeLike(String value) {
            addCriterion("FSubBusinessType like", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeNotLike(String value) {
            addCriterion("FSubBusinessType not like", value, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeIn(List<String> values) {
            addCriterion("FSubBusinessType in", values, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeNotIn(List<String> values) {
            addCriterion("FSubBusinessType not in", values, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeBetween(String value1, String value2) {
            addCriterion("FSubBusinessType between", value1, value2, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andSubBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("FSubBusinessType not between", value1, value2, "subBusinessType");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNull() {
            addCriterion("FPayerName is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNotNull() {
            addCriterion("FPayerName is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameEqualTo(String value) {
            addCriterion("FPayerName =", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotEqualTo(String value) {
            addCriterion("FPayerName <>", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThan(String value) {
            addCriterion("FPayerName >", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("FPayerName >=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThan(String value) {
            addCriterion("FPayerName <", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThanOrEqualTo(String value) {
            addCriterion("FPayerName <=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLike(String value) {
            addCriterion("FPayerName like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotLike(String value) {
            addCriterion("FPayerName not like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameIn(List<String> values) {
            addCriterion("FPayerName in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotIn(List<String> values) {
            addCriterion("FPayerName not in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameBetween(String value1, String value2) {
            addCriterion("FPayerName between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotBetween(String value1, String value2) {
            addCriterion("FPayerName not between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIsNull() {
            addCriterion("FPayerAccount is null");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIsNotNull() {
            addCriterion("FPayerAccount is not null");
            return (Criteria) this;
        }

        public Criteria andPayerAccountEqualTo(String value) {
            addCriterion("FPayerAccount =", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotEqualTo(String value) {
            addCriterion("FPayerAccount <>", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountGreaterThan(String value) {
            addCriterion("FPayerAccount >", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("FPayerAccount >=", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLessThan(String value) {
            addCriterion("FPayerAccount <", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLessThanOrEqualTo(String value) {
            addCriterion("FPayerAccount <=", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLike(String value) {
            addCriterion("FPayerAccount like", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotLike(String value) {
            addCriterion("FPayerAccount not like", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIn(List<String> values) {
            addCriterion("FPayerAccount in", values, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotIn(List<String> values) {
            addCriterion("FPayerAccount not in", values, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountBetween(String value1, String value2) {
            addCriterion("FPayerAccount between", value1, value2, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotBetween(String value1, String value2) {
            addCriterion("FPayerAccount not between", value1, value2, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("FGoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("FGoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("FGoodsName =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("FGoodsName <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("FGoodsName >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("FGoodsName >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("FGoodsName <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("FGoodsName <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("FGoodsName like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("FGoodsName not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("FGoodsName in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("FGoodsName not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("FGoodsName between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("FGoodsName not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("FOrderAmount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("FOrderAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("FOrderAmount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("FOrderAmount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("FOrderAmount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOrderAmount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("FOrderAmount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOrderAmount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("FOrderAmount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("FOrderAmount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOrderAmount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOrderAmount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andCounterFeeIsNull() {
            addCriterion("FCounterFee is null");
            return (Criteria) this;
        }

        public Criteria andCounterFeeIsNotNull() {
            addCriterion("FCounterFee is not null");
            return (Criteria) this;
        }

        public Criteria andCounterFeeEqualTo(BigDecimal value) {
            addCriterion("FCounterFee =", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeNotEqualTo(BigDecimal value) {
            addCriterion("FCounterFee <>", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeGreaterThan(BigDecimal value) {
            addCriterion("FCounterFee >", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FCounterFee >=", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeLessThan(BigDecimal value) {
            addCriterion("FCounterFee <", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FCounterFee <=", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeIn(List<BigDecimal> values) {
            addCriterion("FCounterFee in", values, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeNotIn(List<BigDecimal> values) {
            addCriterion("FCounterFee not in", values, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCounterFee between", value1, value2, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCounterFee not between", value1, value2, "counterFee");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("FRefundAmount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("FRefundAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("FRefundAmount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("FRefundAmount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("FRefundAmount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FRefundAmount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("FRefundAmount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FRefundAmount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("FRefundAmount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("FRefundAmount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRefundAmount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRefundAmount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIsNull() {
            addCriterion("FPayeeName is null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIsNotNull() {
            addCriterion("FPayeeName is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameEqualTo(String value) {
            addCriterion("FPayeeName =", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotEqualTo(String value) {
            addCriterion("FPayeeName <>", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThan(String value) {
            addCriterion("FPayeeName >", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("FPayeeName >=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThan(String value) {
            addCriterion("FPayeeName <", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThanOrEqualTo(String value) {
            addCriterion("FPayeeName <=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLike(String value) {
            addCriterion("FPayeeName like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotLike(String value) {
            addCriterion("FPayeeName not like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIn(List<String> values) {
            addCriterion("FPayeeName in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotIn(List<String> values) {
            addCriterion("FPayeeName not in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameBetween(String value1, String value2) {
            addCriterion("FPayeeName between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotBetween(String value1, String value2) {
            addCriterion("FPayeeName not between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountIsNull() {
            addCriterion("FPayeeAccount is null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountIsNotNull() {
            addCriterion("FPayeeAccount is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountEqualTo(String value) {
            addCriterion("FPayeeAccount =", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotEqualTo(String value) {
            addCriterion("FPayeeAccount <>", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountGreaterThan(String value) {
            addCriterion("FPayeeAccount >", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("FPayeeAccount >=", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountLessThan(String value) {
            addCriterion("FPayeeAccount <", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountLessThanOrEqualTo(String value) {
            addCriterion("FPayeeAccount <=", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountLike(String value) {
            addCriterion("FPayeeAccount like", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotLike(String value) {
            addCriterion("FPayeeAccount not like", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountIn(List<String> values) {
            addCriterion("FPayeeAccount in", values, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotIn(List<String> values) {
            addCriterion("FPayeeAccount not in", values, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountBetween(String value1, String value2) {
            addCriterion("FPayeeAccount between", value1, value2, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotBetween(String value1, String value2) {
            addCriterion("FPayeeAccount not between", value1, value2, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusIsNull() {
            addCriterion("FOrderOriginalStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusIsNotNull() {
            addCriterion("FOrderOriginalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusEqualTo(String value) {
            addCriterion("FOrderOriginalStatus =", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusNotEqualTo(String value) {
            addCriterion("FOrderOriginalStatus <>", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusGreaterThan(String value) {
            addCriterion("FOrderOriginalStatus >", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FOrderOriginalStatus >=", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusLessThan(String value) {
            addCriterion("FOrderOriginalStatus <", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusLessThanOrEqualTo(String value) {
            addCriterion("FOrderOriginalStatus <=", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusLike(String value) {
            addCriterion("FOrderOriginalStatus like", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusNotLike(String value) {
            addCriterion("FOrderOriginalStatus not like", value, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusIn(List<String> values) {
            addCriterion("FOrderOriginalStatus in", values, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusNotIn(List<String> values) {
            addCriterion("FOrderOriginalStatus not in", values, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusBetween(String value1, String value2) {
            addCriterion("FOrderOriginalStatus between", value1, value2, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderOriginalStatusNotBetween(String value1, String value2) {
            addCriterion("FOrderOriginalStatus not between", value1, value2, "orderOriginalStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("FOrderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("FOrderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("FOrderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("FOrderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("FOrderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOrderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("FOrderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("FOrderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("FOrderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("FOrderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("FOrderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("FOrderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNull() {
            addCriterion("FPaySuccessTime is null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNotNull() {
            addCriterion("FPaySuccessTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeEqualTo(Date value) {
            addCriterion("FPaySuccessTime =", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotEqualTo(Date value) {
            addCriterion("FPaySuccessTime <>", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThan(Date value) {
            addCriterion("FPaySuccessTime >", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FPaySuccessTime >=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThan(Date value) {
            addCriterion("FPaySuccessTime <", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("FPaySuccessTime <=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIn(List<Date> values) {
            addCriterion("FPaySuccessTime in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotIn(List<Date> values) {
            addCriterion("FPaySuccessTime not in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeBetween(Date value1, Date value2) {
            addCriterion("FPaySuccessTime between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("FPaySuccessTime not between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("FOrderCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("FOrderCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("FOrderCreateTime =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("FOrderCreateTime <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("FOrderCreateTime >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FOrderCreateTime >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("FOrderCreateTime <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("FOrderCreateTime <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("FOrderCreateTime in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("FOrderCreateTime not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("FOrderCreateTime between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("FOrderCreateTime not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNull() {
            addCriterion("FPaymentChannel is null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNotNull() {
            addCriterion("FPaymentChannel is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelEqualTo(String value) {
            addCriterion("FPaymentChannel =", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotEqualTo(String value) {
            addCriterion("FPaymentChannel <>", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThan(String value) {
            addCriterion("FPaymentChannel >", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("FPaymentChannel >=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThan(String value) {
            addCriterion("FPaymentChannel <", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThanOrEqualTo(String value) {
            addCriterion("FPaymentChannel <=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLike(String value) {
            addCriterion("FPaymentChannel like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotLike(String value) {
            addCriterion("FPaymentChannel not like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIn(List<String> values) {
            addCriterion("FPaymentChannel in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotIn(List<String> values) {
            addCriterion("FPaymentChannel not in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelBetween(String value1, String value2) {
            addCriterion("FPaymentChannel between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotBetween(String value1, String value2) {
            addCriterion("FPaymentChannel not between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalIsNull() {
            addCriterion("FPaymentTerminal is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalIsNotNull() {
            addCriterion("FPaymentTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalEqualTo(String value) {
            addCriterion("FPaymentTerminal =", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalNotEqualTo(String value) {
            addCriterion("FPaymentTerminal <>", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalGreaterThan(String value) {
            addCriterion("FPaymentTerminal >", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalGreaterThanOrEqualTo(String value) {
            addCriterion("FPaymentTerminal >=", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalLessThan(String value) {
            addCriterion("FPaymentTerminal <", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalLessThanOrEqualTo(String value) {
            addCriterion("FPaymentTerminal <=", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalLike(String value) {
            addCriterion("FPaymentTerminal like", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalNotLike(String value) {
            addCriterion("FPaymentTerminal not like", value, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalIn(List<String> values) {
            addCriterion("FPaymentTerminal in", values, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalNotIn(List<String> values) {
            addCriterion("FPaymentTerminal not in", values, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalBetween(String value1, String value2) {
            addCriterion("FPaymentTerminal between", value1, value2, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andPaymentTerminalNotBetween(String value1, String value2) {
            addCriterion("FPaymentTerminal not between", value1, value2, "paymentTerminal");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("FRemark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("FRemark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("FRemark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("FRemark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("FRemark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FRemark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("FRemark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("FRemark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("FRemark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("FRemark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("FRemark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("FRemark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("FRemark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("FRemark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("FMerchantNo is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("FMerchantNo is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("FMerchantNo =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("FMerchantNo <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("FMerchantNo >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("FMerchantNo >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("FMerchantNo <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("FMerchantNo <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("FMerchantNo like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("FMerchantNo not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("FMerchantNo in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("FMerchantNo not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("FMerchantNo between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("FMerchantNo not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeIsNull() {
            addCriterion("FPlatformFee is null");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeIsNotNull() {
            addCriterion("FPlatformFee is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeEqualTo(BigDecimal value) {
            addCriterion("FPlatformFee =", value, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeNotEqualTo(BigDecimal value) {
            addCriterion("FPlatformFee <>", value, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeGreaterThan(BigDecimal value) {
            addCriterion("FPlatformFee >", value, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FPlatformFee >=", value, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeLessThan(BigDecimal value) {
            addCriterion("FPlatformFee <", value, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FPlatformFee <=", value, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeIn(List<BigDecimal> values) {
            addCriterion("FPlatformFee in", values, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeNotIn(List<BigDecimal> values) {
            addCriterion("FPlatformFee not in", values, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPlatformFee between", value1, value2, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPlatformFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPlatformFee not between", value1, value2, "platformFee");
            return (Criteria) this;
        }

        public Criteria andPayerUidIsNull() {
            addCriterion("FPayerUid is null");
            return (Criteria) this;
        }

        public Criteria andPayerUidIsNotNull() {
            addCriterion("FPayerUid is not null");
            return (Criteria) this;
        }

        public Criteria andPayerUidEqualTo(String value) {
            addCriterion("FPayerUid =", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidNotEqualTo(String value) {
            addCriterion("FPayerUid <>", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidGreaterThan(String value) {
            addCriterion("FPayerUid >", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidGreaterThanOrEqualTo(String value) {
            addCriterion("FPayerUid >=", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidLessThan(String value) {
            addCriterion("FPayerUid <", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidLessThanOrEqualTo(String value) {
            addCriterion("FPayerUid <=", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidLike(String value) {
            addCriterion("FPayerUid like", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidNotLike(String value) {
            addCriterion("FPayerUid not like", value, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidIn(List<String> values) {
            addCriterion("FPayerUid in", values, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidNotIn(List<String> values) {
            addCriterion("FPayerUid not in", values, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidBetween(String value1, String value2) {
            addCriterion("FPayerUid between", value1, value2, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayerUidNotBetween(String value1, String value2) {
            addCriterion("FPayerUid not between", value1, value2, "payerUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidIsNull() {
            addCriterion("FPayeeUid is null");
            return (Criteria) this;
        }

        public Criteria andPayeeUidIsNotNull() {
            addCriterion("FPayeeUid is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeUidEqualTo(String value) {
            addCriterion("FPayeeUid =", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidNotEqualTo(String value) {
            addCriterion("FPayeeUid <>", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidGreaterThan(String value) {
            addCriterion("FPayeeUid >", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidGreaterThanOrEqualTo(String value) {
            addCriterion("FPayeeUid >=", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidLessThan(String value) {
            addCriterion("FPayeeUid <", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidLessThanOrEqualTo(String value) {
            addCriterion("FPayeeUid <=", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidLike(String value) {
            addCriterion("FPayeeUid like", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidNotLike(String value) {
            addCriterion("FPayeeUid not like", value, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidIn(List<String> values) {
            addCriterion("FPayeeUid in", values, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidNotIn(List<String> values) {
            addCriterion("FPayeeUid not in", values, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidBetween(String value1, String value2) {
            addCriterion("FPayeeUid between", value1, value2, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andPayeeUidNotBetween(String value1, String value2) {
            addCriterion("FPayeeUid not between", value1, value2, "payeeUid");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoIsNull() {
            addCriterion("FMerchantBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoIsNotNull() {
            addCriterion("FMerchantBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoEqualTo(String value) {
            addCriterion("FMerchantBatchNo =", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoNotEqualTo(String value) {
            addCriterion("FMerchantBatchNo <>", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoGreaterThan(String value) {
            addCriterion("FMerchantBatchNo >", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("FMerchantBatchNo >=", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoLessThan(String value) {
            addCriterion("FMerchantBatchNo <", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoLessThanOrEqualTo(String value) {
            addCriterion("FMerchantBatchNo <=", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoLike(String value) {
            addCriterion("FMerchantBatchNo like", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoNotLike(String value) {
            addCriterion("FMerchantBatchNo not like", value, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoIn(List<String> values) {
            addCriterion("FMerchantBatchNo in", values, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoNotIn(List<String> values) {
            addCriterion("FMerchantBatchNo not in", values, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoBetween(String value1, String value2) {
            addCriterion("FMerchantBatchNo between", value1, value2, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andMerchantBatchNoNotBetween(String value1, String value2) {
            addCriterion("FMerchantBatchNo not between", value1, value2, "merchantBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoIsNull() {
            addCriterion("FTransactionBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoIsNotNull() {
            addCriterion("FTransactionBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoEqualTo(String value) {
            addCriterion("FTransactionBatchNo =", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoNotEqualTo(String value) {
            addCriterion("FTransactionBatchNo <>", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoGreaterThan(String value) {
            addCriterion("FTransactionBatchNo >", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("FTransactionBatchNo >=", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoLessThan(String value) {
            addCriterion("FTransactionBatchNo <", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoLessThanOrEqualTo(String value) {
            addCriterion("FTransactionBatchNo <=", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoLike(String value) {
            addCriterion("FTransactionBatchNo like", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoNotLike(String value) {
            addCriterion("FTransactionBatchNo not like", value, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoIn(List<String> values) {
            addCriterion("FTransactionBatchNo in", values, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoNotIn(List<String> values) {
            addCriterion("FTransactionBatchNo not in", values, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoBetween(String value1, String value2) {
            addCriterion("FTransactionBatchNo between", value1, value2, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andTransactionBatchNoNotBetween(String value1, String value2) {
            addCriterion("FTransactionBatchNo not between", value1, value2, "transactionBatchNo");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdIsNull() {
            addCriterion("FAccountStatementBatchNoId is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdIsNotNull() {
            addCriterion("FAccountStatementBatchNoId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdEqualTo(Integer value) {
            addCriterion("FAccountStatementBatchNoId =", value, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdNotEqualTo(Integer value) {
            addCriterion("FAccountStatementBatchNoId <>", value, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdGreaterThan(Integer value) {
            addCriterion("FAccountStatementBatchNoId >", value, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAccountStatementBatchNoId >=", value, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdLessThan(Integer value) {
            addCriterion("FAccountStatementBatchNoId <", value, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdLessThanOrEqualTo(Integer value) {
            addCriterion("FAccountStatementBatchNoId <=", value, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdIn(List<Integer> values) {
            addCriterion("FAccountStatementBatchNoId in", values, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdNotIn(List<Integer> values) {
            addCriterion("FAccountStatementBatchNoId not in", values, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdBetween(Integer value1, Integer value2) {
            addCriterion("FAccountStatementBatchNoId between", value1, value2, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andAccountStatementBatchNoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FAccountStatementBatchNoId not between", value1, value2, "accountStatementBatchNoId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("FCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("FCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("FCreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("FCreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("FCreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FCreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("FCreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("FCreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("FCreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("FCreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("FCreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("FCreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("FIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("FIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("FIsDelete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("FIsDelete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("FIsDelete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsDelete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("FIsDelete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsDelete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("FIsDelete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("FIsDelete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsDelete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsDelete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}