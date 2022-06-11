/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinhDo
 */
public class KhachThue {
    String maKT,HoTen,NgaySinh,NgheNghiep,GioiTinh,Sdt,QueQuan,maPhong;
    public KhachThue() {
    }
    public KhachThue(String maKT, String HoTen, String NgaySinh, String NgheNghiep, String GioiTinh, String Sdt, String QueQuan, String maPhong) {
        this.maKT = maKT;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.NgheNghiep = NgheNghiep;
        this.GioiTinh = GioiTinh;
        this.Sdt = Sdt;
        this.QueQuan = QueQuan;
        this.maPhong = maPhong;
    }
    public String getMaKT() {
        return maKT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getSdt() {
        return Sdt;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaKT(String maKT) {
        this.maKT = maKT;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    
}
