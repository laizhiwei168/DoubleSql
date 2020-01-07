package com.cimc.senheyun.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdPurchaseRDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdPurchaseRDExample() {
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

        public Criteria andPkPurchaseRDIsNull() {
            addCriterion("pk_purchase_r_d is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDIsNotNull() {
            addCriterion("pk_purchase_r_d is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDEqualTo(String value) {
            addCriterion("pk_purchase_r_d =", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDNotEqualTo(String value) {
            addCriterion("pk_purchase_r_d <>", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDGreaterThan(String value) {
            addCriterion("pk_purchase_r_d >", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDGreaterThanOrEqualTo(String value) {
            addCriterion("pk_purchase_r_d >=", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDLessThan(String value) {
            addCriterion("pk_purchase_r_d <", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDLessThanOrEqualTo(String value) {
            addCriterion("pk_purchase_r_d <=", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDLike(String value) {
            addCriterion("pk_purchase_r_d like", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDNotLike(String value) {
            addCriterion("pk_purchase_r_d not like", value, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDIn(List<String> values) {
            addCriterion("pk_purchase_r_d in", values, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDNotIn(List<String> values) {
            addCriterion("pk_purchase_r_d not in", values, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDBetween(String value1, String value2) {
            addCriterion("pk_purchase_r_d between", value1, value2, "pkPurchaseRD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseRDNotBetween(String value1, String value2) {
            addCriterion("pk_purchase_r_d not between", value1, value2, "pkPurchaseRD");
            return (Criteria) this;
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

        public Criteria andPkMaterialIsNull() {
            addCriterion("pk_material is null");
            return (Criteria) this;
        }

        public Criteria andPkMaterialIsNotNull() {
            addCriterion("pk_material is not null");
            return (Criteria) this;
        }

        public Criteria andPkMaterialEqualTo(String value) {
            addCriterion("pk_material =", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialNotEqualTo(String value) {
            addCriterion("pk_material <>", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialGreaterThan(String value) {
            addCriterion("pk_material >", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("pk_material >=", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialLessThan(String value) {
            addCriterion("pk_material <", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialLessThanOrEqualTo(String value) {
            addCriterion("pk_material <=", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialLike(String value) {
            addCriterion("pk_material like", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialNotLike(String value) {
            addCriterion("pk_material not like", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialIn(List<String> values) {
            addCriterion("pk_material in", values, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialNotIn(List<String> values) {
            addCriterion("pk_material not in", values, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialBetween(String value1, String value2) {
            addCriterion("pk_material between", value1, value2, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialNotBetween(String value1, String value2) {
            addCriterion("pk_material not between", value1, value2, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRequestedDateIsNull() {
            addCriterion("requested_date is null");
            return (Criteria) this;
        }

        public Criteria andRequestedDateIsNotNull() {
            addCriterion("requested_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequestedDateEqualTo(Date value) {
            addCriterion("requested_date =", value, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateNotEqualTo(Date value) {
            addCriterion("requested_date <>", value, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateGreaterThan(Date value) {
            addCriterion("requested_date >", value, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("requested_date >=", value, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateLessThan(Date value) {
            addCriterion("requested_date <", value, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateLessThanOrEqualTo(Date value) {
            addCriterion("requested_date <=", value, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateIn(List<Date> values) {
            addCriterion("requested_date in", values, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateNotIn(List<Date> values) {
            addCriterion("requested_date not in", values, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateBetween(Date value1, Date value2) {
            addCriterion("requested_date between", value1, value2, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andRequestedDateNotBetween(Date value1, Date value2) {
            addCriterion("requested_date not between", value1, value2, "requestedDate");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationIsNull() {
            addCriterion("reason_application is null");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationIsNotNull() {
            addCriterion("reason_application is not null");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationEqualTo(String value) {
            addCriterion("reason_application =", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationNotEqualTo(String value) {
            addCriterion("reason_application <>", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationGreaterThan(String value) {
            addCriterion("reason_application >", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("reason_application >=", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationLessThan(String value) {
            addCriterion("reason_application <", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationLessThanOrEqualTo(String value) {
            addCriterion("reason_application <=", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationLike(String value) {
            addCriterion("reason_application like", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationNotLike(String value) {
            addCriterion("reason_application not like", value, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationIn(List<String> values) {
            addCriterion("reason_application in", values, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationNotIn(List<String> values) {
            addCriterion("reason_application not in", values, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationBetween(String value1, String value2) {
            addCriterion("reason_application between", value1, value2, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andReasonApplicationNotBetween(String value1, String value2) {
            addCriterion("reason_application not between", value1, value2, "reasonApplication");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDIsNull() {
            addCriterion("pk_original_d is null");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDIsNotNull() {
            addCriterion("pk_original_d is not null");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDEqualTo(String value) {
            addCriterion("pk_original_d =", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDNotEqualTo(String value) {
            addCriterion("pk_original_d <>", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDGreaterThan(String value) {
            addCriterion("pk_original_d >", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDGreaterThanOrEqualTo(String value) {
            addCriterion("pk_original_d >=", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDLessThan(String value) {
            addCriterion("pk_original_d <", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDLessThanOrEqualTo(String value) {
            addCriterion("pk_original_d <=", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDLike(String value) {
            addCriterion("pk_original_d like", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDNotLike(String value) {
            addCriterion("pk_original_d not like", value, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDIn(List<String> values) {
            addCriterion("pk_original_d in", values, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDNotIn(List<String> values) {
            addCriterion("pk_original_d not in", values, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDBetween(String value1, String value2) {
            addCriterion("pk_original_d between", value1, value2, "pkOriginalD");
            return (Criteria) this;
        }

        public Criteria andPkOriginalDNotBetween(String value1, String value2) {
            addCriterion("pk_original_d not between", value1, value2, "pkOriginalD");
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