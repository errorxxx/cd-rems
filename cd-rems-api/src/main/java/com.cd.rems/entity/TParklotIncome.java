package com.cd.rems.entity;

import java.io.Serializable;
import java.util.Date;

public class TParklotIncome implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_income.incomeId
     *
     * @mbg.generated
     */
    private Integer incomeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_income.parklotNum
     *
     * @mbg.generated
     */
    private String parklotnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_income.parkCentificateNum
     *
     * @mbg.generated
     */
    private String parkcentificatenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_income.incomes
     *
     * @mbg.generated
     */
    private Long incomes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_income.incomeType
     *
     * @mbg.generated
     */
    private Byte incometype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_income.incaomeTime
     *
     * @mbg.generated
     */
    private Date incaometime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_income.carparkId
     *
     * @mbg.generated
     */
    private Integer carparkid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_parklot_income
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_income.incomeId
     *
     * @return the value of t_parklot_income.incomeId
     *
     * @mbg.generated
     */
    public Integer getIncomeid() {
        return incomeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_income.incomeId
     *
     * @param incomeid the value for t_parklot_income.incomeId
     *
     * @mbg.generated
     */
    public void setIncomeid(Integer incomeid) {
        this.incomeid = incomeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_income.parklotNum
     *
     * @return the value of t_parklot_income.parklotNum
     *
     * @mbg.generated
     */
    public String getParklotnum() {
        return parklotnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_income.parklotNum
     *
     * @param parklotnum the value for t_parklot_income.parklotNum
     *
     * @mbg.generated
     */
    public void setParklotnum(String parklotnum) {
        this.parklotnum = parklotnum == null ? null : parklotnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_income.parkCentificateNum
     *
     * @return the value of t_parklot_income.parkCentificateNum
     *
     * @mbg.generated
     */
    public String getParkcentificatenum() {
        return parkcentificatenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_income.parkCentificateNum
     *
     * @param parkcentificatenum the value for t_parklot_income.parkCentificateNum
     *
     * @mbg.generated
     */
    public void setParkcentificatenum(String parkcentificatenum) {
        this.parkcentificatenum = parkcentificatenum == null ? null : parkcentificatenum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_income.incomes
     *
     * @return the value of t_parklot_income.incomes
     *
     * @mbg.generated
     */
    public Long getIncomes() {
        return incomes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_income.incomes
     *
     * @param incomes the value for t_parklot_income.incomes
     *
     * @mbg.generated
     */
    public void setIncomes(Long incomes) {
        this.incomes = incomes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_income.incomeType
     *
     * @return the value of t_parklot_income.incomeType
     *
     * @mbg.generated
     */
    public Byte getIncometype() {
        return incometype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_income.incomeType
     *
     * @param incometype the value for t_parklot_income.incomeType
     *
     * @mbg.generated
     */
    public void setIncometype(Byte incometype) {
        this.incometype = incometype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_income.incaomeTime
     *
     * @return the value of t_parklot_income.incaomeTime
     *
     * @mbg.generated
     */
    public Date getIncaometime() {
        return incaometime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_income.incaomeTime
     *
     * @param incaometime the value for t_parklot_income.incaomeTime
     *
     * @mbg.generated
     */
    public void setIncaometime(Date incaometime) {
        this.incaometime = incaometime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_income.carparkId
     *
     * @return the value of t_parklot_income.carparkId
     *
     * @mbg.generated
     */
    public Integer getCarparkid() {
        return carparkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_income.carparkId
     *
     * @param carparkid the value for t_parklot_income.carparkId
     *
     * @mbg.generated
     */
    public void setCarparkid(Integer carparkid) {
        this.carparkid = carparkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_parklot_income
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", incomeid=").append(incomeid);
        sb.append(", parklotnum=").append(parklotnum);
        sb.append(", parkcentificatenum=").append(parkcentificatenum);
        sb.append(", incomes=").append(incomes);
        sb.append(", incometype=").append(incometype);
        sb.append(", incaometime=").append(incaometime);
        sb.append(", carparkid=").append(carparkid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}