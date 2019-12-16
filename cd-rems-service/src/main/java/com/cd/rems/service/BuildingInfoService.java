package com.cd.rems.service;

import com.cd.rems.entity.TBuildinginfo;

import java.util.List;

/**
 * @Description 房产信息服务
 * @Autor 谢修继
 * @Date 2019/12/3 21:28
 */
public interface BuildingInfoService {
    List<TBuildinginfo> selectAll();
}
