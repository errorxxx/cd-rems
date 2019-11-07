package com.cd.rems.dao;

import com.cd.rems.entity.TChargetype;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TChargetypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chargeType
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer chargetypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chargeType
     *
     * @mbg.generated
     */
    int insert(TChargetype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chargeType
     *
     * @mbg.generated
     */
    TChargetype selectByPrimaryKey(Integer chargetypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chargeType
     *
     * @mbg.generated
     */
    List<TChargetype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chargeType
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TChargetype record);
}