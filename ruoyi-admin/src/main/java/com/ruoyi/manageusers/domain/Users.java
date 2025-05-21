package com.ruoyi.manageusers.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 管理用户对象 users
 * 
 * @author ruoyi
 * @date 2025-04-01
 */
public class Users extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户编号，主键（唯一 */
    private Long peopleId;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 第三方平台账号id，如微信、QQ等 */
    private String thirdPartyId;

    /** 密码 */
    private String password;

    /** 用户角色（1.普通用户、2.肥胖用户）默认为1普通用户 */
    @Excel(name = "用户角色", readConverterExp = "1=.普通用户、2.肥胖用户")
    private Long userRole;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 身高 */
    @Excel(name = "身高")
    private Long height;

    /** 原始体重 */
    @Excel(name = "原始体重")
    private Long originalweight;

    /** 当前 */
    @Excel(name = "当前")
    private Long currentweight;

    /** 体脂率 */
    @Excel(name = "体脂率")
    private Long fatPercentage;

    /** 健康状况 */
    @Excel(name = "健康状况")
    private String healthStatus;

    /** 预期体重 */
    @Excel(name = "预期体重")
    private Long targetWeight;

    /** 饮食偏好（如素食等） */
    @Excel(name = "饮食偏好", readConverterExp = "如=素食等")
    private String preference;

    /** 过敏原 */
    @Excel(name = "过敏原")
    private String allergies;

    /** 注册时间 */
    private Date registration;

    /** 最后登陆时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后登陆时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLogin;

    /** 用户状态，是否激活1.激活 0.未激活，默认为1 */
    private Long isActive;

    /** 负责医生的id */
    @Excel(name = "负责医生的id")
    private Long userId;

    public void setPeopleId(Long peopleId) 
    {
        this.peopleId = peopleId;
    }

    public Long getPeopleId() 
    {
        return peopleId;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setThirdPartyId(String thirdPartyId) 
    {
        this.thirdPartyId = thirdPartyId;
    }

    public String getThirdPartyId() 
    {
        return thirdPartyId;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setUserRole(Long userRole) 
    {
        this.userRole = userRole;
    }

    public Long getUserRole() 
    {
        return userRole;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }

    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setHeight(Long height) 
    {
        this.height = height;
    }

    public Long getHeight() 
    {
        return height;
    }

    public void setOriginalweight(Long originalweight) 
    {
        this.originalweight = originalweight;
    }

    public Long getOriginalweight() 
    {
        return originalweight;
    }

    public void setCurrentweight(Long currentweight) 
    {
        this.currentweight = currentweight;
    }

    public Long getCurrentweight() 
    {
        return currentweight;
    }

    public void setFatPercentage(Long fatPercentage) 
    {
        this.fatPercentage = fatPercentage;
    }

    public Long getFatPercentage() 
    {
        return fatPercentage;
    }

    public void setHealthStatus(String healthStatus) 
    {
        this.healthStatus = healthStatus;
    }

    public String getHealthStatus() 
    {
        return healthStatus;
    }

    public void setTargetWeight(Long targetWeight) 
    {
        this.targetWeight = targetWeight;
    }

    public Long getTargetWeight() 
    {
        return targetWeight;
    }

    public void setPreference(String preference) 
    {
        this.preference = preference;
    }

    public String getPreference() 
    {
        return preference;
    }

    public void setAllergies(String allergies) 
    {
        this.allergies = allergies;
    }

    public String getAllergies() 
    {
        return allergies;
    }

    public void setRegistration(Date registration) 
    {
        this.registration = registration;
    }

    public Date getRegistration() 
    {
        return registration;
    }

    public void setLastLogin(Date lastLogin) 
    {
        this.lastLogin = lastLogin;
    }

    public Date getLastLogin() 
    {
        return lastLogin;
    }

    public void setIsActive(Long isActive) 
    {
        this.isActive = isActive;
    }

    public Long getIsActive() 
    {
        return isActive;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("peopleId", getPeopleId())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("thirdPartyId", getThirdPartyId())
            .append("password", getPassword())
            .append("userRole", getUserRole())
            .append("username", getUsername())
            .append("birthday", getBirthday())
            .append("age", getAge())
            .append("gender", getGender())
            .append("height", getHeight())
            .append("originalweight", getOriginalweight())
            .append("currentweight", getCurrentweight())
            .append("fatPercentage", getFatPercentage())
            .append("healthStatus", getHealthStatus())
            .append("targetWeight", getTargetWeight())
            .append("preference", getPreference())
            .append("allergies", getAllergies())
            .append("registration", getRegistration())
            .append("lastLogin", getLastLogin())
            .append("isActive", getIsActive())
            .append("userId", getUserId())
            .toString();
    }
}
