package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the uva_warning102 database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_warning102")
public class Warning implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private WarningPK id;

    private String line;

    private String warning;

    public Warning() {
    }

    public WarningPK getId() {
        return id;
    }

    public void setId(WarningPK id) {
        this.id = id;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

}