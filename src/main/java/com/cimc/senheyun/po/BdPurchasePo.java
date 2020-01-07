package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class BdPurchasePo {
    private String pkPurchase;

    private String theme;

    private Byte purchaseType;

    private Byte originalBillsType;

    private String pkOriginalBills;

    private String buyer;

    private Date applicationDate;

    private String pkCustomer;

    private String customer;

    private String customerPhone;

    private String pkAddress;

    private String arrivalLocation;

    private BigDecimal arrivalLongitude;

    private BigDecimal arrivalLatitude;

    private String pkSupplier;

    private String supplier;

    private String supplierPhone;

    private String pkSupplierAddress;

    private String supplierLocation;

    private BigDecimal supplierLongitude;

    private BigDecimal supplierLatitude;

    private BigDecimal distance;

    private BigDecimal distancePrice;

    private BigDecimal totalShippingFeeMoney;

    private BigDecimal totalMoney;

    private BigDecimal totalTaxMoney;

    private BigDecimal totalContainsTaxMoney;

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

    private Boolean enablestate;

    

    public String getPkPurchase() {
        return pkPurchase;
    }

    public void setPkPurchase(String pkPurchase) {
        this.pkPurchase = pkPurchase == null ? null : pkPurchase.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public Byte getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(Byte purchaseType) {
        this.purchaseType = purchaseType;
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

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
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

    public String getPkSupplier() {
        return pkSupplier;
    }

    public void setPkSupplier(String pkSupplier) {
        this.pkSupplier = pkSupplier == null ? null : pkSupplier.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone == null ? null : supplierPhone.trim();
    }

    public String getPkSupplierAddress() {
        return pkSupplierAddress;
    }

    public void setPkSupplierAddress(String pkSupplierAddress) {
        this.pkSupplierAddress = pkSupplierAddress == null ? null : pkSupplierAddress.trim();
    }

    public String getSupplierLocation() {
        return supplierLocation;
    }

    public void setSupplierLocation(String supplierLocation) {
        this.supplierLocation = supplierLocation == null ? null : supplierLocation.trim();
    }

    public BigDecimal getSupplierLongitude() {
        return supplierLongitude;
    }

    public void setSupplierLongitude(BigDecimal supplierLongitude) {
        this.supplierLongitude = supplierLongitude;
    }

    public BigDecimal getSupplierLatitude() {
        return supplierLatitude;
    }

    public void setSupplierLatitude(BigDecimal supplierLatitude) {
        this.supplierLatitude = supplierLatitude;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public BigDecimal getDistancePrice() {
        return distancePrice;
    }

    public void setDistancePrice(BigDecimal distancePrice) {
        this.distancePrice = distancePrice;
    }

    public BigDecimal getTotalShippingFeeMoney() {
        return totalShippingFeeMoney;
    }

    public void setTotalShippingFeeMoney(BigDecimal totalShippingFeeMoney) {
        this.totalShippingFeeMoney = totalShippingFeeMoney;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getTotalTaxMoney() {
        return totalTaxMoney;
    }

    public void setTotalTaxMoney(BigDecimal totalTaxMoney) {
        this.totalTaxMoney = totalTaxMoney;
    }

    public BigDecimal getTotalContainsTaxMoney() {
        return totalContainsTaxMoney;
    }

    public void setTotalContainsTaxMoney(BigDecimal totalContainsTaxMoney) {
        this.totalContainsTaxMoney = totalContainsTaxMoney;
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

    public Boolean getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Boolean enablestate) {
        this.enablestate = enablestate;
    }
}