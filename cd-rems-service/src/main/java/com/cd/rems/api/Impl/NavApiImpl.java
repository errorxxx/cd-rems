package com.cd.rems.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cd.rems.api.NavApi;
import com.cd.rems.entity.TNav;
import com.cd.rems.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service
@Component
public class NavApiImpl implements NavApi {
    @Autowired
    NavService navService;
    @Override
    public List<TNav> getAllVisibleMenuByType(TNav nav) {
        return navService.getAllVisibleMenuByType(nav);
    }
}
