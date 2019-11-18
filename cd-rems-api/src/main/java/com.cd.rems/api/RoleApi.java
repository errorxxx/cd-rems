package com.cd.rems.api;

import com.cd.rems.entity.TRole;
import com.cd.rems.entity.TUser;

import java.util.List;

/**
 * @Description 角色相关接口
 * @Autor 谢修继
 * @Date 2019/11/18 22:25
 */
public interface RoleApi {
    List<TRole> selectAll();
}
