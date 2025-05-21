package com.ruoyi.manageusers.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.manageusers.domain.Users;
import com.ruoyi.manageusers.service.IUsersService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 管理用户Controller
 * 
 * @author ruoyi
 * @date 2025-04-01
 */
@RestController
@RequestMapping("/manageusers/manageusers")
public class UsersController extends BaseController
{
    @Autowired
    private IUsersService usersService;

    /**
     * 查询管理用户列表
     */
    @PreAuthorize("@ss.hasPermi('manageusers:manageusers:list')")
    @GetMapping("/list")
    public TableDataInfo list(Users users)
    {
        startPage();
        List<Users> list = usersService.selectUsersList(users);
        return getDataTable(list);
    }

    /**
     * 导出管理用户列表
     */
    @PreAuthorize("@ss.hasPermi('manageusers:manageusers:export')")
    @Log(title = "管理用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Users users)
    {
        List<Users> list = usersService.selectUsersList(users);
        ExcelUtil<Users> util = new ExcelUtil<Users>(Users.class);
        util.exportExcel(response, list, "管理用户数据");
    }

    /**
     * 获取管理用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('manageusers:manageusers:query')")
    @GetMapping(value = "/{peopleId}")
    public AjaxResult getInfo(@PathVariable("peopleId") Long peopleId)
    {
        return success(usersService.selectUsersByPeopleId(peopleId));
    }

    /**
     * 新增管理用户
     */
    @PreAuthorize("@ss.hasPermi('manageusers:manageusers:add')")
    @Log(title = "管理用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Users users)
    {
        return toAjax(usersService.insertUsers(users));
    }

    /**
     * 修改管理用户
     */
    @PreAuthorize("@ss.hasPermi('manageusers:manageusers:edit')")
    @Log(title = "管理用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Users users)
    {
        return toAjax(usersService.updateUsers(users));
    }

    /**
     * 删除管理用户
     */
    @PreAuthorize("@ss.hasPermi('manageusers:manageusers:remove')")
    @Log(title = "管理用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{peopleIds}")
    public AjaxResult remove(@PathVariable Long[] peopleIds)
    {
        return toAjax(usersService.deleteUsersByPeopleIds(peopleIds));
    }
}
