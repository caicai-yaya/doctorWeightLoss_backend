package com.ruoyi.manageusers.mapper;

import java.util.List;
import com.ruoyi.manageusers.domain.Users;

/**
 * 管理用户Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-01
 */
public interface UsersMapper 
{
    /**
     * 查询管理用户
     * 
     * @param peopleId 管理用户主键
     * @return 管理用户
     */
    public Users selectUsersByPeopleId(Long peopleId);

    /**
     * 查询管理用户列表
     * 
     * @param users 管理用户
     * @return 管理用户集合
     */
    public List<Users> selectUsersList(Users users);

    /**
     * 新增管理用户
     * 
     * @param users 管理用户
     * @return 结果
     */
    public int insertUsers(Users users);

    /**
     * 修改管理用户
     * 
     * @param users 管理用户
     * @return 结果
     */
    public int updateUsers(Users users);

    /**
     * 删除管理用户
     * 
     * @param peopleId 管理用户主键
     * @return 结果
     */
    public int deleteUsersByPeopleId(Long peopleId);

    /**
     * 批量删除管理用户
     * 
     * @param peopleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUsersByPeopleIds(Long[] peopleIds);
}
