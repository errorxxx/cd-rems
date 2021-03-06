package com.cd.rems.dao;

import com.cd.rems.entity.TElemode;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TElemodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eleMode
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer elemodeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eleMode
     *
     * @mbg.generated
     */
    int insert(TElemode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eleMode
     *
     * @mbg.generated
     */
    TElemode selectByPrimaryKey(Integer elemodeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eleMode
     *
     * @mbg.generated
     */
    List<TElemode> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eleMode
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TElemode record);
}