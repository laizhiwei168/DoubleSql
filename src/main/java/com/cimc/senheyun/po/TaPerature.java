package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class TaPerature {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ta_perature_equipmet_data_new.pk_equipment
     *
     * @mbg.generated
     */
    private String pkEquipment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ta_perature_equipmet_data_new.dataTime
     *
     * @mbg.generated
     */
    private Date datatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ta_perature_equipmet_data_new.liquidLevelMPa
     *
     * @mbg.generated
     */
    private BigDecimal liquidlevelmpa;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ta_perature_equipmet_data_new.batteryCapacity
     *
     * @mbg.generated
     */
    private BigDecimal batterycapacity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ta_perature_equipmet_data_new.signal
     *
     * @mbg.generated
     */
    private BigDecimal signal;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ta_perature_equipmet_data_new
     *
     * @mbg.generated
     */
    public TaPerature(String pkEquipment, Date datatime, BigDecimal liquidlevelmpa, BigDecimal batterycapacity, BigDecimal signal) {
        this.pkEquipment = pkEquipment;
        this.datatime = datatime;
        this.liquidlevelmpa = liquidlevelmpa;
        this.batterycapacity = batterycapacity;
        this.signal = signal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ta_perature_equipmet_data_new
     *
     * @mbg.generated
     */
    public TaPerature() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ta_perature_equipmet_data_new.pk_equipment
     *
     * @return the value of ta_perature_equipmet_data_new.pk_equipment
     *
     * @mbg.generated
     */
    public String getPkEquipment() {
        return pkEquipment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ta_perature_equipmet_data_new.pk_equipment
     *
     * @param pkEquipment the value for ta_perature_equipmet_data_new.pk_equipment
     *
     * @mbg.generated
     */
    public void setPkEquipment(String pkEquipment) {
        this.pkEquipment = pkEquipment == null ? null : pkEquipment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ta_perature_equipmet_data_new.dataTime
     *
     * @return the value of ta_perature_equipmet_data_new.dataTime
     *
     * @mbg.generated
     */
    public Date getDatatime() {
        return datatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ta_perature_equipmet_data_new.dataTime
     *
     * @param datatime the value for ta_perature_equipmet_data_new.dataTime
     *
     * @mbg.generated
     */
    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ta_perature_equipmet_data_new.liquidLevelMPa
     *
     * @return the value of ta_perature_equipmet_data_new.liquidLevelMPa
     *
     * @mbg.generated
     */
    public BigDecimal getLiquidlevelmpa() {
        return liquidlevelmpa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ta_perature_equipmet_data_new.liquidLevelMPa
     *
     * @param liquidlevelmpa the value for ta_perature_equipmet_data_new.liquidLevelMPa
     *
     * @mbg.generated
     */
    public void setLiquidlevelmpa(BigDecimal liquidlevelmpa) {
        this.liquidlevelmpa = liquidlevelmpa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ta_perature_equipmet_data_new.batteryCapacity
     *
     * @return the value of ta_perature_equipmet_data_new.batteryCapacity
     *
     * @mbg.generated
     */
    public BigDecimal getBatterycapacity() {
        return batterycapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ta_perature_equipmet_data_new.batteryCapacity
     *
     * @param batterycapacity the value for ta_perature_equipmet_data_new.batteryCapacity
     *
     * @mbg.generated
     */
    public void setBatterycapacity(BigDecimal batterycapacity) {
        this.batterycapacity = batterycapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ta_perature_equipmet_data_new.signal
     *
     * @return the value of ta_perature_equipmet_data_new.signal
     *
     * @mbg.generated
     */
    public BigDecimal getSignal() {
        return signal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ta_perature_equipmet_data_new.signal
     *
     * @param signal the value for ta_perature_equipmet_data_new.signal
     *
     * @mbg.generated
     */
    public void setSignal(BigDecimal signal) {
        this.signal = signal;
    }
}