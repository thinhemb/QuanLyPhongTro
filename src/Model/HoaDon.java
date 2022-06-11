/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinhDo
 */
public class HoaDon {
    String maHD, maKT, maPhong, tenKT;
    Long sdc, sdm, snc, snm;
    Long giaThue, tienDien, tongTien, tienNuoc, tienDV;
    String date;

    public Long getSdc() {
        return sdc;
    }

    public void setSdc(Long sdc) {
        this.sdc = sdc;
    }

    public Long getSdm() {
        return sdm;
    }

    public void setSdm(Long sdm) {
        this.sdm = sdm;
    }

    public Long getSnc() {
        return snc;
    }

    public void setSnc(Long snc) {
        this.snc = snc;
    }

    public Long getSnm() {
        return snm;
    }

    public void setSnm(Long snm) {
        this.snm = snm;
    }

    public String getDate() {
        return date;
    }

    public String getTenKT() {
        return tenKT;
    }

    public void setTenKT(String tenKT) {
        this.tenKT = tenKT;
    }

    @Override
    public String toString() {
        return "Mã Hoá Đơn : " + maHD 
                + "\t\tNgày Tạo Hoá Đơn : " + date 
                + "\nMã Khách Thuê : " + maKT 
                + "\t\tTên Khách Thuê : " + tenKT 
                + "\nMã Phòng : " + maPhong 
                + "\nGiá Phòng : " + giaThue 
                + "\nSố Chữ Điện Cũ : " + sdc 
                +"\t\tSố Chữ Điện Mới : " + sdm 
                +"\nTổng Tiền Điện : " + tienDien 
                + "\nSố Chữ Nước Cũ : " + snc 
                +"\t\tSố Chữ Nước Mới : " + snm 
                + "\nTổng Tiền Nước : " + tienNuoc 
                + "\nTiền Dịch Vụ : " + tienDV 
                + "\nTổng Tiền : " + tongTien;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(Long giaThue) {
        this.giaThue = giaThue;
    }

    public Long getTienDien() {
        return tienDien;
    }

    public void setTienDien(Long tienDien) {
        this.tienDien = tienDien;
    }

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;
    }

    public Long getTienNuoc() {
        return tienNuoc;
    }

    public void setTienNuoc(Long tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

    public Long getTienDV() {
        return tienDV;
    }

    public void setTienDV(Long tienDV) {
        this.tienDV = tienDV;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKT() {
        return maKT;
    }

    public void setMaKT(String maKT) {
        this.maKT = maKT;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
}
