package com.cd.rems.service.Impl;

import com.cd.rems.dao.CarparkVoMapper;
import com.cd.rems.dao.TBuildingcarparkMapper;
import com.cd.rems.dao.TCarparkMapper;
import com.cd.rems.entity.TBuildingcarpark;
import com.cd.rems.model.CarparkVo;
import com.cd.rems.service.CarparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @author liufuqiang
 * @description 停车场信息业务逻辑接口实现类
 * @date 2019/11/29 16:07
 */
@Component
public class CarparkServiceImpl implements CarparkService {
    @Autowired
    TBuildingcarparkMapper mapper;
    @Autowired
    TCarparkMapper carparkMapper;
    @Autowired
    CarparkVoMapper carparkVoMapper;
    @Override
    public List<TBuildingcarpark> listAll() {
        return mapper.selectAll();
    }

    @Override
    public List<CarparkVo> selectAllByPage(int currentPageIndex, int pageSize) {
        return carparkVoMapper.selectAllByPage(currentPageIndex,pageSize);
    }

    @Override
    public int selectCountAll() {
        return carparkMapper.selectCountAll();
    }

    @Override
    public int selectCountAllByCondition(CarparkVo carparkVo) {
        return carparkMapper.selectCountAllByCondition(carparkVo);
    }

    @Override
    public List<CarparkVo> selectAllByConditionAndPage(CarparkVo carparkVo, int currentPageIndex, int pageSize) {
        return carparkVoMapper.selectAllByConditionAndPage(carparkVo,currentPageIndex,pageSize);
    }
}
