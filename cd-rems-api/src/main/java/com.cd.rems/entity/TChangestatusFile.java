package com.cd.rems.entity;

import java.io.Serializable;

public class TChangestatusFile implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_changeStatus_file.changeStatusId
     *
     * @mbg.generated
     */
    private Integer changestatusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_changeStatus_file.changeStatusName
     *
     * @mbg.generated
     */
    private String changestatusname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_changeStatus_file.changeStatus
     *
     * @mbg.generated
     */
    private Integer changestatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_changeStatus_file
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_changeStatus_file.changeStatusId
     *
     * @return the value of t_changeStatus_file.changeStatusId
     *
     * @mbg.generated
     */
    public Integer getChangestatusid() {
        return changestatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_changeStatus_file.changeStatusId
     *
     * @param changestatusid the value for t_changeStatus_file.changeStatusId
     *
     * @mbg.generated
     */
    public void setChangestatusid(Integer changestatusid) {
        this.changestatusid = changestatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_changeStatus_file.changeStatusName
     *
     * @return the value of t_changeStatus_file.changeStatusName
     *
     * @mbg.generated
     */
    public String getChangestatusname() {
        return changestatusname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_changeStatus_file.changeStatusName
     *
     * @param changestatusname the value for t_changeStatus_file.changeStatusName
     *
     * @mbg.generated
     */
    public void setChangestatusname(String changestatusname) {
        this.changestatusname = changestatusname == null ? null : changestatusname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_changeStatus_file.changeStatus
     *
     * @return the value of t_changeStatus_file.changeStatus
     *
     * @mbg.generated
     */
    public Integer getChangestatus() {
        return changestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_changeStatus_file.changeStatus
     *
     * @param changestatus the value for t_changeStatus_file.changeStatus
     *
     * @mbg.generated
     */
    public void setChangestatus(Integer changestatus) {
        this.changestatus = changestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_changeStatus_file
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", changestatusid=").append(changestatusid);
        sb.append(", changestatusname=").append(changestatusname);
        sb.append(", changestatus=").append(changestatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}