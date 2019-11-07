package com.cd.rems.api;

import com.cd.rems.entity.TUser;

import java.util.List;

/**
 * @Description 用户信息api
 * @Autor 谢修继
 * @Date 2019/11/7 22:25
 */
public interface UserApi {
    List<TUser> selectAll();
}
