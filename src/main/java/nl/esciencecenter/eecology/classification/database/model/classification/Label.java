package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the label database table.
 * 
 */
@Entity
@Table(schema = "classification")
public class Label implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private LabelPK id;

    private Integer blue;

    private String description;

    private Integer green;

    private String name;

    private Integer red;

    //bi-directional many-to-one association to Classification
    @OneToMany(mappedBy = "label")
    private Set<Classification> classifications;

    //bi-directional many-to-one association to LabelSchema
    @ManyToOne
    @JoinColumn(name = "label_schema_id", insertable = false, updatable = false)
    private LabelSchema labelSchema;

    //bi-directional many-to-one association to LabelRemap
    @OneToMany(mappedBy = "source")
    private Set<LabelRemap> sources;

    //bi-directional one-to-one association to LabelRemap
    @OneToOne(mappedBy = "target")
    private LabelRemap target;

    public Label() {
    }

    public LabelPK getId() {
        return id;
    }

    public void setId(LabelPK id) {
        this.id = id;
    }

    public Integer getBlue() {
        return blue;
    }

    public void setBlue(Integer blue) {
        this.blue = blue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRed() {
        return red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public Set<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(Set<Classification> classifications) {
        this.classifications = classifications;
    }

    public LabelSchema getLabelSchema() {
        return labelSchema;
    }

    public void setLabelSchema(LabelSchema labelSchema) {
        this.labelSchema = labelSchema;
    }

    public Set<LabelRemap> getSources() {
        return sources;
    }

    public void setSources(Set<LabelRemap> labelRemaps) {
        sources = labelRemaps;
    }

    public LabelRemap getTarget() {
        return target;
    }

    public void setTarget(LabelRemap labelRemap) {
        target = labelRemap;
    }

}