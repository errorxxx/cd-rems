package com.cd.rems.service;

import com.cd.rems.entity.TBuildinginfo;
import com.cd.rems.model.BuildingInfoVo;

import java.util.List;

/**
 * @Description 房产信息服务
 * @Autor 谢修继
 * @Date 2019/12/3 21:28
 */
public interface BuildingInfoService {
    List<TBuildinginfo> selectAll(BuildingInfoVo info);

    void addBuildingInfo(TBuildinginfo tBuildinginfo);

    boolean delete(TBuildinginfo tBuildinginfo);

    List<TBuildinginfo> selectByPage(BuildingInfoVo info);
}
