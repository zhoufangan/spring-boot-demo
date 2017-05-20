package com.zhoufa.mybatis.pager;

import java.io.Serializable;
import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/20.
 */
public class Pageable implements Serializable {

    private static final long serialVersionUID = 1926869438319315370L;

    private int pageNumber;
    private int pageSize;
    private int pageTotal;
    private int total;
    private List<Sort> sort;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Sort> getSort() {
        return sort;
    }

    public void setSort(List<Sort> sort) {
        this.sort = sort;
    }
}
