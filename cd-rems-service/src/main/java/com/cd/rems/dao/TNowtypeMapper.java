package com.cd.rems.dao;

import com.cd.rems.entity.TNowtype;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TNowtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nowType
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer nowtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nowType
     *
     * @mbg.generated
     */
    int insert(TNowtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nowType
     *
     * @mbg.generated
     */
    TNowtype selectByPrimaryKey(Integer nowtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nowType
     *
     * @mbg.generated
     */
    List<TNowtype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nowType
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TNowtype record);
}