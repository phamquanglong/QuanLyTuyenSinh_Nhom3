/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phamquanglong51
 */
public class ThiSinh {
    public String SBD;
    public String hoTen;
    public String diaChi;
    public String uuTien;
    public String khoiThi;

    public ThiSinh() {
    }

    public ThiSinh(String SBD, String hoTen, String diaChi, String uuTien, String khoiThi) {
        this.SBD = SBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
        this.khoiThi = khoiThi;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    public String getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(String khoiThi) {
        this.khoiThi = khoiThi;
    }
}
