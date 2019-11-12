package com.cd.rems.dao;

import com.cd.rems.entity.TNav;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TNavMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nav
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer navid);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nav
     *
     * @mbg.generated
     */
    int insert(TNav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nav
     *
     * @mbg.generated
     */
    TNav selectByPrimaryKey(Integer navid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nav
     *
     * @mbg.generated
     */
    List<TNav> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_nav
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TNav record);
    List<TNav> getAllVisibleMenuByType(TNav nav);
}