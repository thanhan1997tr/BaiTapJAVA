/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 *
 * @author ThanhAn
 */
public class LoadComboBox {
    public void LoadComboBox(JComboBox cbb, String sql, String b){
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                cbb.addItem(rs.getString(b));
            }
        } catch (Exception e) {
        }
    }
    
    public void LoadComboBoxMaLoai(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT * FROM LOAIXE";
        String b = "MALOAI";
        LoadComboBox(cbb, sql, b);
    }
    
    public void LoadComboBoxTenKhachHang(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT HOTENKHACH FROM KHACHHANG GROUP BY HOTENKHACH";
        String b = "HOTENKHACH";
        LoadComboBox(cbb, sql, b);
    }
}
