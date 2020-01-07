package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class BdPurchaseInvoicingPo {
    private String pkPurchaseI;

    private String pkPurchase;

    private Byte paymentType;

    private Byte payType;

    private BigDecimal checkAmount;

    private String invoicingClerk;

    private Date invoicingDate;

    private Boolean enablestate;

    

    public String getPkPurchaseI() {
        return pkPurchaseI;
    }

    public void setPkPurchaseI(String pkPurchaseI) {
        this.pkPurchaseI = pkPurchaseI == null ? null : pkPurchaseI.trim();
    }

    public String getPkPurchase() {
        return pkPurchase;
    }

    public void setPkPurchase(String pkPurchase) {
        this.pkPurchase = pkPurchase == null ? null : pkPurchase.trim();
    }

    public Byte getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Byte paymentType) {
        this.paymentType = paymentType;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public BigDecimal getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
    }

    public String getInvoicingClerk() {
        return invoicingClerk;
    }

    public void setInvoicingClerk(String invoicingClerk) {
        this.invoicingClerk = invoicingClerk == null ? null : invoicingClerk.trim();
    }

    public Date getInvoicingDate() {
        return invoicingDate;
    }

    public void setInvoicingDate(Date invoicingDate) {
        this.invoicingDate = invoicingDate;
    }

    public Boolean getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Boolean enablestate) {
        this.enablestate = enablestate;
    }
}