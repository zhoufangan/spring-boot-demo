package com.zhoufa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Created by zhoufangan on 2017/5/11.
 *         新浪对账单批次模型
 */
public class SINAAccountStatementBatch implements Serializable {

    private Integer id;// 自增主键
    private Integer batchNo; // 批次号
    private String statisticalTime;// 统计时间
    private Integer status;// 批次号状态 0初始化 10正常
    private Date createTime;// 创建时间
    private Integer createUserId;// 创建的人ID 系统-1
    private Date lastModifyTime; // 修改时间
    private Integer lastModifyUserId;// 最后修改的人 系统-1
    private Boolean isDelete;// 是否删除 0否

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    public String getStatisticalTime() {
        return statisticalTime;
    }

    public void setStatisticalTime(String statisticalTime) {
        this.statisticalTime = statisticalTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean delete) {
        isDelete = delete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(Integer lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }
}
