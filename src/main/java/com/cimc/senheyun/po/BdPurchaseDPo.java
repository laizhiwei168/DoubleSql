package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class BdPurchaseDPo {
    private String pkPurchaseD;

    private String pkPurchase;

    private String pkMaterial;

    private Integer amount;

    private BigDecimal price;

    private BigDecimal money;

    private BigDecimal tax;

    private BigDecimal priceIncludingTax;

    private BigDecimal taxMoney;

    private BigDecimal containsTaxMoney;

    private Date deliveryDate;

    private String pkOriginalD;

    

    public String getPkPurchaseD() {
        return pkPurchaseD;
    }

    public void setPkPurchaseD(String pkPurchaseD) {
        this.pkPurchaseD = pkPurchaseD == null ? null : pkPurchaseD.trim();
    }

    public String getPkPurchase() {
        return pkPurchase;
    }

    public void setPkPurchase(String pkPurchase) {
        this.pkPurchase = pkPurchase == null ? null : pkPurchase.trim();
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getPriceIncludingTax() {
        return priceIncludingTax;
    }

    public void setPriceIncludingTax(BigDecimal priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
    }

    public BigDecimal getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(BigDecimal taxMoney) {
        this.taxMoney = taxMoney;
    }

    public BigDecimal getContainsTaxMoney() {
        return containsTaxMoney;
    }

    public void setContainsTaxMoney(BigDecimal containsTaxMoney) {
        this.containsTaxMoney = containsTaxMoney;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPkOriginalD() {
        return pkOriginalD;
    }

    public void setPkOriginalD(String pkOriginalD) {
        this.pkOriginalD = pkOriginalD == null ? null : pkOriginalD.trim();
    }
}