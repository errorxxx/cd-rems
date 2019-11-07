package com.cd.rems.service;

import com.cd.rems.entity.TUser;

import java.util.List;

/**
 * @Description 用户创建等服务
 * @Autor 谢修继
 * @Date 2019/11/7 22:55
 */
public interface UserService {

     /*
     * @Author 谢修继
     * @Description 获取所有用户
     * @Date 2019/11/7 22:57
     * @Param
     * @return
     **/
    List<TUser> selectAll();
}
