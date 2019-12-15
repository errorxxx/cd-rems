package com.cd.rems.dao;

import com.cd.rems.model.CarparkVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liufuqiang
 * @description
 * @date 2019/11/30 13:09
 */
@Repository
public interface CarparkVoMapper {
    /**
     * 后台分页查询
     * @param currentPageIndex 当前页首条下标
     * @param pageSize 显示条数
     * @return
     */
    List<CarparkVo> selectAllByPage(int currentPageIndex, int pageSize);

    /**
     * 后台分页模糊查询
     * @param carparkVo
     * @param currentPageIndex
     * @param pageSize
     * @return
     */
    List<CarparkVo> selectAllByConditionAndPage(@Param("carparkVo")CarparkVo carparkVo, @Param("currentPageIndex")int currentPageIndex, @Param("pageSize")int pageSize);
}
