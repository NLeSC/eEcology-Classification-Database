package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the uva_device database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_device")
public class Device implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "device_info_serial")
    private Integer deviceInfoSerial;

    @Column(name = "device_mass")
    private double deviceMass;

    @Column(name = "firmware_version")
    private String firmwareVersion;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "x_o")
    private double xO;

    @Column(name = "x_s")
    private double xS;

    @Column(name = "y_o")
    private double yO;

    @Column(name = "y_s")
    private double yS;

    @Column(name = "z_o")
    private double zO;

    @Column(name = "z_s")
    private double zS;

    //bi-directional many-to-one association to TrackSession
    @OneToMany(mappedBy = "uvaDevice1")
    private Set<TrackSession> uvaTrackSessions1;

    //bi-directional many-to-one association to TrackingfileParsing
    @OneToMany(mappedBy = "uvaDevice")
    private Set<TrackingfileParsing> uvaTrackingfileParsings;

    //bi-directional many-to-one association to AccessDevice
    @OneToMany(mappedBy = "uvaDevice")
    private Set<AccessDevice> uvaAccessDevices;

    //bi-directional many-to-one association to Acceleration
    @OneToMany(mappedBy = "uvaDevice")
    private Set<Acceleration> uvaAcceleration101s;

    //bi-directional many-to-one association to TrackingSpeed
    @OneToMany(mappedBy = "uvaDevice")
    private Set<TrackingSpeed> uvaTrackingSpeeds;

    //bi-directional many-to-one association to AccelerationStart
    @OneToMany(mappedBy = "uvaDevice")
    private Set<AccelerationStart> uvaAccStart102s;

    //bi-directional many-to-one association to TrackSession
    @OneToMany(mappedBy = "uvaDevice2")
    private Set<TrackSession> uvaTrackSessions2;

    //bi-directional many-to-one association to TrackingData101
    @OneToMany(mappedBy = "uvaDevice")
    private Set<TrackingData101> uvaTrackingData101s;

    public Device() {
    }

    public Integer getDeviceInfoSerial() {
        return deviceInfoSerial;
    }

    public void setDeviceInfoSerial(Integer deviceInfoSerial) {
        this.deviceInfoSerial = deviceInfoSerial;
    }

    public double getDeviceMass() {
        return deviceMass;
    }

    public void setDeviceMass(double deviceMass) {
        this.deviceMass = deviceMass;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public double getXO() {
        return xO;
    }

    public void setXO(double xO) {
        this.xO = xO;
    }

    public double getXS() {
        return xS;
    }

    public void setXS(double xS) {
        this.xS = xS;
    }

    public double getYO() {
        return yO;
    }

    public void setYO(double yO) {
        this.yO = yO;
    }

    public double getYS() {
        return yS;
    }

    public void setYS(double yS) {
        this.yS = yS;
    }

    public double getZO() {
        return zO;
    }

    public void setZO(double zO) {
        this.zO = zO;
    }

    public double getZS() {
        return zS;
    }

    public void setZS(double zS) {
        this.zS = zS;
    }

    public Set<TrackSession> getUvaTrackSessions1() {
        return uvaTrackSessions1;
    }

    public void setUvaTrackSessions1(Set<TrackSession> uvaTrackSessions1) {
        this.uvaTrackSessions1 = uvaTrackSessions1;
    }

    public Set<TrackingfileParsing> getUvaTrackingfileParsings() {
        return uvaTrackingfileParsings;
    }

    public void setUvaTrackingfileParsings(Set<TrackingfileParsing> uvaTrackingfileParsings) {
        this.uvaTrackingfileParsings = uvaTrackingfileParsings;
    }

    public Set<AccessDevice> getUvaAccessDevices() {
        return uvaAccessDevices;
    }

    public void setUvaAccessDevices(Set<AccessDevice> uvaAccessDevices) {
        this.uvaAccessDevices = uvaAccessDevices;
    }

    public Set<Acceleration> getUvaAcceleration101s() {
        return uvaAcceleration101s;
    }

    public void setUvaAcceleration101s(Set<Acceleration> uvaAcceleration101s) {
        this.uvaAcceleration101s = uvaAcceleration101s;
    }

    public Set<TrackingSpeed> getUvaTrackingSpeeds() {
        return uvaTrackingSpeeds;
    }

    public void setUvaTrackingSpeeds(Set<TrackingSpeed> uvaTrackingSpeeds) {
        this.uvaTrackingSpeeds = uvaTrackingSpeeds;
    }

    public Set<AccelerationStart> getUvaAccStart102s() {
        return uvaAccStart102s;
    }

    public void setUvaAccStart102s(Set<AccelerationStart> uvaAccStart102s) {
        this.uvaAccStart102s = uvaAccStart102s;
    }

    public Set<TrackSession> getUvaTrackSessions2() {
        return uvaTrackSessions2;
    }

    public void setUvaTrackSessions2(Set<TrackSession> uvaTrackSessions2) {
        this.uvaTrackSessions2 = uvaTrackSessions2;
    }

    public Set<TrackingData101> getUvaTrackingData101s() {
        return uvaTrackingData101s;
    }

    public void setUvaTrackingData101s(Set<TrackingData101> uvaTrackingData101s) {
        this.uvaTrackingData101s = uvaTrackingData101s;
    }

}