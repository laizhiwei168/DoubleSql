package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdPurchaseInvoicingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdPurchaseInvoicingExample() {
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

        public Criteria andPkPurchaseIIsNull() {
            addCriterion("pk_purchase_i is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIIsNotNull() {
            addCriterion("pk_purchase_i is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIEqualTo(String value) {
            addCriterion("pk_purchase_i =", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseINotEqualTo(String value) {
            addCriterion("pk_purchase_i <>", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIGreaterThan(String value) {
            addCriterion("pk_purchase_i >", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIGreaterThanOrEqualTo(String value) {
            addCriterion("pk_purchase_i >=", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseILessThan(String value) {
            addCriterion("pk_purchase_i <", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseILessThanOrEqualTo(String value) {
            addCriterion("pk_purchase_i <=", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseILike(String value) {
            addCriterion("pk_purchase_i like", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseINotLike(String value) {
            addCriterion("pk_purchase_i not like", value, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIIn(List<String> values) {
            addCriterion("pk_purchase_i in", values, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseINotIn(List<String> values) {
            addCriterion("pk_purchase_i not in", values, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseIBetween(String value1, String value2) {
            addCriterion("pk_purchase_i between", value1, value2, "pkPurchaseI");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseINotBetween(String value1, String value2) {
            addCriterion("pk_purchase_i not between", value1, value2, "pkPurchaseI");
            return (Criteria) this;
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

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Byte value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Byte value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Byte value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Byte value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Byte> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Byte> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Byte value1, Byte value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Byte value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Byte value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Byte value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Byte value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Byte> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Byte> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andCheckAmountIsNull() {
            addCriterion("check_amount is null");
            return (Criteria) this;
        }

        public Criteria andCheckAmountIsNotNull() {
            addCriterion("check_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCheckAmountEqualTo(BigDecimal value) {
            addCriterion("check_amount =", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountNotEqualTo(BigDecimal value) {
            addCriterion("check_amount <>", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountGreaterThan(BigDecimal value) {
            addCriterion("check_amount >", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("check_amount >=", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountLessThan(BigDecimal value) {
            addCriterion("check_amount <", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("check_amount <=", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountIn(List<BigDecimal> values) {
            addCriterion("check_amount in", values, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountNotIn(List<BigDecimal> values) {
            addCriterion("check_amount not in", values, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_amount between", value1, value2, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_amount not between", value1, value2, "checkAmount");
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