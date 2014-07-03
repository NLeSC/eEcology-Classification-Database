package nl.esciencecenter.eecology.classification.db.model.classification;

import java.util.List;
import nl.esciencecenter.eecology.classification.db.classification.ClassifierParentClassifierIdKey;
import nl.esciencecenter.eecology.classification.db.classification.ClassifierParentClassifierIdKeyExample;
import org.apache.ibatis.annotations.Param;

public interface ClassifierParentClassifierIdKeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_parent_classifier_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int countByExample(ClassifierParentClassifierIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_parent_classifier_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int deleteByExample(ClassifierParentClassifierIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_parent_classifier_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insert(ClassifierParentClassifierIdKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_parent_classifier_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insertSelective(ClassifierParentClassifierIdKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_parent_classifier_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    List<ClassifierParentClassifierIdKey> selectByExample(ClassifierParentClassifierIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_parent_classifier_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExampleSelective(@Param("record") ClassifierParentClassifierIdKey record, @Param("example") ClassifierParentClassifierIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_parent_classifier_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExample(@Param("record") ClassifierParentClassifierIdKey record, @Param("example") ClassifierParentClassifierIdKeyExample example);
}