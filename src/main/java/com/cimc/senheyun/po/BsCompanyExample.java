package com.cimc.senheyun.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BsCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BsCompanyExample() {
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

        public Criteria andEnglishnameIsNull() {
            addCriterion("englishName is null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNotNull() {
            addCriterion("englishName is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameEqualTo(String value) {
            addCriterion("englishName =", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotEqualTo(String value) {
            addCriterion("englishName <>", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThan(String value) {
            addCriterion("englishName >", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("englishName >=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThan(String value) {
            addCriterion("englishName <", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("englishName <=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLike(String value) {
            addCriterion("englishName like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotLike(String value) {
            addCriterion("englishName not like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIn(List<String> values) {
            addCriterion("englishName in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotIn(List<String> values) {
            addCriterion("englishName not in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameBetween(String value1, String value2) {
            addCriterion("englishName between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotBetween(String value1, String value2) {
            addCriterion("englishName not between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressIsNull() {
            addCriterion("registeredAddress is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressIsNotNull() {
            addCriterion("registeredAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressEqualTo(String value) {
            addCriterion("registeredAddress =", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotEqualTo(String value) {
            addCriterion("registeredAddress <>", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressGreaterThan(String value) {
            addCriterion("registeredAddress >", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressGreaterThanOrEqualTo(String value) {
            addCriterion("registeredAddress >=", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressLessThan(String value) {
            addCriterion("registeredAddress <", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressLessThanOrEqualTo(String value) {
            addCriterion("registeredAddress <=", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressLike(String value) {
            addCriterion("registeredAddress like", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotLike(String value) {
            addCriterion("registeredAddress not like", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressIn(List<String> values) {
            addCriterion("registeredAddress in", values, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotIn(List<String> values) {
            addCriterion("registeredAddress not in", values, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressBetween(String value1, String value2) {
            addCriterion("registeredAddress between", value1, value2, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotBetween(String value1, String value2) {
            addCriterion("registeredAddress not between", value1, value2, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("businessType is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("businessType is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(Integer value) {
            addCriterion("businessType =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(Integer value) {
            addCriterion("businessType <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(Integer value) {
            addCriterion("businessType >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessType >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(Integer value) {
            addCriterion("businessType <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(Integer value) {
            addCriterion("businessType <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<Integer> values) {
            addCriterion("businessType in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<Integer> values) {
            addCriterion("businessType not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(Integer value1, Integer value2) {
            addCriterion("businessType between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("businessType not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNull() {
            addCriterion("businessCode is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNotNull() {
            addCriterion("businessCode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeEqualTo(String value) {
            addCriterion("businessCode =", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotEqualTo(String value) {
            addCriterion("businessCode <>", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThan(String value) {
            addCriterion("businessCode >", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThanOrEqualTo(String value) {
            addCriterion("businessCode >=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThan(String value) {
            addCriterion("businessCode <", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThanOrEqualTo(String value) {
            addCriterion("businessCode <=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLike(String value) {
            addCriterion("businessCode like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotLike(String value) {
            addCriterion("businessCode not like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIn(List<String> values) {
            addCriterion("businessCode in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotIn(List<String> values) {
            addCriterion("businessCode not in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeBetween(String value1, String value2) {
            addCriterion("businessCode between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotBetween(String value1, String value2) {
            addCriterion("businessCode not between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeIsNull() {
            addCriterion("companyCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeIsNotNull() {
            addCriterion("companyCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeEqualTo(Date value) {
            addCriterion("companyCreateTime =", value, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeNotEqualTo(Date value) {
            addCriterion("companyCreateTime <>", value, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeGreaterThan(Date value) {
            addCriterion("companyCreateTime >", value, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("companyCreateTime >=", value, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeLessThan(Date value) {
            addCriterion("companyCreateTime <", value, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("companyCreateTime <=", value, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeIn(List<Date> values) {
            addCriterion("companyCreateTime in", values, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeNotIn(List<Date> values) {
            addCriterion("companyCreateTime not in", values, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeBetween(Date value1, Date value2) {
            addCriterion("companyCreateTime between", value1, value2, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanycreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("companyCreateTime not between", value1, value2, "companycreatetime");
            return (Criteria) this;
        }

        public Criteria andIsfreezeIsNull() {
            addCriterion("isFreeze is null");
            return (Criteria) this;
        }

        public Criteria andIsfreezeIsNotNull() {
            addCriterion("isFreeze is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreezeEqualTo(Integer value) {
            addCriterion("isFreeze =", value, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeNotEqualTo(Integer value) {
            addCriterion("isFreeze <>", value, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeGreaterThan(Integer value) {
            addCriterion("isFreeze >", value, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFreeze >=", value, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeLessThan(Integer value) {
            addCriterion("isFreeze <", value, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeLessThanOrEqualTo(Integer value) {
            addCriterion("isFreeze <=", value, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeIn(List<Integer> values) {
            addCriterion("isFreeze in", values, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeNotIn(List<Integer> values) {
            addCriterion("isFreeze not in", values, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeBetween(Integer value1, Integer value2) {
            addCriterion("isFreeze between", value1, value2, "isfreeze");
            return (Criteria) this;
        }

        public Criteria andIsfreezeNotBetween(Integer value1, Integer value2) {
            addCriterion("isFreeze not between", value1, value2, "isfreeze");
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