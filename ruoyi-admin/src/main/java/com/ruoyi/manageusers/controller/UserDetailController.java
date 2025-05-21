package com.ruoyi.manageusers.controller;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.manageusers.domain.WeightLogs;
import com.ruoyi.manageusers.domain.FoodLogs;
import com.ruoyi.manageusers.domain.ExerciseLogs;
import com.ruoyi.manageusers.domain.DoctorAdvice;
import com.ruoyi.manageusers.service.IWeightLogsService;
import com.ruoyi.manageusers.service.IFoodLogsService;
import com.ruoyi.manageusers.service.IExerciseLogsService;
import com.ruoyi.manageusers.service.IDoctorAdviceService;

/**
 * 用户详情Controller
 * 
 * @author ruoyi
 * @date 2025-04-04
 */
@RestController
@RequestMapping("/manageusers/detail")
public class UserDetailController extends BaseController
{
    @Autowired
    private IWeightLogsService weightLogsService;
    
    @Autowired
    private IFoodLogsService foodLogsService;
    
    @Autowired
    private IExerciseLogsService exerciseLogsService;
    
    @Autowired
    private IDoctorAdviceService doctorAdviceService;

    /**
     * 获取用户减重记录
     */
    @PreAuthorize("@ss.hasPermi('manageusers:detail:query')")
    @GetMapping(value = "/weight/{peopleId}")
    public AjaxResult getWeightLogs(@PathVariable("peopleId") String peopleId)
    {
        List<WeightLogs> list = weightLogsService.selectWeightLogsByPeopleId(peopleId);
        return success(list);
    }

    /**
     * 获取用户饮食记录
     */
    @PreAuthorize("@ss.hasPermi('manageusers:detail:query')")
    @GetMapping(value = "/food/{peopleId}")
    public AjaxResult getFoodLogs(@PathVariable("peopleId") String peopleId)
    {
        List<FoodLogs> list = foodLogsService.selectFoodLogsByPeopleId(peopleId);
        return success(list);
    }

    /**
     * 获取用户运动记录
     */
    @PreAuthorize("@ss.hasPermi('manageusers:detail:query')")
    @GetMapping(value = "/exercise/{peopleId}")
    public AjaxResult getExerciseLogs(@PathVariable("peopleId") String peopleId)
    {
        ExerciseLogs exerciseLogs = new ExerciseLogs();
        exerciseLogs.setPeopleId(peopleId);
        List<ExerciseLogs> list = exerciseLogsService.selectExerciseLogsList(exerciseLogs);
        return success(list);
    }
    
    /**
     * 获取医生建议
     */
    @PreAuthorize("@ss.hasPermi('manageusers:detail:query')")
    @GetMapping(value = "/advice/{peopleId}")
    public AjaxResult getDoctorAdvice(@PathVariable("peopleId") String peopleId)
    {
        List<DoctorAdvice> list = doctorAdviceService.selectDoctorAdviceByPeopleId(peopleId);
        return success(list);
    }
    
    /**
     * 获取用户所有健康数据（包括减重记录、饮食记录、运动记录、医生建议）
     */
    @PreAuthorize("@ss.hasPermi('manageusers:detail:query')")
    @GetMapping(value = "/all/{peopleId}")
    public AjaxResult getAllUserData(@PathVariable("peopleId") String peopleId)
    {
        Map<String, Object> data = new HashMap<>();
        data.put("weightLogs", weightLogsService.selectWeightLogsByPeopleId(peopleId));
        data.put("foodLogs", foodLogsService.selectFoodLogsByPeopleId(peopleId));
        
        // 使用与getExerciseLogs方法相同的方式获取运动记录
        ExerciseLogs exerciseLogs = new ExerciseLogs();
        exerciseLogs.setPeopleId(peopleId);
        data.put("exerciseLogs", exerciseLogsService.selectExerciseLogsList(exerciseLogs));
        
        data.put("doctorAdvice", doctorAdviceService.selectDoctorAdviceByPeopleId(peopleId));
        return success(data);
    }

    /**
     * 添加医生建议
     */
    @PreAuthorize("@ss.hasPermi('manageusers:detail:add')")
    @Log(title = "医生建议", businessType = BusinessType.INSERT)
    @PostMapping("/advice")
    public AjaxResult addAdvice(@RequestBody DoctorAdvice doctorAdvice)
    {
        // 设置当前登录医生的ID
        doctorAdvice.setUserId(SecurityUtils.getUserId().toString());
        // 设置创建时间
        doctorAdvice.setCreateTime(new Date());
        return toAjax(doctorAdviceService.insertDoctorAdvice(doctorAdvice));
    }
} 