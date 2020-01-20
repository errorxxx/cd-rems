package com.cd.rems.model;

import lombok.Data;

/**
 * @Description 查询楼盘信息类
 * @Autor 谢修继
 * @Date 2020/1/19 15:10
 */
@Data
public class BuildingInfoVo {
    String name;
    String address;
    String nowTypeId;
    String startTime;
    String endTime;
    Integer currentPage;
    Integer pageSize;
}
