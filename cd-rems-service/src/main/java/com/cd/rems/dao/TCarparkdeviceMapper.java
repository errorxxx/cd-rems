package com.cd.rems.dao;

import com.cd.rems.entity.TCarparkdevice;
import java.util.List;

public interface TCarparkdeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkDevice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer carparkdeviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkDevice
     *
     * @mbg.generated
     */
    int insert(TCarparkdevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkDevice
     *
     * @mbg.generated
     */
    TCarparkdevice selectByPrimaryKey(Integer carparkdeviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkDevice
     *
     * @mbg.generated
     */
    List<TCarparkdevice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkDevice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCarparkdevice record);
}