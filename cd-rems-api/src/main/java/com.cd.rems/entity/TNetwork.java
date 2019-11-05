package com.cd.rems.entity;

import java.io.Serializable;

public class TNetwork implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_network.networkId
     *
     * @mbg.generated
     */
    private Integer networkid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_network.network
     *
     * @mbg.generated
     */
    private String network;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_network.isSelected
     *
     * @mbg.generated
     */
    private Boolean isselected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_network.carparkDeviceId
     *
     * @mbg.generated
     */
    private Integer carparkdeviceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_network
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_network.networkId
     *
     * @return the value of t_network.networkId
     *
     * @mbg.generated
     */
    public Integer getNetworkid() {
        return networkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_network.networkId
     *
     * @param networkid the value for t_network.networkId
     *
     * @mbg.generated
     */
    public void setNetworkid(Integer networkid) {
        this.networkid = networkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_network.network
     *
     * @return the value of t_network.network
     *
     * @mbg.generated
     */
    public String getNetwork() {
        return network;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_network.network
     *
     * @param network the value for t_network.network
     *
     * @mbg.generated
     */
    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_network.isSelected
     *
     * @return the value of t_network.isSelected
     *
     * @mbg.generated
     */
    public Boolean getIsselected() {
        return isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_network.isSelected
     *
     * @param isselected the value for t_network.isSelected
     *
     * @mbg.generated
     */
    public void setIsselected(Boolean isselected) {
        this.isselected = isselected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_network.carparkDeviceId
     *
     * @return the value of t_network.carparkDeviceId
     *
     * @mbg.generated
     */
    public Integer getCarparkdeviceid() {
        return carparkdeviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_network.carparkDeviceId
     *
     * @param carparkdeviceid the value for t_network.carparkDeviceId
     *
     * @mbg.generated
     */
    public void setCarparkdeviceid(Integer carparkdeviceid) {
        this.carparkdeviceid = carparkdeviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_network
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", networkid=").append(networkid);
        sb.append(", network=").append(network);
        sb.append(", isselected=").append(isselected);
        sb.append(", carparkdeviceid=").append(carparkdeviceid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}