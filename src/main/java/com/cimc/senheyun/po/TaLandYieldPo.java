package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class TaLandYieldPo {
    private String pkLand;

    private Date datatime;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private BigDecimal yield;

    private BigDecimal weight;

    private BigDecimal demarcate1;

    private BigDecimal demarcate2;

    private BigDecimal simulationvalue;

    private Integer landtype;

    

    public String getPkLand() {
        return pkLand;
    }

    public void setPkLand(String pkLand) {
        this.pkLand = pkLand == null ? null : pkLand.trim();
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getYield() {
        return yield;
    }

    public void setYield(BigDecimal yield) {
        this.yield = yield;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getDemarcate1() {
        return demarcate1;
    }

    public void setDemarcate1(BigDecimal demarcate1) {
        this.demarcate1 = demarcate1;
    }

    public BigDecimal getDemarcate2() {
        return demarcate2;
    }

    public void setDemarcate2(BigDecimal demarcate2) {
        this.demarcate2 = demarcate2;
    }

    public BigDecimal getSimulationvalue() {
        return simulationvalue;
    }

    public void setSimulationvalue(BigDecimal simulationvalue) {
        this.simulationvalue = simulationvalue;
    }

    public Integer getLandtype() {
        return landtype;
    }

    public void setLandtype(Integer landtype) {
        this.landtype = landtype;
    }
}