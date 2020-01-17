package com.cd.rems.service.Impl;

import com.cd.rems.dao.TBuildinginfoMapper;
import com.cd.rems.entity.TBuildinginfo;
import com.cd.rems.service.BuildingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/12/3 21:30
 */
@Component
public class BuildingInfoServiceImpl implements BuildingInfoService {
    @Autowired
    TBuildinginfoMapper buildinginfoMapper;
    @Override
    public List<TBuildinginfo> selectAll() {
        return this.buildinginfoMapper.selectAll();
    }

    @Override
    public void addBuildingInfo(TBuildinginfo tBuildinginfo) {
        int insert = this.buildinginfoMapper.insert(tBuildinginfo);
    }


}
