/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HoaDon;
import View.MainForm;
import View.Them_HoaDon;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ThinhDo
 */
public class HoaDonDao extends Connections {
    
    public static int rs = 0;
    String Query = "select * "
            + "from tblHoaDon h, tblKhachThue k, tblQlyPhongTro p "
            + "where h.maKT = k.maKT and h.maPhong = p.maPhong ";

    public static void Export(List<HoaDon> listhoadon) {
        try {
            FileWriter fw = new FileWriter("HoaDon.doc");
            BufferedWriter bw = new BufferedWriter(fw);
            for (HoaDon hoadon : listhoadon) {
                bw.write(hoadon.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<HoaDon> Search_HD(String maHD) {
        List<HoaDon> listhoadon = new ArrayList<HoaDon>();
        String sql = Query + "and " + "maHD = '" + maHD + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                setHoaDon(rs, hoadon);
                listhoadon.add(hoadon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listhoadon;
    }

    public static Long getTienDien(String maPhong) {
        Long soChuDien = soChu("chiSoDienMoi", maPhong) - soChu("chiSoDienCu", maPhong);
        return soChuDien(maPhong) * 3500;
    }

    public static Long getTienNuoc(String maPhong) {
        Long soChuNuoc = soChu("chiSoNuocMoi", maPhong) - soChu("chiSoNuocCu", maPhong);
        return soChuNuoc * 2500;
    }

    public static Long getTienPhong(String maPhong) {
        String sql = "select giaThue "
                + "from tblQlyPhongTro "
                + "where maPhong = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maPhong);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getLong("giaThue");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0l;
    }

    public static Long soChuDien(String ID) {
        String sql = "select chiSoDienMoi -  chiSoDienCu  sochu "
                + "from tblQlyPhongTro "
                + "where maPhong = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong("sochu");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0l;
    }

    public static Long soChu(String s, String ID) {
        String sql = "select "
                + s
                + " from tblQlyPhongTro where maPhong = '"
                + ID
                + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0l;
    }

    public static Long soChuNuoc(String ID) {
        String sql = "select chiSoNuocMoi -  chiSoNuocCu sochu "
                + "from tblQlyPhongTro "
                + "where maPhong = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong("sochu");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0l;
    }

    public List<HoaDon> getAllHoaHon() {
        List<HoaDon> list_hoadon = new ArrayList<HoaDon>();
//        String sql = "select maHD, HoTen, h.maPhong, tgian from tblHoaDon h, tblKhachThue k, tblQlyPhongTro p where h.maKT = k.maKT and h.maPhong = p.maPhong";
        try {
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                setHoaDon(rs, hoadon);
                list_hoadon.add(hoadon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_hoadon;
    }

    public static void setHoaDon(ResultSet rs, HoaDon hoadon) {
        try {
            String maPhong = rs.getString("maPhong");
            Long tienphong = getTienPhong(rs.getString("maPhong"));
            Long tiendien = getTienDien(rs.getString("maPhong"));
            Long tiennuoc = getTienNuoc(rs.getString("maPhong"));
            Long tiendv = 70000l;
            Long tongtien = tienphong + tiendien + tiennuoc + tiendv;
            hoadon.setSdc(soChu("chiSoDienCu", maPhong));
            hoadon.setSdm(soChu("chiSoDienMoi", maPhong));
            hoadon.setSnc(soChu("chiSoNuocCu", maPhong));
            hoadon.setSnm(soChu("chiSoNuocMoi", maPhong));
            hoadon.setMaHD(rs.getString("maHD"));
            hoadon.setTenKT(rs.getString("HoTen"));
            hoadon.setMaKT(rs.getString("maKT"));
            hoadon.setMaPhong(rs.getString("maPhong"));
            hoadon.setGiaThue(tienphong);
            hoadon.setTienDien(tiendien);
            hoadon.setTienNuoc(tiennuoc);
            hoadon.setTienDV(tiendv);
            hoadon.setTongTien(tongtien);
            hoadon.setDate(rs.getString("tgian"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<HoaDon> Search_HD1(String maPhong) {
        List<HoaDon> list_hoadon = new ArrayList<HoaDon>();
        String sql = Query
                + " and h.maPhong like '%" + maPhong + "%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                setHoaDon(rs, hoadon);
                list_hoadon.add(hoadon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_hoadon;
    }

    public List<HoaDon> Search_HD2(String month, String year) {
        String date = year + "-" + month + "-01";
        List<HoaDon> list_hoadon = new ArrayList<HoaDon>();
        String sql = Query
                + " and DATEDIFF(MONTH, ?,tgian) = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, date);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                setHoaDon(rs, hoadon);
                list_hoadon.add(hoadon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_hoadon;
    }

    public static String getmaKT(String name, String maPhong) {
        String sql = "select maKT from tblKhachThue where HoTen = ? and maPhong = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, maPhong);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("maKT");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void Add_HoaDon(HoaDon hoadon) {
        String sql = "Insert Into tblHoaDon(maKT, maPhong, tgian)"
                + "Values (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hoadon.getMaKT());
            ps.setString(2, hoadon.getMaPhong());
            ps.setString(3, "" + hoadon.getDate());
            rs = ps.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(new MainForm(), "thanhcong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Del_HoaDon(String maHD) {
        String sql = "delete from tblHoaDon where maHD = '"
                + maHD + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean KtraNhap(JTextField Phong) {
        if (Phong.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(new Them_HoaDon(), "Chưa Nhập Tên Phòng");
            Phong.requestFocus();
            return false;
        }
        return true;
    }

    public static void Init_NameKH(String maPhong, JComboBox cbx) {
        String sql = "select HoTen from tblKhachThue where maPhong = '" + maPhong + "'";
        try {
            cbx.removeAllItems();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbx.addItem(rs.getString("HoTen"));
            }
        } catch (Exception e) {
        }
    }
}
