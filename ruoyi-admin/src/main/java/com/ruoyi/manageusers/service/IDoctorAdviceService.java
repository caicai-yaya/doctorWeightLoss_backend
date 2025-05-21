package com.ruoyi.manageusers.service;

import java.util.List;
import com.ruoyi.manageusers.domain.DoctorAdvice;

/**
 * 医生建议Service接口
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public interface IDoctorAdviceService 
{
    /**
     * 查询医生建议
     * 
     * @param adviceId 医生建议主键
     * @return 医生建议
     */
    public DoctorAdvice selectDoctorAdviceById(Long adviceId);

    /**
     * 查询医生建议列表
     * 
     * @param doctorAdvice 医生建议
     * @return 医生建议集合
     */
    public List<DoctorAdvice> selectDoctorAdviceList(DoctorAdvice doctorAdvice);
    
    /**
     * 查询医生建议列表通过用户ID
     * 
     * @param peopleId 用户ID
     * @return 医生建议集合
     */
    public List<DoctorAdvice> selectDoctorAdviceByPeopleId(String peopleId);

    /**
     * 新增医生建议
     * 
     * @param doctorAdvice 医生建议
     * @return 结果
     */
    public int insertDoctorAdvice(DoctorAdvice doctorAdvice);

    /**
     * 修改医生建议
     * 
     * @param doctorAdvice 医生建议
     * @return 结果
     */
    public int updateDoctorAdvice(DoctorAdvice doctorAdvice);

    /**
     * 批量删除医生建议
     * 
     * @param adviceIds 需要删除的医生建议主键集合
     * @return 结果
     */
    public int deleteDoctorAdviceByIds(Long[] adviceIds);

    /**
     * 删除医生建议信息
     * 
     * @param adviceId 医生建议主键
     * @return 结果
     */
    public int deleteDoctorAdviceById(Long adviceId);
} 