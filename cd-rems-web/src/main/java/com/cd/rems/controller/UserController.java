package com.cd.rems.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.UserApi;
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
@RequestMapping("/User")
public class UserController {

    @Reference
    UserApi userApi;

    @RequestMapping("/query")
    public List<TUser> selectAll(){
        return userApi.selectAll();
    }
}
