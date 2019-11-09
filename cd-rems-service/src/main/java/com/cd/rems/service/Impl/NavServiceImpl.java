package com.cd.rems.service.Impl;

import com.cd.rems.dao.TNavMapper;
import com.cd.rems.entity.TNav;
import com.cd.rems.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class NavServiceImpl implements NavService {
    @Autowired
    TNavMapper navMapper;
    @Override
    public List<TNav> getAllVisibleMenuByType(TNav nav) {
        return navMapper.getAllVisibleMenuByType(nav);
    }
}
