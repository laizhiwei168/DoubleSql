package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class BdPurchaseRPo {
    private String pkPurchaseR;

    private String theme;

    private Byte purchaseRType;

    private String proposerId;

    private String proposerSection;

    private Byte originalBillsType;

    private String pkOriginalBills;

    private Date applicationDate;

    private String pkCustomer;

    private String customer;

    private String customerPhone;

    private String pkAddress;

    private String arrivalLocation;

    private BigDecimal arrivalLongitude;

    private BigDecimal arrivalLatitude;

    private Byte documentStatus;

    private String manufacturingClerk;

    private Date manufacturingDate;

    private String confirmationClerk;

    private Date confirmationDate;

    private String invoicingClerk;

    private Date invoicingDate;

    private String updateClerk;

    private Date updateTime;

    private String remark;

   

    public String getPkPurchaseR() {
        return pkPurchaseR;
    }

    public void setPkPurchaseR(String pkPurchaseR) {
        this.pkPurchaseR = pkPurchaseR == null ? null : pkPurchaseR.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public Byte getPurchaseRType() {
        return purchaseRType;
    }

    public void setPurchaseRType(Byte purchaseRType) {
        this.purchaseRType = purchaseRType;
    }

    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId == null ? null : proposerId.trim();
    }

    public String getProposerSection() {
        return proposerSection;
    }

    public void setProposerSection(String proposerSection) {
        this.proposerSection = proposerSection == null ? null : proposerSection.trim();
    }

    public Byte getOriginalBillsType() {
        return originalBillsType;
    }

    public void setOriginalBillsType(Byte originalBillsType) {
        this.originalBillsType = originalBillsType;
    }

    public String getPkOriginalBills() {
        return pkOriginalBills;
    }

    public void setPkOriginalBills(String pkOriginalBills) {
        this.pkOriginalBills = pkOriginalBills == null ? null : pkOriginalBills.trim();
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(String pkCustomer) {
        this.pkCustomer = pkCustomer == null ? null : pkCustomer.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getPkAddress() {
        return pkAddress;
    }

    public void setPkAddress(String pkAddress) {
        this.pkAddress = pkAddress == null ? null : pkAddress.trim();
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation == null ? null : arrivalLocation.trim();
    }

    public BigDecimal getArrivalLongitude() {
        return arrivalLongitude;
    }

    public void setArrivalLongitude(BigDecimal arrivalLongitude) {
        this.arrivalLongitude = arrivalLongitude;
    }

    public BigDecimal getArrivalLatitude() {
        return arrivalLatitude;
    }

    public void setArrivalLatitude(BigDecimal arrivalLatitude) {
        this.arrivalLatitude = arrivalLatitude;
    }

    public Byte getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(Byte documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getManufacturingClerk() {
        return manufacturingClerk;
    }

    public void setManufacturingClerk(String manufacturingClerk) {
        this.manufacturingClerk = manufacturingClerk == null ? null : manufacturingClerk.trim();
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getConfirmationClerk() {
        return confirmationClerk;
    }

    public void setConfirmationClerk(String confirmationClerk) {
        this.confirmationClerk = confirmationClerk == null ? null : confirmationClerk.trim();
    }

    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
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

    public String getUpdateClerk() {
        return updateClerk;
    }

    public void setUpdateClerk(String updateClerk) {
        this.updateClerk = updateClerk == null ? null : updateClerk.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}