/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.KhachThue;
import View.Them_Nguoidung;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ThinhDo
 */
public class KhachThueDao extends Connections {
    public static void update_TinhTrangPhong(String maPhong, String txt) {
        String sql = "update tblQlyPhongTro set TinhTrang = '"
                + txt + "' where maPhong = '" + maPhong + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int soluongNguoiThue(String maPhong) {
        String sql = "select soNguoi from tblQlyPhongTro ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("soNguoi");
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int insert(KhachThue nhan) {
        String sql = "insert into tblKhachThue(HoTen,NgaySinh,NgheNghiep,GioiTinh,Sdt,QueQuan,maPhong) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, nhan.getHoTen());
            pstmt.setString(2, nhan.getNgaySinh());
            pstmt.setString(3, nhan.getNgheNghiep());
            pstmt.setString(4, nhan.getGioiTinh());
            pstmt.setString(5, nhan.getSdt());
            pstmt.setString(6, nhan.getQueQuan());
            pstmt.setString(7, nhan.getMaPhong());
            if (soluongNguoiThue(nhan.getMaPhong()) > getCountKhachThue(nhan.getMaPhong())) {
                int rs = pstmt.executeUpdate();
                if (rs > 0) {
                    update_TinhTrangPhong(nhan.getMaPhong(), "Da Thue");
                    return rs;
                }
            }else {
                JOptionPane.showMessageDialog(new Them_Nguoidung(), "So Luong Khach Thue Da Du");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<KhachThue> getAllUsersKT() {
        List<KhachThue> kts = new ArrayList<KhachThue>();
        String sql = "select * from tblKhachThue";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachThue kt = new KhachThue();
                kt.setMaKT(rs.getString("MaKT"));
                kt.setHoTen(rs.getString("HoTen"));
                kt.setNgaySinh(rs.getString("NgaySinh"));
                kt.setNgheNghiep(rs.getString("NgheNghiep"));
                kt.setGioiTinh(rs.getString("GioiTinh"));
                kt.setSdt(rs.getString("Sdt"));
                kt.setQueQuan(rs.getString("QueQuan"));
                kt.setMaPhong(rs.getString("maPhong"));
                kts.add(kt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachThueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kts;
    }

    public static int getCountKhachThue(String maPhong) {
        String sql = "select COUNT(maKT) soluong from tblKhachThue where maPhong = '"
                + maPhong + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return Integer.parseInt(rs.getString("soluong"));
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public void DELETENGUOIDUNG(String MaKT, String maPhong) {
        String sql = "DELETE from tblKhachThue WHERE MaKT = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, MaKT);
            int rs = pst.executeUpdate();
            if (getCountKhachThue(maPhong) == 0) {
                update_TinhTrangPhong(maPhong, "Trong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public KhachThue getKhachThueByID(String MaKT) {
        String sql = "select * from tblKhachThue where MaKT= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, MaKT);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                KhachThue kt = new KhachThue();

                kt.setMaKT(rs.getString("MaKT"));
                kt.setHoTen(rs.getString("HoTen"));
                kt.setNgaySinh(rs.getString("NgaySinh"));
                kt.setNgheNghiep(rs.getString("NgheNghiep"));
                kt.setGioiTinh(rs.getString("GioiTinh"));
                kt.setSdt(rs.getString("Sdt"));
                kt.setQueQuan(rs.getString("QueQuan"));
                kt.setMaPhong(rs.getString("maPhong"));

                return kt;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void updateKhachThue(KhachThue nhan) {
        String sql = "update tblKhachThue set HoTen= ?,NgaySinh= ?,NgheNghiep= ?,GioiTinh= ?,Sdt= ?,QueQuan= ?,maPhong= ? where MaKT = ?";
//        String sql = "update tblKhachThue set HoTen= ?,NgaySinh= ?,NgheNghiep= ?,GioiTinh= ?,Sdt= ?,QueQuan= ? where MaKT = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(8, nhan.getMaKT());
            pstmt.setString(1, nhan.getHoTen());
            pstmt.setString(2, nhan.getNgaySinh());
            pstmt.setString(3, nhan.getNgheNghiep());
            pstmt.setString(4, nhan.getGioiTinh());
            pstmt.setString(5, nhan.getSdt());
            pstmt.setString(6, nhan.getQueQuan());
            pstmt.setString(7, nhan.getMaPhong());
            int rs = pstmt.executeUpdate();
            //laptop.setKq(rs);
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Init_MaPhong(JComboBox cbx) {
        String sql = "select maPhong from tblQlyPhongTro";
        try {
            cbx.removeAllItems();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbx.addItem(rs.getString("maPhong"));
            }
        } catch (Exception e) {
        }
    }
    public static boolean getIdbyAll(String sdt, String ten){
        String sql = "select * from tblKhachThue where Sdt = ? and HoTen = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sdt);
            ps.setString(2, ten);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static String checkGioiTinh(JComboBox phong){
        String sql = "select * from tblQlyPhongTro where maPhong = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, phong.getSelectedItem().toString());
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                return rs.getString("DoiTuongThue");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
