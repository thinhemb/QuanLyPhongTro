/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinhDo
 */
public class PhongTro {
    private String maPhong, doiTuong, tinhTrang;
    private int soNguoi,csDienCu, csDienMoi, csNuocCu, csNuocMoi;
    private double dienTich, giaThue;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getCsDienCu() {
        return csDienCu;
    }

    public void setCsDienCu(int csDienCu) {
        this.csDienCu = csDienCu;
    }

    public int getCsDienMoi() {
        return csDienMoi;
    }

    public void setCsDienMoi(int csDienMoi) {
        this.csDienMoi = csDienMoi;
    }

    public int getCsNuocCu() {
        return csNuocCu;
    }

    public void setCsNuocCu(int csNuocCu) {
        this.csNuocCu = csNuocCu;
    }

    public int getCsNuocMoi() {
        return csNuocMoi;
    }

    public void setCsNuocMoi(int csNuocMoi) {
        this.csNuocMoi = csNuocMoi;
    }

    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(double giaThue) {
        this.giaThue = giaThue;
    }
    
    public double tienDien(){
        return 3500*(getCsDienMoi() - getCsDienCu());
    }
    public double tienNuoc(){
        return 2500*(getCsNuocMoi() - getCsNuocCu());
    }
}
