package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class TaBusinessPo {
    private String pkEquipment;

    private Date datatime;

    private BigDecimal batterycapacity;

    private BigDecimal signal;

    private String datanumber;

    private String imei;

    private String iccid;

    private BigDecimal soiltemperature1;

    private BigDecimal soiltemperature2;

    private BigDecimal soiltemperature3;

    private BigDecimal soilmoisture1;

    private BigDecimal soilmoisture2;

    private BigDecimal soilmoisture3;

    

    public String getPkEquipment() {
        return pkEquipment;
    }

    public void setPkEquipment(String pkEquipment) {
        this.pkEquipment = pkEquipment == null ? null : pkEquipment.trim();
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public BigDecimal getBatterycapacity() {
        return batterycapacity;
    }

    public void setBatterycapacity(BigDecimal batterycapacity) {
        this.batterycapacity = batterycapacity;
    }

    public BigDecimal getSignal() {
        return signal;
    }

    public void setSignal(BigDecimal signal) {
        this.signal = signal;
    }

    public String getDatanumber() {
        return datanumber;
    }

    public void setDatanumber(String datanumber) {
        this.datanumber = datanumber == null ? null : datanumber.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid == null ? null : iccid.trim();
    }

    public BigDecimal getSoiltemperature1() {
        return soiltemperature1;
    }

    public void setSoiltemperature1(BigDecimal soiltemperature1) {
        this.soiltemperature1 = soiltemperature1;
    }

    public BigDecimal getSoiltemperature2() {
        return soiltemperature2;
    }

    public void setSoiltemperature2(BigDecimal soiltemperature2) {
        this.soiltemperature2 = soiltemperature2;
    }

    public BigDecimal getSoiltemperature3() {
        return soiltemperature3;
    }

    public void setSoiltemperature3(BigDecimal soiltemperature3) {
        this.soiltemperature3 = soiltemperature3;
    }

    public BigDecimal getSoilmoisture1() {
        return soilmoisture1;
    }

    public void setSoilmoisture1(BigDecimal soilmoisture1) {
        this.soilmoisture1 = soilmoisture1;
    }

    public BigDecimal getSoilmoisture2() {
        return soilmoisture2;
    }

    public void setSoilmoisture2(BigDecimal soilmoisture2) {
        this.soilmoisture2 = soilmoisture2;
    }

    public BigDecimal getSoilmoisture3() {
        return soilmoisture3;
    }

    public void setSoilmoisture3(BigDecimal soilmoisture3) {
        this.soilmoisture3 = soilmoisture3;
    }
}