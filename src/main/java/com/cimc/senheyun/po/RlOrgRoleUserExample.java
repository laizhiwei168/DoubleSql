package com.cimc.senheyun.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RlOrgRoleUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RlOrgRoleUserExample() {
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

        public Criteria andPkOrgRoleUserIsNull() {
            addCriterion("pk_org_role_user is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserIsNotNull() {
            addCriterion("pk_org_role_user is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserEqualTo(String value) {
            addCriterion("pk_org_role_user =", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserNotEqualTo(String value) {
            addCriterion("pk_org_role_user <>", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserGreaterThan(String value) {
            addCriterion("pk_org_role_user >", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserGreaterThanOrEqualTo(String value) {
            addCriterion("pk_org_role_user >=", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserLessThan(String value) {
            addCriterion("pk_org_role_user <", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserLessThanOrEqualTo(String value) {
            addCriterion("pk_org_role_user <=", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserLike(String value) {
            addCriterion("pk_org_role_user like", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserNotLike(String value) {
            addCriterion("pk_org_role_user not like", value, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserIn(List<String> values) {
            addCriterion("pk_org_role_user in", values, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserNotIn(List<String> values) {
            addCriterion("pk_org_role_user not in", values, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserBetween(String value1, String value2) {
            addCriterion("pk_org_role_user between", value1, value2, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleUserNotBetween(String value1, String value2) {
            addCriterion("pk_org_role_user not between", value1, value2, "pkOrgRoleUser");
            return (Criteria) this;
        }

        public Criteria andPkUserIsNull() {
            addCriterion("pk_user is null");
            return (Criteria) this;
        }

        public Criteria andPkUserIsNotNull() {
            addCriterion("pk_user is not null");
            return (Criteria) this;
        }

        public Criteria andPkUserEqualTo(String value) {
            addCriterion("pk_user =", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotEqualTo(String value) {
            addCriterion("pk_user <>", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserGreaterThan(String value) {
            addCriterion("pk_user >", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserGreaterThanOrEqualTo(String value) {
            addCriterion("pk_user >=", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserLessThan(String value) {
            addCriterion("pk_user <", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserLessThanOrEqualTo(String value) {
            addCriterion("pk_user <=", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserLike(String value) {
            addCriterion("pk_user like", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotLike(String value) {
            addCriterion("pk_user not like", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserIn(List<String> values) {
            addCriterion("pk_user in", values, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotIn(List<String> values) {
            addCriterion("pk_user not in", values, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserBetween(String value1, String value2) {
            addCriterion("pk_user between", value1, value2, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotBetween(String value1, String value2) {
            addCriterion("pk_user not between", value1, value2, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleIsNull() {
            addCriterion("pk_org_role is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleIsNotNull() {
            addCriterion("pk_org_role is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleEqualTo(String value) {
            addCriterion("pk_org_role =", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleNotEqualTo(String value) {
            addCriterion("pk_org_role <>", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleGreaterThan(String value) {
            addCriterion("pk_org_role >", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleGreaterThanOrEqualTo(String value) {
            addCriterion("pk_org_role >=", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleLessThan(String value) {
            addCriterion("pk_org_role <", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleLessThanOrEqualTo(String value) {
            addCriterion("pk_org_role <=", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleLike(String value) {
            addCriterion("pk_org_role like", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleNotLike(String value) {
            addCriterion("pk_org_role not like", value, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleIn(List<String> values) {
            addCriterion("pk_org_role in", values, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleNotIn(List<String> values) {
            addCriterion("pk_org_role not in", values, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleBetween(String value1, String value2) {
            addCriterion("pk_org_role between", value1, value2, "pkOrgRole");
            return (Criteria) this;
        }

        public Criteria andPkOrgRoleNotBetween(String value1, String value2) {
            addCriterion("pk_org_role not between", value1, value2, "pkOrgRole");
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