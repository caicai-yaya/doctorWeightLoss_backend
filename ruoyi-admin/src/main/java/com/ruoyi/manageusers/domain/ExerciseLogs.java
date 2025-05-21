package com.ruoyi.manageusers.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户运动记录对象 exercise_logs
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public class ExerciseLogs extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 运动记录编号，主键（唯一、自增 */
    private Long elId;

    /** 用户id */
    @Excel(name = "用户id")
    private String peopleId;

    /** 运动id */
    @Excel(name = "运动id")
    private Long exerciseId;

    /** 运动名称 */
    @Excel(name = "运动名称")
    private String exerciseName;

    /** 记录日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 运动时长 */
    @Excel(name = "运动时长")
    private String duration;

    /** 消耗卡路里 */
    @Excel(name = "消耗卡路里")
    private String caloriesBurned;

    public void setElId(Long elId) 
    {
        this.elId = elId;
    }

    public Long getElId() 
    {
        return elId;
    }
    public void setPeopleId(String peopleId) 
    {
        this.peopleId = peopleId;
    }

    public String getPeopleId() 
    {
        return peopleId;
    }
    
    public String getUserId() 
    {
        return peopleId;
    }

    public void setUserId(String userId) 
    {
        this.peopleId = userId;
    }
    
    public void setExerciseId(Long exerciseId) 
    {
        this.exerciseId = exerciseId;
    }

    public Long getExerciseId() 
    {
        return exerciseId;
    }
    public void setExerciseName(String exerciseName) 
    {
        this.exerciseName = exerciseName;
    }

    public String getExerciseName() 
    {
        return exerciseName;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setDuration(String duration) 
    {
        this.duration = duration;
    }

    public String getDuration() 
    {
        return duration;
    }
    public void setCaloriesBurned(String caloriesBurned) 
    {
        this.caloriesBurned = caloriesBurned;
    }

    public String getCaloriesBurned() 
    {
        return caloriesBurned;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("elId", getElId())
            .append("peopleId", getPeopleId())
            .append("exerciseId", getExerciseId())
            .append("exerciseName", getExerciseName())
            .append("date", getDate())
            .append("duration", getDuration())
            .append("caloriesBurned", getCaloriesBurned())
            .toString();
    }
} 