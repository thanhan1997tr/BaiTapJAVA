/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author ThanhAn
 */
public class LoadComboBox {
    public void LoadComboBoxDisplay(JComboBox cbb, String sql, String b){
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
    
    public ArrayList<String> LoadComboBoxValue(String sql, String b){
        ArrayList<String> value = new  ArrayList<>();
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                value.add(rs.getString(b));
            }
        } catch (Exception e) {
        }
        return value;
    }
    
    public void LoadComboBoxTenKhachHang(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT HOTENKHACH FROM KHACHHANG GROUP BY HOTENKHACH";
        String b = "HOTENKHACH";
        LoadComboBoxDisplay(cbb, sql, b);
    }
    
    public ArrayList<String> LoadMaLoai(){
        String sql = "SELECT * FROM LOAIXE";
        String b = "MALOAI";
        return LoadComboBoxValue(sql, b);
    }
    
    public void LoadComboBoxTenLoai(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT * FROM LOAIXE";
        String b = "TENLOAI";
        LoadComboBoxDisplay(cbb, sql, b);
    }
    
    public String getValueComboBoxTenLoai(JComboBox cbbdp){
        return LoadMaLoai().get(cbbdp.getSelectedIndex());
    }
}
