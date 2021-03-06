package com.cd.rems.dao;

import com.cd.rems.entity.TCarplottype;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TCarplottypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carplotType
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer carplottypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carplotType
     *
     * @mbg.generated
     */
    int insert(TCarplottype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carplotType
     *
     * @mbg.generated
     */
    TCarplottype selectByPrimaryKey(Integer carplottypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carplotType
     *
     * @mbg.generated
     */
    List<TCarplottype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carplotType
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCarplottype record);
}