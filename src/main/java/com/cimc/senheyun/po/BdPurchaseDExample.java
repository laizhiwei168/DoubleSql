package com.cimc.senheyun.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdPurchaseDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdPurchaseDExample() {
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

        public Criteria andPkPurchaseDIsNull() {
            addCriterion("pk_purchase_d is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDIsNotNull() {
            addCriterion("pk_purchase_d is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDEqualTo(String value) {
            addCriterion("pk_purchase_d =", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDNotEqualTo(String value) {
            addCriterion("pk_purchase_d <>", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDGreaterThan(String value) {
            addCriterion("pk_purchase_d >", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDGreaterThanOrEqualTo(String value) {
            addCriterion("pk_purchase_d >=", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDLessThan(String value) {
            addCriterion("pk_purchase_d <", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDLessThanOrEqualTo(String value) {
            addCriterion("pk_purchase_d <=", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDLike(String value) {
            addCriterion("pk_purchase_d like", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDNotLike(String value) {
            addCriterion("pk_purchase_d not like", value, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDIn(List<String> values) {
            addCriterion("pk_purchase_d in", values, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDNotIn(List<String> values) {
            addCriterion("pk_purchase_d not in", values, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDBetween(String value1, String value2) {
            addCriterion("pk_purchase_d between", value1, value2, "pkPurchaseD");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseDNotBetween(String value1, String value2) {
            addCriterion("pk_purchase_d not between", value1, value2, "pkPurchaseD");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxIsNull() {
            addCriterion("price_including_tax is null");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxIsNotNull() {
            addCriterion("price_including_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxEqualTo(BigDecimal value) {
            addCriterion("price_including_tax =", value, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxNotEqualTo(BigDecimal value) {
            addCriterion("price_including_tax <>", value, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxGreaterThan(BigDecimal value) {
            addCriterion("price_including_tax >", value, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_including_tax >=", value, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxLessThan(BigDecimal value) {
            addCriterion("price_including_tax <", value, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_including_tax <=", value, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxIn(List<BigDecimal> values) {
            addCriterion("price_including_tax in", values, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxNotIn(List<BigDecimal> values) {
            addCriterion("price_including_tax not in", values, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_including_tax between", value1, value2, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andPriceIncludingTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_including_tax not between", value1, value2, "priceIncludingTax");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIsNull() {
            addCriterion("tax_money is null");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIsNotNull() {
            addCriterion("tax_money is not null");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyEqualTo(BigDecimal value) {
            addCriterion("tax_money =", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotEqualTo(BigDecimal value) {
            addCriterion("tax_money <>", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyGreaterThan(BigDecimal value) {
            addCriterion("tax_money >", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_money >=", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyLessThan(BigDecimal value) {
            addCriterion("tax_money <", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_money <=", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIn(List<BigDecimal> values) {
            addCriterion("tax_money in", values, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotIn(List<BigDecimal> values) {
            addCriterion("tax_money not in", values, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_money between", value1, value2, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_money not between", value1, value2, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyIsNull() {
            addCriterion("contains_tax_money is null");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyIsNotNull() {
            addCriterion("contains_tax_money is not null");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyEqualTo(BigDecimal value) {
            addCriterion("contains_tax_money =", value, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyNotEqualTo(BigDecimal value) {
            addCriterion("contains_tax_money <>", value, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyGreaterThan(BigDecimal value) {
            addCriterion("contains_tax_money >", value, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contains_tax_money >=", value, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyLessThan(BigDecimal value) {
            addCriterion("contains_tax_money <", value, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contains_tax_money <=", value, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyIn(List<BigDecimal> values) {
            addCriterion("contains_tax_money in", values, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyNotIn(List<BigDecimal> values) {
            addCriterion("contains_tax_money not in", values, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contains_tax_money between", value1, value2, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andContainsTaxMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contains_tax_money not between", value1, value2, "containsTaxMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(Date value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(Date value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(Date value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(Date value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<Date> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<Date> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
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