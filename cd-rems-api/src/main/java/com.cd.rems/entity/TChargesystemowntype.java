package com.cd.rems.entity;

import java.io.Serializable;

public class TChargesystemowntype implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeSystemOwnType.chargeSystemOwnTypeId
     *
     * @mbg.generated
     */
    private Integer chargesystemowntypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeSystemOwnType.chargeSystemOwnType
     *
     * @mbg.generated
     */
    private String chargesystemowntype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeSystemOwnType.isSelected
     *
     * @mbg.generated
     */
    private Boolean isselected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeSystemOwnType.carparkDeviceId
     *
     * @mbg.generated
     */
    private Integer carparkdeviceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_chargeSystemOwnType
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeSystemOwnType.chargeSystemOwnTypeId
     *
     * @return the value of t_chargeSystemOwnType.chargeSystemOwnTypeId
     *
     * @mbg.generated
     */
    public Integer getChargesystemowntypeid() {
        return chargesystemowntypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeSystemOwnType.chargeSystemOwnTypeId
     *
     * @param chargesystemowntypeid the value for t_chargeSystemOwnType.chargeSystemOwnTypeId
     *
     * @mbg.generated
     */
    public void setChargesystemowntypeid(Integer chargesystemowntypeid) {
        this.chargesystemowntypeid = chargesystemowntypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeSystemOwnType.chargeSystemOwnType
     *
     * @return the value of t_chargeSystemOwnType.chargeSystemOwnType
     *
     * @mbg.generated
     */
    public String getChargesystemowntype() {
        return chargesystemowntype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeSystemOwnType.chargeSystemOwnType
     *
     * @param chargesystemowntype the value for t_chargeSystemOwnType.chargeSystemOwnType
     *
     * @mbg.generated
     */
    public void setChargesystemowntype(String chargesystemowntype) {
        this.chargesystemowntype = chargesystemowntype == null ? null : chargesystemowntype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeSystemOwnType.isSelected
     *
     * @return the value of t_chargeSystemOwnType.isSelected
     *
     * @mbg.generated
     */
    public Boolean getIsselected() {
        return isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeSystemOwnType.isSelected
     *
     * @param isselected the value for t_chargeSystemOwnType.isSelected
     *
     * @mbg.generated
     */
    public void setIsselected(Boolean isselected) {
        this.isselected = isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeSystemOwnType.carparkDeviceId
     *
     * @return the value of t_chargeSystemOwnType.carparkDeviceId
     *
     * @mbg.generated
     */
    public Integer getCarparkdeviceid() {
        return carparkdeviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeSystemOwnType.carparkDeviceId
     *
     * @param carparkdeviceid the value for t_chargeSystemOwnType.carparkDeviceId
     *
     * @mbg.generated
     */
    public void setCarparkdeviceid(Integer carparkdeviceid) {
        this.carparkdeviceid = carparkdeviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chargeSystemOwnType
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chargesystemowntypeid=").append(chargesystemowntypeid);
        sb.append(", chargesystemowntype=").append(chargesystemowntype);
        sb.append(", isselected=").append(isselected);
        sb.append(", carparkdeviceid=").append(carparkdeviceid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}