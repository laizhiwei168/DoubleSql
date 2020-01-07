package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaLandYieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaLandYieldExample() {
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

        public Criteria andDatatimeIsNull() {
            addCriterion("dataTime is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNotNull() {
            addCriterion("dataTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeEqualTo(Date value) {
            addCriterion("dataTime =", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotEqualTo(Date value) {
            addCriterion("dataTime <>", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThan(Date value) {
            addCriterion("dataTime >", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dataTime >=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThan(Date value) {
            addCriterion("dataTime <", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("dataTime <=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIn(List<Date> values) {
            addCriterion("dataTime in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotIn(List<Date> values) {
            addCriterion("dataTime not in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeBetween(Date value1, Date value2) {
            addCriterion("dataTime between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("dataTime not between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andYieldIsNull() {
            addCriterion("yield is null");
            return (Criteria) this;
        }

        public Criteria andYieldIsNotNull() {
            addCriterion("yield is not null");
            return (Criteria) this;
        }

        public Criteria andYieldEqualTo(BigDecimal value) {
            addCriterion("yield =", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldNotEqualTo(BigDecimal value) {
            addCriterion("yield <>", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldGreaterThan(BigDecimal value) {
            addCriterion("yield >", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yield >=", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldLessThan(BigDecimal value) {
            addCriterion("yield <", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yield <=", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldIn(List<BigDecimal> values) {
            addCriterion("yield in", values, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldNotIn(List<BigDecimal> values) {
            addCriterion("yield not in", values, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yield between", value1, value2, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yield not between", value1, value2, "yield");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andDemarcate1IsNull() {
            addCriterion("demarcate1 is null");
            return (Criteria) this;
        }

        public Criteria andDemarcate1IsNotNull() {
            addCriterion("demarcate1 is not null");
            return (Criteria) this;
        }

        public Criteria andDemarcate1EqualTo(BigDecimal value) {
            addCriterion("demarcate1 =", value, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1NotEqualTo(BigDecimal value) {
            addCriterion("demarcate1 <>", value, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1GreaterThan(BigDecimal value) {
            addCriterion("demarcate1 >", value, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demarcate1 >=", value, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1LessThan(BigDecimal value) {
            addCriterion("demarcate1 <", value, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("demarcate1 <=", value, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1In(List<BigDecimal> values) {
            addCriterion("demarcate1 in", values, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1NotIn(List<BigDecimal> values) {
            addCriterion("demarcate1 not in", values, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("demarcate1 between", value1, value2, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demarcate1 not between", value1, value2, "demarcate1");
            return (Criteria) this;
        }

        public Criteria andDemarcate2IsNull() {
            addCriterion("demarcate2 is null");
            return (Criteria) this;
        }

        public Criteria andDemarcate2IsNotNull() {
            addCriterion("demarcate2 is not null");
            return (Criteria) this;
        }

        public Criteria andDemarcate2EqualTo(BigDecimal value) {
            addCriterion("demarcate2 =", value, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2NotEqualTo(BigDecimal value) {
            addCriterion("demarcate2 <>", value, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2GreaterThan(BigDecimal value) {
            addCriterion("demarcate2 >", value, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demarcate2 >=", value, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2LessThan(BigDecimal value) {
            addCriterion("demarcate2 <", value, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("demarcate2 <=", value, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2In(List<BigDecimal> values) {
            addCriterion("demarcate2 in", values, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2NotIn(List<BigDecimal> values) {
            addCriterion("demarcate2 not in", values, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("demarcate2 between", value1, value2, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andDemarcate2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demarcate2 not between", value1, value2, "demarcate2");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueIsNull() {
            addCriterion("simulationValue is null");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueIsNotNull() {
            addCriterion("simulationValue is not null");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueEqualTo(BigDecimal value) {
            addCriterion("simulationValue =", value, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueNotEqualTo(BigDecimal value) {
            addCriterion("simulationValue <>", value, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueGreaterThan(BigDecimal value) {
            addCriterion("simulationValue >", value, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("simulationValue >=", value, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueLessThan(BigDecimal value) {
            addCriterion("simulationValue <", value, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("simulationValue <=", value, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueIn(List<BigDecimal> values) {
            addCriterion("simulationValue in", values, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueNotIn(List<BigDecimal> values) {
            addCriterion("simulationValue not in", values, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("simulationValue between", value1, value2, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andSimulationvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("simulationValue not between", value1, value2, "simulationvalue");
            return (Criteria) this;
        }

        public Criteria andLandtypeIsNull() {
            addCriterion("landType is null");
            return (Criteria) this;
        }

        public Criteria andLandtypeIsNotNull() {
            addCriterion("landType is not null");
            return (Criteria) this;
        }

        public Criteria andLandtypeEqualTo(Integer value) {
            addCriterion("landType =", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeNotEqualTo(Integer value) {
            addCriterion("landType <>", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeGreaterThan(Integer value) {
            addCriterion("landType >", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("landType >=", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeLessThan(Integer value) {
            addCriterion("landType <", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeLessThanOrEqualTo(Integer value) {
            addCriterion("landType <=", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeIn(List<Integer> values) {
            addCriterion("landType in", values, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeNotIn(List<Integer> values) {
            addCriterion("landType not in", values, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeBetween(Integer value1, Integer value2) {
            addCriterion("landType between", value1, value2, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("landType not between", value1, value2, "landtype");
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