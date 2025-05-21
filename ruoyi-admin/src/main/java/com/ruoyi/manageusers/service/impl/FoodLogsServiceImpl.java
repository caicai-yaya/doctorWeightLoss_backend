package com.ruoyi.manageusers.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manageusers.mapper.FoodLogsMapper;
import com.ruoyi.manageusers.domain.FoodLogs;
import com.ruoyi.manageusers.service.IFoodLogsService;

/**
 * 用户饮食记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
@Service
public class FoodLogsServiceImpl implements IFoodLogsService 
{
    @Autowired
    private FoodLogsMapper foodLogsMapper;

    /**
     * 查询用户饮食记录
     * 
     * @param flId 用户饮食记录主键
     * @return 用户饮食记录
     */
    @Override
    public FoodLogs selectFoodLogsById(Long flId)
    {
        return foodLogsMapper.selectFoodLogsById(flId);
    }

    /**
     * 查询用户饮食记录列表
     * 
     * @param foodLogs 用户饮食记录
     * @return 用户饮食记录
     */
    @Override
    public List<FoodLogs> selectFoodLogsList(FoodLogs foodLogs)
    {
        return foodLogsMapper.selectFoodLogsList(foodLogs);
    }
    
    /**
     * 查询用户饮食记录列表通过用户ID
     * 
     * @param peopleId 用户ID
     * @return 用户饮食记录集合
     */
    @Override
    public List<FoodLogs> selectFoodLogsByPeopleId(String peopleId)
    {
        return foodLogsMapper.selectFoodLogsByPeopleId(peopleId);
    }

    /**
     * 新增用户饮食记录
     * 
     * @param foodLogs 用户饮食记录
     * @return 结果
     */
    @Override
    public int insertFoodLogs(FoodLogs foodLogs)
    {
        return foodLogsMapper.insertFoodLogs(foodLogs);
    }

    /**
     * 修改用户饮食记录
     * 
     * @param foodLogs 用户饮食记录
     * @return 结果
     */
    @Override
    public int updateFoodLogs(FoodLogs foodLogs)
    {
        return foodLogsMapper.updateFoodLogs(foodLogs);
    }

    /**
     * 批量删除用户饮食记录
     * 
     * @param flIds 需要删除的用户饮食记录主键
     * @return 结果
     */
    @Override
    public int deleteFoodLogsByIds(Long[] flIds)
    {
        return foodLogsMapper.deleteFoodLogsByIds(flIds);
    }

    /**
     * 删除用户饮食记录信息
     * 
     * @param flId 用户饮食记录主键
     * @return 结果
     */
    @Override
    public int deleteFoodLogsById(Long flId)
    {
        return foodLogsMapper.deleteFoodLogsById(flId);
    }
} 