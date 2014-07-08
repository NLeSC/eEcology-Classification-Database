package nl.esciencecenter.eecology.classification.db.model.classification;

import java.util.ArrayList;
import java.util.List;

public class ClassifierTypeClassTypeIdSeqExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public ClassifierTypeClassTypeIdSeqExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andSequence_nameIsNull() {
            addCriterion("sequence_name is null");
            return (Criteria) this;
        }

        public Criteria andSequence_nameIsNotNull() {
            addCriterion("sequence_name is not null");
            return (Criteria) this;
        }

        public Criteria andSequence_nameEqualTo(String value) {
            addCriterion("sequence_name =", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameNotEqualTo(String value) {
            addCriterion("sequence_name <>", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameGreaterThan(String value) {
            addCriterion("sequence_name >", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sequence_name >=", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameLessThan(String value) {
            addCriterion("sequence_name <", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameLessThanOrEqualTo(String value) {
            addCriterion("sequence_name <=", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameLike(String value) {
            addCriterion("sequence_name like", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameNotLike(String value) {
            addCriterion("sequence_name not like", value, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameIn(List<String> values) {
            addCriterion("sequence_name in", values, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameNotIn(List<String> values) {
            addCriterion("sequence_name not in", values, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameBetween(String value1, String value2) {
            addCriterion("sequence_name between", value1, value2, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andSequence_nameNotBetween(String value1, String value2) {
            addCriterion("sequence_name not between", value1, value2, "sequence_name");
            return (Criteria) this;
        }

        public Criteria andLast_valueIsNull() {
            addCriterion("last_value is null");
            return (Criteria) this;
        }

        public Criteria andLast_valueIsNotNull() {
            addCriterion("last_value is not null");
            return (Criteria) this;
        }

        public Criteria andLast_valueEqualTo(Long value) {
            addCriterion("last_value =", value, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueNotEqualTo(Long value) {
            addCriterion("last_value <>", value, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueGreaterThan(Long value) {
            addCriterion("last_value >", value, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueGreaterThanOrEqualTo(Long value) {
            addCriterion("last_value >=", value, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueLessThan(Long value) {
            addCriterion("last_value <", value, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueLessThanOrEqualTo(Long value) {
            addCriterion("last_value <=", value, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueIn(List<Long> values) {
            addCriterion("last_value in", values, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueNotIn(List<Long> values) {
            addCriterion("last_value not in", values, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueBetween(Long value1, Long value2) {
            addCriterion("last_value between", value1, value2, "last_value");
            return (Criteria) this;
        }

        public Criteria andLast_valueNotBetween(Long value1, Long value2) {
            addCriterion("last_value not between", value1, value2, "last_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueIsNull() {
            addCriterion("start_value is null");
            return (Criteria) this;
        }

        public Criteria andStart_valueIsNotNull() {
            addCriterion("start_value is not null");
            return (Criteria) this;
        }

        public Criteria andStart_valueEqualTo(Long value) {
            addCriterion("start_value =", value, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueNotEqualTo(Long value) {
            addCriterion("start_value <>", value, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueGreaterThan(Long value) {
            addCriterion("start_value >", value, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueGreaterThanOrEqualTo(Long value) {
            addCriterion("start_value >=", value, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueLessThan(Long value) {
            addCriterion("start_value <", value, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueLessThanOrEqualTo(Long value) {
            addCriterion("start_value <=", value, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueIn(List<Long> values) {
            addCriterion("start_value in", values, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueNotIn(List<Long> values) {
            addCriterion("start_value not in", values, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueBetween(Long value1, Long value2) {
            addCriterion("start_value between", value1, value2, "start_value");
            return (Criteria) this;
        }

        public Criteria andStart_valueNotBetween(Long value1, Long value2) {
            addCriterion("start_value not between", value1, value2, "start_value");
            return (Criteria) this;
        }

        public Criteria andIncrement_byIsNull() {
            addCriterion("increment_by is null");
            return (Criteria) this;
        }

        public Criteria andIncrement_byIsNotNull() {
            addCriterion("increment_by is not null");
            return (Criteria) this;
        }

        public Criteria andIncrement_byEqualTo(Long value) {
            addCriterion("increment_by =", value, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byNotEqualTo(Long value) {
            addCriterion("increment_by <>", value, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byGreaterThan(Long value) {
            addCriterion("increment_by >", value, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byGreaterThanOrEqualTo(Long value) {
            addCriterion("increment_by >=", value, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byLessThan(Long value) {
            addCriterion("increment_by <", value, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byLessThanOrEqualTo(Long value) {
            addCriterion("increment_by <=", value, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byIn(List<Long> values) {
            addCriterion("increment_by in", values, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byNotIn(List<Long> values) {
            addCriterion("increment_by not in", values, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byBetween(Long value1, Long value2) {
            addCriterion("increment_by between", value1, value2, "increment_by");
            return (Criteria) this;
        }

        public Criteria andIncrement_byNotBetween(Long value1, Long value2) {
            addCriterion("increment_by not between", value1, value2, "increment_by");
            return (Criteria) this;
        }

        public Criteria andMax_valueIsNull() {
            addCriterion("max_value is null");
            return (Criteria) this;
        }

        public Criteria andMax_valueIsNotNull() {
            addCriterion("max_value is not null");
            return (Criteria) this;
        }

        public Criteria andMax_valueEqualTo(Long value) {
            addCriterion("max_value =", value, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueNotEqualTo(Long value) {
            addCriterion("max_value <>", value, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueGreaterThan(Long value) {
            addCriterion("max_value >", value, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueGreaterThanOrEqualTo(Long value) {
            addCriterion("max_value >=", value, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueLessThan(Long value) {
            addCriterion("max_value <", value, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueLessThanOrEqualTo(Long value) {
            addCriterion("max_value <=", value, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueIn(List<Long> values) {
            addCriterion("max_value in", values, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueNotIn(List<Long> values) {
            addCriterion("max_value not in", values, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueBetween(Long value1, Long value2) {
            addCriterion("max_value between", value1, value2, "max_value");
            return (Criteria) this;
        }

        public Criteria andMax_valueNotBetween(Long value1, Long value2) {
            addCriterion("max_value not between", value1, value2, "max_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueIsNull() {
            addCriterion("min_value is null");
            return (Criteria) this;
        }

        public Criteria andMin_valueIsNotNull() {
            addCriterion("min_value is not null");
            return (Criteria) this;
        }

        public Criteria andMin_valueEqualTo(Long value) {
            addCriterion("min_value =", value, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueNotEqualTo(Long value) {
            addCriterion("min_value <>", value, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueGreaterThan(Long value) {
            addCriterion("min_value >", value, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueGreaterThanOrEqualTo(Long value) {
            addCriterion("min_value >=", value, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueLessThan(Long value) {
            addCriterion("min_value <", value, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueLessThanOrEqualTo(Long value) {
            addCriterion("min_value <=", value, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueIn(List<Long> values) {
            addCriterion("min_value in", values, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueNotIn(List<Long> values) {
            addCriterion("min_value not in", values, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueBetween(Long value1, Long value2) {
            addCriterion("min_value between", value1, value2, "min_value");
            return (Criteria) this;
        }

        public Criteria andMin_valueNotBetween(Long value1, Long value2) {
            addCriterion("min_value not between", value1, value2, "min_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueIsNull() {
            addCriterion("cache_value is null");
            return (Criteria) this;
        }

        public Criteria andCache_valueIsNotNull() {
            addCriterion("cache_value is not null");
            return (Criteria) this;
        }

        public Criteria andCache_valueEqualTo(Long value) {
            addCriterion("cache_value =", value, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueNotEqualTo(Long value) {
            addCriterion("cache_value <>", value, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueGreaterThan(Long value) {
            addCriterion("cache_value >", value, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueGreaterThanOrEqualTo(Long value) {
            addCriterion("cache_value >=", value, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueLessThan(Long value) {
            addCriterion("cache_value <", value, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueLessThanOrEqualTo(Long value) {
            addCriterion("cache_value <=", value, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueIn(List<Long> values) {
            addCriterion("cache_value in", values, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueNotIn(List<Long> values) {
            addCriterion("cache_value not in", values, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueBetween(Long value1, Long value2) {
            addCriterion("cache_value between", value1, value2, "cache_value");
            return (Criteria) this;
        }

        public Criteria andCache_valueNotBetween(Long value1, Long value2) {
            addCriterion("cache_value not between", value1, value2, "cache_value");
            return (Criteria) this;
        }

        public Criteria andLog_cntIsNull() {
            addCriterion("log_cnt is null");
            return (Criteria) this;
        }

        public Criteria andLog_cntIsNotNull() {
            addCriterion("log_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andLog_cntEqualTo(Long value) {
            addCriterion("log_cnt =", value, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntNotEqualTo(Long value) {
            addCriterion("log_cnt <>", value, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntGreaterThan(Long value) {
            addCriterion("log_cnt >", value, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntGreaterThanOrEqualTo(Long value) {
            addCriterion("log_cnt >=", value, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntLessThan(Long value) {
            addCriterion("log_cnt <", value, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntLessThanOrEqualTo(Long value) {
            addCriterion("log_cnt <=", value, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntIn(List<Long> values) {
            addCriterion("log_cnt in", values, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntNotIn(List<Long> values) {
            addCriterion("log_cnt not in", values, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntBetween(Long value1, Long value2) {
            addCriterion("log_cnt between", value1, value2, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andLog_cntNotBetween(Long value1, Long value2) {
            addCriterion("log_cnt not between", value1, value2, "log_cnt");
            return (Criteria) this;
        }

        public Criteria andIs_cycledIsNull() {
            addCriterion("is_cycled is null");
            return (Criteria) this;
        }

        public Criteria andIs_cycledIsNotNull() {
            addCriterion("is_cycled is not null");
            return (Criteria) this;
        }

        public Criteria andIs_cycledEqualTo(Boolean value) {
            addCriterion("is_cycled =", value, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledNotEqualTo(Boolean value) {
            addCriterion("is_cycled <>", value, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledGreaterThan(Boolean value) {
            addCriterion("is_cycled >", value, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cycled >=", value, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledLessThan(Boolean value) {
            addCriterion("is_cycled <", value, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cycled <=", value, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledIn(List<Boolean> values) {
            addCriterion("is_cycled in", values, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledNotIn(List<Boolean> values) {
            addCriterion("is_cycled not in", values, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cycled between", value1, value2, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_cycledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cycled not between", value1, value2, "is_cycled");
            return (Criteria) this;
        }

        public Criteria andIs_calledIsNull() {
            addCriterion("is_called is null");
            return (Criteria) this;
        }

        public Criteria andIs_calledIsNotNull() {
            addCriterion("is_called is not null");
            return (Criteria) this;
        }

        public Criteria andIs_calledEqualTo(Boolean value) {
            addCriterion("is_called =", value, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledNotEqualTo(Boolean value) {
            addCriterion("is_called <>", value, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledGreaterThan(Boolean value) {
            addCriterion("is_called >", value, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_called >=", value, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledLessThan(Boolean value) {
            addCriterion("is_called <", value, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_called <=", value, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledIn(List<Boolean> values) {
            addCriterion("is_called in", values, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledNotIn(List<Boolean> values) {
            addCriterion("is_called not in", values, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_called between", value1, value2, "is_called");
            return (Criteria) this;
        }

        public Criteria andIs_calledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_called not between", value1, value2, "is_called");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated do_not_delete_during_merge Mon Jul 07 16:43:08 CEST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table classification.classifier_type_class_type_id_seq
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}