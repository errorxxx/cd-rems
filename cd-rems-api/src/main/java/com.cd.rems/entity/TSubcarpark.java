package com.cd.rems.entity;

import java.io.Serializable;

public class TSubcarpark implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subCarpark.subCarparkId
     *
     * @mbg.generated
     */
    private Integer subcarparkid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subCarpark.subCarparkName
     *
     * @mbg.generated
     */
    private String subcarparkname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subCarpark.carplotNumber
     *
     * @mbg.generated
     */
    private Integer carplotnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subCarpark.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    private Integer carparksurveyinfoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_subCarpark
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subCarpark.subCarparkId
     *
     * @return the value of t_subCarpark.subCarparkId
     *
     * @mbg.generated
     */
    public Integer getSubcarparkid() {
        return subcarparkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subCarpark.subCarparkId
     *
     * @param subcarparkid the value for t_subCarpark.subCarparkId
     *
     * @mbg.generated
     */
    public void setSubcarparkid(Integer subcarparkid) {
        this.subcarparkid = subcarparkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subCarpark.subCarparkName
     *
     * @return the value of t_subCarpark.subCarparkName
     *
     * @mbg.generated
     */
    public String getSubcarparkname() {
        return subcarparkname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subCarpark.subCarparkName
     *
     * @param subcarparkname the value for t_subCarpark.subCarparkName
     *
     * @mbg.generated
     */
    public void setSubcarparkname(String subcarparkname) {
        this.subcarparkname = subcarparkname == null ? null : subcarparkname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subCarpark.carplotNumber
     *
     * @return the value of t_subCarpark.carplotNumber
     *
     * @mbg.generated
     */
    public Integer getCarplotnumber() {
        return carplotnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subCarpark.carplotNumber
     *
     * @param carplotnumber the value for t_subCarpark.carplotNumber
     *
     * @mbg.generated
     */
    public void setCarplotnumber(Integer carplotnumber) {
        this.carplotnumber = carplotnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subCarpark.carparkSurveyInfoId
     *
     * @return the value of t_subCarpark.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    public Integer getCarparksurveyinfoid() {
        return carparksurveyinfoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subCarpark.carparkSurveyInfoId
     *
     * @param carparksurveyinfoid the value for t_subCarpark.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    public void setCarparksurveyinfoid(Integer carparksurveyinfoid) {
        this.carparksurveyinfoid = carparksurveyinfoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_subCarpark
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subcarparkid=").append(subcarparkid);
        sb.append(", subcarparkname=").append(subcarparkname);
        sb.append(", carplotnumber=").append(carplotnumber);
        sb.append(", carparksurveyinfoid=").append(carparksurveyinfoid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}