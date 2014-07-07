package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the uva_trackingfile_parsing database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_trackingfile_parsing")
public class TrackingfileParsing implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_reported")
    private Date dateReported;

    private String filename;

    private String filepath;

    private Long filesize;

    @Column(name = "last_found_date")
    private Timestamp lastFoundDate;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "n_acceleration_records")
    private Integer nAccelerationRecords;

    @Column(name = "n_acceleration_start_records")
    private Integer nAccelerationStartRecords;

    @Column(name = "n_communication_records")
    private Integer nCommunicationRecords;

    @Column(name = "n_data_lines")
    private Integer nDataLines;

    @Column(name = "n_energy_records")
    private Integer nEnergyRecords;

    @Column(name = "n_errors")
    private Integer nErrors;

    @Column(name = "n_lines")
    private Integer nLines;

    @Column(name = "n_settings_records")
    private Integer nSettingsRecords;

    @Column(name = "n_tracking_records")
    private Integer nTrackingRecords;

    @Column(name = "parsed_date")
    private Timestamp parsedDate;

    private Integer version;

    //bi-directional many-to-one association to Device
    @ManyToOne
    @JoinColumn(name = "device_info_serial")
    private Device uvaDevice;

    public TrackingfileParsing() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public Timestamp getLastFoundDate() {
        return lastFoundDate;
    }

    public void setLastFoundDate(Timestamp lastFoundDate) {
        this.lastFoundDate = lastFoundDate;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getNAccelerationRecords() {
        return nAccelerationRecords;
    }

    public void setNAccelerationRecords(Integer nAccelerationRecords) {
        this.nAccelerationRecords = nAccelerationRecords;
    }

    public Integer getNAccelerationStartRecords() {
        return nAccelerationStartRecords;
    }

    public void setNAccelerationStartRecords(Integer nAccelerationStartRecords) {
        this.nAccelerationStartRecords = nAccelerationStartRecords;
    }

    public Integer getNCommunicationRecords() {
        return nCommunicationRecords;
    }

    public void setNCommunicationRecords(Integer nCommunicationRecords) {
        this.nCommunicationRecords = nCommunicationRecords;
    }

    public Integer getNDataLines() {
        return nDataLines;
    }

    public void setNDataLines(Integer nDataLines) {
        this.nDataLines = nDataLines;
    }

    public Integer getNEnergyRecords() {
        return nEnergyRecords;
    }

    public void setNEnergyRecords(Integer nEnergyRecords) {
        this.nEnergyRecords = nEnergyRecords;
    }

    public Integer getNErrors() {
        return nErrors;
    }

    public void setNErrors(Integer nErrors) {
        this.nErrors = nErrors;
    }

    public Integer getNLines() {
        return nLines;
    }

    public void setNLines(Integer nLines) {
        this.nLines = nLines;
    }

    public Integer getNSettingsRecords() {
        return nSettingsRecords;
    }

    public void setNSettingsRecords(Integer nSettingsRecords) {
        this.nSettingsRecords = nSettingsRecords;
    }

    public Integer getNTrackingRecords() {
        return nTrackingRecords;
    }

    public void setNTrackingRecords(Integer nTrackingRecords) {
        this.nTrackingRecords = nTrackingRecords;
    }

    public Timestamp getParsedDate() {
        return parsedDate;
    }

    public void setParsedDate(Timestamp parsedDate) {
        this.parsedDate = parsedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Device getUvaDevice() {
        return uvaDevice;
    }

    public void setUvaDevice(Device uvaDevice) {
        this.uvaDevice = uvaDevice;
    }

}