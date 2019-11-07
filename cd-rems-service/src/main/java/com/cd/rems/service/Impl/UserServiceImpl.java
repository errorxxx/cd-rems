package com.cd.rems.service.Impl;

import com.cd.rems.dao.TUserMapper;
import com.cd.rems.entity.TUser;
import com.cd.rems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/11/7 22:56
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    TUserMapper mapper;

    @Override
    public List<TUser> selectAll() {
        return mapper.selectAll();
    }
}
