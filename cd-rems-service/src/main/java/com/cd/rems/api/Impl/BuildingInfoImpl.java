package com.cd.rems.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cd.rems.api.BuildingInfoApi;
import com.cd.rems.entity.TBuildinginfo;
import com.cd.rems.service.BuildingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/12/3 21:32
 */
@Service
@Component
public class BuildingInfoImpl implements BuildingInfoApi {

    @Autowired
    BuildingInfoService buildingInfoService;

    @Override
    public List<TBuildinginfo> selectAll() {
        return buildingInfoService.selectAll();
    }
}
