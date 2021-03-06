package com.cd.rems.dao;

import com.cd.rems.entity.TBuildingset;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TBuildingsetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buildingSet
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer buildingsetid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buildingSet
     *
     * @mbg.generated
     */
    int insert(TBuildingset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buildingSet
     *
     * @mbg.generated
     */
    TBuildingset selectByPrimaryKey(Integer buildingsetid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buildingSet
     *
     * @mbg.generated
     */
    List<TBuildingset> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buildingSet
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TBuildingset record);
}