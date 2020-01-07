package com.cimc.senheyun.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BsMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BsMenuExample() {
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

        public Criteria andPkMenuIsNull() {
            addCriterion("pk_menu is null");
            return (Criteria) this;
        }

        public Criteria andPkMenuIsNotNull() {
            addCriterion("pk_menu is not null");
            return (Criteria) this;
        }

        public Criteria andPkMenuEqualTo(String value) {
            addCriterion("pk_menu =", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuNotEqualTo(String value) {
            addCriterion("pk_menu <>", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuGreaterThan(String value) {
            addCriterion("pk_menu >", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuGreaterThanOrEqualTo(String value) {
            addCriterion("pk_menu >=", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuLessThan(String value) {
            addCriterion("pk_menu <", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuLessThanOrEqualTo(String value) {
            addCriterion("pk_menu <=", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuLike(String value) {
            addCriterion("pk_menu like", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuNotLike(String value) {
            addCriterion("pk_menu not like", value, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuIn(List<String> values) {
            addCriterion("pk_menu in", values, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuNotIn(List<String> values) {
            addCriterion("pk_menu not in", values, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuBetween(String value1, String value2) {
            addCriterion("pk_menu between", value1, value2, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkMenuNotBetween(String value1, String value2) {
            addCriterion("pk_menu not between", value1, value2, "pkMenu");
            return (Criteria) this;
        }

        public Criteria andPkCompanyIsNull() {
            addCriterion("pk_company is null");
            return (Criteria) this;
        }

        public Criteria andPkCompanyIsNotNull() {
            addCriterion("pk_company is not null");
            return (Criteria) this;
        }

        public Criteria andPkCompanyEqualTo(String value) {
            addCriterion("pk_company =", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyNotEqualTo(String value) {
            addCriterion("pk_company <>", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyGreaterThan(String value) {
            addCriterion("pk_company >", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("pk_company >=", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyLessThan(String value) {
            addCriterion("pk_company <", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyLessThanOrEqualTo(String value) {
            addCriterion("pk_company <=", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyLike(String value) {
            addCriterion("pk_company like", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyNotLike(String value) {
            addCriterion("pk_company not like", value, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyIn(List<String> values) {
            addCriterion("pk_company in", values, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyNotIn(List<String> values) {
            addCriterion("pk_company not in", values, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyBetween(String value1, String value2) {
            addCriterion("pk_company between", value1, value2, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andPkCompanyNotBetween(String value1, String value2) {
            addCriterion("pk_company not between", value1, value2, "pkCompany");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("menuUrl is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("menuUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("menuUrl =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("menuUrl <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("menuUrl >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("menuUrl >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("menuUrl <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("menuUrl <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("menuUrl like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("menuUrl not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("menuUrl in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("menuUrl not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("menuUrl between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("menuUrl not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andFPkMenuIsNull() {
            addCriterion("f_pk_menu is null");
            return (Criteria) this;
        }

        public Criteria andFPkMenuIsNotNull() {
            addCriterion("f_pk_menu is not null");
            return (Criteria) this;
        }

        public Criteria andFPkMenuEqualTo(String value) {
            addCriterion("f_pk_menu =", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuNotEqualTo(String value) {
            addCriterion("f_pk_menu <>", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuGreaterThan(String value) {
            addCriterion("f_pk_menu >", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuGreaterThanOrEqualTo(String value) {
            addCriterion("f_pk_menu >=", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuLessThan(String value) {
            addCriterion("f_pk_menu <", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuLessThanOrEqualTo(String value) {
            addCriterion("f_pk_menu <=", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuLike(String value) {
            addCriterion("f_pk_menu like", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuNotLike(String value) {
            addCriterion("f_pk_menu not like", value, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuIn(List<String> values) {
            addCriterion("f_pk_menu in", values, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuNotIn(List<String> values) {
            addCriterion("f_pk_menu not in", values, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuBetween(String value1, String value2) {
            addCriterion("f_pk_menu between", value1, value2, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andFPkMenuNotBetween(String value1, String value2) {
            addCriterion("f_pk_menu not between", value1, value2, "fPkMenu");
            return (Criteria) this;
        }

        public Criteria andIsConnectIsNull() {
            addCriterion("is_connect is null");
            return (Criteria) this;
        }

        public Criteria andIsConnectIsNotNull() {
            addCriterion("is_connect is not null");
            return (Criteria) this;
        }

        public Criteria andIsConnectEqualTo(Boolean value) {
            addCriterion("is_connect =", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectNotEqualTo(Boolean value) {
            addCriterion("is_connect <>", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectGreaterThan(Boolean value) {
            addCriterion("is_connect >", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_connect >=", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectLessThan(Boolean value) {
            addCriterion("is_connect <", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectLessThanOrEqualTo(Boolean value) {
            addCriterion("is_connect <=", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectIn(List<Boolean> values) {
            addCriterion("is_connect in", values, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectNotIn(List<Boolean> values) {
            addCriterion("is_connect not in", values, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectBetween(Boolean value1, Boolean value2) {
            addCriterion("is_connect between", value1, value2, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_connect not between", value1, value2, "isConnect");
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