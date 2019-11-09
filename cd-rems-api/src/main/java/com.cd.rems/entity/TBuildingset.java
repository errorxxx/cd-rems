package com.cd.rems.entity;

import java.io.Serializable;

public class TBuildingset implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSet.buildingSetId
     *
     * @mbg.generated
     */
    private Integer buildingsetid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSet.buildingSetNumber
     *
     * @mbg.generated
     */
    private Integer buildingsetnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSet.floors
     *
     * @mbg.generated
     */
    private Integer floors;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSet.salePrice
     *
     * @mbg.generated
     */
    private Long saleprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSet.buildingId
     *
     * @mbg.generated
     */
    private Integer buildingid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_buildingSet
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSet.buildingSetId
     *
     * @return the value of t_buildingSet.buildingSetId
     *
     * @mbg.generated
     */
    public Integer getBuildingsetid() {
        return buildingsetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSet.buildingSetId
     *
     * @param buildingsetid the value for t_buildingSet.buildingSetId
     *
     * @mbg.generated
     */
    public void setBuildingsetid(Integer buildingsetid) {
        this.buildingsetid = buildingsetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSet.buildingSetNumber
     *
     * @return the value of t_buildingSet.buildingSetNumber
     *
     * @mbg.generated
     */
    public Integer getBuildingsetnumber() {
        return buildingsetnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSet.buildingSetNumber
     *
     * @param buildingsetnumber the value for t_buildingSet.buildingSetNumber
     *
     * @mbg.generated
     */
    public void setBuildingsetnumber(Integer buildingsetnumber) {
        this.buildingsetnumber = buildingsetnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSet.floors
     *
     * @return the value of t_buildingSet.floors
     *
     * @mbg.generated
     */
    public Integer getFloors() {
        return floors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSet.floors
     *
     * @param floors the value for t_buildingSet.floors
     *
     * @mbg.generated
     */
    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSet.salePrice
     *
     * @return the value of t_buildingSet.salePrice
     *
     * @mbg.generated
     */
    public Long getSaleprice() {
        return saleprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSet.salePrice
     *
     * @param saleprice the value for t_buildingSet.salePrice
     *
     * @mbg.generated
     */
    public void setSaleprice(Long saleprice) {
        this.saleprice = saleprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSet.buildingId
     *
     * @return the value of t_buildingSet.buildingId
     *
     * @mbg.generated
     */
    public Integer getBuildingid() {
        return buildingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSet.buildingId
     *
     * @param buildingid the value for t_buildingSet.buildingId
     *
     * @mbg.generated
     */
    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buildingSet
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buildingsetid=").append(buildingsetid);
        sb.append(", buildingsetnumber=").append(buildingsetnumber);
        sb.append(", floors=").append(floors);
        sb.append(", saleprice=").append(saleprice);
        sb.append(", buildingid=").append(buildingid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}