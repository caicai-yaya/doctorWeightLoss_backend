package com.ruoyi.manageusers.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户饮食记录对象 food_logs
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public class FoodLogs extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 饮食记录编号，主键（唯一、自增 */
    private Long flId;

    /** 用户id */
    @Excel(name = "用户id")
    private String peopleId;

    /** 食物编号 */
    @Excel(name = "食物编号")
    private Long foodId;

    /** 记录日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 餐次类型（早/中/晚/加餐） */
    @Excel(name = "餐次类型", readConverterExp = "早=/中/晚/加餐")
    private String mealType;

    /** 记录方式（手动/图片上传） */
    @Excel(name = "记录方式", readConverterExp = "手=动/图片上传")
    private String method;

    /** 图片 */
    @Excel(name = "图片")
    private String image;

    /** 多少份 */
    @Excel(name = "多少份")
    private Long sum;
    
    /** 食物名称（非数据库字段） */
    private String foodName;
    
    /** 卡路里（非数据库字段） */
    private Long calories;

    public void setFlId(Long flId) 
    {
        this.flId = flId;
    }

    public Long getFlId() 
    {
        return flId;
    }
    public void setPeopleId(String peopleId) 
    {
        this.peopleId = peopleId;
    }

    public String getPeopleId() 
    {
        return peopleId;
    }
    public void setFoodId(Long foodId) 
    {
        this.foodId = foodId;
    }

    public Long getFoodId() 
    {
        return foodId;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setMealType(String mealType) 
    {
        this.mealType = mealType;
    }

    public String getMealType() 
    {
        return mealType;
    }
    public void setMethod(String method) 
    {
        this.method = method;
    }

    public String getMethod() 
    {
        return method;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setSum(Long sum) 
    {
        this.sum = sum;
    }

    public Long getSum() 
    {
        return sum;
    }
    
    public String getFoodName() 
    {
        return foodName;
    }

    public void setFoodName(String foodName) 
    {
        this.foodName = foodName;
    }
    
    public Long getCalories() 
    {
        return calories;
    }

    public void setCalories(Long calories) 
    {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("flId", getFlId())
            .append("peopleId", getPeopleId())
            .append("foodId", getFoodId())
            .append("date", getDate())
            .append("mealType", getMealType())
            .append("method", getMethod())
            .append("image", getImage())
            .append("sum", getSum())
            .append("foodName", getFoodName())
            .append("calories", getCalories())
            .toString();
    }
} 