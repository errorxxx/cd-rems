package com.cd.rems.dao;

import com.cd.rems.entity.TEnclosure;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TEnclosureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_enclosure
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer enclosureid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_enclosure
     *
     * @mbg.generated
     */
    int insert(TEnclosure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_enclosure
     *
     * @mbg.generated
     */
    TEnclosure selectByPrimaryKey(Integer enclosureid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_enclosure
     *
     * @mbg.generated
     */
    List<TEnclosure> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_enclosure
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TEnclosure record);
}