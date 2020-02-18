package com.cd.rems.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description 查询楼盘信息类
 * @Autor 谢修继
 * @Date 2020/1/19 15:10
 */
@Data
public class BuildingInfoVo implements Serializable {
    String name;
    String address;
    String nowTypeId;
    String startTime;
    String endTime;
    Integer currentPage;
    Integer pageSize;
    Integer currentSize;
}
