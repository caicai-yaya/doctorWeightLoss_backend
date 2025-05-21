package com.ruoyi.manageusers.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manageusers.mapper.UsersMapper;
import com.ruoyi.manageusers.domain.Users;
import com.ruoyi.manageusers.service.IUsersService;

/**
 * 管理用户Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-01
 */
@Service
public class UsersServiceImpl implements IUsersService 
{
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 查询管理用户
     * 
     * @param peopleId 管理用户主键
     * @return 管理用户
     */
    @Override
    public Users selectUsersByPeopleId(Long peopleId)
    {
        return usersMapper.selectUsersByPeopleId(peopleId);
    }

    /**
     * 查询管理用户列表
     * 
     * @param users 管理用户
     * @return 管理用户
     */
    @Override
    public List<Users> selectUsersList(Users users)
    {
        return usersMapper.selectUsersList(users);
    }

    /**
     * 新增管理用户
     * 
     * @param users 管理用户
     * @return 结果
     */
    @Override
    public int insertUsers(Users users)
    {
        return usersMapper.insertUsers(users);
    }

    /**
     * 修改管理用户
     * 
     * @param users 管理用户
     * @return 结果
     */
    @Override
    public int updateUsers(Users users)
    {
        return usersMapper.updateUsers(users);
    }

    /**
     * 批量删除管理用户
     * 
     * @param peopleIds 需要删除的管理用户主键
     * @return 结果
     */
    @Override
    public int deleteUsersByPeopleIds(Long[] peopleIds)
    {
        return usersMapper.deleteUsersByPeopleIds(peopleIds);
    }

    /**
     * 删除管理用户信息
     * 
     * @param peopleId 管理用户主键
     * @return 结果
     */
    @Override
    public int deleteUsersByPeopleId(Long peopleId)
    {
        return usersMapper.deleteUsersByPeopleId(peopleId);
    }
}
