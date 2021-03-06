package com.cd.rems.dao;

import com.cd.rems.entity.TWlantype;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TWlantypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_WLANType
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer wlantypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_WLANType
     *
     * @mbg.generated
     */
    int insert(TWlantype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_WLANType
     *
     * @mbg.generated
     */
    TWlantype selectByPrimaryKey(Integer wlantypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_WLANType
     *
     * @mbg.generated
     */
    List<TWlantype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_WLANType
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TWlantype record);
}