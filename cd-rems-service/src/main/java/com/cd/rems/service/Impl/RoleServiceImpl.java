package com.cd.rems.service.Impl;

import com.cd.rems.dao.TRoleMapper;
import com.cd.rems.entity.TRole;
import com.cd.rems.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/11/18 22:29
 */
@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    TRoleMapper roleMapper;
    @Override
    public List<TRole> selectAll() {
        return roleMapper.selectAll();
    }
}
