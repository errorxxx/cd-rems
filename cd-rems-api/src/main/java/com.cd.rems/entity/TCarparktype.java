package com.cd.rems.entity;

import java.io.Serializable;

public class TCarparktype implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkType.carparkTypeId
     *
     * @mbg.generated
     */
    private Integer carparktypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkType.carparkType
     *
     * @mbg.generated
     */
    private String carparktype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkType.isSelected
     *
     * @mbg.generated
     */
    private Boolean isselected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkType.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    private Integer carparksurveyinfoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_carparkType
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkType.carparkTypeId
     *
     * @return the value of t_carparkType.carparkTypeId
     *
     * @mbg.generated
     */
    public Integer getCarparktypeid() {
        return carparktypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkType.carparkTypeId
     *
     * @param carparktypeid the value for t_carparkType.carparkTypeId
     *
     * @mbg.generated
     */
    public void setCarparktypeid(Integer carparktypeid) {
        this.carparktypeid = carparktypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkType.carparkType
     *
     * @return the value of t_carparkType.carparkType
     *
     * @mbg.generated
     */
    public String getCarparktype() {
        return carparktype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkType.carparkType
     *
     * @param carparktype the value for t_carparkType.carparkType
     *
     * @mbg.generated
     */
    public void setCarparktype(String carparktype) {
        this.carparktype = carparktype == null ? null : carparktype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkType.isSelected
     *
     * @return the value of t_carparkType.isSelected
     *
     * @mbg.generated
     */
    public Boolean getIsselected() {
        return isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkType.isSelected
     *
     * @param isselected the value for t_carparkType.isSelected
     *
     * @mbg.generated
     */
    public void setIsselected(Boolean isselected) {
        this.isselected = isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkType.carparkSurveyInfoId
     *
     * @return the value of t_carparkType.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    public Integer getCarparksurveyinfoid() {
        return carparksurveyinfoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkType.carparkSurveyInfoId
     *
     * @param carparksurveyinfoid the value for t_carparkType.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    public void setCarparksurveyinfoid(Integer carparksurveyinfoid) {
        this.carparksurveyinfoid = carparksurveyinfoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkType
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carparktypeid=").append(carparktypeid);
        sb.append(", carparktype=").append(carparktype);
        sb.append(", isselected=").append(isselected);
        sb.append(", carparksurveyinfoid=").append(carparksurveyinfoid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}