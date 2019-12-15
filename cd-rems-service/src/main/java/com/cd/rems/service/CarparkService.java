package com.cd.rems.service;

import com.cd.rems.entity.TBuildingcarpark;
import com.cd.rems.model.CarparkVo;

import java.util.List;
public interface CarparkService {
     List<TBuildingcarpark> listAll();
     List<CarparkVo> selectAllByPage(int currentPageIndex, int pageSize);
     int selectCountAll();
     int selectCountAllByCondition(CarparkVo carparkVo);
     List<CarparkVo> selectAllByConditionAndPage(CarparkVo carparkVo,int currentPageIndex,int pageSize);
}
