package cn.hy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAccountExample() {
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

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_Person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_Person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_Person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_Person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_Person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_Person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_Person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_Person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_Person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_Person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_Person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_Person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_Person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_Person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("contact_Address is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("contact_Address is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("contact_Address =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("contact_Address <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("contact_Address >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contact_Address >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("contact_Address <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("contact_Address <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("contact_Address like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("contact_Address not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("contact_Address in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("contact_Address not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("contact_Address between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("contact_Address not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactBalanceIsNull() {
            addCriterion("contact_Balance is null");
            return (Criteria) this;
        }

        public Criteria andContactBalanceIsNotNull() {
            addCriterion("contact_Balance is not null");
            return (Criteria) this;
        }

        public Criteria andContactBalanceEqualTo(Double value) {
            addCriterion("contact_Balance =", value, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceNotEqualTo(Double value) {
            addCriterion("contact_Balance <>", value, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceGreaterThan(Double value) {
            addCriterion("contact_Balance >", value, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("contact_Balance >=", value, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceLessThan(Double value) {
            addCriterion("contact_Balance <", value, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceLessThanOrEqualTo(Double value) {
            addCriterion("contact_Balance <=", value, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceIn(List<Double> values) {
            addCriterion("contact_Balance in", values, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceNotIn(List<Double> values) {
            addCriterion("contact_Balance not in", values, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceBetween(Double value1, Double value2) {
            addCriterion("contact_Balance between", value1, value2, "contactBalance");
            return (Criteria) this;
        }

        public Criteria andContactBalanceNotBetween(Double value1, Double value2) {
            addCriterion("contact_Balance not between", value1, value2, "contactBalance");
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