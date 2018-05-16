/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.XeDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author ThanhAn
 */
public class XeDAL {
    DBConnect s = new DBConnect();
    Connection conn = s.getConnection();
    public ArrayList<XeDTO> LoadDSXe(){
        ArrayList<XeDTO> dsxe = new ArrayList<>();
        try {
            String sql = "EXEC XE_DS";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                String soxe = rs.getString("SOXE");
                String tinhtrang = "";
                if (rs.getString("TINHTRANG").equals("0"))
                    tinhtrang = "Xe cũ";
                else
                    tinhtrang = "Xe mới";
                String maloai = rs.getString("MALOAI");
                XeDTO xe = new XeDTO(soxe, tinhtrang, maloai);
                dsxe.add(xe);
            }
        } catch (Exception e) {
        }
        
        return dsxe;
    }
   
    public boolean getTrungMa(String manhap){
        Boolean ktra = true;
        try {
            String sql = "SELECT SOXE FROM XE";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()){
                if (manhap.equals(rs.getString("SOXE")))
                    ktra = true;
                else
                    ktra = false;
                break;
                    
            }
        } catch (Exception e) {
        }
        return ktra;
    }
    
    public void ThemXe(XeDTO xe){
        try {
            String sql = "{call XE_THEM(?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, xe.getsSoxe());
            cs.setString(2, xe.getsTinhTrang());
            cs.setString(3, xe.getsMaLoai());
            cs.execute();
        } catch (Exception e) {
        }
    }
    
    public void XoaXe(String soxe){
        try {
            String sql = "{call XE_XOA(?)}";
            CallableStatement cs  = conn.prepareCall(sql);
            cs.setString(1, soxe);
            cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(XeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SuaXe(XeDTO xe){
        try {
            String sql = "{call XE_Sua(?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, xe.getsSoxe());
            cs.setString(2, xe.getsTinhTrang());
            cs.setString(3, xe.getsMaLoai());
            cs.execute();
        } catch (Exception e) {
        }
    }
}
