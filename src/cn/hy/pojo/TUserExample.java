package cn.hy.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_ID not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andRoamingStatusIsNull() {
            addCriterion("roaming_Status is null");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusIsNotNull() {
            addCriterion("roaming_Status is not null");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusEqualTo(String value) {
            addCriterion("roaming_Status =", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusNotEqualTo(String value) {
            addCriterion("roaming_Status <>", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusGreaterThan(String value) {
            addCriterion("roaming_Status >", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("roaming_Status >=", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusLessThan(String value) {
            addCriterion("roaming_Status <", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusLessThanOrEqualTo(String value) {
            addCriterion("roaming_Status <=", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusLike(String value) {
            addCriterion("roaming_Status like", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusNotLike(String value) {
            addCriterion("roaming_Status not like", value, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusIn(List<String> values) {
            addCriterion("roaming_Status in", values, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusNotIn(List<String> values) {
            addCriterion("roaming_Status not in", values, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusBetween(String value1, String value2) {
            addCriterion("roaming_Status between", value1, value2, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andRoamingStatusNotBetween(String value1, String value2) {
            addCriterion("roaming_Status not between", value1, value2, "roamingStatus");
            return (Criteria) this;
        }

        public Criteria andComLevelIsNull() {
            addCriterion("com_Level is null");
            return (Criteria) this;
        }

        public Criteria andComLevelIsNotNull() {
            addCriterion("com_Level is not null");
            return (Criteria) this;
        }

        public Criteria andComLevelEqualTo(String value) {
            addCriterion("com_Level =", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelNotEqualTo(String value) {
            addCriterion("com_Level <>", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelGreaterThan(String value) {
            addCriterion("com_Level >", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelGreaterThanOrEqualTo(String value) {
            addCriterion("com_Level >=", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelLessThan(String value) {
            addCriterion("com_Level <", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelLessThanOrEqualTo(String value) {
            addCriterion("com_Level <=", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelLike(String value) {
            addCriterion("com_Level like", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelNotLike(String value) {
            addCriterion("com_Level not like", value, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelIn(List<String> values) {
            addCriterion("com_Level in", values, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelNotIn(List<String> values) {
            addCriterion("com_Level not in", values, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelBetween(String value1, String value2) {
            addCriterion("com_Level between", value1, value2, "comLevel");
            return (Criteria) this;
        }

        public Criteria andComLevelNotBetween(String value1, String value2) {
            addCriterion("com_Level not between", value1, value2, "comLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_ID not between", value1, value2, "accountId");
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