package nl.esciencecenter.eecology.classification.db.doa.classification;

import java.util.List;
import nl.esciencecenter.eecology.classification.db.model.classification.ClassifierTypeNameKey;
import nl.esciencecenter.eecology.classification.db.model.classification.ClassifierTypeNameKeyExample;
import org.apache.ibatis.annotations.Param;

public interface ClassifierTypeNameKeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_name_key
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    int countByExample(ClassifierTypeNameKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_name_key
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    int deleteByExample(ClassifierTypeNameKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_name_key
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    int insert(ClassifierTypeNameKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_name_key
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    int insertSelective(ClassifierTypeNameKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_name_key
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    List<ClassifierTypeNameKey> selectByExample(ClassifierTypeNameKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_name_key
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    int updateByExampleSelective(@Param("record") ClassifierTypeNameKey record, @Param("example") ClassifierTypeNameKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classifier_type_name_key
     *
     * @mbggenerated Mon Jul 07 16:43:08 CEST 2014
     */
    int updateByExample(@Param("record") ClassifierTypeNameKey record, @Param("example") ClassifierTypeNameKeyExample example);
}