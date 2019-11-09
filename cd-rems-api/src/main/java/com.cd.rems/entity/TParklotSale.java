package com.cd.rems.entity;

import java.io.Serializable;
import java.util.Date;

public class TParklotSale implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.lotsaleId
     *
     * @mbg.generated
     */
    private Integer lotsaleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.parklotNum
     *
     * @mbg.generated
     */
    private String parklotnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.parkCentificateNum
     *
     * @mbg.generated
     */
    private String parkcentificatenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.subscriber
     *
     * @mbg.generated
     */
    private String subscriber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.subscribeDate
     *
     * @mbg.generated
     */
    private Date subscribedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.subscriberTel
     *
     * @mbg.generated
     */
    private String subscribertel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.parklotSaler
     *
     * @mbg.generated
     */
    private String parklotsaler;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.parklotDealPrice
     *
     * @mbg.generated
     */
    private Long parklotdealprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_parklot_sale.carparkId
     *
     * @mbg.generated
     */
    private Integer carparkid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_parklot_sale
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.lotsaleId
     *
     * @return the value of t_parklot_sale.lotsaleId
     *
     * @mbg.generated
     */
    public Integer getLotsaleid() {
        return lotsaleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.lotsaleId
     *
     * @param lotsaleid the value for t_parklot_sale.lotsaleId
     *
     * @mbg.generated
     */
    public void setLotsaleid(Integer lotsaleid) {
        this.lotsaleid = lotsaleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.parklotNum
     *
     * @return the value of t_parklot_sale.parklotNum
     *
     * @mbg.generated
     */
    public String getParklotnum() {
        return parklotnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.parklotNum
     *
     * @param parklotnum the value for t_parklot_sale.parklotNum
     *
     * @mbg.generated
     */
    public void setParklotnum(String parklotnum) {
        this.parklotnum = parklotnum == null ? null : parklotnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.parkCentificateNum
     *
     * @return the value of t_parklot_sale.parkCentificateNum
     *
     * @mbg.generated
     */
    public String getParkcentificatenum() {
        return parkcentificatenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.parkCentificateNum
     *
     * @param parkcentificatenum the value for t_parklot_sale.parkCentificateNum
     *
     * @mbg.generated
     */
    public void setParkcentificatenum(String parkcentificatenum) {
        this.parkcentificatenum = parkcentificatenum == null ? null : parkcentificatenum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.subscriber
     *
     * @return the value of t_parklot_sale.subscriber
     *
     * @mbg.generated
     */
    public String getSubscriber() {
        return subscriber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.subscriber
     *
     * @param subscriber the value for t_parklot_sale.subscriber
     *
     * @mbg.generated
     */
    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber == null ? null : subscriber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.subscribeDate
     *
     * @return the value of t_parklot_sale.subscribeDate
     *
     * @mbg.generated
     */
    public Date getSubscribedate() {
        return subscribedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.subscribeDate
     *
     * @param subscribedate the value for t_parklot_sale.subscribeDate
     *
     * @mbg.generated
     */
    public void setSubscribedate(Date subscribedate) {
        this.subscribedate = subscribedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.subscriberTel
     *
     * @return the value of t_parklot_sale.subscriberTel
     *
     * @mbg.generated
     */
    public String getSubscribertel() {
        return subscribertel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.subscriberTel
     *
     * @param subscribertel the value for t_parklot_sale.subscriberTel
     *
     * @mbg.generated
     */
    public void setSubscribertel(String subscribertel) {
        this.subscribertel = subscribertel == null ? null : subscribertel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.parklotSaler
     *
     * @return the value of t_parklot_sale.parklotSaler
     *
     * @mbg.generated
     */
    public String getParklotsaler() {
        return parklotsaler;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.parklotSaler
     *
     * @param parklotsaler the value for t_parklot_sale.parklotSaler
     *
     * @mbg.generated
     */
    public void setParklotsaler(String parklotsaler) {
        this.parklotsaler = parklotsaler == null ? null : parklotsaler.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.parklotDealPrice
     *
     * @return the value of t_parklot_sale.parklotDealPrice
     *
     * @mbg.generated
     */
    public Long getParklotdealprice() {
        return parklotdealprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.parklotDealPrice
     *
     * @param parklotdealprice the value for t_parklot_sale.parklotDealPrice
     *
     * @mbg.generated
     */
    public void setParklotdealprice(Long parklotdealprice) {
        this.parklotdealprice = parklotdealprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_parklot_sale.carparkId
     *
     * @return the value of t_parklot_sale.carparkId
     *
     * @mbg.generated
     */
    public Integer getCarparkid() {
        return carparkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_parklot_sale.carparkId
     *
     * @param carparkid the value for t_parklot_sale.carparkId
     *
     * @mbg.generated
     */
    public void setCarparkid(Integer carparkid) {
        this.carparkid = carparkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_parklot_sale
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lotsaleid=").append(lotsaleid);
        sb.append(", parklotnum=").append(parklotnum);
        sb.append(", parkcentificatenum=").append(parkcentificatenum);
        sb.append(", subscriber=").append(subscriber);
        sb.append(", subscribedate=").append(subscribedate);
        sb.append(", subscribertel=").append(subscribertel);
        sb.append(", parklotsaler=").append(parklotsaler);
        sb.append(", parklotdealprice=").append(parklotdealprice);
        sb.append(", carparkid=").append(carparkid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}