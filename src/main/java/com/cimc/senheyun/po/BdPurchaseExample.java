package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdPurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdPurchaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkPurchaseIsNull() {
            addCriterion("pk_purchase is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIsNotNull() {
            addCriterion("pk_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseEqualTo(String value) {
            addCriterion("pk_purchase =", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseNotEqualTo(String value) {
            addCriterion("pk_purchase <>", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseGreaterThan(String value) {
            addCriterion("pk_purchase >", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("pk_purchase >=", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseLessThan(String value) {
            addCriterion("pk_purchase <", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseLessThanOrEqualTo(String value) {
            addCriterion("pk_purchase <=", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseLike(String value) {
            addCriterion("pk_purchase like", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseNotLike(String value) {
            addCriterion("pk_purchase not like", value, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIn(List<String> values) {
            addCriterion("pk_purchase in", values, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseNotIn(List<String> values) {
            addCriterion("pk_purchase not in", values, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseBetween(String value1, String value2) {
            addCriterion("pk_purchase between", value1, value2, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseNotBetween(String value1, String value2) {
            addCriterion("pk_purchase not between", value1, value2, "pkPurchase");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("purchase_type is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("purchase_type is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(Byte value) {
            addCriterion("purchase_type =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(Byte value) {
            addCriterion("purchase_type <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(Byte value) {
            addCriterion("purchase_type >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("purchase_type >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(Byte value) {
            addCriterion("purchase_type <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("purchase_type <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<Byte> values) {
            addCriterion("purchase_type in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<Byte> values) {
            addCriterion("purchase_type not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(Byte value1, Byte value2) {
            addCriterion("purchase_type between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("purchase_type not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeIsNull() {
            addCriterion("original_bills_type is null");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeIsNotNull() {
            addCriterion("original_bills_type is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeEqualTo(Byte value) {
            addCriterion("original_bills_type =", value, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeNotEqualTo(Byte value) {
            addCriterion("original_bills_type <>", value, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeGreaterThan(Byte value) {
            addCriterion("original_bills_type >", value, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("original_bills_type >=", value, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeLessThan(Byte value) {
            addCriterion("original_bills_type <", value, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("original_bills_type <=", value, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeIn(List<Byte> values) {
            addCriterion("original_bills_type in", values, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeNotIn(List<Byte> values) {
            addCriterion("original_bills_type not in", values, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeBetween(Byte value1, Byte value2) {
            addCriterion("original_bills_type between", value1, value2, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andOriginalBillsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("original_bills_type not between", value1, value2, "originalBillsType");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsIsNull() {
            addCriterion("pk_original_bills is null");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsIsNotNull() {
            addCriterion("pk_original_bills is not null");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsEqualTo(String value) {
            addCriterion("pk_original_bills =", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsNotEqualTo(String value) {
            addCriterion("pk_original_bills <>", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsGreaterThan(String value) {
            addCriterion("pk_original_bills >", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsGreaterThanOrEqualTo(String value) {
            addCriterion("pk_original_bills >=", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsLessThan(String value) {
            addCriterion("pk_original_bills <", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsLessThanOrEqualTo(String value) {
            addCriterion("pk_original_bills <=", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsLike(String value) {
            addCriterion("pk_original_bills like", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsNotLike(String value) {
            addCriterion("pk_original_bills not like", value, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsIn(List<String> values) {
            addCriterion("pk_original_bills in", values, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsNotIn(List<String> values) {
            addCriterion("pk_original_bills not in", values, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsBetween(String value1, String value2) {
            addCriterion("pk_original_bills between", value1, value2, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andPkOriginalBillsNotBetween(String value1, String value2) {
            addCriterion("pk_original_bills not between", value1, value2, "pkOriginalBills");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("buyer is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("buyer is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(String value) {
            addCriterion("buyer =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(String value) {
            addCriterion("buyer <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(String value) {
            addCriterion("buyer >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("buyer >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(String value) {
            addCriterion("buyer <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(String value) {
            addCriterion("buyer <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLike(String value) {
            addCriterion("buyer like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotLike(String value) {
            addCriterion("buyer not like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<String> values) {
            addCriterion("buyer in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<String> values) {
            addCriterion("buyer not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(String value1, String value2) {
            addCriterion("buyer between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(String value1, String value2) {
            addCriterion("buyer not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNull() {
            addCriterion("application_date is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNotNull() {
            addCriterion("application_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateEqualTo(Date value) {
            addCriterion("application_date =", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotEqualTo(Date value) {
            addCriterion("application_date <>", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThan(Date value) {
            addCriterion("application_date >", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("application_date >=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThan(Date value) {
            addCriterion("application_date <", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThanOrEqualTo(Date value) {
            addCriterion("application_date <=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIn(List<Date> values) {
            addCriterion("application_date in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotIn(List<Date> values) {
            addCriterion("application_date not in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateBetween(Date value1, Date value2) {
            addCriterion("application_date between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotBetween(Date value1, Date value2) {
            addCriterion("application_date not between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIsNull() {
            addCriterion("pk_customer is null");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIsNotNull() {
            addCriterion("pk_customer is not null");
            return (Criteria) this;
        }

        public Criteria andPkCustomerEqualTo(String value) {
            addCriterion("pk_customer =", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotEqualTo(String value) {
            addCriterion("pk_customer <>", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerGreaterThan(String value) {
            addCriterion("pk_customer >", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("pk_customer >=", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLessThan(String value) {
            addCriterion("pk_customer <", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLessThanOrEqualTo(String value) {
            addCriterion("pk_customer <=", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLike(String value) {
            addCriterion("pk_customer like", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotLike(String value) {
            addCriterion("pk_customer not like", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIn(List<String> values) {
            addCriterion("pk_customer in", values, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotIn(List<String> values) {
            addCriterion("pk_customer not in", values, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerBetween(String value1, String value2) {
            addCriterion("pk_customer between", value1, value2, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotBetween(String value1, String value2) {
            addCriterion("pk_customer not between", value1, value2, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andPkAddressIsNull() {
            addCriterion("pk_address is null");
            return (Criteria) this;
        }

        public Criteria andPkAddressIsNotNull() {
            addCriterion("pk_address is not null");
            return (Criteria) this;
        }

        public Criteria andPkAddressEqualTo(String value) {
            addCriterion("pk_address =", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressNotEqualTo(String value) {
            addCriterion("pk_address <>", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressGreaterThan(String value) {
            addCriterion("pk_address >", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pk_address >=", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressLessThan(String value) {
            addCriterion("pk_address <", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressLessThanOrEqualTo(String value) {
            addCriterion("pk_address <=", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressLike(String value) {
            addCriterion("pk_address like", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressNotLike(String value) {
            addCriterion("pk_address not like", value, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressIn(List<String> values) {
            addCriterion("pk_address in", values, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressNotIn(List<String> values) {
            addCriterion("pk_address not in", values, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressBetween(String value1, String value2) {
            addCriterion("pk_address between", value1, value2, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andPkAddressNotBetween(String value1, String value2) {
            addCriterion("pk_address not between", value1, value2, "pkAddress");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationIsNull() {
            addCriterion("arrival_location is null");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationIsNotNull() {
            addCriterion("arrival_location is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationEqualTo(String value) {
            addCriterion("arrival_location =", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationNotEqualTo(String value) {
            addCriterion("arrival_location <>", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationGreaterThan(String value) {
            addCriterion("arrival_location >", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_location >=", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationLessThan(String value) {
            addCriterion("arrival_location <", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationLessThanOrEqualTo(String value) {
            addCriterion("arrival_location <=", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationLike(String value) {
            addCriterion("arrival_location like", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationNotLike(String value) {
            addCriterion("arrival_location not like", value, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationIn(List<String> values) {
            addCriterion("arrival_location in", values, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationNotIn(List<String> values) {
            addCriterion("arrival_location not in", values, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationBetween(String value1, String value2) {
            addCriterion("arrival_location between", value1, value2, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLocationNotBetween(String value1, String value2) {
            addCriterion("arrival_location not between", value1, value2, "arrivalLocation");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeIsNull() {
            addCriterion("arrival_longitude is null");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeIsNotNull() {
            addCriterion("arrival_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeEqualTo(BigDecimal value) {
            addCriterion("arrival_longitude =", value, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("arrival_longitude <>", value, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeGreaterThan(BigDecimal value) {
            addCriterion("arrival_longitude >", value, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("arrival_longitude >=", value, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeLessThan(BigDecimal value) {
            addCriterion("arrival_longitude <", value, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("arrival_longitude <=", value, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeIn(List<BigDecimal> values) {
            addCriterion("arrival_longitude in", values, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("arrival_longitude not in", values, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arrival_longitude between", value1, value2, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arrival_longitude not between", value1, value2, "arrivalLongitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeIsNull() {
            addCriterion("arrival_latitude is null");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeIsNotNull() {
            addCriterion("arrival_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeEqualTo(BigDecimal value) {
            addCriterion("arrival_latitude =", value, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("arrival_latitude <>", value, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeGreaterThan(BigDecimal value) {
            addCriterion("arrival_latitude >", value, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("arrival_latitude >=", value, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeLessThan(BigDecimal value) {
            addCriterion("arrival_latitude <", value, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("arrival_latitude <=", value, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeIn(List<BigDecimal> values) {
            addCriterion("arrival_latitude in", values, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("arrival_latitude not in", values, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arrival_latitude between", value1, value2, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andArrivalLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arrival_latitude not between", value1, value2, "arrivalLatitude");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIsNull() {
            addCriterion("pk_supplier is null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIsNotNull() {
            addCriterion("pk_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierEqualTo(String value) {
            addCriterion("pk_supplier =", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotEqualTo(String value) {
            addCriterion("pk_supplier <>", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThan(String value) {
            addCriterion("pk_supplier >", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("pk_supplier >=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThan(String value) {
            addCriterion("pk_supplier <", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThanOrEqualTo(String value) {
            addCriterion("pk_supplier <=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLike(String value) {
            addCriterion("pk_supplier like", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotLike(String value) {
            addCriterion("pk_supplier not like", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIn(List<String> values) {
            addCriterion("pk_supplier in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotIn(List<String> values) {
            addCriterion("pk_supplier not in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierBetween(String value1, String value2) {
            addCriterion("pk_supplier between", value1, value2, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotBetween(String value1, String value2) {
            addCriterion("pk_supplier not between", value1, value2, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNull() {
            addCriterion("supplier_phone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNotNull() {
            addCriterion("supplier_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneEqualTo(String value) {
            addCriterion("supplier_phone =", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotEqualTo(String value) {
            addCriterion("supplier_phone <>", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThan(String value) {
            addCriterion("supplier_phone >", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_phone >=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThan(String value) {
            addCriterion("supplier_phone <", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_phone <=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLike(String value) {
            addCriterion("supplier_phone like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotLike(String value) {
            addCriterion("supplier_phone not like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIn(List<String> values) {
            addCriterion("supplier_phone in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotIn(List<String> values) {
            addCriterion("supplier_phone not in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneBetween(String value1, String value2) {
            addCriterion("supplier_phone between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotBetween(String value1, String value2) {
            addCriterion("supplier_phone not between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressIsNull() {
            addCriterion("pk_supplier_address is null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressIsNotNull() {
            addCriterion("pk_supplier_address is not null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressEqualTo(String value) {
            addCriterion("pk_supplier_address =", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressNotEqualTo(String value) {
            addCriterion("pk_supplier_address <>", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressGreaterThan(String value) {
            addCriterion("pk_supplier_address >", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pk_supplier_address >=", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressLessThan(String value) {
            addCriterion("pk_supplier_address <", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("pk_supplier_address <=", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressLike(String value) {
            addCriterion("pk_supplier_address like", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressNotLike(String value) {
            addCriterion("pk_supplier_address not like", value, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressIn(List<String> values) {
            addCriterion("pk_supplier_address in", values, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressNotIn(List<String> values) {
            addCriterion("pk_supplier_address not in", values, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressBetween(String value1, String value2) {
            addCriterion("pk_supplier_address between", value1, value2, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPkSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("pk_supplier_address not between", value1, value2, "pkSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationIsNull() {
            addCriterion("supplier_location is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationIsNotNull() {
            addCriterion("supplier_location is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationEqualTo(String value) {
            addCriterion("supplier_location =", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationNotEqualTo(String value) {
            addCriterion("supplier_location <>", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationGreaterThan(String value) {
            addCriterion("supplier_location >", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_location >=", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationLessThan(String value) {
            addCriterion("supplier_location <", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationLessThanOrEqualTo(String value) {
            addCriterion("supplier_location <=", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationLike(String value) {
            addCriterion("supplier_location like", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationNotLike(String value) {
            addCriterion("supplier_location not like", value, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationIn(List<String> values) {
            addCriterion("supplier_location in", values, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationNotIn(List<String> values) {
            addCriterion("supplier_location not in", values, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationBetween(String value1, String value2) {
            addCriterion("supplier_location between", value1, value2, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLocationNotBetween(String value1, String value2) {
            addCriterion("supplier_location not between", value1, value2, "supplierLocation");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeIsNull() {
            addCriterion("supplier_longitude is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeIsNotNull() {
            addCriterion("supplier_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeEqualTo(BigDecimal value) {
            addCriterion("supplier_longitude =", value, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("supplier_longitude <>", value, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeGreaterThan(BigDecimal value) {
            addCriterion("supplier_longitude >", value, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supplier_longitude >=", value, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeLessThan(BigDecimal value) {
            addCriterion("supplier_longitude <", value, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supplier_longitude <=", value, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeIn(List<BigDecimal> values) {
            addCriterion("supplier_longitude in", values, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("supplier_longitude not in", values, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplier_longitude between", value1, value2, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplier_longitude not between", value1, value2, "supplierLongitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeIsNull() {
            addCriterion("supplier_latitude is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeIsNotNull() {
            addCriterion("supplier_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeEqualTo(BigDecimal value) {
            addCriterion("supplier_latitude =", value, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("supplier_latitude <>", value, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeGreaterThan(BigDecimal value) {
            addCriterion("supplier_latitude >", value, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supplier_latitude >=", value, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeLessThan(BigDecimal value) {
            addCriterion("supplier_latitude <", value, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supplier_latitude <=", value, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeIn(List<BigDecimal> values) {
            addCriterion("supplier_latitude in", values, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("supplier_latitude not in", values, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplier_latitude between", value1, value2, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andSupplierLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplier_latitude not between", value1, value2, "supplierLatitude");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(BigDecimal value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(BigDecimal value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(BigDecimal value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(BigDecimal value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<BigDecimal> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<BigDecimal> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistancePriceIsNull() {
            addCriterion("distance_price is null");
            return (Criteria) this;
        }

        public Criteria andDistancePriceIsNotNull() {
            addCriterion("distance_price is not null");
            return (Criteria) this;
        }

        public Criteria andDistancePriceEqualTo(BigDecimal value) {
            addCriterion("distance_price =", value, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceNotEqualTo(BigDecimal value) {
            addCriterion("distance_price <>", value, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceGreaterThan(BigDecimal value) {
            addCriterion("distance_price >", value, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_price >=", value, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceLessThan(BigDecimal value) {
            addCriterion("distance_price <", value, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_price <=", value, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceIn(List<BigDecimal> values) {
            addCriterion("distance_price in", values, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceNotIn(List<BigDecimal> values) {
            addCriterion("distance_price not in", values, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_price between", value1, value2, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andDistancePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_price not between", value1, value2, "distancePrice");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyIsNull() {
            addCriterion("total_shipping_fee_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyIsNotNull() {
            addCriterion("total_shipping_fee_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyEqualTo(BigDecimal value) {
            addCriterion("total_shipping_fee_money =", value, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_shipping_fee_money <>", value, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_shipping_fee_money >", value, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_shipping_fee_money >=", value, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyLessThan(BigDecimal value) {
            addCriterion("total_shipping_fee_money <", value, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_shipping_fee_money <=", value, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyIn(List<BigDecimal> values) {
            addCriterion("total_shipping_fee_money in", values, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_shipping_fee_money not in", values, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_shipping_fee_money between", value1, value2, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalShippingFeeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_shipping_fee_money not between", value1, value2, "totalShippingFeeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(BigDecimal value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyIsNull() {
            addCriterion("total_tax_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyIsNotNull() {
            addCriterion("total_tax_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyEqualTo(BigDecimal value) {
            addCriterion("total_tax_money =", value, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_tax_money <>", value, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_tax_money >", value, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_tax_money >=", value, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyLessThan(BigDecimal value) {
            addCriterion("total_tax_money <", value, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_tax_money <=", value, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyIn(List<BigDecimal> values) {
            addCriterion("total_tax_money in", values, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_tax_money not in", values, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_tax_money between", value1, value2, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalTaxMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_tax_money not between", value1, value2, "totalTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyIsNull() {
            addCriterion("total_contains_tax_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyIsNotNull() {
            addCriterion("total_contains_tax_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyEqualTo(BigDecimal value) {
            addCriterion("total_contains_tax_money =", value, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_contains_tax_money <>", value, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_contains_tax_money >", value, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_contains_tax_money >=", value, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyLessThan(BigDecimal value) {
            addCriterion("total_contains_tax_money <", value, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_contains_tax_money <=", value, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyIn(List<BigDecimal> values) {
            addCriterion("total_contains_tax_money in", values, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_contains_tax_money not in", values, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_contains_tax_money between", value1, value2, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andTotalContainsTaxMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_contains_tax_money not between", value1, value2, "totalContainsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusIsNull() {
            addCriterion("document_status is null");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusIsNotNull() {
            addCriterion("document_status is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusEqualTo(Byte value) {
            addCriterion("document_status =", value, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusNotEqualTo(Byte value) {
            addCriterion("document_status <>", value, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusGreaterThan(Byte value) {
            addCriterion("document_status >", value, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("document_status >=", value, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusLessThan(Byte value) {
            addCriterion("document_status <", value, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("document_status <=", value, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusIn(List<Byte> values) {
            addCriterion("document_status in", values, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusNotIn(List<Byte> values) {
            addCriterion("document_status not in", values, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusBetween(Byte value1, Byte value2) {
            addCriterion("document_status between", value1, value2, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andDocumentStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("document_status not between", value1, value2, "documentStatus");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkIsNull() {
            addCriterion("manufacturing_clerk is null");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkIsNotNull() {
            addCriterion("manufacturing_clerk is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkEqualTo(String value) {
            addCriterion("manufacturing_clerk =", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkNotEqualTo(String value) {
            addCriterion("manufacturing_clerk <>", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkGreaterThan(String value) {
            addCriterion("manufacturing_clerk >", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturing_clerk >=", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkLessThan(String value) {
            addCriterion("manufacturing_clerk <", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkLessThanOrEqualTo(String value) {
            addCriterion("manufacturing_clerk <=", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkLike(String value) {
            addCriterion("manufacturing_clerk like", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkNotLike(String value) {
            addCriterion("manufacturing_clerk not like", value, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkIn(List<String> values) {
            addCriterion("manufacturing_clerk in", values, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkNotIn(List<String> values) {
            addCriterion("manufacturing_clerk not in", values, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkBetween(String value1, String value2) {
            addCriterion("manufacturing_clerk between", value1, value2, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingClerkNotBetween(String value1, String value2) {
            addCriterion("manufacturing_clerk not between", value1, value2, "manufacturingClerk");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateIsNull() {
            addCriterion("manufacturing_date is null");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateIsNotNull() {
            addCriterion("manufacturing_date is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateEqualTo(Date value) {
            addCriterion("manufacturing_date =", value, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateNotEqualTo(Date value) {
            addCriterion("manufacturing_date <>", value, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateGreaterThan(Date value) {
            addCriterion("manufacturing_date >", value, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("manufacturing_date >=", value, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateLessThan(Date value) {
            addCriterion("manufacturing_date <", value, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateLessThanOrEqualTo(Date value) {
            addCriterion("manufacturing_date <=", value, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateIn(List<Date> values) {
            addCriterion("manufacturing_date in", values, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateNotIn(List<Date> values) {
            addCriterion("manufacturing_date not in", values, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateBetween(Date value1, Date value2) {
            addCriterion("manufacturing_date between", value1, value2, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andManufacturingDateNotBetween(Date value1, Date value2) {
            addCriterion("manufacturing_date not between", value1, value2, "manufacturingDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkIsNull() {
            addCriterion("confirmation_clerk is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkIsNotNull() {
            addCriterion("confirmation_clerk is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkEqualTo(String value) {
            addCriterion("confirmation_clerk =", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkNotEqualTo(String value) {
            addCriterion("confirmation_clerk <>", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkGreaterThan(String value) {
            addCriterion("confirmation_clerk >", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkGreaterThanOrEqualTo(String value) {
            addCriterion("confirmation_clerk >=", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkLessThan(String value) {
            addCriterion("confirmation_clerk <", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkLessThanOrEqualTo(String value) {
            addCriterion("confirmation_clerk <=", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkLike(String value) {
            addCriterion("confirmation_clerk like", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkNotLike(String value) {
            addCriterion("confirmation_clerk not like", value, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkIn(List<String> values) {
            addCriterion("confirmation_clerk in", values, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkNotIn(List<String> values) {
            addCriterion("confirmation_clerk not in", values, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkBetween(String value1, String value2) {
            addCriterion("confirmation_clerk between", value1, value2, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationClerkNotBetween(String value1, String value2) {
            addCriterion("confirmation_clerk not between", value1, value2, "confirmationClerk");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateIsNull() {
            addCriterion("confirmation_date is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateIsNotNull() {
            addCriterion("confirmation_date is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateEqualTo(Date value) {
            addCriterion("confirmation_date =", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateNotEqualTo(Date value) {
            addCriterion("confirmation_date <>", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateGreaterThan(Date value) {
            addCriterion("confirmation_date >", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("confirmation_date >=", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateLessThan(Date value) {
            addCriterion("confirmation_date <", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateLessThanOrEqualTo(Date value) {
            addCriterion("confirmation_date <=", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateIn(List<Date> values) {
            addCriterion("confirmation_date in", values, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateNotIn(List<Date> values) {
            addCriterion("confirmation_date not in", values, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateBetween(Date value1, Date value2) {
            addCriterion("confirmation_date between", value1, value2, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateNotBetween(Date value1, Date value2) {
            addCriterion("confirmation_date not between", value1, value2, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkIsNull() {
            addCriterion("invoicing_clerk is null");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkIsNotNull() {
            addCriterion("invoicing_clerk is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkEqualTo(String value) {
            addCriterion("invoicing_clerk =", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkNotEqualTo(String value) {
            addCriterion("invoicing_clerk <>", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkGreaterThan(String value) {
            addCriterion("invoicing_clerk >", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkGreaterThanOrEqualTo(String value) {
            addCriterion("invoicing_clerk >=", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkLessThan(String value) {
            addCriterion("invoicing_clerk <", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkLessThanOrEqualTo(String value) {
            addCriterion("invoicing_clerk <=", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkLike(String value) {
            addCriterion("invoicing_clerk like", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkNotLike(String value) {
            addCriterion("invoicing_clerk not like", value, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkIn(List<String> values) {
            addCriterion("invoicing_clerk in", values, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkNotIn(List<String> values) {
            addCriterion("invoicing_clerk not in", values, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkBetween(String value1, String value2) {
            addCriterion("invoicing_clerk between", value1, value2, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingClerkNotBetween(String value1, String value2) {
            addCriterion("invoicing_clerk not between", value1, value2, "invoicingClerk");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateIsNull() {
            addCriterion("invoicing_date is null");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateIsNotNull() {
            addCriterion("invoicing_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateEqualTo(Date value) {
            addCriterion("invoicing_date =", value, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateNotEqualTo(Date value) {
            addCriterion("invoicing_date <>", value, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateGreaterThan(Date value) {
            addCriterion("invoicing_date >", value, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invoicing_date >=", value, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateLessThan(Date value) {
            addCriterion("invoicing_date <", value, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateLessThanOrEqualTo(Date value) {
            addCriterion("invoicing_date <=", value, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateIn(List<Date> values) {
            addCriterion("invoicing_date in", values, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateNotIn(List<Date> values) {
            addCriterion("invoicing_date not in", values, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateBetween(Date value1, Date value2) {
            addCriterion("invoicing_date between", value1, value2, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingDateNotBetween(Date value1, Date value2) {
            addCriterion("invoicing_date not between", value1, value2, "invoicingDate");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkIsNull() {
            addCriterion("update_clerk is null");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkIsNotNull() {
            addCriterion("update_clerk is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkEqualTo(String value) {
            addCriterion("update_clerk =", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkNotEqualTo(String value) {
            addCriterion("update_clerk <>", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkGreaterThan(String value) {
            addCriterion("update_clerk >", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkGreaterThanOrEqualTo(String value) {
            addCriterion("update_clerk >=", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkLessThan(String value) {
            addCriterion("update_clerk <", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkLessThanOrEqualTo(String value) {
            addCriterion("update_clerk <=", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkLike(String value) {
            addCriterion("update_clerk like", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkNotLike(String value) {
            addCriterion("update_clerk not like", value, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkIn(List<String> values) {
            addCriterion("update_clerk in", values, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkNotIn(List<String> values) {
            addCriterion("update_clerk not in", values, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkBetween(String value1, String value2) {
            addCriterion("update_clerk between", value1, value2, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateClerkNotBetween(String value1, String value2) {
            addCriterion("update_clerk not between", value1, value2, "updateClerk");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNull() {
            addCriterion("enablestate is null");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNotNull() {
            addCriterion("enablestate is not null");
            return (Criteria) this;
        }

        public Criteria andEnablestateEqualTo(Boolean value) {
            addCriterion("enablestate =", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotEqualTo(Boolean value) {
            addCriterion("enablestate <>", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThan(Boolean value) {
            addCriterion("enablestate >", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enablestate >=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThan(Boolean value) {
            addCriterion("enablestate <", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThanOrEqualTo(Boolean value) {
            addCriterion("enablestate <=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateIn(List<Boolean> values) {
            addCriterion("enablestate in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotIn(List<Boolean> values) {
            addCriterion("enablestate not in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateBetween(Boolean value1, Boolean value2) {
            addCriterion("enablestate between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enablestate not between", value1, value2, "enablestate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}