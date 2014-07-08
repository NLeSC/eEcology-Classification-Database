package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the uva_trackingfile_messages database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_trackingfile_messages")
public class TrackingfileMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Column(name = "line_number")
    private Integer lineNumber;

    private String message;

    @Column(name = "message_code")
    private Integer messageCode;

    @Column(name = "message_type")
    private Integer messageType;

    @Column(name = "tracking_bookkeeping_id")
    private Integer trackingBookkeepingId;

    public TrackingfileMessage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Integer getTrackingBookkeepingId() {
        return trackingBookkeepingId;
    }

    public void setTrackingBookkeepingId(Integer trackingBookkeepingId) {
        this.trackingBookkeepingId = trackingBookkeepingId;
    }

}