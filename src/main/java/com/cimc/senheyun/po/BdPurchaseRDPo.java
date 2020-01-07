package com.cimc.senheyun.po;

import java.util.Date;

public class BdPurchaseRDPo {
    private String pkPurchaseRD;

    private String pkPurchaseR;

    private String pkMaterial;

    private Integer amount;

    private Date requestedDate;

    private String reasonApplication;

    private String pkOriginalD;

    

    public String getPkPurchaseRD() {
        return pkPurchaseRD;
    }

    public void setPkPurchaseRD(String pkPurchaseRD) {
        this.pkPurchaseRD = pkPurchaseRD == null ? null : pkPurchaseRD.trim();
    }

    public String getPkPurchaseR() {
        return pkPurchaseR;
    }

    public void setPkPurchaseR(String pkPurchaseR) {
        this.pkPurchaseR = pkPurchaseR == null ? null : pkPurchaseR.trim();
    }

    public String getPkMaterial() {
        return pkMaterial;
    }

    public void setPkMaterial(String pkMaterial) {
        this.pkMaterial = pkMaterial == null ? null : pkMaterial.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getReasonApplication() {
        return reasonApplication;
    }

    public void setReasonApplication(String reasonApplication) {
        this.reasonApplication = reasonApplication == null ? null : reasonApplication.trim();
    }

    public String getPkOriginalD() {
        return pkOriginalD;
    }

    public void setPkOriginalD(String pkOriginalD) {
        this.pkOriginalD = pkOriginalD == null ? null : pkOriginalD.trim();
    }
}