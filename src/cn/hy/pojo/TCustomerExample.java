package cn.hy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerExample() {
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

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_Type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_Type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_Type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_Type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_Type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_Type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_Type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_Type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_Type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_Type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_Type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_Type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_Type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_Type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ID_Number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ID_Number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("ID_Number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("ID_Number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("ID_Number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ID_Number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("ID_Number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ID_Number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("ID_Number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("ID_Number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("ID_Number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("ID_Number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("ID_Number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("ID_Number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_Name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_Name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_Name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_Name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_Name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_Name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_Name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_Name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_Name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_Name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_Name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_Name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_Name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIsNull() {
            addCriterion("customer_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIsNotNull() {
            addCriterion("customer_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayEqualTo(Date value) {
            addCriterion("customer_Birthday =", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotEqualTo(Date value) {
            addCriterion("customer_Birthday <>", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayGreaterThan(Date value) {
            addCriterion("customer_Birthday >", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_Birthday >=", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayLessThan(Date value) {
            addCriterion("customer_Birthday <", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("customer_Birthday <=", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIn(List<Date> values) {
            addCriterion("customer_Birthday in", values, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotIn(List<Date> values) {
            addCriterion("customer_Birthday not in", values, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayBetween(Date value1, Date value2) {
            addCriterion("customer_Birthday between", value1, value2, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("customer_Birthday not between", value1, value2, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_Sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(String value) {
            addCriterion("customer_Sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(String value) {
            addCriterion("customer_Sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(String value) {
            addCriterion("customer_Sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(String value) {
            addCriterion("customer_Sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(String value) {
            addCriterion("customer_Sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(String value) {
            addCriterion("customer_Sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLike(String value) {
            addCriterion("customer_Sex like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotLike(String value) {
            addCriterion("customer_Sex not like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<String> values) {
            addCriterion("customer_Sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<String> values) {
            addCriterion("customer_Sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(String value1, String value2) {
            addCriterion("customer_Sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(String value1, String value2) {
            addCriterion("customer_Sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("customer_Address is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("customer_Address is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("customer_Address =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("customer_Address <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("customer_Address >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("customer_Address >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("customer_Address <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("customer_Address <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("customer_Address like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("customer_Address not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("customer_Address in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("customer_Address not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("customer_Address between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("customer_Address not between", value1, value2, "customerAddress");
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