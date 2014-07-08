package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the uva_comm101 database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_comm101")
public class Communication implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CommunicationPK id;

    private Integer accii;

    private String action;

    @Column(name = "bytes_communicated")
    private Integer bytesCommunicated;

    private Integer comii;

    @Column(name = "date_time_end")
    private Timestamp dateTimeEnd;

    @Column(name = "date_time_end_utc")
    private Timestamp dateTimeEndUtc;

    @Column(name = "date_time_utc")
    private Timestamp dateTimeUtc;

    private Integer devicemode;

    private Integer gpsii;

    @Column(name = "last_gps_fix")
    private Timestamp lastGpsFix;

    private double latitude;

    private Integer logb;

    private Integer logp;

    private double longitude;

    @Column(name = "network_join_time")
    private Integer networkJoinTime;

    @Column(name = "non_ascii_char")
    private Integer nonAsciiChar;

    @Column(name = "number_identical_lines")
    private Integer numberIdenticalLines;

    private String status;

    @Column(name = "sts_time")
    private Timestamp stsTime;

    private Integer swddd;

    private Integer timesynced;

    private double vbat;

    public Communication() {
    }

    public CommunicationPK getId() {
        return id;
    }

    public void setId(CommunicationPK id) {
        this.id = id;
    }

    public Integer getAccii() {
        return accii;
    }

    public void setAccii(Integer accii) {
        this.accii = accii;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getBytesCommunicated() {
        return bytesCommunicated;
    }

    public void setBytesCommunicated(Integer bytesCommunicated) {
        this.bytesCommunicated = bytesCommunicated;
    }

    public Integer getComii() {
        return comii;
    }

    public void setComii(Integer comii) {
        this.comii = comii;
    }

    public Timestamp getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(Timestamp dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }

    public Timestamp getDateTimeEndUtc() {
        return dateTimeEndUtc;
    }

    public void setDateTimeEndUtc(Timestamp dateTimeEndUtc) {
        this.dateTimeEndUtc = dateTimeEndUtc;
    }

    public Timestamp getDateTimeUtc() {
        return dateTimeUtc;
    }

    public void setDateTimeUtc(Timestamp dateTimeUtc) {
        this.dateTimeUtc = dateTimeUtc;
    }

    public Integer getDevicemode() {
        return devicemode;
    }

    public void setDevicemode(Integer devicemode) {
        this.devicemode = devicemode;
    }

    public Integer getGpsii() {
        return gpsii;
    }

    public void setGpsii(Integer gpsii) {
        this.gpsii = gpsii;
    }

    public Timestamp getLastGpsFix() {
        return lastGpsFix;
    }

    public void setLastGpsFix(Timestamp lastGpsFix) {
        this.lastGpsFix = lastGpsFix;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Integer getLogb() {
        return logb;
    }

    public void setLogb(Integer logb) {
        this.logb = logb;
    }

    public Integer getLogp() {
        return logp;
    }

    public void setLogp(Integer logp) {
        this.logp = logp;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Integer getNetworkJoinTime() {
        return networkJoinTime;
    }

    public void setNetworkJoinTime(Integer networkJoinTime) {
        this.networkJoinTime = networkJoinTime;
    }

    public Integer getNonAsciiChar() {
        return nonAsciiChar;
    }

    public void setNonAsciiChar(Integer nonAsciiChar) {
        this.nonAsciiChar = nonAsciiChar;
    }

    public Integer getNumberIdenticalLines() {
        return numberIdenticalLines;
    }

    public void setNumberIdenticalLines(Integer numberIdenticalLines) {
        this.numberIdenticalLines = numberIdenticalLines;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getStsTime() {
        return stsTime;
    }

    public void setStsTime(Timestamp stsTime) {
        this.stsTime = stsTime;
    }

    public Integer getSwddd() {
        return swddd;
    }

    public void setSwddd(Integer swddd) {
        this.swddd = swddd;
    }

    public Integer getTimesynced() {
        return timesynced;
    }

    public void setTimesynced(Integer timesynced) {
        this.timesynced = timesynced;
    }

    public double getVbat() {
        return vbat;
    }

    public void setVbat(double vbat) {
        this.vbat = vbat;
    }

}