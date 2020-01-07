package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaBusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaBusinessExample() {
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

        public Criteria andPkEquipmentIsNull() {
            addCriterion("pk_equipment is null");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentIsNotNull() {
            addCriterion("pk_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentEqualTo(String value) {
            addCriterion("pk_equipment =", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentNotEqualTo(String value) {
            addCriterion("pk_equipment <>", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentGreaterThan(String value) {
            addCriterion("pk_equipment >", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("pk_equipment >=", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentLessThan(String value) {
            addCriterion("pk_equipment <", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentLessThanOrEqualTo(String value) {
            addCriterion("pk_equipment <=", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentLike(String value) {
            addCriterion("pk_equipment like", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentNotLike(String value) {
            addCriterion("pk_equipment not like", value, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentIn(List<String> values) {
            addCriterion("pk_equipment in", values, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentNotIn(List<String> values) {
            addCriterion("pk_equipment not in", values, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentBetween(String value1, String value2) {
            addCriterion("pk_equipment between", value1, value2, "pkEquipment");
            return (Criteria) this;
        }

        public Criteria andPkEquipmentNotBetween(String value1, String value2) {
            addCriterion("pk_equipment not between", value1, value2, "pkEquipment");
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

        public Criteria andBatterycapacityIsNull() {
            addCriterion("batteryCapacity is null");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityIsNotNull() {
            addCriterion("batteryCapacity is not null");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityEqualTo(BigDecimal value) {
            addCriterion("batteryCapacity =", value, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityNotEqualTo(BigDecimal value) {
            addCriterion("batteryCapacity <>", value, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityGreaterThan(BigDecimal value) {
            addCriterion("batteryCapacity >", value, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("batteryCapacity >=", value, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityLessThan(BigDecimal value) {
            addCriterion("batteryCapacity <", value, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("batteryCapacity <=", value, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityIn(List<BigDecimal> values) {
            addCriterion("batteryCapacity in", values, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityNotIn(List<BigDecimal> values) {
            addCriterion("batteryCapacity not in", values, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("batteryCapacity between", value1, value2, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andBatterycapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("batteryCapacity not between", value1, value2, "batterycapacity");
            return (Criteria) this;
        }

        public Criteria andSignalIsNull() {
            addCriterion("signal is null");
            return (Criteria) this;
        }

        public Criteria andSignalIsNotNull() {
            addCriterion("signal is not null");
            return (Criteria) this;
        }

        public Criteria andSignalEqualTo(BigDecimal value) {
            addCriterion("signal =", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotEqualTo(BigDecimal value) {
            addCriterion("signal <>", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalGreaterThan(BigDecimal value) {
            addCriterion("signal >", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("signal >=", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalLessThan(BigDecimal value) {
            addCriterion("signal <", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("signal <=", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalIn(List<BigDecimal> values) {
            addCriterion("signal in", values, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotIn(List<BigDecimal> values) {
            addCriterion("signal not in", values, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signal between", value1, value2, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signal not between", value1, value2, "signal");
            return (Criteria) this;
        }

        public Criteria andDatanumberIsNull() {
            addCriterion("dataNumber is null");
            return (Criteria) this;
        }

        public Criteria andDatanumberIsNotNull() {
            addCriterion("dataNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDatanumberEqualTo(String value) {
            addCriterion("dataNumber =", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberNotEqualTo(String value) {
            addCriterion("dataNumber <>", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberGreaterThan(String value) {
            addCriterion("dataNumber >", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberGreaterThanOrEqualTo(String value) {
            addCriterion("dataNumber >=", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberLessThan(String value) {
            addCriterion("dataNumber <", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberLessThanOrEqualTo(String value) {
            addCriterion("dataNumber <=", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberLike(String value) {
            addCriterion("dataNumber like", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberNotLike(String value) {
            addCriterion("dataNumber not like", value, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberIn(List<String> values) {
            addCriterion("dataNumber in", values, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberNotIn(List<String> values) {
            addCriterion("dataNumber not in", values, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberBetween(String value1, String value2) {
            addCriterion("dataNumber between", value1, value2, "datanumber");
            return (Criteria) this;
        }

        public Criteria andDatanumberNotBetween(String value1, String value2) {
            addCriterion("dataNumber not between", value1, value2, "datanumber");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("IMEI is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("IMEI =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("IMEI <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("IMEI >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("IMEI >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("IMEI <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("IMEI <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("IMEI like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("IMEI not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("IMEI in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("IMEI not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("IMEI between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("IMEI not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andIccidIsNull() {
            addCriterion("ICCID is null");
            return (Criteria) this;
        }

        public Criteria andIccidIsNotNull() {
            addCriterion("ICCID is not null");
            return (Criteria) this;
        }

        public Criteria andIccidEqualTo(String value) {
            addCriterion("ICCID =", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotEqualTo(String value) {
            addCriterion("ICCID <>", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThan(String value) {
            addCriterion("ICCID >", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThanOrEqualTo(String value) {
            addCriterion("ICCID >=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThan(String value) {
            addCriterion("ICCID <", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThanOrEqualTo(String value) {
            addCriterion("ICCID <=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLike(String value) {
            addCriterion("ICCID like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotLike(String value) {
            addCriterion("ICCID not like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidIn(List<String> values) {
            addCriterion("ICCID in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotIn(List<String> values) {
            addCriterion("ICCID not in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidBetween(String value1, String value2) {
            addCriterion("ICCID between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotBetween(String value1, String value2) {
            addCriterion("ICCID not between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1IsNull() {
            addCriterion("soilTemperature1 is null");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1IsNotNull() {
            addCriterion("soilTemperature1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1EqualTo(BigDecimal value) {
            addCriterion("soilTemperature1 =", value, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1NotEqualTo(BigDecimal value) {
            addCriterion("soilTemperature1 <>", value, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1GreaterThan(BigDecimal value) {
            addCriterion("soilTemperature1 >", value, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("soilTemperature1 >=", value, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1LessThan(BigDecimal value) {
            addCriterion("soilTemperature1 <", value, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("soilTemperature1 <=", value, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1In(List<BigDecimal> values) {
            addCriterion("soilTemperature1 in", values, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1NotIn(List<BigDecimal> values) {
            addCriterion("soilTemperature1 not in", values, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilTemperature1 between", value1, value2, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilTemperature1 not between", value1, value2, "soiltemperature1");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2IsNull() {
            addCriterion("soilTemperature2 is null");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2IsNotNull() {
            addCriterion("soilTemperature2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2EqualTo(BigDecimal value) {
            addCriterion("soilTemperature2 =", value, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2NotEqualTo(BigDecimal value) {
            addCriterion("soilTemperature2 <>", value, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2GreaterThan(BigDecimal value) {
            addCriterion("soilTemperature2 >", value, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("soilTemperature2 >=", value, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2LessThan(BigDecimal value) {
            addCriterion("soilTemperature2 <", value, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("soilTemperature2 <=", value, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2In(List<BigDecimal> values) {
            addCriterion("soilTemperature2 in", values, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2NotIn(List<BigDecimal> values) {
            addCriterion("soilTemperature2 not in", values, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilTemperature2 between", value1, value2, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilTemperature2 not between", value1, value2, "soiltemperature2");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3IsNull() {
            addCriterion("soilTemperature3 is null");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3IsNotNull() {
            addCriterion("soilTemperature3 is not null");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3EqualTo(BigDecimal value) {
            addCriterion("soilTemperature3 =", value, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3NotEqualTo(BigDecimal value) {
            addCriterion("soilTemperature3 <>", value, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3GreaterThan(BigDecimal value) {
            addCriterion("soilTemperature3 >", value, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("soilTemperature3 >=", value, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3LessThan(BigDecimal value) {
            addCriterion("soilTemperature3 <", value, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("soilTemperature3 <=", value, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3In(List<BigDecimal> values) {
            addCriterion("soilTemperature3 in", values, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3NotIn(List<BigDecimal> values) {
            addCriterion("soilTemperature3 not in", values, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilTemperature3 between", value1, value2, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoiltemperature3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilTemperature3 not between", value1, value2, "soiltemperature3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1IsNull() {
            addCriterion("soilMoisture1 is null");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1IsNotNull() {
            addCriterion("soilMoisture1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1EqualTo(BigDecimal value) {
            addCriterion("soilMoisture1 =", value, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1NotEqualTo(BigDecimal value) {
            addCriterion("soilMoisture1 <>", value, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1GreaterThan(BigDecimal value) {
            addCriterion("soilMoisture1 >", value, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("soilMoisture1 >=", value, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1LessThan(BigDecimal value) {
            addCriterion("soilMoisture1 <", value, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("soilMoisture1 <=", value, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1In(List<BigDecimal> values) {
            addCriterion("soilMoisture1 in", values, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1NotIn(List<BigDecimal> values) {
            addCriterion("soilMoisture1 not in", values, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilMoisture1 between", value1, value2, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilMoisture1 not between", value1, value2, "soilmoisture1");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2IsNull() {
            addCriterion("soilMoisture2 is null");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2IsNotNull() {
            addCriterion("soilMoisture2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2EqualTo(BigDecimal value) {
            addCriterion("soilMoisture2 =", value, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2NotEqualTo(BigDecimal value) {
            addCriterion("soilMoisture2 <>", value, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2GreaterThan(BigDecimal value) {
            addCriterion("soilMoisture2 >", value, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("soilMoisture2 >=", value, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2LessThan(BigDecimal value) {
            addCriterion("soilMoisture2 <", value, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("soilMoisture2 <=", value, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2In(List<BigDecimal> values) {
            addCriterion("soilMoisture2 in", values, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2NotIn(List<BigDecimal> values) {
            addCriterion("soilMoisture2 not in", values, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilMoisture2 between", value1, value2, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilMoisture2 not between", value1, value2, "soilmoisture2");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3IsNull() {
            addCriterion("soilMoisture3 is null");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3IsNotNull() {
            addCriterion("soilMoisture3 is not null");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3EqualTo(BigDecimal value) {
            addCriterion("soilMoisture3 =", value, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3NotEqualTo(BigDecimal value) {
            addCriterion("soilMoisture3 <>", value, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3GreaterThan(BigDecimal value) {
            addCriterion("soilMoisture3 >", value, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("soilMoisture3 >=", value, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3LessThan(BigDecimal value) {
            addCriterion("soilMoisture3 <", value, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("soilMoisture3 <=", value, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3In(List<BigDecimal> values) {
            addCriterion("soilMoisture3 in", values, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3NotIn(List<BigDecimal> values) {
            addCriterion("soilMoisture3 not in", values, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilMoisture3 between", value1, value2, "soilmoisture3");
            return (Criteria) this;
        }

        public Criteria andSoilmoisture3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("soilMoisture3 not between", value1, value2, "soilmoisture3");
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