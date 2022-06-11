package Controller;

import Model.PhongTro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ThinhDo
 */
public class PhongTroDao extends Connections{
    static int rs = 0;

    public static List<PhongTro> getInFoPhongTro() {
        List<PhongTro> phongTros = new ArrayList<PhongTro>();
        String sql = "select * from tblQlyPhongTro";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PhongTro pt = new PhongTro();

                pt.setMaPhong(rs.getString("maPhong"));
                pt.setDienTich(rs.getDouble("dienTich"));
                pt.setSoNguoi(rs.getInt("soNguoi"));
                pt.setGiaThue(rs.getDouble("giaThue"));
                pt.setDoiTuong(rs.getString("DoiTuongThue"));
                pt.setTinhTrang(rs.getString("TinhTrang"));
                pt.setCsDienMoi(rs.getInt("chiSoDienMoi"));
                pt.setCsDienCu(rs.getInt("chiSoDienCu"));
                pt.setCsNuocCu(rs.getInt("chiSoNuocCu"));
                pt.setCsNuocMoi(rs.getInt("chiSoNuocMoi"));
                phongTros.add(pt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return phongTros;
    }

    public void addPhongTro(PhongTro pt) {
        String sql = "insert into tblQlyPhongTro( dienTich, soNguoi, giaThue, DoiTuongThue, TinhTrang,chiSoDienMoi,"
                + "chiSoDienCu,chiSoNuocCu,chiSoNuocMoi) values(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setString(1, pt.getMaPhong());
            ps.setDouble(1, pt.getDienTich());
            ps.setInt(2, pt.getSoNguoi());
            ps.setDouble(3, pt.getGiaThue());
            ps.setString(4, pt.getDoiTuong());
            ps.setString(5, pt.getTinhTrang());
            ps.setInt(6, 0);
            ps.setInt(7, 0);
            ps.setInt(8, 0);
            ps.setInt(9, 0);
            int rs = ps.executeUpdate();
            //pt.setKq(rs);
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public PhongTro getPhongTroByID(String maPhong) {
        String sql = "select * from tblQlyPhongTro where maPhong= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maPhong);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PhongTro pt = new PhongTro();
                pt.setMaPhong(rs.getString("maPhong"));
                pt.setDienTich(rs.getDouble("dienTich"));
                pt.setSoNguoi(rs.getInt("soNguoi"));
                pt.setGiaThue(rs.getDouble("giaThue"));
                pt.setDoiTuong(rs.getString("DoiTuongThue"));
                pt.setTinhTrang(rs.getString("TinhTrang"));
                pt.setCsDienMoi(rs.getInt("chiSoDienMoi"));
                pt.setCsDienCu(rs.getInt("chiSoDienCu"));
                pt.setCsNuocCu(rs.getInt("chiSoNuocCu"));
                pt.setCsNuocMoi(rs.getInt("chiSoNuocMoi"));
                return pt;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

   public int updatePhongTro(PhongTro pt) {
        String sql = "update tblQlyPhongTro set  dienTich = ?, soNguoi= ?, giaThue= ?, DoiTuongThue= ?, TinhTrang= ? where maPhong = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(6, pt.getMaPhong());
            ps.setDouble(1, pt.getDienTich());
            ps.setInt(2, pt.getSoNguoi());
            ps.setDouble(3, pt.getGiaThue());
            ps.setString(4, pt.getDoiTuong());
            ps.setString(5, pt.getTinhTrang());
            return rs = ps.executeUpdate();          
            //laptop.setKq(rs);
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void updateCSDN(PhongTro pt) {
        String sql = "update tblQlyPhongTro set  chiSoDienCu = ?, chiSoDienMoi= ?, chiSoNuocCu= ?, chiSoNuocMoi= ? where maPhong = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, pt.getMaPhong());
            ps.setInt(1, pt.getCsDienCu());
            ps.setInt(2, pt.getCsDienMoi());
            ps.setInt(3, pt.getCsNuocCu());
            ps.setInt(4, pt.getCsNuocMoi());
            int rs = ps.executeUpdate();
            //laptop.setKq(rs);
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deletePhongTro(String maPhong) {
        String sql = "delete from tblQlyPhongTro where maPhong = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maPhong);
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<PhongTro> getCSDienNuoc() {
        List<PhongTro> phongTros = new ArrayList<PhongTro>();
        String sql = "select * from tblQlyPhongTro";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 1;
            while (rs.next()) {
                PhongTro pt = new PhongTro();
                pt.setMaPhong(rs.getString("maPhong"));
                pt.setCsDienMoi(rs.getInt("chiSoDienMoi"));
                pt.setCsDienCu(rs.getInt("chiSoDienCu"));
                pt.setCsNuocCu(rs.getInt("chiSoNuocCu"));
                pt.setCsNuocMoi(rs.getInt("chiSoNuocMoi"));
                phongTros.add(pt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return phongTros;
    }
}
