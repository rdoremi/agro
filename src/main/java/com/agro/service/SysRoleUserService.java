package com.agro.service;

import com.agro.pojo.SysRoleUser;

import java.util.List;

/**
 * (SysRoleUser)表服务接口
 *
 * @author makejava
 * @since 2020-07-17 14:59:03
 */
public interface SysRoleUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    SysRoleUser queryById(Long userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRoleUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    SysRoleUser insert(SysRoleUser sysRoleUser);

    /**
     * 修改数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    boolean update(SysRoleUser sysRoleUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Long userId);

    int save(SysRoleUser sysRoleUser);
}