package com.cimc.senheyun.po;

import java.util.ArrayList;
import java.util.List;

public class BdPurchasePDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdPurchasePDExample() {
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

        public Criteria andPkPurchasePDIsNull() {
            addCriterion("pk_purchase_p_d is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDIsNotNull() {
            addCriterion("pk_purchase_p_d is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDEqualTo(String value) {
            addCriterion("pk_purchase_p_d =", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDNotEqualTo(String value) {
            addCriterion("pk_purchase_p_d <>", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDGreaterThan(String value) {
            addCriterion("pk_purchase_p_d >", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDGreaterThanOrEqualTo(String value) {
            addCriterion("pk_purchase_p_d >=", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDLessThan(String value) {
            addCriterion("pk_purchase_p_d <", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDLessThanOrEqualTo(String value) {
            addCriterion("pk_purchase_p_d <=", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDLike(String value) {
            addCriterion("pk_purchase_p_d like", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDNotLike(String value) {
            addCriterion("pk_purchase_p_d not like", value, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDIn(List<String> values) {
            addCriterion("pk_purchase_p_d in", values, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDNotIn(List<String> values) {
            addCriterion("pk_purchase_p_d not in", values, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDBetween(String value1, String value2) {
            addCriterion("pk_purchase_p_d between", value1, value2, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePDNotBetween(String value1, String value2) {
            addCriterion("pk_purchase_p_d not between", value1, value2, "pkPurchasePD");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePIsNull() {
            addCriterion("pk_purchase_p is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePIsNotNull() {
            addCriterion("pk_purchase_p is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePEqualTo(String value) {
            addCriterion("pk_purchase_p =", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePNotEqualTo(String value) {
            addCriterion("pk_purchase_p <>", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePGreaterThan(String value) {
            addCriterion("pk_purchase_p >", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePGreaterThanOrEqualTo(String value) {
            addCriterion("pk_purchase_p >=", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePLessThan(String value) {
            addCriterion("pk_purchase_p <", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePLessThanOrEqualTo(String value) {
            addCriterion("pk_purchase_p <=", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePLike(String value) {
            addCriterion("pk_purchase_p like", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePNotLike(String value) {
            addCriterion("pk_purchase_p not like", value, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePIn(List<String> values) {
            addCriterion("pk_purchase_p in", values, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePNotIn(List<String> values) {
            addCriterion("pk_purchase_p not in", values, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePBetween(String value1, String value2) {
            addCriterion("pk_purchase_p between", value1, value2, "pkPurchaseP");
            return (Criteria) this;
        }

        public Criteria andPkPurchasePNotBetween(String value1, String value2) {
            addCriterion("pk_purchase_p not between", value1, value2, "pkPurchaseP");
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