package com.cimc.senheyun.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class commandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public commandExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdIsNull() {
            addCriterion("equipmet_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdIsNotNull() {
            addCriterion("equipmet_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdEqualTo(String value) {
            addCriterion("equipmet_id =", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdNotEqualTo(String value) {
            addCriterion("equipmet_id <>", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdGreaterThan(String value) {
            addCriterion("equipmet_id >", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdGreaterThanOrEqualTo(String value) {
            addCriterion("equipmet_id >=", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdLessThan(String value) {
            addCriterion("equipmet_id <", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdLessThanOrEqualTo(String value) {
            addCriterion("equipmet_id <=", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdLike(String value) {
            addCriterion("equipmet_id like", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdNotLike(String value) {
            addCriterion("equipmet_id not like", value, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdIn(List<String> values) {
            addCriterion("equipmet_id in", values, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdNotIn(List<String> values) {
            addCriterion("equipmet_id not in", values, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdBetween(String value1, String value2) {
            addCriterion("equipmet_id between", value1, value2, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andEquipmetIdNotBetween(String value1, String value2) {
            addCriterion("equipmet_id not between", value1, value2, "equipmetId");
            return (Criteria) this;
        }

        public Criteria andCommandTitleIsNull() {
            addCriterion("command_title is null");
            return (Criteria) this;
        }

        public Criteria andCommandTitleIsNotNull() {
            addCriterion("command_title is not null");
            return (Criteria) this;
        }

        public Criteria andCommandTitleEqualTo(String value) {
            addCriterion("command_title =", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleNotEqualTo(String value) {
            addCriterion("command_title <>", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleGreaterThan(String value) {
            addCriterion("command_title >", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleGreaterThanOrEqualTo(String value) {
            addCriterion("command_title >=", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleLessThan(String value) {
            addCriterion("command_title <", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleLessThanOrEqualTo(String value) {
            addCriterion("command_title <=", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleLike(String value) {
            addCriterion("command_title like", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleNotLike(String value) {
            addCriterion("command_title not like", value, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleIn(List<String> values) {
            addCriterion("command_title in", values, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleNotIn(List<String> values) {
            addCriterion("command_title not in", values, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleBetween(String value1, String value2) {
            addCriterion("command_title between", value1, value2, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTitleNotBetween(String value1, String value2) {
            addCriterion("command_title not between", value1, value2, "commandTitle");
            return (Criteria) this;
        }

        public Criteria andCommandTypeIsNull() {
            addCriterion("command_type is null");
            return (Criteria) this;
        }

        public Criteria andCommandTypeIsNotNull() {
            addCriterion("command_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommandTypeEqualTo(String value) {
            addCriterion("command_type =", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeNotEqualTo(String value) {
            addCriterion("command_type <>", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeGreaterThan(String value) {
            addCriterion("command_type >", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("command_type >=", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeLessThan(String value) {
            addCriterion("command_type <", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeLessThanOrEqualTo(String value) {
            addCriterion("command_type <=", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeLike(String value) {
            addCriterion("command_type like", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeNotLike(String value) {
            addCriterion("command_type not like", value, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeIn(List<String> values) {
            addCriterion("command_type in", values, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeNotIn(List<String> values) {
            addCriterion("command_type not in", values, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeBetween(String value1, String value2) {
            addCriterion("command_type between", value1, value2, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandTypeNotBetween(String value1, String value2) {
            addCriterion("command_type not between", value1, value2, "commandType");
            return (Criteria) this;
        }

        public Criteria andCommandContentIsNull() {
            addCriterion("command_content is null");
            return (Criteria) this;
        }

        public Criteria andCommandContentIsNotNull() {
            addCriterion("command_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommandContentEqualTo(String value) {
            addCriterion("command_content =", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentNotEqualTo(String value) {
            addCriterion("command_content <>", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentGreaterThan(String value) {
            addCriterion("command_content >", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentGreaterThanOrEqualTo(String value) {
            addCriterion("command_content >=", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentLessThan(String value) {
            addCriterion("command_content <", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentLessThanOrEqualTo(String value) {
            addCriterion("command_content <=", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentLike(String value) {
            addCriterion("command_content like", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentNotLike(String value) {
            addCriterion("command_content not like", value, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentIn(List<String> values) {
            addCriterion("command_content in", values, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentNotIn(List<String> values) {
            addCriterion("command_content not in", values, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentBetween(String value1, String value2) {
            addCriterion("command_content between", value1, value2, "commandContent");
            return (Criteria) this;
        }

        public Criteria andCommandContentNotBetween(String value1, String value2) {
            addCriterion("command_content not between", value1, value2, "commandContent");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("finishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(Date value) {
            addCriterion("finishTime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(Date value) {
            addCriterion("finishTime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(Date value) {
            addCriterion("finishTime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finishTime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(Date value) {
            addCriterion("finishTime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("finishTime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<Date> values) {
            addCriterion("finishTime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<Date> values) {
            addCriterion("finishTime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(Date value1, Date value2) {
            addCriterion("finishTime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("finishTime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNull() {
            addCriterion("flowid is null");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNotNull() {
            addCriterion("flowid is not null");
            return (Criteria) this;
        }

        public Criteria andFlowidEqualTo(Integer value) {
            addCriterion("flowid =", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotEqualTo(Integer value) {
            addCriterion("flowid <>", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThan(Integer value) {
            addCriterion("flowid >", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("flowid >=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThan(Integer value) {
            addCriterion("flowid <", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThanOrEqualTo(Integer value) {
            addCriterion("flowid <=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidIn(List<Integer> values) {
            addCriterion("flowid in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotIn(List<Integer> values) {
            addCriterion("flowid not in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidBetween(Integer value1, Integer value2) {
            addCriterion("flowid between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotBetween(Integer value1, Integer value2) {
            addCriterion("flowid not between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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