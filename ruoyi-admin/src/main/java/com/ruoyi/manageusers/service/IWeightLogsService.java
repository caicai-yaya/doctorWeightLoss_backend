package com.ruoyi.manageusers.service;

import java.util.List;
import com.ruoyi.manageusers.domain.WeightLogs;

/**
 * 用户减重记录Service接口
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public interface IWeightLogsService 
{
    /**
     * 查询用户减重记录
     * 
     * @param weightLogsId 用户减重记录主键
     * @return 用户减重记录
     */
    public WeightLogs selectWeightLogsById(Long weightLogsId);

    /**
     * 查询用户减重记录列表
     * 
     * @param weightLogs 用户减重记录
     * @return 用户减重记录集合
     */
    public List<WeightLogs> selectWeightLogsList(WeightLogs weightLogs);
    
    /**
     * 查询用户减重记录列表通过用户ID
     * 
     * @param peopleId 用户ID
     * @return 用户减重记录集合
     */
    public List<WeightLogs> selectWeightLogsByPeopleId(String peopleId);

    /**
     * 新增用户减重记录
     * 
     * @param weightLogs 用户减重记录
     * @return 结果
     */
    public int insertWeightLogs(WeightLogs weightLogs);

    /**
     * 修改用户减重记录
     * 
     * @param weightLogs 用户减重记录
     * @return 结果
     */
    public int updateWeightLogs(WeightLogs weightLogs);

    /**
     * 批量删除用户减重记录
     * 
     * @param weightLogsIds 需要删除的用户减重记录主键集合
     * @return 结果
     */
    public int deleteWeightLogsByIds(Long[] weightLogsIds);

    /**
     * 删除用户减重记录信息
     * 
     * @param weightLogsId 用户减重记录主键
     * @return 结果
     */
    public int deleteWeightLogsById(Long weightLogsId);
} 