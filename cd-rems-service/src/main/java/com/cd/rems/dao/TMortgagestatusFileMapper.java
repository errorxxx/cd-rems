package com.cd.rems.dao;

import com.cd.rems.entity.TMortgagestatusFile;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TMortgagestatusFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mortgageStatus_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer mortgagestatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mortgageStatus_file
     *
     * @mbg.generated
     */
    int insert(TMortgagestatusFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mortgageStatus_file
     *
     * @mbg.generated
     */
    TMortgagestatusFile selectByPrimaryKey(Integer mortgagestatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mortgageStatus_file
     *
     * @mbg.generated
     */
    List<TMortgagestatusFile> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mortgageStatus_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMortgagestatusFile record);
}