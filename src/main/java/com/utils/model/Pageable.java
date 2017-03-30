package com.utils.model;

import com.utils.CamelNameUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/4
 * Time: 10:31
 * 分页参数实体
 */
public class Pageable implements Serializable{
    private static final long serialVersionUID = 251698636377472734L;
    /**
     * 默认页码
     */
    private static final Integer DEFAULT_PAGE_NUMBER = 1;

    /**
     * 默认每页记录数
     */
    private static final Integer DEFAULT_PAGE_SIZE = 20;

    /**
     * 最大每页记录数
     */
    private static final Integer MAX_PAGE_SIZE = 1000;

    /**
     * 页码
     */
    private Integer pageNumber = DEFAULT_PAGE_NUMBER;

    /**
     * 每页记录数
     */
    private Integer pageSize = DEFAULT_PAGE_SIZE;

    /**
     * 搜索属性
     */
    private String searchProperty;

    /**
     * 搜索值
     */
    private String searchValue;

    /**
     * 过滤器
     */
    private Map<String, Object> filters = new HashMap<String, Object>();

    /**
     * 排序属性
     */
    private String sortProperty;

    /**
     * 排序方向
     */
    private String sortDirection;


    public Pageable() {
    }

    /**
     * @param pageSize 每页记录数
     */
    public Pageable(Integer pageSize) {
        if (pageSize != null && pageSize > 0 && pageSize <= MAX_PAGE_SIZE) {
            this.pageSize = pageSize;
        }
    }

    /**
     * @param pageNumber 页码
     * @param pageSize   每页记录数
     */
    public Pageable(Integer pageNumber, Integer pageSize) {
        if (pageNumber != null && pageNumber > 0) {
            this.pageNumber = pageNumber;
        }
        if (pageSize != null && pageSize > 0 && pageSize <= MAX_PAGE_SIZE) {
            this.pageSize = pageSize;
        }
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        if (pageNumber == null || pageNumber < 1) {
            pageNumber = DEFAULT_PAGE_NUMBER;
        }
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize == null || pageSize < 1 || pageSize > MAX_PAGE_SIZE) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        this.pageSize = pageSize;
    }

    public String getSearchProperty() {
        return searchProperty;
    }

    public void setSearchProperty(String searchProperty) {
        this.searchProperty = searchProperty;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public Map<String, Object> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, Object> filters) {
        this.filters = filters;
    }

    public String getSortProperty() {
        return sortProperty;
    }

    public void setSortProperty(String sortProperty) {
        this.sortProperty = sortProperty;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

   /* *//**
     * 生成HashCode
     *
     * @return HashCode
     *//*
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getPageNumber()).append(getPageSize()).append(getSearchProperty())
                .append(getSearchValue()).append(getFilters()).append(getSortProperty()).append(getSortDirection()).toHashCode();
    }

    *//**
     * 判断是否相等
     *
     * @param obj 对象
     * @return 是否相等
     *//*
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (isEmpty() || obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pageable pageable = (Pageable) obj;
        if (pageable.isEmpty()) {
            return false;
        }
        return new EqualsBuilder().append(getPageNumber(), pageable.getPageNumber())
                .append(getPageSize(), pageable.getPageSize())
                .append(getSearchProperty(), pageable.getSearchProperty())
                .append(getSearchValue(), pageable.getSearchValue()).append(getFilters(), pageable.getFilters())
                .append(getSortProperty(), pageable.getSortProperty())
                .append(getSortDirection(), pageable.getSortDirection()).isEquals();
    }*/

    /**
     * 判断是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return getPageNumber() == null || getPageSize() == null;
    }

    /**
     * 返回拼接的排序字符
     *
     * @return order by XX desc|asc
     */
    public String getOrderBy() {
        if(this.getSortProperty()==null){
            setSortProperty(" id ");
            setSortDirection(" desc");
        }
        return CamelNameUtils.toUnderline(this.getSortProperty()) + " " + this.getSortDirection();
    }
}
