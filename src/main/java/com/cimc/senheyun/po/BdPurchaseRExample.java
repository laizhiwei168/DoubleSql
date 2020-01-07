package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdPurchaseRExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdPurchaseRExample() {
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

        public Criteria andPkPurchaseRIsNull() {
            addCriterion("pk_purchase_r is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRIsNotNull() {
            addCriterion("pk_purchase_r is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseREqualTo(String value) {
            addCriterion("pk_purchase_r =", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRNotEqualTo(String value) {
            addCriterion("pk_purchase_r <>", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRGreaterThan(String value) {
            addCriterion("pk_purchase_r >", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRGreaterThanOrEqualTo(String value) {
            addCriterion("pk_purchase_r >=", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRLessThan(String value) {
            addCriterion("pk_purchase_r <", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRLessThanOrEqualTo(String value) {
            addCriterion("pk_purchase_r <=", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRLike(String value) {
            addCriterion("pk_purchase_r like", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRNotLike(String value) {
            addCriterion("pk_purchase_r not like", value, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRIn(List<String> values) {
            addCriterion("pk_purchase_r in", values, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRNotIn(List<String> values) {
            addCriterion("pk_purchase_r not in", values, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRBetween(String value1, String value2) {
            addCriterion("pk_purchase_r between", value1, value2, "pkPurchaseR");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRNotBetween(String value1, String value2) {
            addCriterion("pk_purchase_r not between", value1, value2, "pkPurchaseR");
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

        public Criteria andPurchaseRTypeIsNull() {
            addCriterion("purchase_r_type is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeIsNotNull() {
            addCriterion("purchase_r_type is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeEqualTo(Byte value) {
            addCriterion("purchase_r_type =", value, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeNotEqualTo(Byte value) {
            addCriterion("purchase_r_type <>", value, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeGreaterThan(Byte value) {
            addCriterion("purchase_r_type >", value, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("purchase_r_type >=", value, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeLessThan(Byte value) {
            addCriterion("purchase_r_type <", value, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeLessThanOrEqualTo(Byte value) {
            addCriterion("purchase_r_type <=", value, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeIn(List<Byte> values) {
            addCriterion("purchase_r_type in", values, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeNotIn(List<Byte> values) {
            addCriterion("purchase_r_type not in", values, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeBetween(Byte value1, Byte value2) {
            addCriterion("purchase_r_type between", value1, value2, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andPurchaseRTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("purchase_r_type not between", value1, value2, "purchaseRType");
            return (Criteria) this;
        }

        public Criteria andProposerIdIsNull() {
            addCriterion("proposer_id is null");
            return (Criteria) this;
        }

        public Criteria andProposerIdIsNotNull() {
            addCriterion("proposer_id is not null");
            return (Criteria) this;
        }

        public Criteria andProposerIdEqualTo(String value) {
            addCriterion("proposer_id =", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotEqualTo(String value) {
            addCriterion("proposer_id <>", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdGreaterThan(String value) {
            addCriterion("proposer_id >", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdGreaterThanOrEqualTo(String value) {
            addCriterion("proposer_id >=", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdLessThan(String value) {
            addCriterion("proposer_id <", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdLessThanOrEqualTo(String value) {
            addCriterion("proposer_id <=", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdLike(String value) {
            addCriterion("proposer_id like", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotLike(String value) {
            addCriterion("proposer_id not like", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdIn(List<String> values) {
            addCriterion("proposer_id in", values, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotIn(List<String> values) {
            addCriterion("proposer_id not in", values, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdBetween(String value1, String value2) {
            addCriterion("proposer_id between", value1, value2, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotBetween(String value1, String value2) {
            addCriterion("proposer_id not between", value1, value2, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerSectionIsNull() {
            addCriterion("proposer_section is null");
            return (Criteria) this;
        }

        public Criteria andProposerSectionIsNotNull() {
            addCriterion("proposer_section is not null");
            return (Criteria) this;
        }

        public Criteria andProposerSectionEqualTo(String value) {
            addCriterion("proposer_section =", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionNotEqualTo(String value) {
            addCriterion("proposer_section <>", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionGreaterThan(String value) {
            addCriterion("proposer_section >", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionGreaterThanOrEqualTo(String value) {
            addCriterion("proposer_section >=", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionLessThan(String value) {
            addCriterion("proposer_section <", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionLessThanOrEqualTo(String value) {
            addCriterion("proposer_section <=", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionLike(String value) {
            addCriterion("proposer_section like", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionNotLike(String value) {
            addCriterion("proposer_section not like", value, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionIn(List<String> values) {
            addCriterion("proposer_section in", values, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionNotIn(List<String> values) {
            addCriterion("proposer_section not in", values, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionBetween(String value1, String value2) {
            addCriterion("proposer_section between", value1, value2, "proposerSection");
            return (Criteria) this;
        }

        public Criteria andProposerSectionNotBetween(String value1, String value2) {
            addCriterion("proposer_section not between", value1, value2, "proposerSection");
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