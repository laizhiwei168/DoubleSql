package com.cimc.senheyun.po;

public class BdPurchasePDPo {
    private String pkPurchasePD;

    private String pkPurchaseP;

    private String pkMaterial;

    private Integer amount;

    private String pkOriginalD;

    

    public String getPkPurchasePD() {
        return pkPurchasePD;
    }

    public void setPkPurchasePD(String pkPurchasePD) {
        this.pkPurchasePD = pkPurchasePD == null ? null : pkPurchasePD.trim();
    }

    public String getPkPurchaseP() {
        return pkPurchaseP;
    }

    public void setPkPurchaseP(String pkPurchaseP) {
        this.pkPurchaseP = pkPurchaseP == null ? null : pkPurchaseP.trim();
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

    public String getPkOriginalD() {
        return pkOriginalD;
    }

    public void setPkOriginalD(String pkOriginalD) {
        this.pkOriginalD = pkOriginalD == null ? null : pkOriginalD.trim();
    }
}