package com.cd.rems.dao;

import com.cd.rems.entity.TParklotMonthrent;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TParklotMonthrentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_parklot_monthrent
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer rentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_parklot_monthrent
     *
     * @mbg.generated
     */
    int insert(TParklotMonthrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_parklot_monthrent
     *
     * @mbg.generated
     */
    TParklotMonthrent selectByPrimaryKey(Integer rentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_parklot_monthrent
     *
     * @mbg.generated
     */
    List<TParklotMonthrent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_parklot_monthrent
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TParklotMonthrent record);
}