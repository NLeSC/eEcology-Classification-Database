package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the segment_acceleration database table.
 * 
 */
@Entity
@Table(name = "segment_acceleration")
public class SegmentAcceleration implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "SEGMENT_ACCELERATION_SEGMENTACCELERATIONID_GENERATOR", sequenceName = "CLASSIFICATION.SEGMENT_ACCELERATION_SEGMENT_ACCELERATION_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEGMENT_ACCELERATION_SEGMENTACCELERATIONID_GENERATOR")
    @Column(name = "segment_acceleration_id")
    private Integer segmentAccelerationId;

    @Column(name = "date_time")
    private Timestamp dateTime;

    @Column(name = "device_info_serial")
    private Integer deviceInfoSerial;

    private Integer index;

    //bi-directional many-to-one association to Segment
    @ManyToOne
    @JoinColumn(name = "segment_id")
    private Segment segment;

    public SegmentAcceleration() {
    }

    public Integer getSegmentAccelerationId() {
        return segmentAccelerationId;
    }

    public void setSegmentAccelerationId(Integer segmentAccelerationId) {
        this.segmentAccelerationId = segmentAccelerationId;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getDeviceInfoSerial() {
        return deviceInfoSerial;
    }

    public void setDeviceInfoSerial(Integer deviceInfoSerial) {
        this.deviceInfoSerial = deviceInfoSerial;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

}