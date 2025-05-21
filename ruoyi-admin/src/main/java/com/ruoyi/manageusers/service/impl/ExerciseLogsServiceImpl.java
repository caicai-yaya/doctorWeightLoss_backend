package com.ruoyi.manageusers.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manageusers.mapper.ExerciseLogsMapper;
import com.ruoyi.manageusers.domain.ExerciseLogs;
import com.ruoyi.manageusers.service.IExerciseLogsService;

/**
 * 用户运动记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
@Service
public class ExerciseLogsServiceImpl implements IExerciseLogsService 
{
    @Autowired
    private ExerciseLogsMapper exerciseLogsMapper;

    /**
     * 查询用户运动记录
     * 
     * @param elId 用户运动记录主键
     * @return 用户运动记录
     */
    @Override
    public ExerciseLogs selectExerciseLogsById(Long elId)
    {
        return exerciseLogsMapper.selectExerciseLogsById(elId);
    }

    /**
     * 查询用户运动记录列表
     * 
     * @param exerciseLogs 用户运动记录
     * @return 用户运动记录
     */
    @Override
    public List<ExerciseLogs> selectExerciseLogsList(ExerciseLogs exerciseLogs)
    {
        return exerciseLogsMapper.selectExerciseLogsList(exerciseLogs);
    }
    
    /**
     * 查询用户运动记录列表通过用户ID
     * 
     * @param userId 用户ID
     * @return 用户运动记录集合
     */
    @Override
    public List<ExerciseLogs> selectExerciseLogsByUserId(String userId)
    {
        return exerciseLogsMapper.selectExerciseLogsByUserId(userId);
    }

    /**
     * 新增用户运动记录
     * 
     * @param exerciseLogs 用户运动记录
     * @return 结果
     */
    @Override
    public int insertExerciseLogs(ExerciseLogs exerciseLogs)
    {
        return exerciseLogsMapper.insertExerciseLogs(exerciseLogs);
    }

    /**
     * 修改用户运动记录
     * 
     * @param exerciseLogs 用户运动记录
     * @return 结果
     */
    @Override
    public int updateExerciseLogs(ExerciseLogs exerciseLogs)
    {
        return exerciseLogsMapper.updateExerciseLogs(exerciseLogs);
    }

    /**
     * 批量删除用户运动记录
     * 
     * @param elIds 需要删除的用户运动记录主键
     * @return 结果
     */
    @Override
    public int deleteExerciseLogsByIds(Long[] elIds)
    {
        return exerciseLogsMapper.deleteExerciseLogsByIds(elIds);
    }

    /**
     * 删除用户运动记录信息
     * 
     * @param elId 用户运动记录主键
     * @return 结果
     */
    @Override
    public int deleteExerciseLogsById(Long elId)
    {
        return exerciseLogsMapper.deleteExerciseLogsById(elId);
    }
} 