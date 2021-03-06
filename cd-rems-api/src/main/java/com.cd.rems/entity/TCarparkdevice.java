package com.cd.rems.entity;

import java.io.Serializable;
import java.util.Date;

public class TCarparkdevice implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.carparkDeviceId
     *
     * @mbg.generated
     */
    private Integer carparkdeviceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.deviceBrand
     *
     * @mbg.generated
     */
    private String devicebrand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.installDate
     *
     * @mbg.generated
     */
    private Date installdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.chargeSystemOwnTypeId
     *
     * @mbg.generated
     */
    private Integer chargesystemowntypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.hasContract
     *
     * @mbg.generated
     */
    private String hascontract;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.contractStartDate
     *
     * @mbg.generated
     */
    private Date contractstartdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.contractEndDate
     *
     * @mbg.generated
     */
    private Date contractenddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.WLANTypeId
     *
     * @mbg.generated
     */
    private Integer wlantypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.wiringMode
     *
     * @mbg.generated
     */
    private String wiringmode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.network
     *
     * @mbg.generated
     */
    private Integer network;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.internetAccessId
     *
     * @mbg.generated
     */
    private Integer internetaccessid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.otherGive
     *
     * @mbg.generated
     */
    private String othergive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_carparkDevice.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    private Integer carparksurveyinfoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_carparkDevice
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.carparkDeviceId
     *
     * @return the value of t_carparkDevice.carparkDeviceId
     *
     * @mbg.generated
     */
    public Integer getCarparkdeviceid() {
        return carparkdeviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.carparkDeviceId
     *
     * @param carparkdeviceid the value for t_carparkDevice.carparkDeviceId
     *
     * @mbg.generated
     */
    public void setCarparkdeviceid(Integer carparkdeviceid) {
        this.carparkdeviceid = carparkdeviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.deviceBrand
     *
     * @return the value of t_carparkDevice.deviceBrand
     *
     * @mbg.generated
     */
    public String getDevicebrand() {
        return devicebrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.deviceBrand
     *
     * @param devicebrand the value for t_carparkDevice.deviceBrand
     *
     * @mbg.generated
     */
    public void setDevicebrand(String devicebrand) {
        this.devicebrand = devicebrand == null ? null : devicebrand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.installDate
     *
     * @return the value of t_carparkDevice.installDate
     *
     * @mbg.generated
     */
    public Date getInstalldate() {
        return installdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.installDate
     *
     * @param installdate the value for t_carparkDevice.installDate
     *
     * @mbg.generated
     */
    public void setInstalldate(Date installdate) {
        this.installdate = installdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.chargeSystemOwnTypeId
     *
     * @return the value of t_carparkDevice.chargeSystemOwnTypeId
     *
     * @mbg.generated
     */
    public Integer getChargesystemowntypeid() {
        return chargesystemowntypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.chargeSystemOwnTypeId
     *
     * @param chargesystemowntypeid the value for t_carparkDevice.chargeSystemOwnTypeId
     *
     * @mbg.generated
     */
    public void setChargesystemowntypeid(Integer chargesystemowntypeid) {
        this.chargesystemowntypeid = chargesystemowntypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.hasContract
     *
     * @return the value of t_carparkDevice.hasContract
     *
     * @mbg.generated
     */
    public String getHascontract() {
        return hascontract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.hasContract
     *
     * @param hascontract the value for t_carparkDevice.hasContract
     *
     * @mbg.generated
     */
    public void setHascontract(String hascontract) {
        this.hascontract = hascontract == null ? null : hascontract.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.contractStartDate
     *
     * @return the value of t_carparkDevice.contractStartDate
     *
     * @mbg.generated
     */
    public Date getContractstartdate() {
        return contractstartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.contractStartDate
     *
     * @param contractstartdate the value for t_carparkDevice.contractStartDate
     *
     * @mbg.generated
     */
    public void setContractstartdate(Date contractstartdate) {
        this.contractstartdate = contractstartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.contractEndDate
     *
     * @return the value of t_carparkDevice.contractEndDate
     *
     * @mbg.generated
     */
    public Date getContractenddate() {
        return contractenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.contractEndDate
     *
     * @param contractenddate the value for t_carparkDevice.contractEndDate
     *
     * @mbg.generated
     */
    public void setContractenddate(Date contractenddate) {
        this.contractenddate = contractenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.WLANTypeId
     *
     * @return the value of t_carparkDevice.WLANTypeId
     *
     * @mbg.generated
     */
    public Integer getWlantypeid() {
        return wlantypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.WLANTypeId
     *
     * @param wlantypeid the value for t_carparkDevice.WLANTypeId
     *
     * @mbg.generated
     */
    public void setWlantypeid(Integer wlantypeid) {
        this.wlantypeid = wlantypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.wiringMode
     *
     * @return the value of t_carparkDevice.wiringMode
     *
     * @mbg.generated
     */
    public String getWiringmode() {
        return wiringmode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.wiringMode
     *
     * @param wiringmode the value for t_carparkDevice.wiringMode
     *
     * @mbg.generated
     */
    public void setWiringmode(String wiringmode) {
        this.wiringmode = wiringmode == null ? null : wiringmode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.network
     *
     * @return the value of t_carparkDevice.network
     *
     * @mbg.generated
     */
    public Integer getNetwork() {
        return network;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.network
     *
     * @param network the value for t_carparkDevice.network
     *
     * @mbg.generated
     */
    public void setNetwork(Integer network) {
        this.network = network;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.internetAccessId
     *
     * @return the value of t_carparkDevice.internetAccessId
     *
     * @mbg.generated
     */
    public Integer getInternetaccessid() {
        return internetaccessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.internetAccessId
     *
     * @param internetaccessid the value for t_carparkDevice.internetAccessId
     *
     * @mbg.generated
     */
    public void setInternetaccessid(Integer internetaccessid) {
        this.internetaccessid = internetaccessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.otherGive
     *
     * @return the value of t_carparkDevice.otherGive
     *
     * @mbg.generated
     */
    public String getOthergive() {
        return othergive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.otherGive
     *
     * @param othergive the value for t_carparkDevice.otherGive
     *
     * @mbg.generated
     */
    public void setOthergive(String othergive) {
        this.othergive = othergive == null ? null : othergive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_carparkDevice.carparkSurveyInfoId
     *
     * @return the value of t_carparkDevice.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    public Integer getCarparksurveyinfoid() {
        return carparksurveyinfoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_carparkDevice.carparkSurveyInfoId
     *
     * @param carparksurveyinfoid the value for t_carparkDevice.carparkSurveyInfoId
     *
     * @mbg.generated
     */
    public void setCarparksurveyinfoid(Integer carparksurveyinfoid) {
        this.carparksurveyinfoid = carparksurveyinfoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_carparkDevice
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carparkdeviceid=").append(carparkdeviceid);
        sb.append(", devicebrand=").append(devicebrand);
        sb.append(", installdate=").append(installdate);
        sb.append(", chargesystemowntypeid=").append(chargesystemowntypeid);
        sb.append(", hascontract=").append(hascontract);
        sb.append(", contractstartdate=").append(contractstartdate);
        sb.append(", contractenddate=").append(contractenddate);
        sb.append(", wlantypeid=").append(wlantypeid);
        sb.append(", wiringmode=").append(wiringmode);
        sb.append(", network=").append(network);
        sb.append(", internetaccessid=").append(internetaccessid);
        sb.append(", othergive=").append(othergive);
        sb.append(", carparksurveyinfoid=").append(carparksurveyinfoid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}