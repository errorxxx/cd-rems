package com.cd.rems.entity;

import java.io.Serializable;

public class TChargetype implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeType.chargeTypeId
     *
     * @mbg.generated
     */
    private Integer chargetypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeType.chargeType
     *
     * @mbg.generated
     */
    private String chargetype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeType.isSelected
     *
     * @mbg.generated
     */
    private Boolean isselected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chargeType.chargePaternId
     *
     * @mbg.generated
     */
    private Integer chargepaternid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_chargeType
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeType.chargeTypeId
     *
     * @return the value of t_chargeType.chargeTypeId
     *
     * @mbg.generated
     */
    public Integer getChargetypeid() {
        return chargetypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeType.chargeTypeId
     *
     * @param chargetypeid the value for t_chargeType.chargeTypeId
     *
     * @mbg.generated
     */
    public void setChargetypeid(Integer chargetypeid) {
        this.chargetypeid = chargetypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeType.chargeType
     *
     * @return the value of t_chargeType.chargeType
     *
     * @mbg.generated
     */
    public String getChargetype() {
        return chargetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeType.chargeType
     *
     * @param chargetype the value for t_chargeType.chargeType
     *
     * @mbg.generated
     */
    public void setChargetype(String chargetype) {
        this.chargetype = chargetype == null ? null : chargetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeType.isSelected
     *
     * @return the value of t_chargeType.isSelected
     *
     * @mbg.generated
     */
    public Boolean getIsselected() {
        return isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeType.isSelected
     *
     * @param isselected the value for t_chargeType.isSelected
     *
     * @mbg.generated
     */
    public void setIsselected(Boolean isselected) {
        this.isselected = isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chargeType.chargePaternId
     *
     * @return the value of t_chargeType.chargePaternId
     *
     * @mbg.generated
     */
    public Integer getChargepaternid() {
        return chargepaternid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chargeType.chargePaternId
     *
     * @param chargepaternid the value for t_chargeType.chargePaternId
     *
     * @mbg.generated
     */
    public void setChargepaternid(Integer chargepaternid) {
        this.chargepaternid = chargepaternid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chargeType
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chargetypeid=").append(chargetypeid);
        sb.append(", chargetype=").append(chargetype);
        sb.append(", isselected=").append(isselected);
        sb.append(", chargepaternid=").append(chargepaternid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}