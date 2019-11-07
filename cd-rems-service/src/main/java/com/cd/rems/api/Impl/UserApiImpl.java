package com.cd.rems.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cd.rems.api.UserApi;
import com.cd.rems.entity.TUser;
import com.cd.rems.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description UserApi实现类
 * @Autor 谢修继
 * @Date 2019/11/7 22:46
 */
@Service
@Component
public class UserApiImpl implements UserApi {
    @Autowired
    UserServiceImpl userService;

    @Override
    public List<TUser> selectAll() {
        return userService.selectAll();
    }
}
