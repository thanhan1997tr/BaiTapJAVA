/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TaiKhoanDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author ThanhAn
 */
public class DangNhapDAL {
    public Boolean DangNhap(TaiKhoanDTO tk){
        boolean test = true;
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            
            String sql = "{call SP_DANGNHAP(?, ?)}";
            CallableStatement cs =conn.prepareCall(sql);
            cs.setString(1, tk.getsTaiKhoan());
            cs.setString(2, tk.getsMatKhau());
            
            ResultSet rs = cs.executeQuery();
            if (rs.next()){
                test = true;
            }
            else{
                test = false;
            }
            
        } catch (Exception e) {
            test = false;
        }
        return test;
    }
}
