package com.cd.rems.service;

import com.cd.rems.entity.TRole;

import java.util.List;

/**
 * @Description 角色相关服务
 * @Autor 谢修继
 * @Date 2019/11/18 22:28
 */
public interface RoleService {
    List<TRole> selectAll();

    void addRole(TRole tRole);

    void updateRole(TRole tRole);

    void deleteRole(TRole tRole);
}
