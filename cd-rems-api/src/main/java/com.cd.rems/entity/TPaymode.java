package com.cd.rems.entity;

import java.io.Serializable;

public class TPaymode implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payMode.payModeId
     *
     * @mbg.generated
     */
    private Integer paymodeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payMode.paymode
     *
     * @mbg.generated
     */
    private String paymode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payMode.isSelected
     *
     * @mbg.generated
     */
    private Boolean isselected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payMode.chargeParternId
     *
     * @mbg.generated
     */
    private Integer chargeparternid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_payMode
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payMode.payModeId
     *
     * @return the value of t_payMode.payModeId
     *
     * @mbg.generated
     */
    public Integer getPaymodeid() {
        return paymodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payMode.payModeId
     *
     * @param paymodeid the value for t_payMode.payModeId
     *
     * @mbg.generated
     */
    public void setPaymodeid(Integer paymodeid) {
        this.paymodeid = paymodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payMode.paymode
     *
     * @return the value of t_payMode.paymode
     *
     * @mbg.generated
     */
    public String getPaymode() {
        return paymode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payMode.paymode
     *
     * @param paymode the value for t_payMode.paymode
     *
     * @mbg.generated
     */
    public void setPaymode(String paymode) {
        this.paymode = paymode == null ? null : paymode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payMode.isSelected
     *
     * @return the value of t_payMode.isSelected
     *
     * @mbg.generated
     */
    public Boolean getIsselected() {
        return isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payMode.isSelected
     *
     * @param isselected the value for t_payMode.isSelected
     *
     * @mbg.generated
     */
    public void setIsselected(Boolean isselected) {
        this.isselected = isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payMode.chargeParternId
     *
     * @return the value of t_payMode.chargeParternId
     *
     * @mbg.generated
     */
    public Integer getChargeparternid() {
        return chargeparternid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payMode.chargeParternId
     *
     * @param chargeparternid the value for t_payMode.chargeParternId
     *
     * @mbg.generated
     */
    public void setChargeparternid(Integer chargeparternid) {
        this.chargeparternid = chargeparternid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payMode
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymodeid=").append(paymodeid);
        sb.append(", paymode=").append(paymode);
        sb.append(", isselected=").append(isselected);
        sb.append(", chargeparternid=").append(chargeparternid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}