package com.cd.rems.dao;

import com.cd.rems.entity.TChangestatusFile;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TChangestatusFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_changeStatus_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer changestatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_changeStatus_file
     *
     * @mbg.generated
     */
    int insert(TChangestatusFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_changeStatus_file
     *
     * @mbg.generated
     */
    TChangestatusFile selectByPrimaryKey(Integer changestatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_changeStatus_file
     *
     * @mbg.generated
     */
    List<TChangestatusFile> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_changeStatus_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TChangestatusFile record);
}