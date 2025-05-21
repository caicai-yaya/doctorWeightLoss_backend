package com.ruoyi.manageusers.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生建议对象 doctor_advice
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public class DoctorAdvice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 建议编号，主键 */
    private Long adviceId;

    /** 患者编号 */
    @Excel(name = "患者编号")
    private String peopleId;

    /** 医生编号 */
    @Excel(name = "医生编号")
    private String userId;

    /** 建议类型（如食材替换、睡眠等） */
    @Excel(name = "建议类型", readConverterExp = "如=食材替换、睡眠等")
    private String adviceType;

    /** 建议内容 */
    @Excel(name = "建议内容")
    private String adviceContent;
    
    /** 建议日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "建议日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public void setAdviceId(Long adviceId) 
    {
        this.adviceId = adviceId;
    }

    public Long getAdviceId() 
    {
        return adviceId;
    }
    public void setPeopleId(String peopleId) 
    {
        this.peopleId = peopleId;
    }

    public String getPeopleId() 
    {
        return peopleId;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setAdviceType(String adviceType) 
    {
        this.adviceType = adviceType;
    }

    public String getAdviceType() 
    {
        return adviceType;
    }
    public void setAdviceContent(String adviceContent) 
    {
        this.adviceContent = adviceContent;
    }

    public String getAdviceContent() 
    {
        return adviceContent;
    }
    
    public void setCreateTime(Date createTime) 
    {
        this.createTime = createTime;
    }

    public Date getCreateTime() 
    {
        return createTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("adviceId", getAdviceId())
            .append("peopleId", getPeopleId())
            .append("userId", getUserId())
            .append("adviceType", getAdviceType())
            .append("adviceContent", getAdviceContent())
            .append("createTime", getCreateTime())
            .toString();
    }
} 