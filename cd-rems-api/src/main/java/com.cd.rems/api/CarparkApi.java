package com.cd.rems.api;

import com.cd.rems.model.CarparkVo;

import java.util.List;

/**
 * @author liufuqiang
 * @description 停车场信息Api接口
 * @date 2019/11/29 16:30
 */
public interface CarparkApi {
    List<CarparkVo> selectAllByPage(int currentPageIndex, int pageSize);
    int selectCountAll();
    int selectCountAllByCondition(CarparkVo carparkVo);
    List<CarparkVo> selectAllByConditionAndPage(CarparkVo carparkVo,int currentPageIndex,int pageSize);
}
