package com.cd.rems.api.Impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.cd.rems.api.CarparkApi;
import com.cd.rems.model.CarparkVo;
import com.cd.rems.service.CarparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liufuqiang
 * @description CarparkApi实现类
 * @date 2019/11/29 16:10
 */
@Service
@Component
public class CarparkApiImpl implements CarparkApi {
    @Autowired
    CarparkService carparkService;

    @Override
    public List<CarparkVo> selectAllByPage(int currentPageIndex, int pageSize) {
        return carparkService.selectAllByPage(currentPageIndex,pageSize);
    }

    @Override
    public int selectCountAll() {
        return carparkService.selectCountAll();
    }

    @Override
    public int selectCountAllByCondition(CarparkVo carparkVo) {
        return carparkService.selectCountAllByCondition(carparkVo);
    }

    @Override
    public List<CarparkVo> selectAllByConditionAndPage(CarparkVo carparkVo, int i, int i1) {
        return carparkService.selectAllByConditionAndPage(carparkVo,i,i1);
    }
}
