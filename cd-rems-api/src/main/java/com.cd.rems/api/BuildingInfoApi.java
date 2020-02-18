package com.cd.rems.api;

import com.cd.rems.entity.TBuildinginfo;
import com.cd.rems.model.BuildingInfoVo;

import java.util.List;

/**
 * @Description
 * @Autor 谢修继
 * @Date 2019/12/3 21:31
 */
public interface BuildingInfoApi {

    /*
     * @Author 谢修继
     * @Description 查询所有的建筑信息
     * @Date 2020/1/16 15:02
     * @Param
     * @return
     **/
    List<TBuildinginfo> selectAll(BuildingInfoVo info);


    /*
     * @Author 谢修继
     * @Description 添加建筑信息
     * @Date 2020/1/16 15:02
     * @Param
     * @return
     **/
    void addBuildingInfo(TBuildinginfo buildinginfo);


    /*
     * @Author 谢修继
     * @Description 删除建筑信息
     * @Date 2020/1/20 15:25
     * @Param
     * @return
     **/
    boolean delete(TBuildinginfo buildinginfo);


    /*
     * @Author 谢修继
     * @Description 通过条件分页查询楼盘信息
     * @Date 2020/1/20 16:10
     * @Param
     * @return
     **/
    List<TBuildinginfo> selectByPage(BuildingInfoVo info);
}
