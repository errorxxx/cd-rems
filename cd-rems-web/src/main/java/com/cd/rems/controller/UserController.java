package com.cd.rems.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.RoleApi;
import com.cd.rems.api.UserApi;
import com.cd.rems.entity.TRole;
import com.cd.rems.entity.TUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/11/7 22:50
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    UserApi userApi;

    @Reference
    RoleApi roleApi;

    @RequestMapping("/query")
    public List<TUser> selectAll() {
        return userApi.selectAll();
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/getAllRoles")
    public List<TRole> getAllRoles() {
        return roleApi.selectAll();
    }


}
