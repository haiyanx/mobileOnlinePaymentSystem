package cn.hy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TMobilesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMobilesExample() {
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

        public Criteria andMobileNumberIsNull() {
            addCriterion("mobile_Number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("mobile_Number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("mobile_Number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("mobile_Number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("mobile_Number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_Number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("mobile_Number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("mobile_Number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("mobile_Number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("mobile_Number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("mobile_Number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("mobile_Number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("mobile_Number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("mobile_Number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIsNull() {
            addCriterion("mobile_Type is null");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIsNotNull() {
            addCriterion("mobile_Type is not null");
            return (Criteria) this;
        }

        public Criteria andMobileTypeEqualTo(String value) {
            addCriterion("mobile_Type =", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotEqualTo(String value) {
            addCriterion("mobile_Type <>", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeGreaterThan(String value) {
            addCriterion("mobile_Type >", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_Type >=", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLessThan(String value) {
            addCriterion("mobile_Type <", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLessThanOrEqualTo(String value) {
            addCriterion("mobile_Type <=", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLike(String value) {
            addCriterion("mobile_Type like", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotLike(String value) {
            addCriterion("mobile_Type not like", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIn(List<String> values) {
            addCriterion("mobile_Type in", values, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotIn(List<String> values) {
            addCriterion("mobile_Type not in", values, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeBetween(String value1, String value2) {
            addCriterion("mobile_Type between", value1, value2, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotBetween(String value1, String value2) {
            addCriterion("mobile_Type not between", value1, value2, "mobileType");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_Number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_Number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("card_Number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("card_Number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("card_Number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_Number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("card_Number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_Number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("card_Number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("card_Number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("card_Number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("card_Number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("card_Number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("card_Number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNull() {
            addCriterion("is_Available is null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNotNull() {
            addCriterion("is_Available is not null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableEqualTo(String value) {
            addCriterion("is_Available =", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotEqualTo(String value) {
            addCriterion("is_Available <>", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThan(String value) {
            addCriterion("is_Available >", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("is_Available >=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThan(String value) {
            addCriterion("is_Available <", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThanOrEqualTo(String value) {
            addCriterion("is_Available <=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLike(String value) {
            addCriterion("is_Available like", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotLike(String value) {
            addCriterion("is_Available not like", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIn(List<String> values) {
            addCriterion("is_Available in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotIn(List<String> values) {
            addCriterion("is_Available not in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableBetween(String value1, String value2) {
            addCriterion("is_Available between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotBetween(String value1, String value2) {
            addCriterion("is_Available not between", value1, value2, "isAvailable");
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