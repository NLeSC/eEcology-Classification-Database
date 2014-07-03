package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * The persistent class for the segment database table.
 * 
 */
@Entity
public class Segment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "SEGMENT_SEGMENTID_GENERATOR", sequenceName = "CLASSIFICATION.SEGMENT_SEGMENT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEGMENT_SEGMENTID_GENERATOR")
    @Column(name = "segment_id")
    private Integer segmentId;

    @Column(name = "date_time")
    private Timestamp dateTime;

    @Column(name = "device_info_serial")
    private Integer deviceInfoSerial;

    //bi-directional many-to-one association to Classification
    @OneToMany(mappedBy = "segment")
    private Set<Classification> classifications;

    //bi-directional many-to-one association to FeatureValue
    @OneToMany(mappedBy = "segment")
    private Set<FeatureValue> featureValues;

    //bi-directional many-to-one association to SegmentAcceleration
    @OneToMany(mappedBy = "segment")
    private Set<SegmentAcceleration> segmentAccelerations;

    public Segment() {
    }

    public Integer getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
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

    public Set<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(Set<Classification> classifications) {
        this.classifications = classifications;
    }

    public Set<FeatureValue> getFeatureValues() {
        return featureValues;
    }

    public void setFeatureValues(Set<FeatureValue> featureValues) {
        this.featureValues = featureValues;
    }

    public Set<SegmentAcceleration> getSegmentAccelerations() {
        return segmentAccelerations;
    }

    public void setSegmentAccelerations(Set<SegmentAcceleration> segmentAccelerations) {
        this.segmentAccelerations = segmentAccelerations;
    }

}