package nl.esciencecenter.eecology.classification.db.classification;

import java.util.Date;

public class LabelSchema {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification.label_schema.label_schema_id
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    private Integer label_schema_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification.label_schema.name
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification.label_schema.created_by
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    private String created_by;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification.label_schema.created_on
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    private Date created_on;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification.label_schema.label_schema_id
     *
     * @return the value of classification.label_schema.label_schema_id
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public Integer getLabel_schema_id() {
        return label_schema_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification.label_schema.label_schema_id
     *
     * @param label_schema_id the value for classification.label_schema.label_schema_id
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public void setLabel_schema_id(Integer label_schema_id) {
        this.label_schema_id = label_schema_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification.label_schema.name
     *
     * @return the value of classification.label_schema.name
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification.label_schema.name
     *
     * @param name the value for classification.label_schema.name
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification.label_schema.created_by
     *
     * @return the value of classification.label_schema.created_by
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public String getCreated_by() {
        return created_by;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification.label_schema.created_by
     *
     * @param created_by the value for classification.label_schema.created_by
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public void setCreated_by(String created_by) {
        this.created_by = created_by == null ? null : created_by.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification.label_schema.created_on
     *
     * @return the value of classification.label_schema.created_on
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public Date getCreated_on() {
        return created_on;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification.label_schema.created_on
     *
     * @param created_on the value for classification.label_schema.created_on
     *
     * @mbggenerated Wed Jul 02 17:44:44 CEST 2014
     */
    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}