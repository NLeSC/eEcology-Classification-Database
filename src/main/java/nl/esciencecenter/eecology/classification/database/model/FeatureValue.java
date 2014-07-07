package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the feature_value database table.
 * 
 */
@Entity
@Table(schema = "classification", name = "feature_value")
public class FeatureValue implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private FeatureValuePK id;

    @Column(name = "attribute_value")
    private double attributeValue;

    //bi-directional many-to-one association to Feature
    @ManyToOne
    @JoinColumn(name = "feature_id", insertable = false, updatable = false)
    private Feature feature;

    //bi-directional many-to-one association to Segment
    @ManyToOne
    @JoinColumn(name = "segment_id", insertable = false, updatable = false)
    private Segment segment;

    public FeatureValue() {
    }

    public FeatureValuePK getId() {
        return id;
    }

    public void setId(FeatureValuePK id) {
        this.id = id;
    }

    public double getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(double attributeValue) {
        this.attributeValue = attributeValue;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

}