package com.cd.rems.dao;

import com.cd.rems.entity.TShops;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TShopsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shops
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer shopsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shops
     *
     * @mbg.generated
     */
    int insert(TShops record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shops
     *
     * @mbg.generated
     */
    TShops selectByPrimaryKey(Integer shopsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shops
     *
     * @mbg.generated
     */
    List<TShops> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shops
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TShops record);
}