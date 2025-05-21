package com.ruoyi.manageusers.mapper;

import java.util.List;
import com.ruoyi.manageusers.domain.FoodLogs;

/**
 * 用户饮食记录Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public interface FoodLogsMapper 
{
    /**
     * 查询用户饮食记录
     * 
     * @param flId 用户饮食记录主键
     * @return 用户饮食记录
     */
    public FoodLogs selectFoodLogsById(Long flId);

    /**
     * 查询用户饮食记录列表
     * 
     * @param foodLogs 用户饮食记录
     * @return 用户饮食记录集合
     */
    public List<FoodLogs> selectFoodLogsList(FoodLogs foodLogs);
    
    /**
     * 查询用户饮食记录列表通过用户ID
     * 
     * @param peopleId 用户ID
     * @return 用户饮食记录集合
     */
    public List<FoodLogs> selectFoodLogsByPeopleId(String peopleId);

    /**
     * 新增用户饮食记录
     * 
     * @param foodLogs 用户饮食记录
     * @return 结果
     */
    public int insertFoodLogs(FoodLogs foodLogs);

    /**
     * 修改用户饮食记录
     * 
     * @param foodLogs 用户饮食记录
     * @return 结果
     */
    public int updateFoodLogs(FoodLogs foodLogs);

    /**
     * 删除用户饮食记录
     * 
     * @param flId 用户饮食记录主键
     * @return 结果
     */
    public int deleteFoodLogsById(Long flId);

    /**
     * 批量删除用户饮食记录
     * 
     * @param flIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFoodLogsByIds(Long[] flIds);
} 