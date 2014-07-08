package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the uva_access_individual database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_access_individual")
public class AccessIndividual implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AccessIndividualPK id;

    public AccessIndividual() {
    }

    public AccessIndividualPK getId() {
        return id;
    }

    public void setId(AccessIndividualPK id) {
        this.id = id;
    }

}