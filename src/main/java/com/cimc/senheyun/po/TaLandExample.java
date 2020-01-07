package com.cimc.senheyun.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaLandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaLandExample() {
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

        public Criteria andPkLandIsNull() {
            addCriterion("pk_land is null");
            return (Criteria) this;
        }

        public Criteria andPkLandIsNotNull() {
            addCriterion("pk_land is not null");
            return (Criteria) this;
        }

        public Criteria andPkLandEqualTo(String value) {
            addCriterion("pk_land =", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandNotEqualTo(String value) {
            addCriterion("pk_land <>", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandGreaterThan(String value) {
            addCriterion("pk_land >", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandGreaterThanOrEqualTo(String value) {
            addCriterion("pk_land >=", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandLessThan(String value) {
            addCriterion("pk_land <", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandLessThanOrEqualTo(String value) {
            addCriterion("pk_land <=", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandLike(String value) {
            addCriterion("pk_land like", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandNotLike(String value) {
            addCriterion("pk_land not like", value, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandIn(List<String> values) {
            addCriterion("pk_land in", values, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandNotIn(List<String> values) {
            addCriterion("pk_land not in", values, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandBetween(String value1, String value2) {
            addCriterion("pk_land between", value1, value2, "pkLand");
            return (Criteria) this;
        }

        public Criteria andPkLandNotBetween(String value1, String value2) {
            addCriterion("pk_land not between", value1, value2, "pkLand");
            return (Criteria) this;
        }

        public Criteria andLandnameIsNull() {
            addCriterion("landName is null");
            return (Criteria) this;
        }

        public Criteria andLandnameIsNotNull() {
            addCriterion("landName is not null");
            return (Criteria) this;
        }

        public Criteria andLandnameEqualTo(String value) {
            addCriterion("landName =", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotEqualTo(String value) {
            addCriterion("landName <>", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThan(String value) {
            addCriterion("landName >", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThanOrEqualTo(String value) {
            addCriterion("landName >=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThan(String value) {
            addCriterion("landName <", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThanOrEqualTo(String value) {
            addCriterion("landName <=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLike(String value) {
            addCriterion("landName like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotLike(String value) {
            addCriterion("landName not like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameIn(List<String> values) {
            addCriterion("landName in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotIn(List<String> values) {
            addCriterion("landName not in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameBetween(String value1, String value2) {
            addCriterion("landName between", value1, value2, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotBetween(String value1, String value2) {
            addCriterion("landName not between", value1, value2, "landname");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatortimeIsNull() {
            addCriterion("creatortime is null");
            return (Criteria) this;
        }

        public Criteria andCreatortimeIsNotNull() {
            addCriterion("creatortime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatortimeEqualTo(Date value) {
            addCriterion("creatortime =", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeNotEqualTo(Date value) {
            addCriterion("creatortime <>", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeGreaterThan(Date value) {
            addCriterion("creatortime >", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatortime >=", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeLessThan(Date value) {
            addCriterion("creatortime <", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeLessThanOrEqualTo(Date value) {
            addCriterion("creatortime <=", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeIn(List<Date> values) {
            addCriterion("creatortime in", values, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeNotIn(List<Date> values) {
            addCriterion("creatortime not in", values, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeBetween(Date value1, Date value2) {
            addCriterion("creatortime between", value1, value2, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeNotBetween(Date value1, Date value2) {
            addCriterion("creatortime not between", value1, value2, "creatortime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("modifiedtime is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("modifiedtime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(Date value) {
            addCriterion("modifiedtime =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(Date value) {
            addCriterion("modifiedtime <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(Date value) {
            addCriterion("modifiedtime >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedtime >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(Date value) {
            addCriterion("modifiedtime <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(Date value) {
            addCriterion("modifiedtime <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<Date> values) {
            addCriterion("modifiedtime in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<Date> values) {
            addCriterion("modifiedtime not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(Date value1, Date value2) {
            addCriterion("modifiedtime between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(Date value1, Date value2) {
            addCriterion("modifiedtime not between", value1, value2, "modifiedtime");
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

        public Criteria andEnablestateEqualTo(Integer value) {
            addCriterion("enablestate =", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotEqualTo(Integer value) {
            addCriterion("enablestate <>", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThan(Integer value) {
            addCriterion("enablestate >", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("enablestate >=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThan(Integer value) {
            addCriterion("enablestate <", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThanOrEqualTo(Integer value) {
            addCriterion("enablestate <=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateIn(List<Integer> values) {
            addCriterion("enablestate in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotIn(List<Integer> values) {
            addCriterion("enablestate not in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateBetween(Integer value1, Integer value2) {
            addCriterion("enablestate between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotBetween(Integer value1, Integer value2) {
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