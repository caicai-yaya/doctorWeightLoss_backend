package com.ruoyi.manageusers.mapper;

import java.util.List;
import com.ruoyi.manageusers.domain.ExerciseLogs;

/**
 * 用户运动记录Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
public interface ExerciseLogsMapper 
{
    /**
     * 查询用户运动记录
     * 
     * @param elId 用户运动记录主键
     * @return 用户运动记录
     */
    public ExerciseLogs selectExerciseLogsById(Long elId);

    /**
     * 查询用户运动记录列表
     * 
     * @param exerciseLogs 用户运动记录
     * @return 用户运动记录集合
     */
    public List<ExerciseLogs> selectExerciseLogsList(ExerciseLogs exerciseLogs);
    
    /**
     * 查询用户运动记录列表通过用户ID
     * 
     * @param userId 用户ID
     * @return 用户运动记录集合
     */
    public List<ExerciseLogs> selectExerciseLogsByUserId(String userId);

    /**
     * 新增用户运动记录
     * 
     * @param exerciseLogs 用户运动记录
     * @return 结果
     */
    public int insertExerciseLogs(ExerciseLogs exerciseLogs);

    /**
     * 修改用户运动记录
     * 
     * @param exerciseLogs 用户运动记录
     * @return 结果
     */
    public int updateExerciseLogs(ExerciseLogs exerciseLogs);

    /**
     * 删除用户运动记录
     * 
     * @param elId 用户运动记录主键
     * @return 结果
     */
    public int deleteExerciseLogsById(Long elId);

    /**
     * 批量删除用户运动记录
     * 
     * @param elIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExerciseLogsByIds(Long[] elIds);
} 