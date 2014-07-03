package nl.esciencecenter.eecology.classification.db.model.classification;

import java.util.List;
import nl.esciencecenter.eecology.classification.db.classification.LabelRemapSourceLabelSchemaIdKey;
import nl.esciencecenter.eecology.classification.db.classification.LabelRemapSourceLabelSchemaIdKeyExample;
import org.apache.ibatis.annotations.Param;

public interface LabelRemapSourceLabelSchemaIdKeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.label_remap_source_label_schema_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int countByExample(LabelRemapSourceLabelSchemaIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.label_remap_source_label_schema_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int deleteByExample(LabelRemapSourceLabelSchemaIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.label_remap_source_label_schema_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insert(LabelRemapSourceLabelSchemaIdKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.label_remap_source_label_schema_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insertSelective(LabelRemapSourceLabelSchemaIdKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.label_remap_source_label_schema_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    List<LabelRemapSourceLabelSchemaIdKey> selectByExample(LabelRemapSourceLabelSchemaIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.label_remap_source_label_schema_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExampleSelective(@Param("record") LabelRemapSourceLabelSchemaIdKey record, @Param("example") LabelRemapSourceLabelSchemaIdKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.label_remap_source_label_schema_id_key
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExample(@Param("record") LabelRemapSourceLabelSchemaIdKey record, @Param("example") LabelRemapSourceLabelSchemaIdKeyExample example);
}