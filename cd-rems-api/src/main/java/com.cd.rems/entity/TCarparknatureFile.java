package com.cd.rems.entity;

import java.io.Serializable;

public class TCarparknatureFile implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkNature_file.carparkNatureId
     *
     * @mbg.generated
     */
    private Integer carparknatureid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkNature_file.carparkNatureName
     *
     * @mbg.generated
     */
    private String carparknaturename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkNature_file.carparkNature
     *
     * @mbg.generated
     */
    private Integer carparknature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_carparkNature_file
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkNature_file.carparkNatureId
     *
     * @return the value of t_carparkNature_file.carparkNatureId
     *
     * @mbg.generated
     */
    public Integer getCarparknatureid() {
        return carparknatureid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkNature_file.carparkNatureId
     *
     * @param carparknatureid the value for t_carparkNature_file.carparkNatureId
     *
     * @mbg.generated
     */
    public void setCarparknatureid(Integer carparknatureid) {
        this.carparknatureid = carparknatureid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkNature_file.carparkNatureName
     *
     * @return the value of t_carparkNature_file.carparkNatureName
     *
     * @mbg.generated
     */
    public String getCarparknaturename() {
        return carparknaturename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkNature_file.carparkNatureName
     *
     * @param carparknaturename the value for t_carparkNature_file.carparkNatureName
     *
     * @mbg.generated
     */
    public void setCarparknaturename(String carparknaturename) {
        this.carparknaturename = carparknaturename == null ? null : carparknaturename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkNature_file.carparkNature
     *
     * @return the value of t_carparkNature_file.carparkNature
     *
     * @mbg.generated
     */
    public Integer getCarparknature() {
        return carparknature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkNature_file.carparkNature
     *
     * @param carparknature the value for t_carparkNature_file.carparkNature
     *
     * @mbg.generated
     */
    public void setCarparknature(Integer carparknature) {
        this.carparknature = carparknature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkNature_file
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carparknatureid=").append(carparknatureid);
        sb.append(", carparknaturename=").append(carparknaturename);
        sb.append(", carparknature=").append(carparknature);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}