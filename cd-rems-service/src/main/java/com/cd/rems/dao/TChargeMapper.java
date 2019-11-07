package com.cd.rems.dao;

import com.cd.rems.entity.TCharge;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TChargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer chargeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge
     *
     * @mbg.generated
     */
    int insert(TCharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge
     *
     * @mbg.generated
     */
    TCharge selectByPrimaryKey(Integer chargeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge
     *
     * @mbg.generated
     */
    List<TCharge> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCharge record);
}