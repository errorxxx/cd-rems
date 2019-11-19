package com.cd.rems.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cd.rems.api.RoleApi;
import com.cd.rems.entity.TRole;
import com.cd.rems.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/11/18 22:27
 */
@Service
@Component
public class RoleApiImpl implements RoleApi {
    @Autowired
    RoleService roleService;

    @Override
    public List<TRole> selectAll() {
        return roleService.selectAll();
    }

    @Override
    public void addRole(TRole tRole) {
        this.roleService.addRole(tRole);
    }

    @Override
    public void updateRole(TRole tRole) {
        this.roleService.updateRole(tRole);
    }

    @Override
    public void deleteRole(TRole tRole) {
        this.roleService.deleteRole(tRole);
    }
}
