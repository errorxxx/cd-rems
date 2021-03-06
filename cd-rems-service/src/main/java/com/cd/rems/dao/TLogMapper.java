package com.cd.rems.dao;

import com.cd.rems.entity.TLog;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_log
     *
     * @mbg.generated
     */
    int insert(TLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_log
     *
     * @mbg.generated
     */
    TLog selectByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_log
     *
     * @mbg.generated
     */
    List<TLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TLog record);
}