package nl.esciencecenter.eecology.classification.db.model.classification;

import java.util.List;
import nl.esciencecenter.eecology.classification.db.classification.SegmentAccelerationPkey;
import nl.esciencecenter.eecology.classification.db.classification.SegmentAccelerationPkeyExample;
import org.apache.ibatis.annotations.Param;

public interface SegmentAccelerationPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.segment_acceleration_pkey
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int countByExample(SegmentAccelerationPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.segment_acceleration_pkey
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int deleteByExample(SegmentAccelerationPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.segment_acceleration_pkey
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insert(SegmentAccelerationPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.segment_acceleration_pkey
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int insertSelective(SegmentAccelerationPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.segment_acceleration_pkey
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    List<SegmentAccelerationPkey> selectByExample(SegmentAccelerationPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.segment_acceleration_pkey
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExampleSelective(@Param("record") SegmentAccelerationPkey record, @Param("example") SegmentAccelerationPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification.segment_acceleration_pkey
     *
     * @mbggenerated Thu Jul 03 09:42:37 CEST 2014
     */
    int updateByExample(@Param("record") SegmentAccelerationPkey record, @Param("example") SegmentAccelerationPkeyExample example);
}