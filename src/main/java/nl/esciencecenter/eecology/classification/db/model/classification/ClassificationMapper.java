package nl.esciencecenter.eecology.classification.db.model.classification;

import java.util.List;
import nl.esciencecenter.eecology.classification.db.classification.Classification;
import nl.esciencecenter.eecology.classification.db.classification.ClassificationExample;
import nl.esciencecenter.eecology.classification.db.classification.ClassificationKey;
import org.apache.ibatis.annotations.Param;

public interface ClassificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int countByExample(ClassificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int deleteByExample(ClassificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int deleteByPrimaryKey(ClassificationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insert(Classification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insertSelective(Classification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    List<Classification> selectByExample(ClassificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    Classification selectByPrimaryKey(ClassificationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByPrimaryKeySelective(Classification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.classification
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByPrimaryKey(Classification record);
}