package com.ruoyi.manageusers.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manageusers.mapper.DoctorAdviceMapper;
import com.ruoyi.manageusers.domain.DoctorAdvice;
import com.ruoyi.manageusers.service.IDoctorAdviceService;

/**
 * 医生建议Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
@Service
public class DoctorAdviceServiceImpl implements IDoctorAdviceService 
{
    @Autowired
    private DoctorAdviceMapper doctorAdviceMapper;

    /**
     * 查询医生建议
     * 
     * @param adviceId 医生建议主键
     * @return 医生建议
     */
    @Override
    public DoctorAdvice selectDoctorAdviceById(Long adviceId)
    {
        return doctorAdviceMapper.selectDoctorAdviceById(adviceId);
    }

    /**
     * 查询医生建议列表
     * 
     * @param doctorAdvice 医生建议
     * @return 医生建议
     */
    @Override
    public List<DoctorAdvice> selectDoctorAdviceList(DoctorAdvice doctorAdvice)
    {
        return doctorAdviceMapper.selectDoctorAdviceList(doctorAdvice);
    }
    
    /**
     * 查询医生建议列表通过用户ID
     * 
     * @param peopleId 用户ID
     * @return 医生建议集合
     */
    @Override
    public List<DoctorAdvice> selectDoctorAdviceByPeopleId(String peopleId)
    {
        return doctorAdviceMapper.selectDoctorAdviceByPeopleId(peopleId);
    }

    /**
     * 新增医生建议
     * 
     * @param doctorAdvice 医生建议
     * @return 结果
     */
    @Override
    public int insertDoctorAdvice(DoctorAdvice doctorAdvice)
    {
        return doctorAdviceMapper.insertDoctorAdvice(doctorAdvice);
    }

    /**
     * 修改医生建议
     * 
     * @param doctorAdvice 医生建议
     * @return 结果
     */
    @Override
    public int updateDoctorAdvice(DoctorAdvice doctorAdvice)
    {
        return doctorAdviceMapper.updateDoctorAdvice(doctorAdvice);
    }

    /**
     * 批量删除医生建议
     * 
     * @param adviceIds 需要删除的医生建议主键
     * @return 结果
     */
    @Override
    public int deleteDoctorAdviceByIds(Long[] adviceIds)
    {
        return doctorAdviceMapper.deleteDoctorAdviceByIds(adviceIds);
    }

    /**
     * 删除医生建议信息
     * 
     * @param adviceId 医生建议主键
     * @return 结果
     */
    @Override
    public int deleteDoctorAdviceById(Long adviceId)
    {
        return doctorAdviceMapper.deleteDoctorAdviceById(adviceId);
    }
} 