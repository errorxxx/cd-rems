package com.cd.rems.entity;

import java.io.Serializable;

public class TMortgagestatusFile implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mortgageStatus_file.mortgageStatusId
     *
     * @mbg.generated
     */
    private Integer mortgagestatusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mortgageStatus_file.mortgageStatusName
     *
     * @mbg.generated
     */
    private String mortgagestatusname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mortgageStatus_file.mortgageStatus
     *
     * @mbg.generated
     */
    private Integer mortgagestatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mortgageStatus_file
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mortgageStatus_file.mortgageStatusId
     *
     * @return the value of t_mortgageStatus_file.mortgageStatusId
     *
     * @mbg.generated
     */
    public Integer getMortgagestatusid() {
        return mortgagestatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mortgageStatus_file.mortgageStatusId
     *
     * @param mortgagestatusid the value for t_mortgageStatus_file.mortgageStatusId
     *
     * @mbg.generated
     */
    public void setMortgagestatusid(Integer mortgagestatusid) {
        this.mortgagestatusid = mortgagestatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mortgageStatus_file.mortgageStatusName
     *
     * @return the value of t_mortgageStatus_file.mortgageStatusName
     *
     * @mbg.generated
     */
    public String getMortgagestatusname() {
        return mortgagestatusname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mortgageStatus_file.mortgageStatusName
     *
     * @param mortgagestatusname the value for t_mortgageStatus_file.mortgageStatusName
     *
     * @mbg.generated
     */
    public void setMortgagestatusname(String mortgagestatusname) {
        this.mortgagestatusname = mortgagestatusname == null ? null : mortgagestatusname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mortgageStatus_file.mortgageStatus
     *
     * @return the value of t_mortgageStatus_file.mortgageStatus
     *
     * @mbg.generated
     */
    public Integer getMortgagestatus() {
        return mortgagestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mortgageStatus_file.mortgageStatus
     *
     * @param mortgagestatus the value for t_mortgageStatus_file.mortgageStatus
     *
     * @mbg.generated
     */
    public void setMortgagestatus(Integer mortgagestatus) {
        this.mortgagestatus = mortgagestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mortgageStatus_file
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mortgagestatusid=").append(mortgagestatusid);
        sb.append(", mortgagestatusname=").append(mortgagestatusname);
        sb.append(", mortgagestatus=").append(mortgagestatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}