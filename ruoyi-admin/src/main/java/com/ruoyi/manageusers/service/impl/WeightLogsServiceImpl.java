package com.ruoyi.manageusers.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manageusers.mapper.WeightLogsMapper;
import com.ruoyi.manageusers.domain.WeightLogs;
import com.ruoyi.manageusers.service.IWeightLogsService;

/**
 * 用户减重记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
@Service
public class WeightLogsServiceImpl implements IWeightLogsService 
{
    @Autowired
    private WeightLogsMapper weightLogsMapper;

    /**
     * 查询用户减重记录
     * 
     * @param weightLogsId 用户减重记录主键
     * @return 用户减重记录
     */
    @Override
    public WeightLogs selectWeightLogsById(Long weightLogsId)
    {
        return weightLogsMapper.selectWeightLogsById(weightLogsId);
    }

    /**
     * 查询用户减重记录列表
     * 
     * @param weightLogs 用户减重记录
     * @return 用户减重记录
     */
    @Override
    public List<WeightLogs> selectWeightLogsList(WeightLogs weightLogs)
    {
        return weightLogsMapper.selectWeightLogsList(weightLogs);
    }
    
    /**
     * 查询用户减重记录列表通过用户ID
     * 
     * @param peopleId 用户ID
     * @return 用户减重记录集合
     */
    @Override
    public List<WeightLogs> selectWeightLogsByPeopleId(String peopleId)
    {
        return weightLogsMapper.selectWeightLogsByPeopleId(peopleId);
    }

    /**
     * 新增用户减重记录
     * 
     * @param weightLogs 用户减重记录
     * @return 结果
     */
    @Override
    public int insertWeightLogs(WeightLogs weightLogs)
    {
        return weightLogsMapper.insertWeightLogs(weightLogs);
    }

    /**
     * 修改用户减重记录
     * 
     * @param weightLogs 用户减重记录
     * @return 结果
     */
    @Override
    public int updateWeightLogs(WeightLogs weightLogs)
    {
        return weightLogsMapper.updateWeightLogs(weightLogs);
    }

    /**
     * 批量删除用户减重记录
     * 
     * @param weightLogsIds 需要删除的用户减重记录主键
     * @return 结果
     */
    @Override
    public int deleteWeightLogsByIds(Long[] weightLogsIds)
    {
        return weightLogsMapper.deleteWeightLogsByIds(weightLogsIds);
    }

    /**
     * 删除用户减重记录信息
     * 
     * @param weightLogsId 用户减重记录主键
     * @return 结果
     */
    @Override
    public int deleteWeightLogsById(Long weightLogsId)
    {
        return weightLogsMapper.deleteWeightLogsById(weightLogsId);
    }
} 