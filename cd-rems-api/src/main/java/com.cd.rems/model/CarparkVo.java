package com.cd.rems.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liufuqiang
 * @description
 * @date 2019/11/30 10:40
 */
public class CarparkVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer carparkid;
    private String carparkname;
    private String carparkaddress;
    private String entryuser;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date entrytime;
    private String developers;
    private String management;
    private String operator;
    private String propert;
    private String equipment;
    private Integer carparknature;
    private Integer carparktype;
    private Integer propertyyears;
    private Integer loanyears;
    private Integer carparkrank;
    private Integer carparktotal;
    private Integer carparktotalloan;
    private Integer buildingid;
    private String buildingname;
    private String buildingaddr;
    private String minDate;
    private String maxDate;

    public Integer getCarparkid() {
        return carparkid;
    }

    public void setCarparkid(Integer carparkid) {
        this.carparkid = carparkid;
    }

    public String getCarparkname() {
        return carparkname;
    }

    public void setCarparkname(String carparkname) {
        this.carparkname = carparkname;
    }

    public String getCarparkaddress() {
        return carparkaddress;
    }

    public void setCarparkaddress(String carparkaddress) {
        this.carparkaddress = carparkaddress;
    }

    public String getEntryuser() {
        return entryuser;
    }

    public void setEntryuser(String entryuser) {
        this.entryuser = entryuser;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPropert() {
        return propert;
    }

    public void setPropert(String propert) {
        this.propert = propert;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public Integer getCarparknature() {
        return carparknature;
    }

    public void setCarparknature(Integer carparknature) {
        this.carparknature = carparknature;
    }

    public Integer getCarparktype() {
        return carparktype;
    }

    public void setCarparktype(Integer carparktype) {
        this.carparktype = carparktype;
    }

    public Integer getPropertyyears() {
        return propertyyears;
    }

    public void setPropertyyears(Integer propertyyears) {
        this.propertyyears = propertyyears;
    }

    public Integer getLoanyears() {
        return loanyears;
    }

    public void setLoanyears(Integer loanyears) {
        this.loanyears = loanyears;
    }

    public Integer getCarparkrank() {
        return carparkrank;
    }

    public void setCarparkrank(Integer carparkrank) {
        this.carparkrank = carparkrank;
    }

    public Integer getCarparktotal() {
        return carparktotal;
    }

    public void setCarparktotal(Integer carparktotal) {
        this.carparktotal = carparktotal;
    }

    public Integer getCarparktotalloan() {
        return carparktotalloan;
    }

    public void setCarparktotalloan(Integer carparktotalloan) {
        this.carparktotalloan = carparktotalloan;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getBuildingaddr() {
        return buildingaddr;
    }

    public void setBuildingaddr(String buildingaddr) {
        this.buildingaddr = buildingaddr;
    }

    public String getMinDate() {
        return minDate;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    @Override
    public String toString() {
        return "CarparkVo{" +
                "carparkid=" + carparkid +
                ", carparkname='" + carparkname + '\'' +
                ", carparkaddress='" + carparkaddress + '\'' +
                ", entryuser='" + entryuser + '\'' +
                ", entrytime=" + entrytime +
                ", developers='" + developers + '\'' +
                ", management='" + management + '\'' +
                ", operator='" + operator + '\'' +
                ", propert='" + propert + '\'' +
                ", equipment='" + equipment + '\'' +
                ", carparknature=" + carparknature +
                ", carparktype=" + carparktype +
                ", propertyyears=" + propertyyears +
                ", loanyears=" + loanyears +
                ", carparkrank=" + carparkrank +
                ", carparktotal=" + carparktotal +
                ", carparktotalloan=" + carparktotalloan +
                ", buildingid=" + buildingid +
                ", buildingname='" + buildingname + '\'' +
                ", buildingaddr='" + buildingaddr + '\'' +
                ", minDate='" + minDate + '\'' +
                ", maxDate='" + maxDate + '\'' +
                '}';
    }
}
