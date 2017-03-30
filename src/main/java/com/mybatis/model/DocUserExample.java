package com.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DocUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocUserExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andWhiteIsNull() {
            addCriterion("white is null");
            return (Criteria) this;
        }

        public Criteria andWhiteIsNotNull() {
            addCriterion("white is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteEqualTo(String value) {
            addCriterion("white =", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteNotEqualTo(String value) {
            addCriterion("white <>", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteGreaterThan(String value) {
            addCriterion("white >", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteGreaterThanOrEqualTo(String value) {
            addCriterion("white >=", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteLessThan(String value) {
            addCriterion("white <", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteLessThanOrEqualTo(String value) {
            addCriterion("white <=", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteLike(String value) {
            addCriterion("white like", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteNotLike(String value) {
            addCriterion("white not like", value, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteIn(List<String> values) {
            addCriterion("white in", values, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteNotIn(List<String> values) {
            addCriterion("white not in", values, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteBetween(String value1, String value2) {
            addCriterion("white between", value1, value2, "white");
            return (Criteria) this;
        }

        public Criteria andWhiteNotBetween(String value1, String value2) {
            addCriterion("white not between", value1, value2, "white");
            return (Criteria) this;
        }

        public Criteria andRedIsNull() {
            addCriterion("red is null");
            return (Criteria) this;
        }

        public Criteria andRedIsNotNull() {
            addCriterion("red is not null");
            return (Criteria) this;
        }

        public Criteria andRedEqualTo(String value) {
            addCriterion("red =", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedNotEqualTo(String value) {
            addCriterion("red <>", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedGreaterThan(String value) {
            addCriterion("red >", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedGreaterThanOrEqualTo(String value) {
            addCriterion("red >=", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedLessThan(String value) {
            addCriterion("red <", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedLessThanOrEqualTo(String value) {
            addCriterion("red <=", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedLike(String value) {
            addCriterion("red like", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedNotLike(String value) {
            addCriterion("red not like", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedIn(List<String> values) {
            addCriterion("red in", values, "red");
            return (Criteria) this;
        }

        public Criteria andRedNotIn(List<String> values) {
            addCriterion("red not in", values, "red");
            return (Criteria) this;
        }

        public Criteria andRedBetween(String value1, String value2) {
            addCriterion("red between", value1, value2, "red");
            return (Criteria) this;
        }

        public Criteria andRedNotBetween(String value1, String value2) {
            addCriterion("red not between", value1, value2, "red");
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andMsgcodeIsNull() {
            addCriterion("msgcode is null");
            return (Criteria) this;
        }

        public Criteria andMsgcodeIsNotNull() {
            addCriterion("msgcode is not null");
            return (Criteria) this;
        }

        public Criteria andMsgcodeEqualTo(String value) {
            addCriterion("msgcode =", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeNotEqualTo(String value) {
            addCriterion("msgcode <>", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeGreaterThan(String value) {
            addCriterion("msgcode >", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("msgcode >=", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeLessThan(String value) {
            addCriterion("msgcode <", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeLessThanOrEqualTo(String value) {
            addCriterion("msgcode <=", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeLike(String value) {
            addCriterion("msgcode like", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeNotLike(String value) {
            addCriterion("msgcode not like", value, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeIn(List<String> values) {
            addCriterion("msgcode in", values, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeNotIn(List<String> values) {
            addCriterion("msgcode not in", values, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeBetween(String value1, String value2) {
            addCriterion("msgcode between", value1, value2, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgcodeNotBetween(String value1, String value2) {
            addCriterion("msgcode not between", value1, value2, "msgcode");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIsNull() {
            addCriterion("msgtime is null");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIsNotNull() {
            addCriterion("msgtime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtimeEqualTo(Integer value) {
            addCriterion("msgtime =", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotEqualTo(Integer value) {
            addCriterion("msgtime <>", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeGreaterThan(Integer value) {
            addCriterion("msgtime >", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("msgtime >=", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeLessThan(Integer value) {
            addCriterion("msgtime <", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeLessThanOrEqualTo(Integer value) {
            addCriterion("msgtime <=", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIn(List<Integer> values) {
            addCriterion("msgtime in", values, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotIn(List<Integer> values) {
            addCriterion("msgtime not in", values, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeBetween(Integer value1, Integer value2) {
            addCriterion("msgtime between", value1, value2, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("msgtime not between", value1, value2, "msgtime");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(Integer value) {
            addCriterion("audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Integer value) {
            addCriterion("audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Integer value) {
            addCriterion("audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Integer value) {
            addCriterion("audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Integer value) {
            addCriterion("audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Integer> values) {
            addCriterion("audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Integer> values) {
            addCriterion("audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Integer value1, Integer value2) {
            addCriterion("audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Integer value1, Integer value2) {
            addCriterion("audit not between", value1, value2, "audit");
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

        public Criteria andRememberIsNull() {
            addCriterion("remember is null");
            return (Criteria) this;
        }

        public Criteria andRememberIsNotNull() {
            addCriterion("remember is not null");
            return (Criteria) this;
        }

        public Criteria andRememberEqualTo(String value) {
            addCriterion("remember =", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberNotEqualTo(String value) {
            addCriterion("remember <>", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberGreaterThan(String value) {
            addCriterion("remember >", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberGreaterThanOrEqualTo(String value) {
            addCriterion("remember >=", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberLessThan(String value) {
            addCriterion("remember <", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberLessThanOrEqualTo(String value) {
            addCriterion("remember <=", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberLike(String value) {
            addCriterion("remember like", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberNotLike(String value) {
            addCriterion("remember not like", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberIn(List<String> values) {
            addCriterion("remember in", values, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberNotIn(List<String> values) {
            addCriterion("remember not in", values, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberBetween(String value1, String value2) {
            addCriterion("remember between", value1, value2, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberNotBetween(String value1, String value2) {
            addCriterion("remember not between", value1, value2, "remember");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andCcidIsNull() {
            addCriterion("ccid is null");
            return (Criteria) this;
        }

        public Criteria andCcidIsNotNull() {
            addCriterion("ccid is not null");
            return (Criteria) this;
        }

        public Criteria andCcidEqualTo(Integer value) {
            addCriterion("ccid =", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotEqualTo(Integer value) {
            addCriterion("ccid <>", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThan(Integer value) {
            addCriterion("ccid >", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccid >=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThan(Integer value) {
            addCriterion("ccid <", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThanOrEqualTo(Integer value) {
            addCriterion("ccid <=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidIn(List<Integer> values) {
            addCriterion("ccid in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotIn(List<Integer> values) {
            addCriterion("ccid not in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidBetween(Integer value1, Integer value2) {
            addCriterion("ccid between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ccid not between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andTimelineIsNull() {
            addCriterion("timeline is null");
            return (Criteria) this;
        }

        public Criteria andTimelineIsNotNull() {
            addCriterion("timeline is not null");
            return (Criteria) this;
        }

        public Criteria andTimelineEqualTo(Integer value) {
            addCriterion("timeline =", value, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineNotEqualTo(Integer value) {
            addCriterion("timeline <>", value, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineGreaterThan(Integer value) {
            addCriterion("timeline >", value, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeline >=", value, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineLessThan(Integer value) {
            addCriterion("timeline <", value, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineLessThanOrEqualTo(Integer value) {
            addCriterion("timeline <=", value, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineIn(List<Integer> values) {
            addCriterion("timeline in", values, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineNotIn(List<Integer> values) {
            addCriterion("timeline not in", values, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineBetween(Integer value1, Integer value2) {
            addCriterion("timeline between", value1, value2, "timeline");
            return (Criteria) this;
        }

        public Criteria andTimelineNotBetween(Integer value1, Integer value2) {
            addCriterion("timeline not between", value1, value2, "timeline");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andLoginTimesIsNull() {
            addCriterion("login_times is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimesIsNotNull() {
            addCriterion("login_times is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimesEqualTo(Integer value) {
            addCriterion("login_times =", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesNotEqualTo(Integer value) {
            addCriterion("login_times <>", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesGreaterThan(Integer value) {
            addCriterion("login_times >", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_times >=", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesLessThan(Integer value) {
            addCriterion("login_times <", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesLessThanOrEqualTo(Integer value) {
            addCriterion("login_times <=", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesIn(List<Integer> values) {
            addCriterion("login_times in", values, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesNotIn(List<Integer> values) {
            addCriterion("login_times not in", values, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesBetween(Integer value1, Integer value2) {
            addCriterion("login_times between", value1, value2, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("login_times not between", value1, value2, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andDrawUserIsNull() {
            addCriterion("draw_user is null");
            return (Criteria) this;
        }

        public Criteria andDrawUserIsNotNull() {
            addCriterion("draw_user is not null");
            return (Criteria) this;
        }

        public Criteria andDrawUserEqualTo(String value) {
            addCriterion("draw_user =", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserNotEqualTo(String value) {
            addCriterion("draw_user <>", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserGreaterThan(String value) {
            addCriterion("draw_user >", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserGreaterThanOrEqualTo(String value) {
            addCriterion("draw_user >=", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserLessThan(String value) {
            addCriterion("draw_user <", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserLessThanOrEqualTo(String value) {
            addCriterion("draw_user <=", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserLike(String value) {
            addCriterion("draw_user like", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserNotLike(String value) {
            addCriterion("draw_user not like", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserIn(List<String> values) {
            addCriterion("draw_user in", values, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserNotIn(List<String> values) {
            addCriterion("draw_user not in", values, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserBetween(String value1, String value2) {
            addCriterion("draw_user between", value1, value2, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserNotBetween(String value1, String value2) {
            addCriterion("draw_user not between", value1, value2, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneIsNull() {
            addCriterion("draw_phone is null");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneIsNotNull() {
            addCriterion("draw_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneEqualTo(String value) {
            addCriterion("draw_phone =", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneNotEqualTo(String value) {
            addCriterion("draw_phone <>", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneGreaterThan(String value) {
            addCriterion("draw_phone >", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("draw_phone >=", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneLessThan(String value) {
            addCriterion("draw_phone <", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneLessThanOrEqualTo(String value) {
            addCriterion("draw_phone <=", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneLike(String value) {
            addCriterion("draw_phone like", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneNotLike(String value) {
            addCriterion("draw_phone not like", value, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneIn(List<String> values) {
            addCriterion("draw_phone in", values, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneNotIn(List<String> values) {
            addCriterion("draw_phone not in", values, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneBetween(String value1, String value2) {
            addCriterion("draw_phone between", value1, value2, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawPhoneNotBetween(String value1, String value2) {
            addCriterion("draw_phone not between", value1, value2, "drawPhone");
            return (Criteria) this;
        }

        public Criteria andDrawBankIsNull() {
            addCriterion("draw_bank is null");
            return (Criteria) this;
        }

        public Criteria andDrawBankIsNotNull() {
            addCriterion("draw_bank is not null");
            return (Criteria) this;
        }

        public Criteria andDrawBankEqualTo(String value) {
            addCriterion("draw_bank =", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankNotEqualTo(String value) {
            addCriterion("draw_bank <>", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankGreaterThan(String value) {
            addCriterion("draw_bank >", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankGreaterThanOrEqualTo(String value) {
            addCriterion("draw_bank >=", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankLessThan(String value) {
            addCriterion("draw_bank <", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankLessThanOrEqualTo(String value) {
            addCriterion("draw_bank <=", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankLike(String value) {
            addCriterion("draw_bank like", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankNotLike(String value) {
            addCriterion("draw_bank not like", value, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankIn(List<String> values) {
            addCriterion("draw_bank in", values, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankNotIn(List<String> values) {
            addCriterion("draw_bank not in", values, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankBetween(String value1, String value2) {
            addCriterion("draw_bank between", value1, value2, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawBankNotBetween(String value1, String value2) {
            addCriterion("draw_bank not between", value1, value2, "drawBank");
            return (Criteria) this;
        }

        public Criteria andDrawCardIsNull() {
            addCriterion("draw_card is null");
            return (Criteria) this;
        }

        public Criteria andDrawCardIsNotNull() {
            addCriterion("draw_card is not null");
            return (Criteria) this;
        }

        public Criteria andDrawCardEqualTo(String value) {
            addCriterion("draw_card =", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardNotEqualTo(String value) {
            addCriterion("draw_card <>", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardGreaterThan(String value) {
            addCriterion("draw_card >", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardGreaterThanOrEqualTo(String value) {
            addCriterion("draw_card >=", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardLessThan(String value) {
            addCriterion("draw_card <", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardLessThanOrEqualTo(String value) {
            addCriterion("draw_card <=", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardLike(String value) {
            addCriterion("draw_card like", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardNotLike(String value) {
            addCriterion("draw_card not like", value, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardIn(List<String> values) {
            addCriterion("draw_card in", values, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardNotIn(List<String> values) {
            addCriterion("draw_card not in", values, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardBetween(String value1, String value2) {
            addCriterion("draw_card between", value1, value2, "drawCard");
            return (Criteria) this;
        }

        public Criteria andDrawCardNotBetween(String value1, String value2) {
            addCriterion("draw_card not between", value1, value2, "drawCard");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andConPeopleIsNull() {
            addCriterion("con_people is null");
            return (Criteria) this;
        }

        public Criteria andConPeopleIsNotNull() {
            addCriterion("con_people is not null");
            return (Criteria) this;
        }

        public Criteria andConPeopleEqualTo(String value) {
            addCriterion("con_people =", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleNotEqualTo(String value) {
            addCriterion("con_people <>", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleGreaterThan(String value) {
            addCriterion("con_people >", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("con_people >=", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleLessThan(String value) {
            addCriterion("con_people <", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleLessThanOrEqualTo(String value) {
            addCriterion("con_people <=", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleLike(String value) {
            addCriterion("con_people like", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleNotLike(String value) {
            addCriterion("con_people not like", value, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleIn(List<String> values) {
            addCriterion("con_people in", values, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleNotIn(List<String> values) {
            addCriterion("con_people not in", values, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleBetween(String value1, String value2) {
            addCriterion("con_people between", value1, value2, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConPeopleNotBetween(String value1, String value2) {
            addCriterion("con_people not between", value1, value2, "conPeople");
            return (Criteria) this;
        }

        public Criteria andConWayIsNull() {
            addCriterion("con_way is null");
            return (Criteria) this;
        }

        public Criteria andConWayIsNotNull() {
            addCriterion("con_way is not null");
            return (Criteria) this;
        }

        public Criteria andConWayEqualTo(String value) {
            addCriterion("con_way =", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotEqualTo(String value) {
            addCriterion("con_way <>", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayGreaterThan(String value) {
            addCriterion("con_way >", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayGreaterThanOrEqualTo(String value) {
            addCriterion("con_way >=", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayLessThan(String value) {
            addCriterion("con_way <", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayLessThanOrEqualTo(String value) {
            addCriterion("con_way <=", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayLike(String value) {
            addCriterion("con_way like", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotLike(String value) {
            addCriterion("con_way not like", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayIn(List<String> values) {
            addCriterion("con_way in", values, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotIn(List<String> values) {
            addCriterion("con_way not in", values, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayBetween(String value1, String value2) {
            addCriterion("con_way between", value1, value2, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotBetween(String value1, String value2) {
            addCriterion("con_way not between", value1, value2, "conWay");
            return (Criteria) this;
        }

        public Criteria andConPhoneIsNull() {
            addCriterion("con_phone is null");
            return (Criteria) this;
        }

        public Criteria andConPhoneIsNotNull() {
            addCriterion("con_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConPhoneEqualTo(String value) {
            addCriterion("con_phone =", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotEqualTo(String value) {
            addCriterion("con_phone <>", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneGreaterThan(String value) {
            addCriterion("con_phone >", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("con_phone >=", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneLessThan(String value) {
            addCriterion("con_phone <", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneLessThanOrEqualTo(String value) {
            addCriterion("con_phone <=", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneLike(String value) {
            addCriterion("con_phone like", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotLike(String value) {
            addCriterion("con_phone not like", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneIn(List<String> values) {
            addCriterion("con_phone in", values, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotIn(List<String> values) {
            addCriterion("con_phone not in", values, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneBetween(String value1, String value2) {
            addCriterion("con_phone between", value1, value2, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotBetween(String value1, String value2) {
            addCriterion("con_phone not between", value1, value2, "conPhone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("vip is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("vip is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(Integer value) {
            addCriterion("vip =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(Integer value) {
            addCriterion("vip <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(Integer value) {
            addCriterion("vip >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(Integer value) {
            addCriterion("vip <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(Integer value) {
            addCriterion("vip <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<Integer> values) {
            addCriterion("vip in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<Integer> values) {
            addCriterion("vip not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(Integer value1, Integer value2) {
            addCriterion("vip between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(Integer value1, Integer value2) {
            addCriterion("vip not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andCodeimgIsNull() {
            addCriterion("codeimg is null");
            return (Criteria) this;
        }

        public Criteria andCodeimgIsNotNull() {
            addCriterion("codeimg is not null");
            return (Criteria) this;
        }

        public Criteria andCodeimgEqualTo(String value) {
            addCriterion("codeimg =", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgNotEqualTo(String value) {
            addCriterion("codeimg <>", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgGreaterThan(String value) {
            addCriterion("codeimg >", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgGreaterThanOrEqualTo(String value) {
            addCriterion("codeimg >=", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgLessThan(String value) {
            addCriterion("codeimg <", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgLessThanOrEqualTo(String value) {
            addCriterion("codeimg <=", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgLike(String value) {
            addCriterion("codeimg like", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgNotLike(String value) {
            addCriterion("codeimg not like", value, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgIn(List<String> values) {
            addCriterion("codeimg in", values, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgNotIn(List<String> values) {
            addCriterion("codeimg not in", values, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgBetween(String value1, String value2) {
            addCriterion("codeimg between", value1, value2, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCodeimgNotBetween(String value1, String value2) {
            addCriterion("codeimg not between", value1, value2, "codeimg");
            return (Criteria) this;
        }

        public Criteria andCimgIsNull() {
            addCriterion("cimg is null");
            return (Criteria) this;
        }

        public Criteria andCimgIsNotNull() {
            addCriterion("cimg is not null");
            return (Criteria) this;
        }

        public Criteria andCimgEqualTo(Integer value) {
            addCriterion("cimg =", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotEqualTo(Integer value) {
            addCriterion("cimg <>", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThan(Integer value) {
            addCriterion("cimg >", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThanOrEqualTo(Integer value) {
            addCriterion("cimg >=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThan(Integer value) {
            addCriterion("cimg <", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThanOrEqualTo(Integer value) {
            addCriterion("cimg <=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgIn(List<Integer> values) {
            addCriterion("cimg in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotIn(List<Integer> values) {
            addCriterion("cimg not in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgBetween(Integer value1, Integer value2) {
            addCriterion("cimg between", value1, value2, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotBetween(Integer value1, Integer value2) {
            addCriterion("cimg not between", value1, value2, "cimg");
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