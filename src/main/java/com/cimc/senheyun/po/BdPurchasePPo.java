package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.Date;

public class BdPurchasePPo {
    private String pkPurchaseP;

    private String theme;

    private Byte originalBillsType;

    private String pkOriginalBills;

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

    private String pkDeliveryman;

    private String deliveryman;

    private String deliverymanPhone;

    private String pkDriver;

    private String driver;

    private String driverPhone;

    private Date deliveryDate;

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

   

    public String getPkPurchaseP() {
        return pkPurchaseP;
    }

    public void setPkPurchaseP(String pkPurchaseP) {
        this.pkPurchaseP = pkPurchaseP == null ? null : pkPurchaseP.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
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

    public String getPkDeliveryman() {
        return pkDeliveryman;
    }

    public void setPkDeliveryman(String pkDeliveryman) {
        this.pkDeliveryman = pkDeliveryman == null ? null : pkDeliveryman.trim();
    }

    public String getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(String deliveryman) {
        this.deliveryman = deliveryman == null ? null : deliveryman.trim();
    }

    public String getDeliverymanPhone() {
        return deliverymanPhone;
    }

    public void setDeliverymanPhone(String deliverymanPhone) {
        this.deliverymanPhone = deliverymanPhone == null ? null : deliverymanPhone.trim();
    }

    public String getPkDriver() {
        return pkDriver;
    }

    public void setPkDriver(String pkDriver) {
        this.pkDriver = pkDriver == null ? null : pkDriver.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone == null ? null : driverPhone.trim();
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
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