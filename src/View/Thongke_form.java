/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.util.List;
import Controller.HoaDonDao;
import Controller.KhachThueDao;
import Controller.PhongTroDao;
import Controller.ThongKeDao;
import Model.KhachThue;
import Model.PhongTro;
import Model.ThongKe;
import Model.HoaDon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Thongke_form extends javax.swing.JFrame {
    String tr="";
    DefaultTableModel defaultTable;
    Table_Thongke a;
    ThongKe thongke;
    KhachThueDao khachthuedao;
    ThongKeDao thongkedao;
    HoaDonDao hoadondao;
    PhongTroDao phongtrodao;
    public Thongke_form() {    
        thongkedao = new ThongKeDao(); 
        khachthuedao = new KhachThueDao();
        phongtrodao = new PhongTroDao();
        hoadondao = new HoaDonDao();
        defaultTable = new DefaultTableModel();
        
        initComponents();              
        
        this.setLocationRelativeTo(null);   
        thongkedao.Count_kh(); thongkedao.Count_dh();thongkedao.Count_Pt_Trong();
        lb1txt.setText(""+thongke.getCount_dh());
        lb4txt.setText(""+thongke.getCount_kh());
        lb3txt.setText(""+thongke.getCount_pt_t());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        donhangtxt = new javax.swing.JPanel();
        lb1txt = new javax.swing.JLabel();
        phongTrong = new javax.swing.JPanel();
        lb3txt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        doanhThu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        khachHang = new javax.swing.JPanel();
        lb4txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("THỐNG KÊ PHÒNG TRỌ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("TỔNG ĐƠN HÀNG");

        donhangtxt.setBackground(new java.awt.Color(0, 204, 204));
        donhangtxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donhangtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donhangtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donhangtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donhangtxtMouseExited(evt);
            }
        });

        lb1txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1txt.setText("jLabel1");

        javax.swing.GroupLayout donhangtxtLayout = new javax.swing.GroupLayout(donhangtxt);
        donhangtxt.setLayout(donhangtxtLayout);
        donhangtxtLayout.setHorizontalGroup(
            donhangtxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb1txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );
        donhangtxtLayout.setVerticalGroup(
            donhangtxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donhangtxtLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lb1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        phongTrong.setBackground(new java.awt.Color(0, 204, 204));
        phongTrong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        phongTrong.setPreferredSize(new java.awt.Dimension(110, 101));
        phongTrong.setRequestFocusEnabled(false);
        phongTrong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phongTrongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phongTrongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phongTrongMouseExited(evt);
            }
        });

        lb3txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb3txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3txt.setText("jLabel1");

        javax.swing.GroupLayout phongTrongLayout = new javax.swing.GroupLayout(phongTrong);
        phongTrong.setLayout(phongTrongLayout);
        phongTrongLayout.setHorizontalGroup(
            phongTrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb3txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );
        phongTrongLayout.setVerticalGroup(
            phongTrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phongTrongLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lb3txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("SỐ PHÒNG CÒN TRỐNG");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TỔMG DOANH THU");

        doanhThu.setBackground(new java.awt.Color(0, 204, 204));
        doanhThu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doanhThu.setPreferredSize(new java.awt.Dimension(125, 110));
        doanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doanhThuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doanhThuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doanhThuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout doanhThuLayout = new javax.swing.GroupLayout(doanhThu);
        doanhThu.setLayout(doanhThuLayout);
        doanhThuLayout.setHorizontalGroup(
            doanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );
        doanhThuLayout.setVerticalGroup(
            doanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("TỔNG KHÁCH HÀNG");

        khachHang.setBackground(new java.awt.Color(0, 204, 204));
        khachHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        khachHang.setPreferredSize(new java.awt.Dimension(125, 6));
        khachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                khachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                khachHangMouseExited(evt);
            }
        });

        lb4txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb4txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4txt.setText("jLabel1");

        javax.swing.GroupLayout khachHangLayout = new javax.swing.GroupLayout(khachHang);
        khachHang.setLayout(khachHangLayout);
        khachHangLayout.setHorizontalGroup(
            khachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb4txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );
        khachHangLayout.setVerticalGroup(
            khachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachHangLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lb4txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(donhangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel9)
                    .addComponent(khachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donhangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void donhangtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donhangtxtMouseClicked
        tr="ĐƠN HÀNG";
        defaultTable.addColumn("Mã Hoá Đơn");
        defaultTable.addColumn("Mã Khách Thuê");
        defaultTable.addColumn("Mã Phòng");
        defaultTable.addColumn("Tiền phòng");
        defaultTable.addColumn("Tiền điện");
        defaultTable.addColumn("Tiền nước");
        defaultTable.addColumn("Tiền dịch vụ");
        a = new Table_Thongke(defaultTable,tr); 
        new Table_Thongke(defaultTable,tr).setVisible(true);
        this.dispose();
        setallHoaDon(hoadondao.getAllHoaHon());
    }//GEN-LAST:event_donhangtxtMouseClicked
    public void setallHoaDon(List<HoaDon> users){
        for (HoaDon hd : users){
            defaultTable.addRow(new Object[]{
                hd.getMaHD(), hd.getMaKT(), hd.getMaPhong(), hd.getGiaThue(),
                hd.getTienDien(), hd.getTienNuoc(),hd.getTienDV()
            });
        }
    }
    private void doanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhThuMouseClicked
        tr="CHI TIÊT ĐƠN HÀNG";
        defaultTable.addColumn("Phòng");
        defaultTable.addColumn("Tổng cộng");
        a = new Table_Thongke(defaultTable,tr); 
        new Table_Thongke(defaultTable,tr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doanhThuMouseClicked
    
    private void khachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseClicked
        tr="DANH SÁCH KHÁCH HÀNG";
        defaultTable.addColumn("Mã Khách thuê");
        defaultTable.addColumn("Họ tên");
        defaultTable.addColumn("Ngày sinh");
        defaultTable.addColumn("Nghề nghiệp");
        defaultTable.addColumn("Giới tính");
        defaultTable.addColumn("SĐT");
        defaultTable.addColumn("Quê quán");
        defaultTable.addColumn("Mã Phòng");
        a = new Table_Thongke(defaultTable,tr); 
        new Table_Thongke(defaultTable,tr).setVisible(true);
        this.dispose();
        setallKhachThue(khachthuedao.getAllUsersKT());
    }//GEN-LAST:event_khachHangMouseClicked
     public void setallKhachThue(List<KhachThue> users){
        for(KhachThue kt : users ){ 
            defaultTable.addRow(new Object[]{ 
               kt.getMaKT(), kt.getHoTen(), kt.getNgaySinh(), kt.getNgheNghiep(), kt.getGioiTinh(), kt.getSdt(),
                kt.getQueQuan(), kt.getMaPhong()
            });
        }
    }  
    private void phongTrongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phongTrongMouseClicked
        tr="DANH SÁCH PHÒNG"; 
        defaultTable.addColumn("Mã phòng");
        defaultTable.addColumn("Diện tích");       
        defaultTable.addColumn("Số người ở");
        defaultTable.addColumn("Giá thuê");
        defaultTable.addColumn("Đối tượng");
        defaultTable.addColumn("Trạng thái");  
        defaultTable.addColumn("CS Điện mới"); 
        defaultTable.addColumn("CS Điện cũ"); 
        defaultTable.addColumn("CS Nước mới"); 
        defaultTable.addColumn("CS Nước cũ"); 
        a = new Table_Thongke(defaultTable,tr); 
        new Table_Thongke(defaultTable,tr).setVisible(true);
        this.dispose();
        setallPhongTro(thongkedao.getInFoPhongTroIf());
    }//GEN-LAST:event_phongTrongMouseClicked
     public void setallPhongTro(List<PhongTro> users){
        for(PhongTro pt : users ){ 
            defaultTable.addRow(new Object[]{ 
                   pt.getMaPhong(), pt.getDienTich(), pt.getSoNguoi(), pt.getGiaThue(), 
                pt.getDoiTuong(), pt.getTinhTrang(), pt.getCsDienMoi(), pt.getCsDienMoi(),
                pt.getCsNuocMoi(), pt.getCsNuocCu()
            });
        }
    }  
    private void donhangtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donhangtxtMouseEntered
        donhangtxt.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_donhangtxtMouseEntered

    private void donhangtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donhangtxtMouseExited
        donhangtxt.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_donhangtxtMouseExited

    private void doanhThuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhThuMouseEntered
        doanhThu.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_doanhThuMouseEntered

    private void doanhThuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhThuMouseExited
        doanhThu.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_doanhThuMouseExited

    private void phongTrongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phongTrongMouseEntered
        phongTrong.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_phongTrongMouseEntered

    private void phongTrongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phongTrongMouseExited
         phongTrong.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_phongTrongMouseExited

    private void khachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseEntered
        khachHang.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_khachHangMouseEntered

    private void khachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseExited
        khachHang.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_khachHangMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Thongke_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thongke_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thongke_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thongke_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thongke_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel doanhThu;
    private javax.swing.JPanel donhangtxt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel khachHang;
    private javax.swing.JLabel lb1txt;
    private javax.swing.JLabel lb3txt;
    private javax.swing.JLabel lb4txt;
    private javax.swing.JPanel phongTrong;
    // End of variables declaration//GEN-END:variables
}
