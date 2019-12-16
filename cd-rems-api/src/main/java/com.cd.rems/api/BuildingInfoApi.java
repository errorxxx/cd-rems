package com.cd.rems.api;

import com.cd.rems.entity.TBuildinginfo;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/12/3 21:31
 */
public interface BuildingInfoApi {
    List<TBuildinginfo> selectAll();
}
