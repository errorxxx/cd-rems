package com.cd.rems.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.BuildingInfoApi;
import com.cd.rems.entity.TBuildinginfo;
import com.cd.rems.model.BuildingInfoVo;
import com.cd.rems.utils.RetCode;
import com.cd.rems.utils.RetResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

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
        buildingInfo.setAddtime(buildingInfo.getInputdate());
        this.buildingInfoApi.addBuildingInfo(buildingInfo);
    }

    @PostMapping("/listAll")
    public RetResult listAllBuildingInfo(@RequestBody BuildingInfoVo param) {
        HashMap<String, Object> map = new HashMap<>();
        List<TBuildinginfo> all = this.buildingInfoApi.selectAll(param);
        List<TBuildinginfo> tBuildinginfos = this.buildingInfoApi.selectByPage(param);
        map.put("list", tBuildinginfos);
        map.put("total", all.size());
        return new RetResult(RetCode.SUCCESS.getCode(), "success", map);//成功
    }

    @PostMapping("/delete")
    public RetResult deleteBuildingInfo(@RequestBody TBuildinginfo buildingInfo) {
        boolean deleted = this.buildingInfoApi.delete(buildingInfo);
        return deleted ? new RetResult(RetCode.SUCCESS.getCode(), "删除楼盘信息成功!", null) : new RetResult(RetCode.FAIL.getCode(), "删除楼盘信息失败!");
    }
}
