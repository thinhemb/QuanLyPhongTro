/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.MainForm;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ThinhDo
 */
public class UserDao extends Connections {
    public UserDao()
    {
        super();
    }
    public boolean checkLogin(String tk,String pass)
    {
        try {
            String sql = "Select * from acc_admin where UserName = ? and Pass = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, tk);
            
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                //                
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
}
