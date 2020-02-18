package com.cd.rems.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cd.rems.api.BuildingInfoApi;
import com.cd.rems.entity.TBuildinginfo;
import com.cd.rems.model.BuildingInfoVo;
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
    public List<TBuildinginfo> selectAll(BuildingInfoVo info) {
        return buildingInfoService.selectAll(info);
    }

    @Override
    public void addBuildingInfo(TBuildinginfo tBuildinginfo) {
        this.buildingInfoService.addBuildingInfo(tBuildinginfo);
    }

    @Override
    public boolean delete(TBuildinginfo tBuildinginfo) {
        return this.buildingInfoService.delete(tBuildinginfo);
    }

    @Override
    public List<TBuildinginfo> selectByPage(BuildingInfoVo info) {
        return this.buildingInfoService.selectByPage(info);
    }
}
