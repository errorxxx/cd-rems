package com.cd.rems.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.BuildingInfoApi;
import com.cd.rems.entity.TBuildinginfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 楼盘信息controller
 * @Autor 谢修继
 * @Date 2020/1/16 14:56
 */
@RestController
@RequestMapping("/buildingInfo")
public class BuildingInfoController {
    @Reference
    BuildingInfoApi buildingInfoApi;

    @PostMapping("/add")
    public void addBuildingInfo(@RequestBody TBuildinginfo buildingInfo) {
        this.buildingInfoApi.addBuildingInfo(buildingInfo);
    }
}
