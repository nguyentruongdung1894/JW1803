/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Entity;

/**
 *
 * @author ScorPius 31
 */
public class D_banner {
    private int madanhmuccha;
    private String tendanhmuccha;
    private int madanhmuccon;
    private String tendanhmuccon;
    private int douutien;
    private boolean trangthai;

    public D_banner() {
    }

    public D_banner(int madanhmuccha, String tendanhmuccha, int madanhmuccon, String tendanhmuccon, int douutien, boolean trangthai) {
        this.madanhmuccha = madanhmuccha;
        this.tendanhmuccha = tendanhmuccha;
        this.madanhmuccon = madanhmuccon;
        this.tendanhmuccon = tendanhmuccon;
        this.douutien = douutien;
        this.trangthai = trangthai;
    }

    public int getMadanhmuccha() {
        return madanhmuccha;
    }

    public void setMadanhmuccha(int madanhmuccha) {
        this.madanhmuccha = madanhmuccha;
    }

    public String getTendanhmuccha() {
        return tendanhmuccha;
    }

    public void setTendanhmuccha(String tendanhmuccha) {
        this.tendanhmuccha = tendanhmuccha;
    }

    public int getMadanhmuccon() {
        return madanhmuccon;
    }

    public void setMadanhmuccon(int madanhmuccon) {
        this.madanhmuccon = madanhmuccon;
    }

    public String getTendanhmuccon() {
        return tendanhmuccon;
    }

    public void setTendanhmuccon(String tendanhmuccon) {
        this.tendanhmuccon = tendanhmuccon;
    }

    public int getDouutien() {
        return douutien;
    }

    public void setDouutien(int douutien) {
        this.douutien = douutien;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    
}
