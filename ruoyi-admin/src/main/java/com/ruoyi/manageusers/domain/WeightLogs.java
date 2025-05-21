package com.ruoyi.manageusers.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户减重记录对象 weight_logs
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public class WeightLogs extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 减重记录编号，主键（唯一、自增 */
    private Long weightLogsId;

    /** 用户id */
    @Excel(name = "用户id")
    private String peopleId;

    /** 记录日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 原始体重 */
    @Excel(name = "原始体重")
    private Float originalweight;

    /** 当前体重 */
    @Excel(name = "当前体重")
    private Float currentweight;

    public void setWeightLogsId(Long weightLogsId) 
    {
        this.weightLogsId = weightLogsId;
    }

    public Long getWeightLogsId() 
    {
        return weightLogsId;
    }
    public void setPeopleId(String peopleId) 
    {
        this.peopleId = peopleId;
    }

    public String getPeopleId() 
    {
        return peopleId;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setOriginalweight(Float originalweight) 
    {
        this.originalweight = originalweight;
    }

    public Float getOriginalweight() 
    {
        return originalweight;
    }
    public void setCurrentweight(Float currentweight) 
    {
        this.currentweight = currentweight;
    }

    public Float getCurrentweight() 
    {
        return currentweight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("weightLogsId", getWeightLogsId())
            .append("peopleId", getPeopleId())
            .append("date", getDate())
            .append("originalweight", getOriginalweight())
            .append("currentweight", getCurrentweight())
            .toString();
    }
} 