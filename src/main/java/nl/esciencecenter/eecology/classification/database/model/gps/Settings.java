package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the uva_settings101 database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_settings101")
public class Settings implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SettingsPK id;

    private Integer accbn;

    private Integer accii;

    private Integer accsn;

    private Integer aol;

    @Column(name = "com_ivale")
    private Integer comIvale;

    @Column(name = "com_ivale_on_h")
    private Integer comIvaleOnH;

    @Column(name = "com_ivale_on_m")
    private Integer comIvaleOnM;

    @Column(name = "com_ivaln")
    private Integer comIvaln;

    @Column(name = "com_ivaln_on_h")
    private Integer comIvalnOnH;

    @Column(name = "com_ivaln_on_m")
    private Integer comIvalnOnM;

    private String eventnum;

    private Integer f;

    private Integer ga;

    @Column(name = "gps_ivale")
    private Integer gpsIvale;

    @Column(name = "gps_ivale_on_h")
    private Integer gpsIvaleOnH;

    @Column(name = "gps_ivale_on_m")
    private Integer gpsIvaleOnM;

    @Column(name = "gps_ivaln")
    private Integer gpsIvaln;

    @Column(name = "gps_ivaln_on_h")
    private Integer gpsIvalnOnH;

    @Column(name = "gps_ivaln_on_m")
    private Integer gpsIvalnOnM;

    private Integer gpsfixtime;

    private Integer gpsnavmode;

    private Integer gpsreceivermode;

    private Integer pac;

    private Integer pdp;

    private Integer swddd;

    private Integer tac;

    private Integer tdp;

    private Integer timesynced;

    @Column(name = "timezone_time")
    private Integer timezoneTime;

    public Settings() {
    }

    public SettingsPK getId() {
        return id;
    }

    public void setId(SettingsPK id) {
        this.id = id;
    }

    public Integer getAccbn() {
        return accbn;
    }

    public void setAccbn(Integer accbn) {
        this.accbn = accbn;
    }

    public Integer getAccii() {
        return accii;
    }

    public void setAccii(Integer accii) {
        this.accii = accii;
    }

    public Integer getAccsn() {
        return accsn;
    }

    public void setAccsn(Integer accsn) {
        this.accsn = accsn;
    }

    public Integer getAol() {
        return aol;
    }

    public void setAol(Integer aol) {
        this.aol = aol;
    }

    public Integer getComIvale() {
        return comIvale;
    }

    public void setComIvale(Integer comIvale) {
        this.comIvale = comIvale;
    }

    public Integer getComIvaleOnH() {
        return comIvaleOnH;
    }

    public void setComIvaleOnH(Integer comIvaleOnH) {
        this.comIvaleOnH = comIvaleOnH;
    }

    public Integer getComIvaleOnM() {
        return comIvaleOnM;
    }

    public void setComIvaleOnM(Integer comIvaleOnM) {
        this.comIvaleOnM = comIvaleOnM;
    }

    public Integer getComIvaln() {
        return comIvaln;
    }

    public void setComIvaln(Integer comIvaln) {
        this.comIvaln = comIvaln;
    }

    public Integer getComIvalnOnH() {
        return comIvalnOnH;
    }

    public void setComIvalnOnH(Integer comIvalnOnH) {
        this.comIvalnOnH = comIvalnOnH;
    }

    public Integer getComIvalnOnM() {
        return comIvalnOnM;
    }

    public void setComIvalnOnM(Integer comIvalnOnM) {
        this.comIvalnOnM = comIvalnOnM;
    }

    public String getEventnum() {
        return eventnum;
    }

    public void setEventnum(String eventnum) {
        this.eventnum = eventnum;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    public Integer getGa() {
        return ga;
    }

    public void setGa(Integer ga) {
        this.ga = ga;
    }

    public Integer getGpsIvale() {
        return gpsIvale;
    }

    public void setGpsIvale(Integer gpsIvale) {
        this.gpsIvale = gpsIvale;
    }

    public Integer getGpsIvaleOnH() {
        return gpsIvaleOnH;
    }

    public void setGpsIvaleOnH(Integer gpsIvaleOnH) {
        this.gpsIvaleOnH = gpsIvaleOnH;
    }

    public Integer getGpsIvaleOnM() {
        return gpsIvaleOnM;
    }

    public void setGpsIvaleOnM(Integer gpsIvaleOnM) {
        this.gpsIvaleOnM = gpsIvaleOnM;
    }

    public Integer getGpsIvaln() {
        return gpsIvaln;
    }

    public void setGpsIvaln(Integer gpsIvaln) {
        this.gpsIvaln = gpsIvaln;
    }

    public Integer getGpsIvalnOnH() {
        return gpsIvalnOnH;
    }

    public void setGpsIvalnOnH(Integer gpsIvalnOnH) {
        this.gpsIvalnOnH = gpsIvalnOnH;
    }

    public Integer getGpsIvalnOnM() {
        return gpsIvalnOnM;
    }

    public void setGpsIvalnOnM(Integer gpsIvalnOnM) {
        this.gpsIvalnOnM = gpsIvalnOnM;
    }

    public Integer getGpsfixtime() {
        return gpsfixtime;
    }

    public void setGpsfixtime(Integer gpsfixtime) {
        this.gpsfixtime = gpsfixtime;
    }

    public Integer getGpsnavmode() {
        return gpsnavmode;
    }

    public void setGpsnavmode(Integer gpsnavmode) {
        this.gpsnavmode = gpsnavmode;
    }

    public Integer getGpsreceivermode() {
        return gpsreceivermode;
    }

    public void setGpsreceivermode(Integer gpsreceivermode) {
        this.gpsreceivermode = gpsreceivermode;
    }

    public Integer getPac() {
        return pac;
    }

    public void setPac(Integer pac) {
        this.pac = pac;
    }

    public Integer getPdp() {
        return pdp;
    }

    public void setPdp(Integer pdp) {
        this.pdp = pdp;
    }

    public Integer getSwddd() {
        return swddd;
    }

    public void setSwddd(Integer swddd) {
        this.swddd = swddd;
    }

    public Integer getTac() {
        return tac;
    }

    public void setTac(Integer tac) {
        this.tac = tac;
    }

    public Integer getTdp() {
        return tdp;
    }

    public void setTdp(Integer tdp) {
        this.tdp = tdp;
    }

    public Integer getTimesynced() {
        return timesynced;
    }

    public void setTimesynced(Integer timesynced) {
        this.timesynced = timesynced;
    }

    public Integer getTimezoneTime() {
        return timezoneTime;
    }

    public void setTimezoneTime(Integer timezoneTime) {
        this.timezoneTime = timezoneTime;
    }

}