/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ThanhAn
 */
public class KhachHangDAL {
    DBConnect s = new DBConnect();
    Connection conn = s.getConnection();
    public ArrayList<KhachHangDTO> LoadDsKH(){
        ArrayList<KhachHangDTO> dskh = new ArrayList<>();
        try {
            String sql = "EXEC KHACHHANG_LOAD";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                String makhach = rs.getString("MAKHACH");
                String hoten = rs.getString("HOTENKHACH");
                String diachi = rs.getString("DIACHI");
                String dienthoai = rs.getString("DIENTHOAI");
                KhachHangDTO kh = new KhachHangDTO(makhach, hoten, diachi, dienthoai);
                dskh.add(kh);
            }
            
        } catch (Exception e) {
        }
        return dskh;
    }
    
    public void Them(KhachHangDTO kh){
        try {
            String sql = "{call KHACHHANG_THEM(?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, kh.getsMaKhach());
            cs.setString(2, kh.getsHoTenKhach());
            cs.setString(3, kh.getsDiaChi());
            cs.setString(4, kh.getsDienThoai());
            cs.execute();
        } catch (Exception e) {
        }
    }
    
    public void Xoa(String ma){
        try {
            String sql = "{call KHACHHANG_XOA(?)}";
            CallableStatement cs  = conn.prepareCall(sql);
            cs.setString(1, ma);
            cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Sua(KhachHangDTO kh){
        try {
            String sql = "{call KHACHHANG_SUA(?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, kh.getsMaKhach());
            cs.setString(2, kh.getsHoTenKhach());
            cs.setString(3, kh.getsDiaChi());
            cs.setString(4, kh.getsDienThoai());
            cs.execute();
        } catch (Exception e) {
        }
    }
    
    public boolean getTrungMa(String manhap){
        Boolean ktra = true;
        try {
            String sql = "SELECT MAKHACH FROM KHACHHANG";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()){
                if (manhap.equals(rs.getString("MAKHACH")))
                    ktra = true;
                else
                    ktra = false;
                break;
                    
            }
        } catch (Exception e) {
        }
        return ktra;
    } 
}
