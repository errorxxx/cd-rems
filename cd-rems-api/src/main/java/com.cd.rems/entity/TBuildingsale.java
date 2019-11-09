package com.cd.rems.entity;

import java.io.Serializable;
import java.util.Date;

public class TBuildingsale implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSale.buildingSaleId
     *
     * @mbg.generated
     */
    private Integer buildingsaleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSale.saleDate
     *
     * @mbg.generated
     */
    private Date saledate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSale.deliveryDate
     *
     * @mbg.generated
     */
    private Date deliverydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSale.averagePrice
     *
     * @mbg.generated
     */
    private Long averageprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSale.deliveryRate
     *
     * @mbg.generated
     */
    private Long deliveryrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSale.occupancyRate
     *
     * @mbg.generated
     */
    private Long occupancyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_buildingSale.buildingId
     *
     * @mbg.generated
     */
    private Integer buildingid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_buildingSale
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSale.buildingSaleId
     *
     * @return the value of t_buildingSale.buildingSaleId
     *
     * @mbg.generated
     */
    public Integer getBuildingsaleid() {
        return buildingsaleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSale.buildingSaleId
     *
     * @param buildingsaleid the value for t_buildingSale.buildingSaleId
     *
     * @mbg.generated
     */
    public void setBuildingsaleid(Integer buildingsaleid) {
        this.buildingsaleid = buildingsaleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSale.saleDate
     *
     * @return the value of t_buildingSale.saleDate
     *
     * @mbg.generated
     */
    public Date getSaledate() {
        return saledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSale.saleDate
     *
     * @param saledate the value for t_buildingSale.saleDate
     *
     * @mbg.generated
     */
    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSale.deliveryDate
     *
     * @return the value of t_buildingSale.deliveryDate
     *
     * @mbg.generated
     */
    public Date getDeliverydate() {
        return deliverydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSale.deliveryDate
     *
     * @param deliverydate the value for t_buildingSale.deliveryDate
     *
     * @mbg.generated
     */
    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSale.averagePrice
     *
     * @return the value of t_buildingSale.averagePrice
     *
     * @mbg.generated
     */
    public Long getAverageprice() {
        return averageprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSale.averagePrice
     *
     * @param averageprice the value for t_buildingSale.averagePrice
     *
     * @mbg.generated
     */
    public void setAverageprice(Long averageprice) {
        this.averageprice = averageprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSale.deliveryRate
     *
     * @return the value of t_buildingSale.deliveryRate
     *
     * @mbg.generated
     */
    public Long getDeliveryrate() {
        return deliveryrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSale.deliveryRate
     *
     * @param deliveryrate the value for t_buildingSale.deliveryRate
     *
     * @mbg.generated
     */
    public void setDeliveryrate(Long deliveryrate) {
        this.deliveryrate = deliveryrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSale.occupancyRate
     *
     * @return the value of t_buildingSale.occupancyRate
     *
     * @mbg.generated
     */
    public Long getOccupancyrate() {
        return occupancyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSale.occupancyRate
     *
     * @param occupancyrate the value for t_buildingSale.occupancyRate
     *
     * @mbg.generated
     */
    public void setOccupancyrate(Long occupancyrate) {
        this.occupancyrate = occupancyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_buildingSale.buildingId
     *
     * @return the value of t_buildingSale.buildingId
     *
     * @mbg.generated
     */
    public Integer getBuildingid() {
        return buildingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_buildingSale.buildingId
     *
     * @param buildingid the value for t_buildingSale.buildingId
     *
     * @mbg.generated
     */
    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buildingSale
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buildingsaleid=").append(buildingsaleid);
        sb.append(", saledate=").append(saledate);
        sb.append(", deliverydate=").append(deliverydate);
        sb.append(", averageprice=").append(averageprice);
        sb.append(", deliveryrate=").append(deliveryrate);
        sb.append(", occupancyrate=").append(occupancyrate);
        sb.append(", buildingid=").append(buildingid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}