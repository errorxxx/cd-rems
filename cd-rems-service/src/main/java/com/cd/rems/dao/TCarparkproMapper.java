package com.cd.rems.dao;

import com.cd.rems.entity.TCarparkpro;
import java.util.List;

public interface TCarparkproMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkPro
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer carparkproid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkPro
     *
     * @mbg.generated
     */
    int insert(TCarparkpro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkPro
     *
     * @mbg.generated
     */
    TCarparkpro selectByPrimaryKey(Integer carparkproid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkPro
     *
     * @mbg.generated
     */
    List<TCarparkpro> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkPro
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCarparkpro record);
}